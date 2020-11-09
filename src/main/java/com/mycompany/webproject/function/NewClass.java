/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.webproject.function;

import com.mycompany.webproject.entity.Category;
import com.mycompany.webproject.entity.Product;
import com.mycompany.webproject.model.Cart;
import java.net.URLEncoder;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.Timestamp;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import static java.time.LocalDateTime.now;
import java.time.ZoneOffset;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
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
//
//
//        String key = AES.encrypt("glaa656@hotmail.co.th");
//        
//        s.SendResetPasswordUrl("glaa656@hotmail.co.th", "http://localhost:8080/WebProProject/ResetPassword?key="+key+"");

//        for(int i = 0; i < 50; i++){
//        String key = AES.encrypt("rachawas8040@gmail.com");
        String key = AES.encrypt("oatter@hotmail.com");
        System.out.println("Encrypt :"+key);
//            
//        }
//        String dy = AES.decrypt("VcFCa4C++/2RsG1r/6vwFTwXMHuY1L/qR0nfBpkFkDA");
        String dy = AES.decrypt("OUnNX139JicQlmE/Hf+IGMDjx3NAp74fkRP0FKw710w");
        System.out.println("Dycrypt :"+dy);
        
        System.out.println("------");
        
//        String key1 = AES.encrypt("oatter@hotmail.com");
//        StringBuilder str = new StringBuilder();
//                   str.append("http://localhost:8080/WebProProject/UpdatePassword?key=");
//                   str.append(key1);
//                   System.out.println(str.toString());
//                   
                   
        
        
                   


//        String key = AES.encrypt("6119053");
//        System.out.println("Encrypt :"+key);
//        String dy = AES.decrypt(key);
//        System.out.println("Dycrypt :"+dy);

        //LocalDateTime now = LocalDateTime.now();
       // int e = Integer.parseInt(now.toString());
        //System.out.println(e);
        
        GregorianCalendar c = new GregorianCalendar();
    c.setTime(Date.from(Instant.now()));
    int day = c.get(Calendar.DAY_OF_MONTH);
    int month = c.get(Calendar.MONTH);
    int year = c.get(Calendar.YEAR);
    int hour = c.get(Calendar.HOUR);
    int minute = c.get(Calendar.MINUTE);
    String date = ""+day+month+year+hour+minute+"";
    System.out.println(date);
    
<<<<<<< HEAD
=======
    
>>>>>>> master

}}
