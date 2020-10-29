/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.webproject.servlet;

import com.mycompany.webproject.entity.Category;
import com.mycompany.webproject.entity.Customersforverify;
import com.mycompany.webproject.function.AES;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author glajaja
 */
public class ActivateServlet extends HttpServlet {

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
        String email = request.getParameter("email");
        String key = request.getParameter("key");
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("com.mycompany_WebProject_war_1.0-SNAPSHOTPU");
        EntityManager em = emf.createEntityManager();
        String category = "select c from Category c";
        Query c = em.createQuery(category);
        List<Category> allcat = c.getResultList();
        request.setAttribute("allcat", allcat);
        String verifykey = AES.decrypt(key);
        
//        String customer = "select c from customersforverify c where email like"+email+"and verifykey like"+verifykey;
//        Query query = em.createQuery(customer);
//        Customersforverify cus = query.getSingleResult();
        Customersforverify cus = em.find(Customersforverify.class, email);
        if(cus==null&&verifykey.equals(cus.getVerifykey())){
            request.setAttribute("message", "Your NOG account are Activated");
            request.getRequestDispatcher("/Activate.jsp").forward(request, response);
            em.getTransaction().begin();
        em.createNativeQuery("Insert into customer (email, firstname, lastname, phone_no, date_of_birth, sex, password, address) "
                + "select (email, firstname, lastname, phone_no, date_of_birth, sex, password, address) where email like '"+email+"' and verify like '"+verifykey+"';"
                        + "DELETE FROM customersforverify WHERE where email like '"+email+"' and verify like '"+verifykey+"';")
                
                .executeUpdate();
            em.getTransaction().commit();
            em.close();
        }
        request.setAttribute("message", "Invalid!!! Verifycode");
        request.getRequestDispatcher("/Activate.jsp").forward(request, response);
        
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
