/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.webproject.servlet;

import com.mycompany.webproject.entity.Category;
import com.mycompany.webproject.entity.Customers;
import com.mycompany.webproject.entity.Discount;
import com.mycompany.webproject.function.GenerateCode;
import com.mycompany.webproject.model.Cart;
import com.mycompany.webproject.model.Cart.LineItem;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDateTime;
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
public class AddOrderServlet extends HttpServlet {

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
        String firstname = request.getParameter("firstname");
        String phone = request.getParameter("phone");
        String address = request.getParameter("address");
        String discountId = request.getParameter("hidcode");
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("com.mycompany_WebProject_war_1.0-SNAPSHOTPU");
        EntityManager em = emf.createEntityManager();
        
        
        HttpSession catsession = request.getSession();
        if(catsession.getAttribute("allcat")==null){
        String cat = "select c from Category c";
        Query c = em.createQuery(cat);
        List<Category> allcat = c.getResultList();
        catsession.setAttribute("allcat", allcat);
        }
        
        HttpSession session = request.getSession();
        if (session == null || session.getAttribute("cart") == null ) {
            request.getRequestDispatcher("/Login").forward(request, response); //fail !!!!
        }
        
        
        Customers c = (Customers)session.getAttribute("email");
        
        Cart cart = (Cart)session.getAttribute("cart");
        LocalDateTime now = LocalDateTime.now();
        String orderid = GenerateCode.genorderid();
        
        Discount d = em.find(Discount.class, discountId);
        em.getTransaction().begin();
        
        em.createNativeQuery("INSERT INTO orders (orderid, email, created, discountId, amount, address) values ('"+orderid+"', '"+c.getEmail()+"', '"+now+"','"+discountId+"', "+cart.getTotalWithpayment()+", '"+address+"')").executeUpdate();
        
        for (LineItem order : cart.getItems()) {
            em.createNativeQuery("INSERT INTO orderdetail (orderdetailid, orderid, product_id, price, quantity) VALUE ('"+orderid+order.getCartid()+"','"+orderid+"','"+order.getProduct().getProductId()+"','"+order.getProduct().getPrice()+"','"+order.getQuantity()+"')").executeUpdate();
        }
        em.getTransaction().commit();
        em.close();
        session.removeAttribute("cart");
        request.getRequestDispatcher("/ProductList").forward(request, response); //orderdetail
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
