<%-- 
    Document   : Bg
    Created on : Nov 10, 2020, 10:04:50 PM
    Author     : NAMM
--%>
<%@taglib prefix="b" uri="http://java.sun.com/jsp/jstl/core" %>
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
        <script src="https://ajax.aspnetcdn.com/ajax/jQuery/jquery-3.4.1.min.js"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/Swiper/4.5.1/js/swiper.min.js"></script>
        <title>Start</title>

        <style>

            /* html,
             body {
                 position: relative;
                 height: 100%;
             }
     
             body {
                 background: #eee;
                 font-family: Helvetica Neue, Helvetica, Arial, sans-serif;
                 font-size: 14px;
                 color: #000;
                 margin: 0;
                 padding: 0;
             }*/

            .swiper-container {
                margin-top: 50px !important;
                box-shadow: 0px 14px 80px rgba(34, 35, 58, 0.2);
                width: 800px;
                height: 450px;
                border-radius: 20px;
            }

            .swiper-slide {
                text-align: center;
                font-size: 18px;
                display: flex;
                justify-content: center;
                align-items: center;
            }

            .item {
                width: 80%;
                height: 50%;
                background: white;
                box-shadow: 0px 14px 80px rgba(34, 35, 58, 0.2);
                border-radius: 8px;
                position: relative;
                display: flex;
                align-items: center;
                justify-content: center;
            }

            .item img {
                width: 100%;
                height: 100%;
                border-radius: 8px;
            }

            .swiper-pagination-bullet {
                width: 12px !important;
                height: 12px !important;
                border-radius: 5px !important;
                background: #fd3838 !important;
                transition: all 0.3s !important;
            }

            .be {
                animation: slide 3s ease-in-out infinite alternate;
                background-image: linear-gradient(-60deg, #b1b1b1 50%, #dbdbdb 50%);
                /*             background-image: linear-gradient(-60deg, #b4d6fc 50%, #deeefc 50%);
                */            bottom: 0;
                left: -50%;
                opacity: .5;
                position: fixed;
                right: -50%;
                top: 0;
                z-index: -1;
            }

            .be2 {
                animation-direction: alternate-reverse;
                animation-duration: 4s;
            }

            .be3 {
                animation-duration: 5s;
            }

            @keyframes slide {
                0% {
                    transform: translateX(-25%);
                }

                100% {
                    transform: translateX(25%);
                }
            }
        </style>
    </head>


    <body bgcolor=white leftmargin=0 topmargin=0 onLoad="ResizeTable();">
        <!--ตาราง พื้นที่แสดงผล เพื่อปรับขนาดพื้นที่ให้อยู่ตรงกลางจอภาพ-->
        <table id=maintable border=0 cellpadding=0 cellspacing=0 align=center width=100%>
            <tr>
                <td align=center valign=middle>
                    <div class="be"></div>
                    <div class="be be2"></div>
                    <div class="be be3"></div></td>
            </tr>
        </table>
        <!--จบ ตาราง พื้นที่แสดงผล เพื่อปรับขนาดพื้นที่ให้อยู่ตรงกลางจอภาพ-->

        <!-- Optional JavaScript -->
        <script language=Javascript>
            function ResizeTable() {
                var objTable = document.getElementById("maintable");
                objTable.style.width = (screen.width - 20);
                objTable.style.height = (screen.height - 100);
            }
        </script>


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
        <script>
            var swiper = new Swiper('.swiper-container', {
                slidesPerView: 2,
                spaceBetween: 30,
                pagination: {
                    el: '.swiper-pagination',
                    clickable: true
                }
            });
        </script>
    </body>

</html>
