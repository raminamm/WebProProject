/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.webproject.controller;

import com.mycompany.webproject.controller.exceptions.IllegalOrphanException;
import com.mycompany.webproject.controller.exceptions.NonexistentEntityException;
import com.mycompany.webproject.controller.exceptions.PreexistingEntityException;
import com.mycompany.webproject.entity.Customers;
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
public class CustomersJpaController implements Serializable {

    public CustomersJpaController(EntityManagerFactory emf) {
        this.emf = emf;
    }
    private EntityManagerFactory emf = null;

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void create(Customers customers) throws PreexistingEntityException, Exception {
        if (customers.getOrdersList() == null) {
            customers.setOrdersList(new ArrayList<Orders>());
        }
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            List<Orders> attachedOrdersList = new ArrayList<Orders>();
            for (Orders ordersListOrdersToAttach : customers.getOrdersList()) {
                ordersListOrdersToAttach = em.getReference(ordersListOrdersToAttach.getClass(), ordersListOrdersToAttach.getOrderid());
                attachedOrdersList.add(ordersListOrdersToAttach);
            }
            customers.setOrdersList(attachedOrdersList);
            em.persist(customers);
            for (Orders ordersListOrders : customers.getOrdersList()) {
                Customers oldEmailOfOrdersListOrders = ordersListOrders.getEmail();
                ordersListOrders.setEmail(customers);
                ordersListOrders = em.merge(ordersListOrders);
                if (oldEmailOfOrdersListOrders != null) {
                    oldEmailOfOrdersListOrders.getOrdersList().remove(ordersListOrders);
                    oldEmailOfOrdersListOrders = em.merge(oldEmailOfOrdersListOrders);
                }
            }
            em.getTransaction().commit();
        } catch (Exception ex) {
            if (findCustomers(customers.getEmail()) != null) {
                throw new PreexistingEntityException("Customers " + customers + " already exists.", ex);
            }
            throw ex;
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(Customers customers) throws IllegalOrphanException, NonexistentEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            Customers persistentCustomers = em.find(Customers.class, customers.getEmail());
            List<Orders> ordersListOld = persistentCustomers.getOrdersList();
            List<Orders> ordersListNew = customers.getOrdersList();
            List<String> illegalOrphanMessages = null;
            for (Orders ordersListOldOrders : ordersListOld) {
                if (!ordersListNew.contains(ordersListOldOrders)) {
                    if (illegalOrphanMessages == null) {
                        illegalOrphanMessages = new ArrayList<String>();
                    }
                    illegalOrphanMessages.add("You must retain Orders " + ordersListOldOrders + " since its email field is not nullable.");
                }
            }
            if (illegalOrphanMessages != null) {
                throw new IllegalOrphanException(illegalOrphanMessages);
            }
            List<Orders> attachedOrdersListNew = new ArrayList<Orders>();
            for (Orders ordersListNewOrdersToAttach : ordersListNew) {
                ordersListNewOrdersToAttach = em.getReference(ordersListNewOrdersToAttach.getClass(), ordersListNewOrdersToAttach.getOrderid());
                attachedOrdersListNew.add(ordersListNewOrdersToAttach);
            }
            ordersListNew = attachedOrdersListNew;
            customers.setOrdersList(ordersListNew);
            customers = em.merge(customers);
            for (Orders ordersListNewOrders : ordersListNew) {
                if (!ordersListOld.contains(ordersListNewOrders)) {
                    Customers oldEmailOfOrdersListNewOrders = ordersListNewOrders.getEmail();
                    ordersListNewOrders.setEmail(customers);
                    ordersListNewOrders = em.merge(ordersListNewOrders);
                    if (oldEmailOfOrdersListNewOrders != null && !oldEmailOfOrdersListNewOrders.equals(customers)) {
                        oldEmailOfOrdersListNewOrders.getOrdersList().remove(ordersListNewOrders);
                        oldEmailOfOrdersListNewOrders = em.merge(oldEmailOfOrdersListNewOrders);
                    }
                }
            }
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                String id = customers.getEmail();
                if (findCustomers(id) == null) {
                    throw new NonexistentEntityException("The customers with id " + id + " no longer exists.");
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
            Customers customers;
            try {
                customers = em.getReference(Customers.class, id);
                customers.getEmail();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The customers with id " + id + " no longer exists.", enfe);
            }
            List<String> illegalOrphanMessages = null;
            List<Orders> ordersListOrphanCheck = customers.getOrdersList();
            for (Orders ordersListOrphanCheckOrders : ordersListOrphanCheck) {
                if (illegalOrphanMessages == null) {
                    illegalOrphanMessages = new ArrayList<String>();
                }
                illegalOrphanMessages.add("This Customers (" + customers + ") cannot be destroyed since the Orders " + ordersListOrphanCheckOrders + " in its ordersList field has a non-nullable email field.");
            }
            if (illegalOrphanMessages != null) {
                throw new IllegalOrphanException(illegalOrphanMessages);
            }
            em.remove(customers);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public List<Customers> findCustomersEntities() {
        return findCustomersEntities(true, -1, -1);
    }

    public List<Customers> findCustomersEntities(int maxResults, int firstResult) {
        return findCustomersEntities(false, maxResults, firstResult);
    }

    private List<Customers> findCustomersEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(Customers.class));
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

    public Customers findCustomers(String id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(Customers.class, id);
        } finally {
            em.close();
        }
    }

    public int getCustomersCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<Customers> rt = cq.from(Customers.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }
    
}
