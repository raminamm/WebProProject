package com.mycompany.webproject.servlet;

import com.mycompany.webproject.controller.ProductJpaController;
import com.mycompany.webproject.entity.Admin;
import com.mycompany.webproject.entity.Category;
import com.mycompany.webproject.entity.Customers;
import com.mycompany.webproject.entity.Product;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.PersistenceException;
import javax.persistence.Query;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
/**
 *
 * @author NAMM
 */
public class AddproductServlet extends HttpServlet {
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
        HttpSession session = request.getSession();
       Admin ad = (Admin) session.getAttribute("admin");
        if (session == null || ad == null ) {
            request.getRequestDispatcher("/LoginAdmin.jsp").forward(request, response);
        }
        try{
        EntityManagerFactory emf
                = Persistence.createEntityManagerFactory("com.mycompany_WebProject_war_1.0-SNAPSHOTPU");
        EntityManager em = emf.createEntityManager();

        String pdid = request.getParameter("productid");
        String name = request.getParameter("productname");
        String price = request.getParameter("price");
        String category = request.getParameter("category");
        String des = request.getParameter("des");

        

        em.getTransaction().begin();
        System.out.println(pdid + ", " + name + ", " + price + ", " + category + ", " + des);
        em.createNativeQuery("insert into product (product_id, name, price, category,productdescription) values ('" + pdid + "','" + name + "','" + price + "','"+ category + "','" + des + "'" + ")").executeUpdate();
        em.getTransaction().commit();
        em.close();
        session.setAttribute("pdid", pdid);
        session.setAttribute("category", category);
        System.out.println(category);
        
        request.getRequestDispatcher("/upload.jsp").forward(request, response);
        }catch (Exception ex){
            request.setAttribute("message", "Product Duplicate");
        request.getRequestDispatcher("/message.jsp").forward(request, response);
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
        HttpSession session = request.getSession();
        Admin a = (Admin) session.getAttribute("admin");
        if (a == null ) {
            //nologin
            request.getRequestDispatcher("AdminLogin").forward(request, response);
        }
        EntityManagerFactory emf
                = Persistence.createEntityManagerFactory("com.mycompany_WebProject_war_1.0-SNAPSHOTPU");
        EntityManager em = emf.createEntityManager();
        String cat = "select c from Category c";
        Query c = em.createQuery(cat);
        List<Category> allcat = c.getResultList();
        request.setAttribute("allcat", allcat);
        request.getRequestDispatcher("Addproduct.jsp").forward(request, response);
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
