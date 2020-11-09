/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.webproject.servlet;

import com.mycompany.webproject.entity.Category;
import com.mycompany.webproject.entity.Customers;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.ResultSet;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.persistence.TypedQuery;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author glajaja
 */
public class addressServlet extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("com.mycompany_WebProject_war_1.0-SNAPSHOTPU");
        EntityManager em = emf.createEntityManager();

        HttpSession catsession = request.getSession();
        if (catsession.getAttribute("allcat") == null) {
            String cat = "select c from Category c";
            Query c = em.createQuery(cat);
            List<Category> allcat = c.getResultList();
            catsession.setAttribute("allcat", allcat);
        }

        HttpSession session = request.getSession();
        Customers cs = (Customers) session.getAttribute("email");
        if (cs == null) {
            request.getRequestDispatcher("/Login").forward(request, response);
        }

//        Customers cus = em.find(Customers.class, cs.getEmail());
//        Query q = em.createNativeQuery("select * from customers where email like '"+cs.getEmail()+"'");
//        Customers c = (Customers) q.getSingleResult();
//        Query q = em.createNativeQuery("select * from customers where email like '" + cs.getEmail() + "'");
//        cs = (Customers) q.getSingleResult();
        TypedQuery<Customers> query = em.createQuery(
                "SELECT c FROM Customers c WHERE c.email = ?1", Customers.class);
        String email = cs.getEmail();
        Customers c = query.setParameter(1, email).getSingleResult();
        System.out.println(c.toString());
        System.out.println(cs.getAddress() + ":" + cs.getAddress1());
        request.setAttribute("customer", cs);
        request.getRequestDispatcher("/address.jsp").forward(request, response);

    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String address = request.getParameter("address");
        String address1 = request.getParameter("address1");
        HttpSession session = request.getSession();
        Customers c = (Customers) session.getAttribute("email");
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("com.mycompany_WebProject_war_1.0-SNAPSHOTPU");
        EntityManager em = emf.createEntityManager();
        if (address1 == null) {
            em.getTransaction().begin();
            em.createNativeQuery("UPDATE customers set address ='" + address + "' where email = '" + c.getEmail() + "'")
                    .executeUpdate();
            em.getTransaction().commit();
            em.close();
            Customers cs = (Customers) session.getAttribute("email");
            cs.setAddress(address);
            request.setAttribute("customer", cs);
        request.getRequestDispatcher("/address.jsp").forward(request, response);
        }
        em.getTransaction().begin();
        em.createNativeQuery("UPDATE customers set address ='" + address + "',address1 = '" + address1 + "' where email = '" + c.getEmail() + "'")
                .executeUpdate();
        em.getTransaction().commit();
        em.close();
        Customers cs = (Customers) session.getAttribute("email");
        cs.setAddress(address);
        cs.setAddress1(address1);
        request.setAttribute("customer", cs);
        request.getRequestDispatcher("/address.jsp").forward(request, response);
//        doGet(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
