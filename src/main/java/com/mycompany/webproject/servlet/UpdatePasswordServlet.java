/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.webproject.servlet;

import com.mycompany.webproject.function.AES;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.URLEncoder;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.PersistenceUnit;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Rachawas
 */
@WebServlet(name = "UpdatePasswordServlet", urlPatterns = {"/UpdatePassword"})
public class UpdatePasswordServlet extends HttpServlet {
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
        String password = request.getParameter("password");
        String conpassword = request.getParameter("conpassword");
        String key = request.getParameter("key");
        System.out.println("Key: " + key);
        HttpSession session = request.getSession(true);
        String email = AES.decrypt(key);
        System.out.println("Email: " + email);
        System.out.println(email);
        if (password.equals(conpassword)) {
            EntityManagerFactory emf = Persistence.createEntityManagerFactory("com.mycompany_WebProject_war_1.0-SNAPSHOTPU");
            EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        em.createNativeQuery("update customers set password = '" + password +"' where email like '"+email+"';")
                .executeUpdate();
            em.getTransaction().commit();
            em.close();
        }
        session.invalidate();
        request.getRequestDispatcher("/logIn.jsp").forward(request, response);
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
        String key = request.getParameter("key");
        System.out.println(key+" : "+AES.decrypt(URLEncoder.encode(key, "UTF-8")));
        String email = AES.decrypt(URLEncoder.encode(key, "UTF-8"));
        HttpSession session = request.getSession();
        session.setAttribute("emailrepass", email);
        System.out.println(session);
        request.getRequestDispatcher("/ResetPassword.jsp").forward(request, response);
        
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
