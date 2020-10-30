/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.webproject.function;

import com.mycompany.webproject.entity.Category;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.List;

/**
 *
 * @author glajaja
 */
public class NewClass {
    
    public static void main(String[] args) {
//        try{   
//                String sql = "select * from category";
//                Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
//                       Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/nogproject?useSSL=false","root","tooRLQSyM");
//                       Statement stm=conn.createStatement();
//                       ResultSet rs=stm.executeQuery(sql);    
//                while(rs.next()){
//                    System.out.println(rs.getString("category"));
//                    }
//                }catch (Exception ex){
//                    ex.getMessage();
//                }
//    sendMail s = new sendMail();
//    s.sendVerifyEmail("glaa656@hotmail.co.th", "http://localhost:8080/WebProProject/activatePage.jsp?email=");

        String key = AES.encrypt("6119053");
        System.out.println("Encrypt :"+key);
        String dy = AES.decrypt(key);
        System.out.println("Dycrypt :"+dy);
    }
}
