/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.webproject.servlet;

import com.mycompany.webproject.entity.Customers;
import com.mycompany.webproject.entity.Discount;
import com.mycompany.webproject.model.Cart;
import java.io.IOException;
import java.io.PrintWriter;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.PersistenceContext;
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
@WebServlet(name = "CheckOutServlet", urlPatterns = {"/CheckOut"})
public class CheckOutServlet extends HttpServlet {

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
<<<<<<< Updated upstream
        String fname = request.getParameter("fname");
        String phone = request.getParameter("phone");
        //if()
=======
//        String Redeem = request.getParameter("Redeem");
        //try{
            //Discount d = em.find((Discount.class),Redeem);
            
//        }catch(Exception) {
//            
//        
//            }
//       }
//        String fname = request.getParameter("fname");
//        String phone = request.getParameter("phone");
>>>>>>> Stashed changes
        
//        HttpSession name = request.getSession();
//        Customers c = (Customers)name.getAttribute("email");
//        if( c == null){
//            request.getRequestDispatcher("/Login").forward(request, response);
//        }
        HttpSession cart = request.getSession();
        
        if(cart.getAttribute("cart") == null){
            request.getRequestDispatcher("Cart").forward(request, response);
        }
        
        request.getRequestDispatcher("/CheckOut.jsp").forward(request, response);
               
        
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
        HttpSession email = request.getSession();
        if(email.getAttribute("email") == null){
            request.getRequestDispatcher("Login").forward(request, response);
        }
        HttpSession cart = request.getSession();
        Cart c = (Cart)cart.getAttribute("cart");
        request.setAttribute("total",c.getTotalWithpayment());
        request.getRequestDispatcher("/CheckOut.jsp").forward(request, response);
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
      EntityManagerFactory emf = Persistence.createEntityManagerFactory("com.mycompany_WebProject_war_1.0-SNAPSHOTPU");
      EntityManager em = emf.createEntityManager();
        String Redeem = request.getParameter("Redeem");
        HttpSession cart = request.getSession();
        Cart c = (Cart) cart.getAttribute("cart");
        Discount d = em.find((Discount.class),Redeem);
        if(d != null){
            request.setAttribute("Redeem", d);
            request.setAttribute("total",c.getTotalWithDiscount(d.getDiscount()));
            request.getRequestDispatcher("/CheckOut.jsp").forward(request, response);
            
        }
            request.setAttribute("massage", "Invalid code");
            request.getRequestDispatcher("/CheckOut.jsp").forward(request, response);
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
