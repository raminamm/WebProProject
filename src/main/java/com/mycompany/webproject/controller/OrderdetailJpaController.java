/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.webproject.controller;

import com.mycompany.webproject.controller.exceptions.NonexistentEntityException;
import com.mycompany.webproject.controller.exceptions.PreexistingEntityException;
import com.mycompany.webproject.entity.Orderdetail;
import java.io.Serializable;
import javax.persistence.Query;
import javax.persistence.EntityNotFoundException;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import com.mycompany.webproject.entity.Orders;
import com.mycompany.webproject.entity.Product;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

/**
 *
 * @author glajaja
 */
public class OrderdetailJpaController implements Serializable {

    public OrderdetailJpaController(EntityManagerFactory emf) {
        this.emf = emf;
    }
    private EntityManagerFactory emf = null;

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void create(Orderdetail orderdetail) throws PreexistingEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            Orders orderid = orderdetail.getOrderid();
            if (orderid != null) {
                orderid = em.getReference(orderid.getClass(), orderid.getOrderid());
                orderdetail.setOrderid(orderid);
            }
            Product productId = orderdetail.getProductId();
            if (productId != null) {
                productId = em.getReference(productId.getClass(), productId.getProductId());
                orderdetail.setProductId(productId);
            }
            em.persist(orderdetail);
            if (orderid != null) {
                orderid.getOrderdetailList().add(orderdetail);
                orderid = em.merge(orderid);
            }
            if (productId != null) {
                productId.getOrderdetailList().add(orderdetail);
                productId = em.merge(productId);
            }
            em.getTransaction().commit();
        } catch (Exception ex) {
            if (findOrderdetail(orderdetail.getOrderdetailid()) != null) {
                throw new PreexistingEntityException("Orderdetail " + orderdetail + " already exists.", ex);
            }
            throw ex;
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(Orderdetail orderdetail) throws NonexistentEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            Orderdetail persistentOrderdetail = em.find(Orderdetail.class, orderdetail.getOrderdetailid());
            Orders orderidOld = persistentOrderdetail.getOrderid();
            Orders orderidNew = orderdetail.getOrderid();
            Product productIdOld = persistentOrderdetail.getProductId();
            Product productIdNew = orderdetail.getProductId();
            if (orderidNew != null) {
                orderidNew = em.getReference(orderidNew.getClass(), orderidNew.getOrderid());
                orderdetail.setOrderid(orderidNew);
            }
            if (productIdNew != null) {
                productIdNew = em.getReference(productIdNew.getClass(), productIdNew.getProductId());
                orderdetail.setProductId(productIdNew);
            }
            orderdetail = em.merge(orderdetail);
            if (orderidOld != null && !orderidOld.equals(orderidNew)) {
                orderidOld.getOrderdetailList().remove(orderdetail);
                orderidOld = em.merge(orderidOld);
            }
            if (orderidNew != null && !orderidNew.equals(orderidOld)) {
                orderidNew.getOrderdetailList().add(orderdetail);
                orderidNew = em.merge(orderidNew);
            }
            if (productIdOld != null && !productIdOld.equals(productIdNew)) {
                productIdOld.getOrderdetailList().remove(orderdetail);
                productIdOld = em.merge(productIdOld);
            }
            if (productIdNew != null && !productIdNew.equals(productIdOld)) {
                productIdNew.getOrderdetailList().add(orderdetail);
                productIdNew = em.merge(productIdNew);
            }
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                String id = orderdetail.getOrderdetailid();
                if (findOrderdetail(id) == null) {
                    throw new NonexistentEntityException("The orderdetail with id " + id + " no longer exists.");
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
            Orderdetail orderdetail;
            try {
                orderdetail = em.getReference(Orderdetail.class, id);
                orderdetail.getOrderdetailid();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The orderdetail with id " + id + " no longer exists.", enfe);
            }
            Orders orderid = orderdetail.getOrderid();
            if (orderid != null) {
                orderid.getOrderdetailList().remove(orderdetail);
                orderid = em.merge(orderid);
            }
            Product productId = orderdetail.getProductId();
            if (productId != null) {
                productId.getOrderdetailList().remove(orderdetail);
                productId = em.merge(productId);
            }
            em.remove(orderdetail);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public List<Orderdetail> findOrderdetailEntities() {
        return findOrderdetailEntities(true, -1, -1);
    }

    public List<Orderdetail> findOrderdetailEntities(int maxResults, int firstResult) {
        return findOrderdetailEntities(false, maxResults, firstResult);
    }

    private List<Orderdetail> findOrderdetailEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(Orderdetail.class));
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

    public Orderdetail findOrderdetail(String id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(Orderdetail.class, id);
        } finally {
            em.close();
        }
    }

    public int getOrderdetailCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<Orderdetail> rt = cq.from(Orderdetail.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }
    
}
