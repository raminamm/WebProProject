<%-- 
    Document   : registation
    Created on : Sep 13, 2020, 3:51:50 PM
    Author     : Admin
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Register Form</h1>
        <form action="registation" method="post">
            <table style="with: 50%">
                <tr>
                    <td>Email</td>
                    <td><input type="email"name="email"></td>
                </tr>
                <tr>
                    <td>First Name</td>
                    <td><input type="text" name="firstname" /></td>
                </tr>
                <tr>
                    <td>Last Name</td>
                    <td><input type="text" name="lastname" /></td>
                </tr>
                <tr>
                    <td>phone no.</td>
                    <td><input type="text"name="phone_no"></td>
                </tr>
                <tr>
                    <td>date_of_birth</td>
                    <td><input type="date"name="date_of_birth"></td>
                </tr>
                <tr>
                    <td>sex</td>
                    <input type="radio" id="male" name="gender" value="male">
                    <label for="male">Male</label><br>
                    <input type="radio" id="female" name="gender" value="female">
                    <label for="female">Female</label><br>
                </tr>
                <tr>
                    <td>Password</td>
                    <td><input type="password" name="password" /></td>
                </tr>
                <tr>
                    <td>Address</td>
                    <td style="color: red"><input type="text" name="address" /><div>${message}</div></td>
                </tr>
                </table>
            <input type="submit" value="Submit" /></form>
        
    </body>
</html>
