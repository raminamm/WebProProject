/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.webproject.controller;

import com.mycompany.webproject.controller.exceptions.NonexistentEntityException;
import com.mycompany.webproject.controller.exceptions.PreexistingEntityException;
import com.mycompany.webproject.entity.Customersforverify;
import java.io.Serializable;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Query;
import javax.persistence.EntityNotFoundException;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

/**
 *
 * @author glajaja
 */
public class CustomersforverifyJpaController implements Serializable {

    public CustomersforverifyJpaController(EntityManagerFactory emf) {
        this.emf = emf;
    }
    private EntityManagerFactory emf = null;

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void create(Customersforverify customersforverify) throws PreexistingEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            em.persist(customersforverify);
            em.getTransaction().commit();
        } catch (Exception ex) {
            if (findCustomersforverify(customersforverify.getEmail()) != null) {
                throw new PreexistingEntityException("Customersforverify " + customersforverify + " already exists.", ex);
            }
            throw ex;
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(Customersforverify customersforverify) throws NonexistentEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            customersforverify = em.merge(customersforverify);
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                String id = customersforverify.getEmail();
                if (findCustomersforverify(id) == null) {
                    throw new NonexistentEntityException("The customersforverify with id " + id + " no longer exists.");
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
            Customersforverify customersforverify;
            try {
                customersforverify = em.getReference(Customersforverify.class, id);
                customersforverify.getEmail();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The customersforverify with id " + id + " no longer exists.", enfe);
            }
            em.remove(customersforverify);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public List<Customersforverify> findCustomersforverifyEntities() {
        return findCustomersforverifyEntities(true, -1, -1);
    }

    public List<Customersforverify> findCustomersforverifyEntities(int maxResults, int firstResult) {
        return findCustomersforverifyEntities(false, maxResults, firstResult);
    }

    private List<Customersforverify> findCustomersforverifyEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(Customersforverify.class));
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

    public Customersforverify findCustomersforverify(String id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(Customersforverify.class, id);
        } finally {
            em.close();
        }
    }

    public int getCustomersforverifyCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<Customersforverify> rt = cq.from(Customersforverify.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }
    
}
