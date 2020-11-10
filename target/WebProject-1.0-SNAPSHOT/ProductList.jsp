<%-- 
    Document   : ProductP1
    Created on : Sep 24, 2020, 12:35:01 AM
    Author     : NAMM
--%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!doctype html>
<html lang="en">

<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <meta name="description" content="">
    <meta name="author" content="Mark Otto, Jacob Thornton, and Bootstrap contributors">
    <meta name="generator" content="Jekyll v4.1.1">
    <title>Product</title>
    <link rel="icon" href="images/logo/ทดลอง2.png">


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


        user agent stylesheet html {
            display: block;
        }

        * {
            box-sizing: border-box;
        }

        body {
            font-family: 'Prompt', sans-serif;
            /* background-color: #eaf2fa; พื้นหลัง*/


        }

        .album {}

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
            text-decoration: none;        }

        /* Number text (1/3 etc) */
        .numbertext {
            color: #f2f2f2;
            font-size: 12px;
            padding: 8px 12px;
            position: absolute;
            top: 0;
        }

        .active {
            background-color: #717171;
        }


        /* On smaller screens, decrease text size */
        @media only screen and (max-width: 300px) {
            .text {
                font-size: 11px
            }
        }

        .ddd {
            padding-bottom: 100px;
            align-content: center;
            text-align: center;
        }

        .site-header {
            background-color: rgb(34, 34, 34);
        }

        div.gallery:hover,
        a:active {
            border: 1px solid #777;
            text-decoration: none;
            /* เอาขีดเส้นใต้ออก */
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


        .content {
            height: 683px;
            width: 100%;
            overflow: hidden;
            box-shadow: 1px 1px 15px rgba(0, 0, 0, 0.4);
        }

        .content .images {
            height: 100%;
            width: 100%;
        }

        .images {
            height: 100%;
            width: 100%;
        }

        .carousel-item {
            height: 65vh;
            min-height: 350px;
            background: no-repeat center center scroll;
            -webkit-background-size: cover;
            -moz-background-size: cover;
            -o-background-size: cover;
            background-size: cover;
        }
    </style>

        <!-- Custom styles for this template -->
        <link href="product.css" rel="stylesheet">



    </head>

    <body cz-shortcut-listen="true">
        <jsp:include page="/WEB-INF/Header.jsp?title=ProductList"/>

        <header>
            <div id="carouselExampleIndicators" class="carousel slide" data-ride="carousel">
                <ol class="carousel-indicators">
                    <li data-target="#carouselExampleIndicators" data-slide-to="0" class="active"></li>
                    <li data-target="#carouselExampleIndicators" data-slide-to="1"></li>
                    <li data-target="#carouselExampleIndicators" data-slide-to="2"></li>
                </ol>

                <div class="carousel-inner" role="listbox">
                    <!-- Slide One - Set the background image for this slide in the line below -->
                    <div class="carousel-item active"
                         style="background-image: url('images/pexels-tembela-bohle-1884581.jpg')">
                        <div class="carousel-caption d-none d-md-block">
                            <h3 class="display-4">เสื้อผ้าที่หลากหลาย</h3>
                            <p class="lead">ตามสไตล์ที่ท่านต้องการ</p>
                        </div>
                    </div>
                    <!-- Slide Two - Set the background image for this slide in the line below -->
                    <div class="carousel-item" style="background-image: url('images/mall-3490393_1920.jpg')">
                        <div class="carousel-caption d-none d-md-block">
                            <h3 class="display-4">เลือกอย่างเพลิดเพลิน</h3>
                            <p class="lead">คุณภาพเทียบเท่าศูนย์การค้าชื่อดัง</p>
                        </div>
                    </div>
                    <!-- Slide Three - Set the background image for this slide in the line below -->
                    <div class="carousel-item" style="background-image: url('images/scarves-4128126_1280.jpg')">
                        <div class="carousel-caption d-none d-md-block">
                            <h3 class="display-4">สีสันที่แตกต่าง</h3>
                            <p class="lead">ชวนให้คุณลองสัมผัสประสบการณ์ใหม่</p>
                        </div>
                    </div>
                </div>
                <a class="carousel-control-prev" href="#carouselExampleIndicators" role="button" data-slide="prev">
                    <span class="carousel-control-prev-icon" aria-hidden="true"></span>
                    <span class="sr-only">Previous</span>
                </a>
                <a class="carousel-control-next" href="#carouselExampleIndicators" role="button" data-slide="next">
                    <span class="carousel-control-next-icon" aria-hidden="true"></span>
                    <span class="sr-only">Next</span>
                </a>
            </div>
        </header>






        <!--จบ ตาราง พื้นที่แสดงผล เพื่อปรับขนาดพื้นที่ให้อยู่ตรงกลางจอภาพ-->

        <!-- ---------------เลื่อนเอง------------------------- -->
        <script>
            var slideIndex = 0;
            showSlides();

            function showSlides() {
                var i;
                var slides = document.getElementsByClassName("mySlides");
                var dots = document.getElementsByClassName("dot");
                for (i = 0; i < slides.length; i++) {
                    slides[i].style.display = "none";
                }
                slideIndex++;
                if (slideIndex > slides.length) {
                    slideIndex = 1
                }
                for (i = 0; i < dots.length; i++) {
                    dots[i].className = dots[i].className.replace(" active", "");
                }
                slides[slideIndex - 1].style.display = "block";
                dots[slideIndex - 1].className += " active";
                setTimeout(showSlides, 3000); // Change image every 3 seconds
            }
        </script>




 <div class="album py-3">
        
                <section class="section-pagetop bg" style="padding: 1.5ex;">
            <h2 class="title-page">Product List</h2>
            <nav>
                <ol class="breadcrumb">
                    <li class="breadcrumb-item"><a href="ProductList">Home</a></li>
                    <li class="breadcrumb-item" aria-current="page">Product List</li>
                </ol>
            </nav>
        </section>
        
        <div class="container">

            <div class="row">
                <c:forEach items="${allpd}" var="p" varStatus="vs">

                    <div class="col-md-4">
                        <div class="gallery card mb-4 shadow-sm">
                            <a href="ProductDetail?productId=${p.productId}" target="_top" style="text-decoration:none ;color:black;">
                                <div align="middle">
                                    <img src="Product-images/${p.category.category}/${p.productId}.jpg" width="75%" height="75%" alt="alt"/>

                                </div>

                                <!--  <svg class="bd-placeholder-img card-img-top" width="100%" height="225"
                                       xmlns="http://www.w3.org/2000/svg" preserveAspectRatio="xMidYMid slice"
                                       focusable="false" role="img" aria-label="Placeholder: Thumbnail">
                                  
                                  <title>Placeholder</title>
                                  
                              <rect width="100%" height="100%" fill="#55595c">
                                  </rect>
                                  <text x="50%" y="50%"
                                      fill="#eceeef" dy=".3em">Thumbnail</text>
                                  
                                 </svg>-->

                                <div class="card-body">
                                    <p class="card-text">${p.name}</p>
                                    <div class="d-flex justify-content-between align-items-center">
                                        <div class="btn-group">
                                            <small class="text-muted">ราคา <fmt:formatNumber pattern="#,###.00" value="${p.price}"/> บาท</small>
                                        </div>
                                    </div>
                                </div>
                            </a>
                                        
                            <form action="AddProductToCart" method="POST"> 
                             <div style="padding: 0.5em;" class="row">
                <div class="col-sm">
<!--                    <input type="hidden" name="productId" value="${product.productId}"/>
                    <input type="hidden" name="quantity" value="1"/>-->
                    <select id="size" name="size"class="btn btn-sm btn-outline-dark" style="width: 100%;" required="">
                                <option selected>select size</option>
                                <option>S</option>
                                <option>M</option>
                                <option>L</option>
                                <option>XL</option>
                            </select>
          
                </div>
                <div class="col-sm">
                    <button type="submit" class="btn btn-sm btn-outline-dark" style="width: 100%;">Add to Cart</button>                </div>
                    
              </div>
</form>
                        </div>         

                    </div>

                </c:forEach>


            </div>
        </div>
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
