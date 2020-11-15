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
import javax.servlet.http.HttpSession;

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
        
        HttpSession catsession = request.getSession();
        if(catsession.getAttribute("allcat")==null){
        String cat = "select c from Category c";
        Query c = em.createQuery(cat);
        List<Category> allcat = c.getResultList();
        catsession.setAttribute("allcat", allcat);
        }
        
        String verifykey = AES.decrypt(key);
        

        Customersforverify cus = em.find(Customersforverify.class, email);
        System.out.println(cus);
        if(cus!=null&&verifykey.equals(cus.getVerifykey())){            
            em.getTransaction().begin();
        em.createNativeQuery("Insert into customers (email, firstname, lastname, phone_no, date_of_birth, sex, password, address)" 
                + "select email, firstname, lastname, phone_no, date_of_birth, sex, password, address from customersforverify where email like '"+email+"' and verifykey like '"+verifykey+"'; " )
                .executeUpdate();
        em.createNativeQuery("DELETE FROM customersforverify WHERE email like '"+email+"' and verifykey like '"+verifykey+"';")        
                .executeUpdate();
            em.getTransaction().commit();
            em.close();
            request.setAttribute("message", "Your NOG account are Activated");
            request.setAttribute("photo", "protection");
            request.getRequestDispatcher("/Activate.jsp").forward(request, response);
        }
        request.setAttribute("message", "Invalid ! link");
        request.setAttribute("photo", "cancel");
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
