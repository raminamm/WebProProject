/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.webproject.controller;

import com.mycompany.webproject.controller.exceptions.IllegalOrphanException;
import com.mycompany.webproject.controller.exceptions.NonexistentEntityException;
import com.mycompany.webproject.controller.exceptions.PreexistingEntityException;
import java.io.Serializable;
import javax.persistence.Query;
import javax.persistence.EntityNotFoundException;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import com.mycompany.webproject.entity.Customers;
import com.mycompany.webproject.entity.Discount;
import com.mycompany.webproject.entity.Orderdetail;
import com.mycompany.webproject.entity.Orders;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

/**
 *
 * @author glajaja
 */
public class OrdersJpaController implements Serializable {

    public OrdersJpaController(EntityManagerFactory emf) {
        this.emf = emf;
    }
    private EntityManagerFactory emf = null;

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void create(Orders orders) throws PreexistingEntityException, Exception {
        if (orders.getOrderdetailList() == null) {
            orders.setOrderdetailList(new ArrayList<Orderdetail>());
        }
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            Customers email = orders.getEmail();
            if (email != null) {
                email = em.getReference(email.getClass(), email.getEmail());
                orders.setEmail(email);
            }
            Discount discountId = orders.getDiscountId();
            if (discountId != null) {
                discountId = em.getReference(discountId.getClass(), discountId.getDiscountId());
                orders.setDiscountId(discountId);
            }
            List<Orderdetail> attachedOrderdetailList = new ArrayList<Orderdetail>();
            for (Orderdetail orderdetailListOrderdetailToAttach : orders.getOrderdetailList()) {
                orderdetailListOrderdetailToAttach = em.getReference(orderdetailListOrderdetailToAttach.getClass(), orderdetailListOrderdetailToAttach.getOrderdetailid());
                attachedOrderdetailList.add(orderdetailListOrderdetailToAttach);
            }
            orders.setOrderdetailList(attachedOrderdetailList);
            em.persist(orders);
            if (email != null) {
                email.getOrdersList().add(orders);
                email = em.merge(email);
            }
            if (discountId != null) {
                discountId.getOrdersList().add(orders);
                discountId = em.merge(discountId);
            }
            for (Orderdetail orderdetailListOrderdetail : orders.getOrderdetailList()) {
                Orders oldOrderidOfOrderdetailListOrderdetail = orderdetailListOrderdetail.getOrderid();
                orderdetailListOrderdetail.setOrderid(orders);
                orderdetailListOrderdetail = em.merge(orderdetailListOrderdetail);
                if (oldOrderidOfOrderdetailListOrderdetail != null) {
                    oldOrderidOfOrderdetailListOrderdetail.getOrderdetailList().remove(orderdetailListOrderdetail);
                    oldOrderidOfOrderdetailListOrderdetail = em.merge(oldOrderidOfOrderdetailListOrderdetail);
                }
            }
            em.getTransaction().commit();
        } catch (Exception ex) {
            if (findOrders(orders.getOrderid()) != null) {
                throw new PreexistingEntityException("Orders " + orders + " already exists.", ex);
            }
            throw ex;
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(Orders orders) throws IllegalOrphanException, NonexistentEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            Orders persistentOrders = em.find(Orders.class, orders.getOrderid());
            Customers emailOld = persistentOrders.getEmail();
            Customers emailNew = orders.getEmail();
            Discount discountIdOld = persistentOrders.getDiscountId();
            Discount discountIdNew = orders.getDiscountId();
            List<Orderdetail> orderdetailListOld = persistentOrders.getOrderdetailList();
            List<Orderdetail> orderdetailListNew = orders.getOrderdetailList();
            List<String> illegalOrphanMessages = null;
            for (Orderdetail orderdetailListOldOrderdetail : orderdetailListOld) {
                if (!orderdetailListNew.contains(orderdetailListOldOrderdetail)) {
                    if (illegalOrphanMessages == null) {
                        illegalOrphanMessages = new ArrayList<String>();
                    }
                    illegalOrphanMessages.add("You must retain Orderdetail " + orderdetailListOldOrderdetail + " since its orderid field is not nullable.");
                }
            }
            if (illegalOrphanMessages != null) {
                throw new IllegalOrphanException(illegalOrphanMessages);
            }
            if (emailNew != null) {
                emailNew = em.getReference(emailNew.getClass(), emailNew.getEmail());
                orders.setEmail(emailNew);
            }
            if (discountIdNew != null) {
                discountIdNew = em.getReference(discountIdNew.getClass(), discountIdNew.getDiscountId());
                orders.setDiscountId(discountIdNew);
            }
            List<Orderdetail> attachedOrderdetailListNew = new ArrayList<Orderdetail>();
            for (Orderdetail orderdetailListNewOrderdetailToAttach : orderdetailListNew) {
                orderdetailListNewOrderdetailToAttach = em.getReference(orderdetailListNewOrderdetailToAttach.getClass(), orderdetailListNewOrderdetailToAttach.getOrderdetailid());
                attachedOrderdetailListNew.add(orderdetailListNewOrderdetailToAttach);
            }
            orderdetailListNew = attachedOrderdetailListNew;
            orders.setOrderdetailList(orderdetailListNew);
            orders = em.merge(orders);
            if (emailOld != null && !emailOld.equals(emailNew)) {
                emailOld.getOrdersList().remove(orders);
                emailOld = em.merge(emailOld);
            }
            if (emailNew != null && !emailNew.equals(emailOld)) {
                emailNew.getOrdersList().add(orders);
                emailNew = em.merge(emailNew);
            }
            if (discountIdOld != null && !discountIdOld.equals(discountIdNew)) {
                discountIdOld.getOrdersList().remove(orders);
                discountIdOld = em.merge(discountIdOld);
            }
            if (discountIdNew != null && !discountIdNew.equals(discountIdOld)) {
                discountIdNew.getOrdersList().add(orders);
                discountIdNew = em.merge(discountIdNew);
            }
            for (Orderdetail orderdetailListNewOrderdetail : orderdetailListNew) {
                if (!orderdetailListOld.contains(orderdetailListNewOrderdetail)) {
                    Orders oldOrderidOfOrderdetailListNewOrderdetail = orderdetailListNewOrderdetail.getOrderid();
                    orderdetailListNewOrderdetail.setOrderid(orders);
                    orderdetailListNewOrderdetail = em.merge(orderdetailListNewOrderdetail);
                    if (oldOrderidOfOrderdetailListNewOrderdetail != null && !oldOrderidOfOrderdetailListNewOrderdetail.equals(orders)) {
                        oldOrderidOfOrderdetailListNewOrderdetail.getOrderdetailList().remove(orderdetailListNewOrderdetail);
                        oldOrderidOfOrderdetailListNewOrderdetail = em.merge(oldOrderidOfOrderdetailListNewOrderdetail);
                    }
                }
            }
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                String id = orders.getOrderid();
                if (findOrders(id) == null) {
                    throw new NonexistentEntityException("The orders with id " + id + " no longer exists.");
                }
            }
            throw ex;
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void destroy(String id) throws IllegalOrphanException, NonexistentEntityException {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            Orders orders;
            try {
                orders = em.getReference(Orders.class, id);
                orders.getOrderid();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The orders with id " + id + " no longer exists.", enfe);
            }
            List<String> illegalOrphanMessages = null;
            List<Orderdetail> orderdetailListOrphanCheck = orders.getOrderdetailList();
            for (Orderdetail orderdetailListOrphanCheckOrderdetail : orderdetailListOrphanCheck) {
                if (illegalOrphanMessages == null) {
                    illegalOrphanMessages = new ArrayList<String>();
                }
                illegalOrphanMessages.add("This Orders (" + orders + ") cannot be destroyed since the Orderdetail " + orderdetailListOrphanCheckOrderdetail + " in its orderdetailList field has a non-nullable orderid field.");
            }
            if (illegalOrphanMessages != null) {
                throw new IllegalOrphanException(illegalOrphanMessages);
            }
            Customers email = orders.getEmail();
            if (email != null) {
                email.getOrdersList().remove(orders);
                email = em.merge(email);
            }
            Discount discountId = orders.getDiscountId();
            if (discountId != null) {
                discountId.getOrdersList().remove(orders);
                discountId = em.merge(discountId);
            }
            em.remove(orders);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public List<Orders> findOrdersEntities() {
        return findOrdersEntities(true, -1, -1);
    }

    public List<Orders> findOrdersEntities(int maxResults, int firstResult) {
        return findOrdersEntities(false, maxResults, firstResult);
    }

    private List<Orders> findOrdersEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(Orders.class));
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

    public Orders findOrders(String id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(Orders.class, id);
        } finally {
            em.close();
        }
    }

    public int getOrdersCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<Orders> rt = cq.from(Orders.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }
    
}
