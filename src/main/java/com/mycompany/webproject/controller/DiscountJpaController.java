/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.webproject.controller;

import com.mycompany.webproject.controller.exceptions.NonexistentEntityException;
import com.mycompany.webproject.controller.exceptions.PreexistingEntityException;
import com.mycompany.webproject.entity.Discount;
import java.io.Serializable;
import javax.persistence.Query;
import javax.persistence.EntityNotFoundException;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import com.mycompany.webproject.entity.Orders;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

/**
 *
 * @author glajaja
 */
public class DiscountJpaController implements Serializable {

    public DiscountJpaController(EntityManagerFactory emf) {
        this.emf = emf;
    }
    private EntityManagerFactory emf = null;

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void create(Discount discount) throws PreexistingEntityException, Exception {
        if (discount.getOrdersList() == null) {
            discount.setOrdersList(new ArrayList<Orders>());
        }
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            List<Orders> attachedOrdersList = new ArrayList<Orders>();
            for (Orders ordersListOrdersToAttach : discount.getOrdersList()) {
                ordersListOrdersToAttach = em.getReference(ordersListOrdersToAttach.getClass(), ordersListOrdersToAttach.getOrderid());
                attachedOrdersList.add(ordersListOrdersToAttach);
            }
            discount.setOrdersList(attachedOrdersList);
            em.persist(discount);
            for (Orders ordersListOrders : discount.getOrdersList()) {
                Discount oldDiscountIdOfOrdersListOrders = ordersListOrders.getDiscountId();
                ordersListOrders.setDiscountId(discount);
                ordersListOrders = em.merge(ordersListOrders);
                if (oldDiscountIdOfOrdersListOrders != null) {
                    oldDiscountIdOfOrdersListOrders.getOrdersList().remove(ordersListOrders);
                    oldDiscountIdOfOrdersListOrders = em.merge(oldDiscountIdOfOrdersListOrders);
                }
            }
            em.getTransaction().commit();
        } catch (Exception ex) {
            if (findDiscount(discount.getDiscountId()) != null) {
                throw new PreexistingEntityException("Discount " + discount + " already exists.", ex);
            }
            throw ex;
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(Discount discount) throws NonexistentEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            Discount persistentDiscount = em.find(Discount.class, discount.getDiscountId());
            List<Orders> ordersListOld = persistentDiscount.getOrdersList();
            List<Orders> ordersListNew = discount.getOrdersList();
            List<Orders> attachedOrdersListNew = new ArrayList<Orders>();
            for (Orders ordersListNewOrdersToAttach : ordersListNew) {
                ordersListNewOrdersToAttach = em.getReference(ordersListNewOrdersToAttach.getClass(), ordersListNewOrdersToAttach.getOrderid());
                attachedOrdersListNew.add(ordersListNewOrdersToAttach);
            }
            ordersListNew = attachedOrdersListNew;
            discount.setOrdersList(ordersListNew);
            discount = em.merge(discount);
            for (Orders ordersListOldOrders : ordersListOld) {
                if (!ordersListNew.contains(ordersListOldOrders)) {
                    ordersListOldOrders.setDiscountId(null);
                    ordersListOldOrders = em.merge(ordersListOldOrders);
                }
            }
            for (Orders ordersListNewOrders : ordersListNew) {
                if (!ordersListOld.contains(ordersListNewOrders)) {
                    Discount oldDiscountIdOfOrdersListNewOrders = ordersListNewOrders.getDiscountId();
                    ordersListNewOrders.setDiscountId(discount);
                    ordersListNewOrders = em.merge(ordersListNewOrders);
                    if (oldDiscountIdOfOrdersListNewOrders != null && !oldDiscountIdOfOrdersListNewOrders.equals(discount)) {
                        oldDiscountIdOfOrdersListNewOrders.getOrdersList().remove(ordersListNewOrders);
                        oldDiscountIdOfOrdersListNewOrders = em.merge(oldDiscountIdOfOrdersListNewOrders);
                    }
                }
            }
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                String id = discount.getDiscountId();
                if (findDiscount(id) == null) {
                    throw new NonexistentEntityException("The discount with id " + id + " no longer exists.");
                }
            }
            throw ex;
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void destroy(String id) throws NonexistentEntityException {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            Discount discount;
            try {
                discount = em.getReference(Discount.class, id);
                discount.getDiscountId();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The discount with id " + id + " no longer exists.", enfe);
            }
            List<Orders> ordersList = discount.getOrdersList();
            for (Orders ordersListOrders : ordersList) {
                ordersListOrders.setDiscountId(null);
                ordersListOrders = em.merge(ordersListOrders);
            }
            em.remove(discount);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public List<Discount> findDiscountEntities() {
        return findDiscountEntities(true, -1, -1);
    }

    public List<Discount> findDiscountEntities(int maxResults, int firstResult) {
        return findDiscountEntities(false, maxResults, firstResult);
    }

    private List<Discount> findDiscountEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(Discount.class));
            Query q = em.createQuery(cq);
            if (!all) {
                q.setMaxResults(maxResults);
                q.setFirstResult(firstResult);
            }
            return q.getResultList();
        } finally {
            em.close();
        }
    }

    public Discount findDiscount(String id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(Discount.class, id);
        } finally {
            em.close();
        }
    }

    public int getDiscountCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<Discount> rt = cq.from(Discount.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }
    
}
