<%-- 
    Document   : singIn
    Created on : Sep 9, 2020, 11:32:40 PM
    Author     : NAMM
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html lang="en">

<head>
    <!--     <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css"
        integrity="sha384-JcKb8q3iqJ61gNV9KGb8thSsNjpSL0n8PARn9HuZOnIxN0hoP+VmmDGMN5t9UJ0Z" crossorigin="anonymous">
    <title>Document</title> -->
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <meta name="description" content="">
    <meta name="author" content="Mark Otto, Jacob Thornton, and Bootstrap contributors">
    <meta name="generator" content="Jekyll v4.1.1">
    <%--<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css"
        integrity="sha384-JcKb8q3iqJ61gNV9KGb8thSsNjpSL0n8PARn9HuZOnIxN0hoP+VmmDGMN5t9UJ0Z" crossorigin="anonymous">--%>
    <link href="bootstrap-4.5.2-dist/css/bootstrap.min.css" rel="stylesheet" type="text/css"
          integrity="sha384-JcKb8q3iqJ61gNV9KGb8thSsNjpSL0n8PARn9HuZOnIxN0hoP+VmmDGMN5t9UJ0Z" crossorigin="anonymous"/>
    <title>login</title>
    <link rel="icon" type="image/gif" href="images/097-user.png"/>

    <!-- Bootstrap core CSS -->
    <!--     <link href="/docs/4.5/dist/css/bootstrap.min.css" rel="stylesheet"
        integrity="sha384-JcKb8q3iqJ61gNV9KGb8thSsNjpSL0n8PARn9HuZOnIxN0hoP+VmmDGMN5t9UJ0Z" crossorigin="anonymous">
 -->
    <!-- Favicons -->
    <!--     <link rel="apple-touch-icon" href="/docs/4.5/assets/img/favicons/apple-touch-icon.png" sizes="180x180">
    <link rel="icon" href="/docs/4.5/assets/img/favicons/favicon-32x32.png" sizes="32x32" type="image/png">
    <link rel="icon" href="/docs/4.5/assets/img/favicons/favicon-16x16.png" sizes="16x16" type="image/png">
    <link rel="manifest" href="/docs/4.5/assets/img/favicons/manifest.json">
    <link rel="mask-icon" href="/docs/4.5/assets/img/favicons/safari-pinned-tab.svg" color="#563d7c">
    <link rel="icon" href="/docs/4.5/assets/img/favicons/favicon.ico">
    <meta name="msapplication-config" content="/docs/4.5/assets/img/favicons/browserconfig.xml">
    <meta name="theme-color" content="#563d7c"> -->

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
            padding-top: 98px;
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
            padding-top: 40px;
            padding-bottom: 40px;
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
            text-align: left;
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
            margin: 8px;
        }

        :root {
            --blue: #007bff;
            --indigo: #6610f2;
            --purple: #6f42c1;
            --pink: #e83e8c;
            --red: #dc3545;
            --orange: #fd7e14;
            --yellow: #ffc107;
            --green: #28a745;
            --teal: #20c997;
            --cyan: #17a2b8;
            --white: #fff;
            --gray: #6c757d;
            --gray-dark: #343a40;
            --primary: #007bff;
            --secondary: #6c757d;
            --success: #28a745;
            --info: #17a2b8;
            --warning: #ffc107;
            --danger: #dc3545;
            --light: #f8f9fa;
            --dark: #343a40;
            --breakpoint-xs: 0;
            --breakpoint-sm: 576px;
            --breakpoint-md: 768px;
            --breakpoint-lg: 992px;
            --breakpoint-xl: 1200px;
            --font-family-sans-serif: -apple-system, BlinkMacSystemFont, "Segoe UI", Roboto, "Helvetica Neue", Arial, "Noto Sans", 
            sans-serif, "Apple Color Emoji", "Segoe UI Emoji", "Segoe UI Symbol", "Noto Color Emoji";
            --font-family-monospace: SFMono-Regular, Menlo, Monaco, Consolas, "Liberation Mono", "Courier New", monospace;
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
            padding-right: 30px;
            padding-bottom: 80px;
            padding-left: 618.5px;
            width: 100%;
        }


        label {
            width: 300px;
            height: 0px;
            padding: 20px;
            line-height: 5px;
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


    </style>

    <link href="signin.css" rel="stylesheet">

</head>

<body class="text-center" cz-shortcut-listen="true">

    <form class="form-signin">
        <div id="container" class="bbb">
            <img class="mb-4" src="images/Asset 1.png" alt="" width="72" height="72">
            <h1 class="h3 mb-3 font-weight-normal text-white">Please sign in</h1>
            <label for="inputEmail" class="sr-only">Email address</label><!-- Email address -->
            <input type="email" id="inputEmail" class="form-control" placeholder="Email address"
                style="border-radius: 5px 5px 0px 0px;height: 48px;" required="" autofocus="">
            <label for="inputPassword" class="sr-only">Password</label><!-- Password -->
            <input type="password" id="inputPassword" class="form-control" placeholder="Password"
                style="border-radius: 0px 0px 5px 5px;height: 48px;" required="">
            <div class="checkbox mb-3 text-white">
                <label>
                    <input type="checkbox" value="remember-me"> Remember me
                </label>
            </div>
            <button class="btn btn-lg btn-danger btn-block" type="submit">Sign in</button>
            <br><p class="h8 mb-3 font-weight-normal text-white">━━━━━━━━━━━━━━━ OR ━━━━━━━━━━━━━━━</p>
            <button class="btn btn-lg btn-danger btn-block" type="submit">Register</button>
        </div>
    </form>




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