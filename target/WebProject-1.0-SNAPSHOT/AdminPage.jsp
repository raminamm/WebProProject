<%-- 
    Document   : AdminPage
    Created on : Sep 24, 2020, 4:29:31 PM
    Author     : NAMM
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!doctype html>
<html lang="en">

<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <meta name="description" content="">
    <meta name="author" content="Mark Otto, Jacob Thornton, and Bootstrap contributors">
    <meta name="generator" content="Jekyll v4.1.1">
    <title>Admin</title>

    <link rel="canonical" href="https://getbootstrap.com/docs/4.5/examples/product/">

    <!-- Bootstrap CSS -->
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css"
        integrity="sha384-JcKb8q3iqJ61gNV9KGb8thSsNjpSL0n8PARn9HuZOnIxN0hoP+VmmDGMN5t9UJ0Z" crossorigin="anonymous">

    <!-- Favicons -->
    <link rel="apple-touch-icon" href="/docs/4.5/assets/img/favicons/apple-touch-icon.png" sizes="180x180">
    <link rel="icon" href="/docs/4.5/assets/img/favicons/favicon-32x32.png" sizes="32x32" type="image/png">
    <link rel="icon" href="/docs/4.5/assets/img/favicons/favicon-16x16.png" sizes="16x16" type="image/png">
    <link rel="manifest" href="/docs/4.5/assets/img/favicons/manifest.json">
    <link rel="mask-icon" href="/docs/4.5/assets/img/favicons/safari-pinned-tab.svg" color="#563d7c">
    <link rel="icon" href="/docs/4.5/assets/img/favicons/favicon.ico">
    <meta name="msapplication-config" content="/docs/4.5/assets/img/favicons/browserconfig.xml">
    <meta name="theme-color" content="#563d7c">
    <link href="https://fonts.googleapis.com/css2?family=Prompt:wght@300&display=swap" rel="stylesheet">


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

        html[Attributes Style] {
            -webkit-locale: "en";
        }

        user agent stylesheet html {
            display: block;
        }

        * {
            box-sizing: border-box;
        }

        body {
            font-family: 'Prompt', sans-serif;
            /*             background-color:lemonchiffon;
 */
        }

        .album {
            /*             background-color: lemonchiffon;
 */
        }

        .mySlides {
            display: none;
        }

        img {
            vertical-align: middle;
        }


        .slideshow>div {
            position: absolute;
            max-width: 100%;
            width: 100%;
            height: 240px;
            max-height: 100%;
        }

        .slideshow>div>img {
            height: 100%;
            width: 100%;
        }

        .text {
            color: #f2f2f2;
            font-size: 15px;
            padding: 8px 12px;
            position: absolute;
            bottom: 8px;
            width: 100%;
            text-align: center;
        }

        /* Number text (1/3 etc) */
        .numbertext {
            color: #f2f2f2;
            font-size: 12px;
            padding: 8px 12px;
            position: absolute;
            top: 0;
        }

        /* The dots/bullets/indicators */
        .dot {
            height: 15px;
            width: 15px;
            margin: 0 2px;
            background-color: #bbb;
            border-radius: 50%;
            display: inline-block;
            transition: background-color 0.6s ease;
        }

        .active {
            background-color: #717171;
        }

        /* Fading animation */
        .fade {
            -webkit-animation-name: fade;
            -webkit-animation-duration: 2.5s;
            animation-name: fade;
            animation-duration: 2.5s;
        }

        @-webkit-keyframes fade {
            from {
                opacity: .4
            }

            to {
                opacity: 1
            }
        }

        @keyframes fade {
            from {
                opacity: .4
            }

            to {
                opacity: 1
            }
        }

        /* On smaller screens, decrease text size */
        @media only screen and (max-width: 300px) {
            .text {
                font-size: 11px
            }
        }

        .ddd {
            padding-bottom: 400px;
            align-content: center;
            text-align: center;
        }

        .site-header {
            background-color: rgb(34, 34, 34);
        }

        div.gallery:hover,
        a:active {
            border: 1px solid #777;
            text-decoration: none; //เอาขีดเส้นใต้ออก
            background-color: grey;
        }

        * {
            -webkit-box-sizing: border-box;
            -moz-box-sizing: border-box;
            box-sizing: border-box;
        }

        ul.pagination {
            display: inline-block;
            padding: 0;
            margin: 0;
        }

        ul.pagination li {
            display: inline;
        }

        ul.pagination li a {
            color: black;
            float: left;
            padding: 8px 16px;
            text-decoration: none;
            transition: background-color .3s;
            border: 1px solid #ddd;
        }

        .pagination li:first-child a {
            border-top-left-radius: 5px;
            border-bottom-left-radius: 5px;
        }

        .pagination li:last-child a {
            border-top-right-radius: 5px;
            border-bottom-right-radius: 5px;
        }

        ul.pagination li a.active {
            background-color: gray;
            color: white;
            border: 1px solid gray;
        }

        ul.pagination li a:hover:not(.active) {
            background-color: #ddd;
        }

    </style>
    <!-- Custom styles for this template -->
    <link href="product.css" rel="stylesheet">



</head>

<body cz-shortcut-listen="true">
    <nav class="site-header sticky-top py-2">
        <div class="container d-flex flex-column flex-md-row justify-content-between"style="display: block; margin: auto">
            <a class="py-2 d-none d-md-inline-block" href="#" style="text-decoration:none">N O G</a>
            <a class="py-2 d-none d-md-inline-block" href="#" style="text-decoration:none">Order List</a>
            <a class="py-2 d-none d-md-inline-block" href="#" style="text-decoration:none">Add Product</a>
            <a class="py-2 d-none d-md-inline-block" href="#" style="text-decoration:none">Log Out</a>

        </div>
    </nav>

    <!--จบ ตาราง พื้นที่แสดงผล เพื่อปรับขนาดพื้นที่ให้อยู่ตรงกลางจอภาพ-->


<!--     <div class="fff" style="margin-left: 444px;display: block; margin: auto;">
            <a href="#" class="btn btn-secondary" role="button">«</a>
            <a href="#" class="btn btn-outline-secondary" role="button">1</a>
            <a href="#" class="btn btn-outline-secondary" role="button">2</a>
            <a href="#" class="btn btn-outline-secondary" role="button">3</a>
            <a href="#" class="btn btn-outline-secondary" role="button">4</a>
            <a href="#" class="btn btn-secondary" role="button">»</a>

    </div> -->

    <!-- Optional JavaScript -->
    <!-- jQuery first, then Popper.js, then Bootstrap JS -->
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