/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.webproject.servlet;


import com.mycompany.webproject.entity.Customers;
import com.mycompany.webproject.function.AES;
import com.mycompany.webproject.function.GenerateCode;
import com.mycompany.webproject.function.sendMail;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.util.Calendar;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.PersistenceUnit;
import javax.persistence.Query;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Admin
 */
@WebServlet(name = "NewServlet", urlPatterns = {"/NewServlet"})
public class NewServlet extends HttpServlet {
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
        
        EntityManagerFactory emf
                = Persistence.createEntityManagerFactory("com.mycompany_WebProject_war_1.0-SNAPSHOTPU");
        EntityManager em = emf.createEntityManager();
        //String email = request.getParameter("email");
        //String g = GenerateCode.gencode();

                
//        em.getTransaction().begin();
//        em.createNativeQuery("Insert into customersforverify (email, firstname, lastname, phone_no, date_of_birth, sex, password, address, verifykey) values"
//                + " ('" + email+"','"+fname+"','"+lname+"','"+phone_no+"','"+dob+"','"+sex+"','"+password+"','"+address+"','"+g+"')")
//                .executeUpdate();
//            em.getTransaction().commit();
//            em.close();

//                    String link = "http://localhost:8080/WebProProject/activatePage.jsp?key="+AES.encrypt(email + g);
//                    sendMail sm = new sendMail();
//                    sm.sendVerifyEmail(email, link);
//
//                    request.setAttribute("message", "Success");
//                    request.getRequestDispatcher("/registation.jsp").forward(request, response);

        em.getTransaction().begin();
        LocalDateTime now = LocalDateTime.now();       
        em.createNativeQuery("INSERT INTO orders (orderid, email, created, amount, address) values ('1111111', 'aaa@hotmail.com', '"+now+"', 1200, 'sgegegeg')").executeUpdate();
        em.getTransaction().commit();
        em.close();
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