/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.webproject.servlet;

import com.mycompany.webproject.entity.Category;
import com.mycompany.webproject.entity.Product;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.PersistenceUnit;
import javax.persistence.Query;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author glajaja
 */
public class ProductListServlet extends HttpServlet {

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
        String sch = request.getParameter("search");
        String category = request.getParameter("category");
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("com.mycompany_WebProject_war_1.0-SNAPSHOTPU");
        EntityManager em = emf.createEntityManager();
        String cat = "select c from Category c";
        Query c = em.createQuery(cat);
        List<Category> allcat = c.getResultList();
        request.setAttribute("allcat", allcat);
        if(category!=null){
            String sql = "select p from Product p where p.category.category like :category";
            Query qry = em.createQuery(sql);
            qry.setParameter("category", "%" + category + "%");
            List<Product> allpd = qry.getResultList();
            request.setAttribute("allpd", allpd);
            request.getRequestDispatcher("/ProductList.jsp").forward(request, response);
        }
        if (sch == null) {
            String sql = "select p from Product p";
            Query qry = em.createQuery(sql);
            List<Product> allpd = qry.getResultList();
            request.setAttribute("allpd", allpd);
            request.getRequestDispatcher("/ProductList.jsp").forward(request, response);
        }
        String sql = "select p from Product p where p.name like :search";
        Query qry = em.createQuery(sql);
        qry.setParameter("search", "%" + sch + "%");
        List<Product> allpd = qry.getResultList();

//        for (Product p : allpd) {
//            System.out.println(p.getCategoryname()+","+p.getProductId()+","+p.getName());
//        }
        request.setAttribute("allpd", allpd);
        request.getRequestDispatcher("/ProductList.jsp").forward(request, response);
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
