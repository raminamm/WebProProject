/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.webproject.servlet;

import com.mycompany.webproject.entity.Customers;
import java.io.IOException;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.NoResultException;
import javax.persistence.Persistence;
import javax.persistence.PersistenceUnit;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Admin
 */
@WebServlet(name = "LoginServlet", urlPatterns = {"/Login"})
public class LoginServlet extends HttpServlet {

    @PersistenceUnit(unitName = "com.mycompany_WebProject_war_1.0-SNAPSHOTPU")

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
        String email = request.getParameter("email");
        String password = request.getParameter("password");
        boolean remember = request.getParameter("remember") != null;
        //int id = Integer.parseInt(email);

//        Customers c = em.createQuery("select c from Customers c where c.email = :email",Customers.class).
//               setParameter("email", email).getSingleResult();
        try {
            //Customers c = em.createNamedQuery("Customers.findByEmail", Customers.class).setParameter("email", email).getSingleResult();
            Customers c = em.find(Customers.class, email);
            if (c != null && c.getPassword().equals(password)) {
                HttpSession session = request.getSession();
                    session.setAttribute("email", c);                   
                if (remember) {                    
                    Cookie ck1 = new Cookie("ck1_email", email);
                    Cookie ck2 = new Cookie("ck2_pass", password);
                    ck1.setMaxAge(60 * 60 * 24 * 7);
                    ck2.setMaxAge(60 * 60 * 24 * 7);
                    response.addCookie(ck1);
                    response.addCookie(ck2);
                }
                request.getRequestDispatcher("/Home.jsp").forward(request, response);
            } else {
                request.setAttribute("message", "Invalid User Email  or password");
                request.getRequestDispatcher("/logIn.jsp").forward(request, response);
            }
        } catch (NoResultException e) {
            request.setAttribute("message", "Invalid User Email  or password");
            request.getRequestDispatcher("/logIn.jsp").forward(request, response);
        }

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
        //processRequest(request, response);
        request.getRequestDispatcher("/logIn.jsp").forward(request, response);
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
        processRequest(request, response);

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
