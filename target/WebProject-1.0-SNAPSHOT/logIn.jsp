<%-- 
    Document   : singIn
    Created on : Sep 9, 2020, 11:32:40 PM
    Author     : NAMM
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html lang="en">

    <head>
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
        <meta name="description" content="">
        <meta name="author" content="Mark Otto, Jacob Thornton, and Bootstrap contributors">
        <meta name="generator" content="Jekyll v4.1.1">
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css"
              integrity="sha384-JcKb8q3iqJ61gNV9KGb8thSsNjpSL0n8PARn9HuZOnIxN0hoP+VmmDGMN5t9UJ0Z" crossorigin="anonymous">
        <link rel="icon" type="image/gif" href="images/097-user.png">

        <title>LogIn</title>
    <link rel="icon" href="logo/ทดลอง2.png">

        <style>
            .bd-placeholder-img {
                font-size: 1.125rem;
                text-anchor: middle;
                -webkit-user-select: none;
                -moz-user-select: none;
                -ms-user-select: none;
                user-select: none;
            }

            @media (min-width: 768px) {
                .bd-placeholder-img-lg {
                    font-size: 3.5rem;
                }
            }

            element.style {
                padding-top: 0px;
                margin-bottom: 0px;
            }

            .text-center {
                text-align: center !important;
            }

            body {
                display: -ms-flexbox;
                display: flex;
                -ms-flex-align: center;
                align-items: center;
                padding-top: 0px;
                padding-bottom: 0px;
            }





            html,
            body {
                height: 100%;
            }

            body {
                margin: 0;
                font-family: -apple-system, BlinkMacSystemFont, "Segoe UI",
                    Roboto, "Helvetica Neue", Arial, "Noto Sans", sans-serif, "Apple Color Emoji",
                    "Segoe UI Emoji", "Segoe UI Symbol", "Noto Color Emoji";
                font-size: 1rem;
                font-weight: 400;
                line-height: 1.5;
                color: #212529;
                text-align: center;
                /*             background-color: rgb(222, 194, 255);
                */
            }

            *,
            ::after,
            ::before {
                box-sizing: border-box;
            }

            user agent stylesheet body {
                display: block;
                margin: 0px;
            }

            html {
                font-family: sans-serif;
                line-height: 1.15;
                -webkit-text-size-adjust: 100%;
                -webkit-tap-highlight-color: transparent;
            }

            *,
            ::after,
            ::before {
                box-sizing: border-box;
            }

            *,
            ::after,
            ::before {
                box-sizing: border-box;
            }

            /*         from{
                display: flex;
                justify-content: center;
                height: 200px;
                width: 100%;
    
                d-flex flex-column align-items-center
                d-flex flex-column align-items-center
            } */

            .mb-3,
            .my-3 {
                margin-bottom: 1rem;
            }

            #container {
                display: flexbox;
                align-items: center;
                justify-content: center;
                /*             margin-left: 650px;
                margin-right: 0px; */
                padding-top: 0px;
                padding-right: 610px;
                padding-left: 610px;
                padding-bottom: 0px;
                /*             padding-left: 618.5px; */
                width: 100%;
            }


            label {
                width: 300px;
                height: 0px;
                padding: 10px;
                line-height: 0px;
                float: left;
                padding: 2px 5px;
                margin: 5px 0 38px 0px;

            }

            body{
                background-image: url('images/pexels-thaís-silva-3385234.jpg');
                background-repeat: no-repeat;
                background-attachment: fixed;
                background-size: cover;
                background-position-y: bottom;
                filter: opacity(82%);
            } 

            .btn {background-color: #ec5f5f;}
             .alert {
            padding: 5px;
            background-color: #f44336;
            color: white;
            opacity: 1;
            transition: opacity 0.6s;
            margin-bottom: 15px;
        }

        .alert.warning {
            background-color: #ff9800;
            font-size: 10px;
        }

        .closebtn {
            margin-left: 15px;
            color: white;
            font-weight: bold;
            float: right;
            font-size: 15px;
            line-height: 5px;
            cursor: pointer;
            transition: 0.3s;
        }

        .closebtn:hover {
            color: black;
        }


        </style>

        <link href="signin.css" rel="stylesheet">




    </head>


    <script language=Javascript>
        function ResizeTable() {
        var objTable = document.getElementById("maintable");
        objTable.style.width = (screen.width - 20);
        objTable.style.height = (screen.height - 100);
        }
    </script>

    <body bgcolor=white leftmargin=0 topmargin=0 onLoad="ResizeTable();">
        <!--ตาราง พื้นที่แสดงผล เพื่อปรับขนาดพื้นที่ให้อยู่ตรงกลางจอภาพ-->

        <table id=maintable border=0 cellpadding=0 cellspacing=0 align=center width=100%>

            <td style="color: red" align=center valign=middle>
                <!--                 ข้อความนี้อยู่กลางจอภาพ
                                <br />มีความกว้างทั้งหมดไม่เกินความกว้าง
                                <br />และสูงของ จอภาพ -->    
                <form class="form-signin"action="Login" method="POST">

                    <div id="container" class="bbb">
                        <img class="mb-4" src="images/Asset 1.png" alt="" width="72" height="72">
                        <h1 class="h3 mb-3 font-weight-normal text-white">Please sign in</h1>
                        <label for="inputEmail" class="sr-only"></label><!-- Email address -->
                        <input type="email" id="inputEmail" class="form-control" placeholder="Email address"
                               style="border-radius: 5px 5px 0px 0px;height: 48px;" required="" autofocus=""name="email"value="${cookie.ck1_email.value}">
                        <label for="inputPassword" class="sr-only" ></label><!-- Password -->
                        <input type="password" id="inputPassword" class="form-control" placeholder="Password"
                               style="border-radius: 0px 0px 5px 5px;height: 48px;" required=""name="password"value="${cookie.ck2_pass.value}">
                        <c:choose>
                            <c:when test="${message!=null}">
                        <div class="alert warning">
                            <span class="closebtn">&times;</span>
                            ${message}
                        </div>
                        </c:when>
                        </c:choose>
                        <script>
                            var close = document.getElementsByClassName("closebtn");
                            var i;

                            for (i = 0; i < close.length; i++) {
                                close[i].onclick = function () {
                                    var div = this.parentElement;
                                    div.style.opacity = "0";
                                    setTimeout(function () { div.style.display = "none"; }, 600);
                                }
                            }
                            
                        
                        </script>
                        
                        <div class="checkbox mb-3 text-white">                                
                            <input type="checkbox" value="remember-me"name="remember"> Remember me
                        </div>
                        <button class="btn btn-lg btn-danger btn-block" type="submit"name="Login">Sign in</button>
                        <br><p class="h8 mb-3 font-weight-normal text-white">━━━━━━━━━━━━━━━ OR ━━━━━━━━━━━━━━━</p>
                    </div>
                </form>
                <div id="container" class="bbb">
                    <form action="register" method="GET">
                        <button class="btn btn-lg btn-danger btn-block" type="submit">Register</button>
                    </form>
                </div>
            </td>
        </tr>
    </table>
    <!--จบ ตาราง พื้นที่แสดงผล เพื่อปรับขนาดพื้นที่ให้อยู่ตรงกลางจอภาพ-->

    <script src="https://code.jquery.com/jquery-3.5.1.slim.min.js"
            integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj"
    crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js"
            integrity="sha384-9/reFTGAW83EW2RDu2S0VKaIzap3H66lZH81PoYlFhbGU+6BZp6G7niu735Sk7lN"
    crossorigin="anonymous"></script>
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"
            integrity="sha384-B4gt1jrGC7Jh4AgTPSdUtOBvfO8shuf57BaghqFfPlYxofvL8/KUEfYiJOMMV+rV"
    crossorigin="anonymous"></script>
</body>


</html>