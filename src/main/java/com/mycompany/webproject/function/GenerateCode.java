/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.webproject.function;

/**
 *
 * @author glajaja
 */
// Java code to explain how to generate OTP 
public class GenerateCode { 
//declaring a of return type String 
//which on calling provides the otp 
    
	

    public static String gencode() {
        //int randomPin declared to store the otp
        //since we using Math.random() hence we have to type cast it int
        //because Math.random() returns decimal value
        int randomPin =(int) (Math.random()*9000000)+1000000; 
        String otp = String.valueOf(randomPin);
        return otp; //returning value of otp 
    }
			
}// Here we are using Math.random() function. 
// class in Java 
