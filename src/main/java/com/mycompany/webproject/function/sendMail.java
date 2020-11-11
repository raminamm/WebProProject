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
    private final String from = "NOG";//change accordingly
    private final String username = "nogPJ248@gmail.com";//change accordingly
    private final String password = "NOGnog248";//change accordingly

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
        props.put("mail.smtp.host", "smtp.gmail.com");
        props.put("mail.smtp.port", "587");
        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.starttls.enable", "true");

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
            message.setSubject("Your NOG Account - Verify Your Email Address");
//            message.setText("Dear "+this.emailAddressTo+",\n" +
//"Please verify your email address to complete your NOG Account. " + massage);
            message.setContent("<body marginheight=\"0\" topmargin=\"0\" marginwidth=\"0\" style=\"margin: 0px; background-color: #f2f3f8;\" leftmargin=\"0\">\n" +
"    <!--100% body table-->\n" +
"    <table cellspacing=\"0\" border=\"0\" cellpadding=\"0\" width=\"100%\" bgcolor=\"#f2f3f8\"\n" +
"        style=\"@import url(https://fonts.googleapis.com/css?family=Rubik:300,400,500,700|Open+Sans:300,400,600,700); font-family: 'Open Sans', sans-serif;\">\n" +
"        <tr>\n" +
"            <td>\n" +
"                <table style=\"background-color: #f2f3f8; max-width:670px;  margin:0 auto;\" width=\"100%\" border=\"0\"\n" +
"                    align=\"center\" cellpadding=\"0\" cellspacing=\"0\">\n" +
"                    <tr>\n" +
"                        <td style=\"height:80px;\">&nbsp;</td>\n" +
"                    </tr>\n" +
"                    <tr>\n" +
"                        <td style=\"height:20px;\">&nbsp;</td>\n" +
"                    </tr>\n" +
"                    <tr>\n" +
"                        <td>\n" +
"                            <table width=\"95%\" border=\"0\" align=\"center\" cellpadding=\"0\" cellspacing=\"0\"\n" +
"                                style=\"max-width:670px;background:#fff; border-radius:3px; text-align:center;-webkit-box-shadow:0 6px 18px 0 rgba(0,0,0,.06);-moz-box-shadow:0 6px 18px 0 rgba(0,0,0,.06);box-shadow:0 6px 18px 0 rgba(0,0,0,.06);\">\n" +
"                                <tr>\n" +
"                                    <td style=\"height:40px;\">&nbsp;</td>\n" +
"                                </tr>\n" +
"                                <tr>\n" +
"                                    <td style=\"padding:0 35px;\">\n" +
"                                        <h1 style=\"color:#1e1e2d; font-weight:500; margin:0;font-size:32px;font-family:'Rubik',sans-serif;\">Please verify your email address to complete yor NOG account&nbsp;</h1>\n" +
"                                        <p></p>\n" +
"                                        <p style=\"color:#455056; font-size:15px;line-height:24px; margin:0;\">\n" +
"                                      Thank you for registering for NOG account. To access website ,Please Activate your account by clicking the  link.&nbsp; Enjoy using your account!</p>\n" +
"                                        <a href=\""+massage+"\"\n" +
"                                            style=\"background:#000000;text-decoration:none !important; font-weight:500; margin-top:35px; color:#fff;text-transform:uppercase; font-size:14px;padding:10px 24px;display:inline-block;border-radius:50px;\">Verify Email Address</a>\n" +
"                                    </td>\n" +
"                                </tr>\n" +
"                                <tr>\n" +
"                                    <td style=\"height:40px;\">&nbsp;</td>\n" +
"                                </tr>\n" +
"                            </table>\n" +
"                        </td>\n" +
"                    <tr>\n" +
"                        <td style=\"height:20px;\">&nbsp;</td>\n" +
"                    </tr>\n" +
"                    <tr>\n" +
"                        <td style=\"text-align:center;\">\n" +
"                            <p style=\"font-size:14px; color:rgba(69, 80, 86, 0.7411764705882353); line-height:18px; margin:0 0 0;\">&copy; <strong>NOG</strong></p>\n" +
"                        </td>\n" +
"                    </tr>\n" +
"                    <tr>\n" +
"                        <td style=\"height:80px;\">&nbsp;</td>\n" +
"                    </tr>\n" +
"                </table>\n" +
"            </td>\n" +
"        </tr>\n" +
"    </table>\n" +
"</body>", "text/html; charset=utf-8");
            Transport.send(message);

            System.out.println("Sent activateurl successfully....");

        } catch (MessagingException e) {
            throw new RuntimeException(e);
        }
    }
     
    
    public void SendResetPasswordUrl(String emailAddressTo, String data) {
        Properties props = new Properties();
        props.put("mail.smtp.host", "smtp.gmail.com");
        props.put("mail.smtp.port", "587");
        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.starttls.enable", "true");

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
            message.setSubject("Your NOG Account - ResetPassword");
//            message.setText("Dear "+emailAddressTo+",\n" +
//"Please Reset you Password in this URL. " + data);
            message.setContent("<body marginheight=\"0\" topmargin=\"0\" marginwidth=\"0\" style=\"margin: 0px; background-color: #f2f3f8;\" leftmargin=\"0\">\n" +
"    <!--100% body table-->\n" +
"    <table cellspacing=\"0\" border=\"0\" cellpadding=\"0\" width=\"100%\" bgcolor=\"#f2f3f8\"\n" +
"        style=\"@import url(https://fonts.googleapis.com/css?family=Rubik:300,400,500,700|Open+Sans:300,400,600,700); font-family: 'Open Sans', sans-serif;\">\n" +
"        <tr>\n" +
"            <td>\n" +
"                <table style=\"background-color: #f2f3f8; max-width:670px;  margin:0 auto;\" width=\"100%\" border=\"0\"\n" +
"                    align=\"center\" cellpadding=\"0\" cellspacing=\"0\">\n" +
"                    <tr>\n" +
"                        <td style=\"height:80px;\">&nbsp;</td>\n" +
"                    </tr>\n" +
"                    <tr>\n" +
"                        <td style=\"height:20px;\">&nbsp;</td>\n" +
"                    </tr>\n" +
"                    <tr>\n" +
"                        <td>\n" +
"                            <table width=\"95%\" border=\"0\" align=\"center\" cellpadding=\"0\" cellspacing=\"0\"\n" +
"                                style=\"max-width:670px;background:#fff; border-radius:3px; text-align:center;-webkit-box-shadow:0 6px 18px 0 rgba(0,0,0,.06);-moz-box-shadow:0 6px 18px 0 rgba(0,0,0,.06);box-shadow:0 6px 18px 0 rgba(0,0,0,.06);\">\n" +
"                                <tr>\n" +
"                                    <td style=\"height:40px;\">&nbsp;</td>\n" +
"                                </tr>\n" +
"                                <tr>\n" +
"                                    <td style=\"padding:0 35px;\">\n" +
"                                        <h1 style=\"color:#1e1e2d; font-weight:500; margin:0;font-size:32px;font-family:'Rubik',sans-serif;\">You have\n" +
"                                            requested to reset your password</h1>\n" +
"                                        <p></p>\n" +
"                                        <p style=\"color:#455056; font-size:15px;line-height:24px; margin:0;\">\n" +
"                                            We cannot simply send you your old password. A unique link to reset your\n" +
"                                            password has been generated for you. To reset your password, click the\n" +
"                                            following link and follow the instructions.\n" +
"                                        </p>\n" +
"                                        <a href=\""+data+"\"\n" +
"                                            style=\"background:#000000;text-decoration:none !important; font-weight:500; margin-top:35px; color:#fff;text-transform:uppercase; font-size:14px;padding:10px 24px;display:inline-block;border-radius:50px;\">Reset\n" +
"                                            Password</a>\n" +
"                                    </td>\n" +
"                                </tr>\n" +
"                                <tr>\n" +
"                                    <td style=\"height:40px;\">&nbsp;</td>\n" +
"                                </tr>\n" +
"                            </table>\n" +
"                        </td>\n" +
"                    <tr>\n" +
"                        <td style=\"height:20px;\">&nbsp;</td>\n" +
"                    </tr>\n" +
"                    <tr>\n" +
"                        <td style=\"text-align:center;\">\n" +
"                            <p style=\"font-size:14px; color:rgba(69, 80, 86, 0.7411764705882353); line-height:18px; margin:0 0 0;\">&copy; <strong>NOG</strong></p>\n" +
"                        </td>\n" +
"                    </tr>\n" +
"                    <tr>\n" +
"                        <td style=\"height:80px;\">&nbsp;</td>\n" +
"                    </tr>\n" +
"                </table>\n" +
"            </td>\n" +
"        </tr>\n" +
"    </table>\n" +
"</body>", "text/html;charset=utf-8");
            Transport.send(message);

            System.out.println("Sent resetpassword successfully....");

        } catch (MessagingException e) {
            throw new RuntimeException(e);
        }
    }
    
}
