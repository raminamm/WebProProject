<%-- 
    Document   : Login
    Created on : Aug 5, 2020, 4:50:40 PM
    Author     : INT303
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        
    <div style="margin-left: 100px">
            <form action = "Login_1" method="POST">
                <table>
                    <tr style="height: 50px">
                        <td>Customer number: </td>                
                        <td><input type = "email" name ="email"/>
                        </td>                       
                    </tr>
                    <tr style="height: 50px">
                        <td>Password</td>                
                        <td><input type = "password" name="password"/> </td>                       
                    </tr>
                    <tr style="height: 50px">
                        <td><input type = "submit" name ="Login_1"/> </td>                       
                    </tr>
                    <tr style="height: 50px">
                        <td style="color: red">${message}</td>
                    </tr>
                </table>
            </form>
                    </div>
    
</html>
