/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.webproject.servlet;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

@WebServlet(name = "UploadFile", urlPatterns = {"/UploadFile"},
        initParams = { @WebInitParam(name = "uploadpath", value = "/UploadFile/") })
@MultipartConfig
public class UploadServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws IOException, ServletException {

        response.setContentType("text/plain;charset=UTF-8");

        ServletOutputStream os = response.getOutputStream();

        ServletConfig sc = getServletConfig();
        String path = sc.getInitParameter("uploadpath");
        System.out.println("path : "+path);
        Part filePart = request.getPart("myfile");
        System.out.println("filepart : "+filePart);
        String fileName = filePart.getSubmittedFileName();
        System.out.println("filename : "+fileName);
        InputStream is = filePart.getInputStream();
        System.out.println("is : "+is);

        Files.copy(is, Paths.get(path + fileName),
                StandardCopyOption.REPLACE_EXISTING);

        os.print("File successfully uploaded");
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
        request.getRequestDispatcher("/upload.jsp").forward(
                request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    

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
