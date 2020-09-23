<%-- 
    Document   : LoginAdmin
    Created on : Sep 23, 2020, 6:28:16 PM
    Author     : NAMM
--%>

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
    <link rel="icon" type="image/gif" href="images/097-user.png" />

    <title>LogIn Admin</title>

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



        .mb-3,
        .my-3 {
            margin-bottom: 1rem;
        }

        #container {
            display: flexbox;
            align-items: center;
            justify-content: center;
            padding-top: 0px;
            padding-right: 610px;
            padding-left: 610px;
            padding-bottom: 0px;
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

        body {
            background-image: url('images/pexels-stephan-seeber-1261728.jpg');
            background-repeat: no-repeat;
            background-attachment: fixed;
            background-size: cover;
            background-position-y: bottom;
            filter: opacity(90%);
        }

        .btn {
            background-color: #ec5f5f;
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
        <tr>
            <td align=center valign=middle>
                <!--                 ข้อความนี้อยู่กลางจอภาพ
                <br />มีความกว้างทั้งหมดไม่เกินความกว้าง
                <br />และสูงของ จอภาพ -->
                <form class="form-signin"action="AdminLogin" method="POST">
                    <div id="container" class="bbb">
                        <img class="mb-2" src="images/Asset 1.png" alt="" width="72" height="72">
                            <h1 class="h3 mb-3 font-weight-normal text-white">Admin</h1>

                            <div class="form-group">
                                <label for="username" class="sr-only">Username</label>
                                <div class="cols-sm-10">
                                    <div class="input-group">
                                        <span class="input-group-addon"><i class="fa fa-users fa"
                                                aria-hidden="true"></i></span>
                                        <input type="text" class="form-control" name="username" id="username"
                                            placeholder="Username"
                                            style="border-radius: 5px 5px 5px 5px; height: 48px;">
                                    </div>
                                </div>
                            </div>

                            <div class="form-group">
                                <label for="inputPassword" class="sr-only">Password</label>
                                <div class="cols-sm-10">
                                    <div class="input-group">
                                        <span class="input-group-addon"><i class="fa fa-users fa"
                                                aria-hidden="true"></i></span>
                                                <input type="password" id="inputPassword" class="form-control" placeholder="Password"
                                                       required="" style="border-radius: 5px 5px 5px 5px; height: 48px;"name="password">
                                    </div>
                                </div>
                            </div>

                            <button class="btn btn-lg btn-danger btn-block" type="submit">log in</button>

                        </div>
                </form>
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

