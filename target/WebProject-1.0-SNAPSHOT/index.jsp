<%-- 
    Document   : firstpage
    Created on : Aug 29, 2020, 12:47:37 PM
    Author     : NAMM
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!doctype html>
<html lang="en">

<head>
    <!-- Required meta tags -->
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

    <!-- Bootstrap CSS -->
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css"
        integrity="sha384-JcKb8q3iqJ61gNV9KGb8thSsNjpSL0n8PARn9HuZOnIxN0hoP+VmmDGMN5t9UJ0Z" crossorigin="anonymous">

    <title>Home</title>
    <link rel="icon" href="logo/ทดลอง2.png">

    <meta name="description" content="">
    <meta name="author" content="Mark Otto, Jacob Thornton, and Bootstrap contributors">
    <meta name="generator" content="Jekyll v4.1.1">

    <!--         <link rel="canonical" href="https://getbootstrap.com/docs/4.5/examples/cover/">
 -->
    <!-- Bootstrap core CSS -->
    <!--     <link href="/docs/4.5/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-JcKb8q3iqJ61gNV9KGb8thSsNjpSL0n8PARn9HuZOnIxN0hoP+VmmDGMN5t9UJ0Z" crossorigin="anonymous">
 -->
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
        
/*         font-family: 'ชื่อฟ้อนต์อังกฤษ', 'ชื่อฟ้อนต์ไทย', sans-serif; */
/* font-family: 'Prompt', sans-serif;*/

        html {
            font-family: 'Prompt', sans-serif;            
            line-height: 1.15;
            -webkit-text-size-adjust: 100%;
            -webkit-tap-highlight-color: transparent;
        }

        .text-center {
            text-align: center !important;
        }

        body {
            display: -ms-flexbox;
            display: flex;
            color: #fff;
            text-shadow: 0 0.05rem 0.1rem rgba(0, 0, 0, .5);
            /*             box-shadow: inset 0 0 5rem rgba(0, 0, 0, .5);*/
            font-family: 'Prompt', sans-serif;
        }

        body {
            background-image: url('images/pexels-yugdas-manandhar-3688303.jpg');
            background-repeat: no-repeat;
            background-attachment: fixed;
            background-size: cover;
            background-position-y: bottom;
            filter: opacity(82%);
        }

        html,
        body {
            height: 100%;
            /*             background-color:indianred;
 */
        }

        .btn {
            background-color: #ec5f5f;
        }

    </style>


    <!-- Custom styles for this template -->
    <link href="cover.css" rel="stylesheet">

</head>

<body class="text-center" cz-shortcut-listen="true">
    
    <div class="cover-container d-flex w-100 h-100 p-3 mx-auto flex-column">
        <header class="masthead mb-auto">
            <div class="inner">
                <h3 class="masthead-brand">NOG</h3>
                <nav class="nav nav-masthead justify-content-center">
                    <a class="nav-link active" href="/WebProProject/index.jsp">Home</a>
                    
                    <a class="nav-link"href="${email==null ?'Login' : 'Logout'}">
                    ${email==null ?'Login' : 'Logout'}
                    <a class="nav-link" href="register">Register</a>
                    <a class="nav-link">Hello ${email==null ? 'Guest' : email.firstname}</a>
                </nav>
            </div>
        </header>

        <main role="main" class="inner cover">
            <h1 class="cover-heading">N O G</h1><br>
            <p class="lead">NOG เว็บไซต์สำหรับคุณผู้ชาย เรารวบรวมสินค้าคุณภาพ 
                ที่ถูกถักทอจากด้ายพิเศษนำเข้า รับประกันความใส่สวมสบาย <br>
                ไม่ระคายผิว พิสูจน์แล้วโดยผู้เชี่ยวชาญ ท่านสามารถเข้ามาเยี่ยมชมสินค้าเราก่อนได้ ทางเรามีสินค้าสำหรับท่านสุภาพบุรุษให้เลือกชมมากมาย
            </p><br>
            <p class="lead">
                <a href="ProductList" class="btn btn-lg btn-danger">เข้าสู่หน้าหลัก</a>
            </p>
        </main>

        <footer class="mastfoot mt-auto">
                         <div class="inner" style="font-size: 10px;margin-bottom: -20px;">
            </div> 
        </footer>
    </div>


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
