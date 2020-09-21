/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.webproject.servlet;

import com.mycompany.webproject.entity.Customers;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDate;
import java.util.Date;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.PersistenceUnit;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Admin
 */
@WebServlet(name = "register", urlPatterns = {"/register"})
public class registerServlet extends HttpServlet {
@PersistenceUnit(unitName = "webpro_Nogproject")
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
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("webpro_Nogproject");
        try{
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        String email = request.getParameter("email");
        String fname = request.getParameter("firstname");
        String lname = request.getParameter("lastname");
        String phone_no = request.getParameter("phone_no");
        String date_of_birth = request.getParameter("date_of_birth");
        String sex = request.getParameter("gender");
        String password = request.getParameter("password");
        String con_password = request.getParameter("password_confirmation");
        String address = request.getParameter("address");
        LocalDate dob = LocalDate.parse(date_of_birth);
        
        if(password.equals(con_password)){                    
        em.createNativeQuery("Insert into customers (email, firstname, lastname, phone_no, date_of_birth, sex, password, address) values"
                + " ('" + email+"','"+fname+"','"+lname+"','"+phone_no+"','"+dob+"','"+sex+"','"+password+"','"+address+"')")
                .executeUpdate();
            em.getTransaction().commit();
            em.close();
            request.setAttribute("message", "Success");
            request.getRequestDispatcher("/register.jsp").forward(request, response);
        }
        request.setAttribute("invalidpass", "Passwords Don't Match");
        request.getRequestDispatcher("/register.jsp").forward(request, response);
        }
        catch  (IOException | ServletException ex){
            request.setAttribute("message", ex.getMessage());
            request.getRequestDispatcher("/register.jsp").forward(request, response);
        
        
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
        request.getRequestDispatcher("/register.jsp").forward(request, response);
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