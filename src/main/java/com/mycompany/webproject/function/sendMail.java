/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.webproject.function;

import java.util.Properties;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

/**
 *
 * @author glajaja
 */
public class sendMail {

    private String emailAddressTo = new String();
    // Sender's email ID needs to be mentioned
    private final String from = "wachrspong@gmail.com";//change accordingly
    private final String username = "wachrspong@gmail.com";//change accordingly
    private final String password = "24Feb2000";//change accordingly

    // Assuming you are sending email through relay.jangosmtp.net
    private static String host = "smtp.gmail.com";
    private String massage = new String();

    public sendMail() {
    }

    public String getEmailAddressTo() {
        return emailAddressTo;
    }

    public void setEmailAddressTo(String emailAddressTo) {
        this.emailAddressTo = emailAddressTo;
    }

    public String getMassage() {
        return massage;
    }

    public void setMassage(String massage) {
        this.massage = massage;
    }

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public void sendVerifyEmail(String emailAddressTo, String url) {
        this.emailAddressTo = emailAddressTo;
        this.massage = url;
        SendActivateUrl();
    }

    public void SendActivateUrl() {
        Properties props = new Properties();
        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.starttls.enable", "true");
        props.put("mail.smtp.host", "smtp.gmail.com");
        props.put("mail.smtp.port", "587");

        // Get the Session object.
        Session session = Session.getInstance(props,
                new javax.mail.Authenticator() {
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(username, password);
            }
        });

        try {
            MimeMessage message = new MimeMessage(session);
            message.setFrom(new InternetAddress(from));
            message.setRecipients(Message.RecipientType.TO,
                    InternetAddress.parse(emailAddressTo));
            message.setSubject("Testing Subject");
            message.setText("Hello, this is sample for to check send "
                    + "email using JavaMailAPI Your link : " + massage);
            Transport.send(message);

            System.out.println("Sent message successfully....");

        } catch (MessagingException e) {
            throw new RuntimeException(e);
        }
    }

}
