/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.webproject.function;

import com.mycompany.webproject.model.Cart;
import java.util.List;
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
    
    public void SendOrder(String emailAddressTo, String orderid,Cart cart,double  discount , String address) {
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
            message.setContent("<body style=\"margin: 0 !important; padding: 0 !important; background-color: #eeeeee;\" bgcolor=\"#eeeeee\">\n" +
"    <div style=\"display: none; font-size: 1px; color: #fefefe; line-height: 1px; font-family: Open Sans, Helvetica, Arial, sans-serif; max-height: 0px; max-width: 0px; opacity: 0; overflow: hidden;\">\n" +
"        For what reason would it be advisable for me to think about business content? That might be little bit risky to have crew member like them.\n" +
"    </div>\n" +
"    <table border=\"0\" cellpadding=\"0\" cellspacing=\"0\" width=\"100%\">\n" +
"        <tr>\n" +
"            <td align=\"center\" style=\"background-color: #eeeeee;\" bgcolor=\"#eeeeee\">\n" +
"                <table align=\"center\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\" width=\"100%\" style=\"max-width:600px;\">\n" +
"                    <tr>\n" +
"                        <td align=\"center\" style=\"padding: 35px 35px 20px 35px; background-color: #ffffff;\" bgcolor=\"#ffffff\">\n" +
"                            <table align=\"center\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\" width=\"100%\" style=\"max-width:600px;\">\n" +
"                                <tr>\n" +
"                                    <td align=\"center\" style=\"font-family: Open Sans, Helvetica, Arial, sans-serif; font-size: 16px; font-weight: 400; line-height: 24px; padding-top: 25px;\"> <img src=\"https://img.icons8.com/carbon-copy/100/000000/checked-checkbox.png\" width=\"125\" height=\"120\" style=\"display: block; border: 0px;\" /><br>\n" +
"                                        <h2 style=\"font-size: 30px; font-weight: 800; line-height: 36px; color: #333333; margin: 0;\"> Thank You For Your Order! </h2>\n" +
"                                    </td>\n" +
"                                </tr>\n" +
"                                <tr>\n" +
"                                    <td align=\"left\" style=\"font-family: Open Sans, Helvetica, Arial, sans-serif; font-size: 16px; font-weight: 400; line-height: 24px; padding-top: 10px;\">\n" +
"                                        <p style=\"font-size: 16px; font-weight: 400; line-height: 24px; color: #777777;\"> Thank you so much for your purchase. I hope you are happy with it and I hope to do business with you again. </p>\n" +
"                                    </td>\n" +
"                                </tr>\n" +
"                                <tr>\n" +
"                                    <td align=\"left\" style=\"padding-top: 20px;\">\n" +
"                                        <table cellspacing=\"0\" cellpadding=\"0\" border=\"0\" width=\"100%\">\n" +
"                                            <tr>\n" +
"                                                <td width=\"75%\" align=\"left\" bgcolor=\"#eeeeee\" style=\"font-family: Open Sans, Helvetica, Arial, sans-serif; font-size: 16px; font-weight: 800; line-height: 24px; padding: 10px;\"> Order Confirmation # </td>\n" +
"                                                <td width=\"25%\" align=\"left\" bgcolor=\"#eeeeee\" style=\"font-family: Open Sans, Helvetica, Arial, sans-serif; font-size: 16px; font-weight: 800; line-height: 24px; padding: 10px;\"> "+orderid+" </td>\n" +
"                                            </tr>\n" +
"											\n" +
"                                            <tr>\n" +
"                                                <td width=\"75%\" align=\"left\" style=\"font-family: Open Sans, Helvetica, Arial, sans-serif; font-size: 16px; font-weight: 400; line-height: 24px; padding: 15px 10px 5px 10px;\"> Purchased Item "+cart.getItemCount()+" </td>\n" +
"                                                <td width=\"25%\" align=\"left\" style=\"font-family: Open Sans, Helvetica, Arial, sans-serif; font-size: 16px; font-weight: 400; line-height: 24px; padding: 15px 10px 5px 10px;\"> "+cart.getTotalWithpayment()+" </td>\n" +
"                                            </tr>\n" +
"                                            \n" +
"                                        </table>\n" +
"                                    </td>\n" +
"                                </tr>\n" +
                    
"                                <tr>\n" +
"                                    <td align=\"left\" style=\"padding-top: 20px;\">\n" +
"                                        <table cellspacing=\"0\" cellpadding=\"0\" border=\"0\" width=\"100%\">\n" +
"                                            <tr>\n" +
"                                                <td width=\"75%\" align=\"left\" style=\"font-family: Open Sans, Helvetica, Arial, sans-serif; font-size: 16px; font-weight: 800; line-height: 24px; padding: 10px; border-top: 3px solid #eeeeee; border-bottom: 3px solid #eeeeee;\"> TOTAL </td>\n" +
"                                                <td width=\"25%\" align=\"left\" style=\"font-family: Open Sans, Helvetica, Arial, sans-serif; font-size: 16px; font-weight: 800; line-height: 24px; padding: 10px; border-top: 3px solid #eeeeee; border-bottom: 3px solid #eeeeee;\"> "+cart.getTotalWithDiscount(discount)+" ฿ </td>\n" +
"                                            </tr>\n" +
"                                        </table>\n" +
"                                    </td>\n" +
"                                </tr>\n" +
"                            </table>\n" +
"                        </td>\n" +
"                    </tr>\n" +
"                    <tr>\n" +
"                        <td align=\"center\" height=\"100%\" valign=\"top\" width=\"100%\" style=\"padding: 0 35px 35px 35px; background-color: #ffffff;\" bgcolor=\"#ffffff\">\n" +
"                            <table align=\"center\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\" width=\"100%\" style=\"max-width:660px;\">\n" +
"                                <tr>\n" +
"                                    <td align=\"center\" valign=\"top\" style=\"font-size:0;\">\n" +
"                                        <div style=\"display:inline-block; max-width:50%; min-width:240px; vertical-align:top; width:100%;\">\n" +
"                                            <table align=\"left\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\" width=\"100%\" style=\"max-width:300px;\">\n" +
"                                                <tr>\n" +
"                                                    <td align=\"left\" valign=\"top\" style=\"font-family: Open Sans, Helvetica, Arial, sans-serif; font-size: 16px; font-weight: 400; line-height: 24px;\">\n" +
"                                                        <p style=\"font-weight: 800;\">Delivery Address</p>\n" +
"                                                        <p>"+address+"</p>\n" +
"                                                    </td>\n" +
"                                                </tr>\n" +
"                                            </table>\n" +
"                                        </div>\n" +
"                                        <div style=\"display:inline-block; max-width:50%; min-width:240px; vertical-align:top; width:100%;\"></div>\n" +
"                                    </td>\n" +
"                                </tr>\n" +
"                            </table>\n" +
"                        </td>\n" +
"                    </tr>\n" +
"                    \n" +
"                </table>\n" +
"            </td>\n" +
"        </tr>\n" +
"    </table>\n" +
"</body>\n" +
"\n" +
"</html>", "text/html;charset=utf-8");
            Transport.send(message);

            System.out.println("Sent order successfully....");

        } catch (MessagingException e) {
            throw new RuntimeException(e);
        }
    }
    
}
