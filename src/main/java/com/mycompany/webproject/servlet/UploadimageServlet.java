/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.webproject.servlet;

import com.mycompany.webproject.entity.Product;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;

/**
 *
 * @author glajaja
 */
public class UploadimageServlet extends HttpServlet {

    private static final long serialVersionUID = 1L;
     
    // location to store file uploaded
    private static final String UPLOAD_DIRECTORY = "Product-images";
 
    // upload settings
    private static final int MEMORY_THRESHOLD   = 1024 * 1024 * 3;  // 3MB
    private static final int MAX_FILE_SIZE      = 1024 * 1024 * 40; // 40MB
    private static final int MAX_REQUEST_SIZE   = 1024 * 1024 * 50; // 50MB
 
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
        String pdid = (String) session.getAttribute("pdid");
        String category = (String)session.getAttribute("category");
        System.out.println(category);
        if (!ServletFileUpload.isMultipartContent(request)) {
            // if not, we stop here
            PrintWriter writer = response.getWriter();
            writer.println("Error: Form must has enctype=multipart/form-data.");
            writer.flush();
            return;
        }
 
       
        DiskFileItemFactory factory = new DiskFileItemFactory();
        
        factory.setSizeThreshold(MEMORY_THRESHOLD);
       
        factory.setRepository(new File(System.getProperty("java.io.tmpdir")));
 
        ServletFileUpload upload = new ServletFileUpload(factory);
         
        
        upload.setFileSizeMax(MAX_FILE_SIZE);
         
        
        upload.setSizeMax(MAX_REQUEST_SIZE);
 
    
        String uploadPath = getServletContext().getRealPath("")
                + File.separator + UPLOAD_DIRECTORY;
         
      
        File uploadDir = new File(uploadPath);
        if (!uploadDir.exists()) {
            uploadDir.mkdir();
        }
 
        try {
            
            @SuppressWarnings("unchecked")
            List<FileItem> formItems = upload.parseRequest(request);
 
            if (formItems != null && formItems.size() > 0) {
               
                for (FileItem item : formItems) {
                    
                    if (!item.isFormField()) {
                        String fileName = pdid+".jpg";//new File(item.getName()).getName();
                        String filePath = uploadPath + File.separator + category +File.separator+fileName;
                        File storeFile = new File(filePath);
                        System.out.println("filepath : "+filePath);
                       
                        item.write(storeFile);
                        request.setAttribute("message",
                            "Upload has been done successfully!");
                    }
                }
            }
        } catch (Exception ex) {
            request.setAttribute("message",
                    "There was an error: " + ex.getMessage());
        }
        session.removeAttribute("category");
        session.removeAttribute("pdid");
        getServletContext().getRequestDispatcher("/message.jsp").forward(
                request, response);
    
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
