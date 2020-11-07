<%-- 
    Document   : test
    Created on : Nov 5, 2020, 9:30:14 PM
    Author     : Rachawas
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <form id="form" method="POST" action="/UpdatePassword">
        <input type="hidden" id="key" name="key" value=""/>
    </form>
    <script>
        let url = window.location.href
        let key = Array.from(url.split('='))
        document.getElementById('key').value = key[1]
        console.log(document.getElementById('key').value)
        document.getElementById('form').submit()
    </script>
</html>
