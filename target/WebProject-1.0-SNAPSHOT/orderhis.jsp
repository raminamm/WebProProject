<%-- 
    Document   : orderhis
    Created on : Nov 5, 2020, 4:59:54 PM
    Author     : NAMM
--%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
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

    <title>Order History</title>
      <link rel="icon" href="logo/ทดลอง2.png">


    <link href='https://maxcdn.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css'>
    <script src='https://maxcdn.bootstrapcdn.com/bootstrap/4.1.1/js/bootstrap.min.js'></script>
    <script src='https://cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js'></script>

    <style>
        * {
            margin: 0;
            padding: 0;
            -webkit-font-smoothing: antialiased;
            -webkit-text-shadow: rgba(0, 0, 0, .01) 0 0 1px;
            text-shadow: rgba(0, 0, 0, .01) 0 0 1px
        }

        body {
            font-family: 'Rubik', sans-serif;
            font-size: 14px;
            font-weight: 400;
            background: #E0E0E0;
            color: #000000
        }

        ul {
            list-style: none;
            margin-bottom: 0px
        }

        .button {
            display: inline-block;
            background: #000000;
            border-radius: 5px;
            height: 48px;
            -webkit-transition: all 200ms ease;
            -moz-transition: all 200ms ease;
            -ms-transition: all 200ms ease;
            -o-transition: all 200ms ease;
            transition: all 200ms ease
        }

        .button a {
            display: block;
            font-size: 18px;
            font-weight: 400;
            line-height: 48px;
            color: #FFFFFF;
            padding-left: 35px;
            padding-right: 35px
        }

        .button:hover {
            opacity: 0.8
        }

        .his_section {
            width: 100%;
            padding-top: 0px;
            padding-bottom: 111px
        }

        .his_title {
            font-size: 30px;
            font-weight: 500
        }

        .his_items {
            margin-top: 8px
        }

        .his_list {
            border: solid 1px #e8e8e8;
            box-shadow: 0px 1px 5px rgba(0, 0, 0, 0.1);
            background-color: #fff
        }

        .his_item {
            width: 100%;
            padding: 15px;
            padding-right: 46px
        }

        .his_item_image {
            width: 133px;
            height: 133px;
            float: left
        }

        .his_item_image img {
            max-width: 100%
        }

        .his_item_info {
            width: calc(100% - 133px);
            float: left;
            padding-top: 18px
        }

        .his_item_name {
            margin-left: 7.53%
        }

        .his_item_title {
            font-size: 14px;
            font-weight: 400;
            color: rgba(0, 0, 0, 0.5)
        }

        .his_item_text {
            font-size: 18px;
            margin-top: 35px
        }

        .his_item_text span {
            display: inline-block;
            width: 20px;
            height: 20px;
            border-radius: 50%;
            margin-right: 11px;
            -webkit-transform: translateY(4px);
            -moz-transform: translateY(4px);
            -ms-transform: translateY(4px);
            -o-transform: translateY(4px);
            transform: translateY(4px)
        }

        .his_item_price {
            text-align: right
        }

        .his_item_total {
            text-align: right
        }

        .order_total {
            width: 100%;
            height: 60px;
            margin-top: 30px;
            border: solid 1px #e8e8e8;
            box-shadow: 0px 1px 5px rgba(0, 0, 0, 0.1);
            padding-right: 46px;
            padding-left: 15px;
            background-color: #fff
        }

        .order_total_title {
            display: inline-block;
            font-size: 14px;
            color: rgba(0, 0, 0, 0.5);
            line-height: 60px
        }

        .order_total_amount {
            display: inline-block;
            font-size: 18px;
            font-weight: 500;
            margin-left: 26px;
            line-height: 60px
        }

        .back_buttons {
            margin-top: 60px;
            text-align: right
        }

        .his_button_clear {
            display: inline-block;
            border: none;
            font-size: 18px;
            font-weight: 400;
            line-height: 48px;
            color: rgba(0, 0, 0, 0.5);
            background: #FFFFFF;
            border: solid 1px #b2b2b2;
            padding-left: 35px;
            padding-right: 35px;
            outline: none;
            cursor: pointer;
            margin-right: 26px
        }

        .his_button_clear:hover {
            border-color: #0e8ce4;
            color: #0e8ce4
        }

        .back {
            display: inline-block;
            border: none;
            font-size: 18px;
            font-weight: 400;
            line-height: 48px;
            color: #FFFFFF;
            padding-left: 35px;
            padding-right: 35px;
            outline: none;
            cursor: pointer;
            vertical-align: top
        }
    </style>




</head>
<script language=Javascript>
    function ResizeTable() {
        var objTable = document.getElementById("maintable");
        objTable.style.width = (screen.width - 20);
        objTable.style.height = (screen.height - 100);
    }
</script>



        <jsp:include page="/WEB-INF/Header.jsp?title=ProductDetail"/>



<body bgcolor=white leftmargin=0 topmargin=0 onLoad="ResizeTable();">
    <!--ตาราง พื้นที่แสดงผล เพื่อปรับขนาดพื้นที่ให้อยู่ตรงกลางจอภาพ-->
    <table id=maintable border=0 cellpadding=0 cellspacing=0 align=center width=100%>
        <tr>
            <td align=center valign=middle>
                <!--                 ข้อความนี้อยู่กลางจอภาพ
                <br />มีความกว้างทั้งหมดไม่เกินความกว้าง
                <br />และสูงของ จอภาพ -->


                <div class="his_section">
                    <section class="section-pagetop bg" style="padding: 1.5ex;">
                        <h2 style="text-align: left;" class="title-page">Order History</h2>
                        <nav>
                            <ol class="breadcrumb">
                                <li class="breadcrumb-item"><a href="ProductList>Home</a></li>
                                <li class="breadcrumb-item" aria-current="page">Order History</li>
                            </ol>
                        </nav>
                    </section>

           <div class="container-fluid">
                        <div class="row">
                            <div class="col-lg-10 offset-lg-1">
                                <div class="his_container">
                                    
                                    <c:forEach items=""
                                    <a href="Orderdetail" class="notification-link">
                                        <div class="his_items">
                                            <ul class="his_list">
                                                <li class="his_item clearfix">
                                                    <div class="his_item_info d-flex flex-md-row flex-column justify-content-between">
                                                        <div class="his_item_name his_info_col">
                                                            <div class="his_item_title"><strong style="font-size: 19px;">Order No.</strong></div>
                                                            <div class="his_item_text">01</div>
                                                        </div>
                                                        
                                                        <div class="his_item_total his_info_col">
                                                            <div class="his_item_title"><strong style="font-size: 19px;">Date</strong></div>
                                                            <div class="his_item_text">date</div>
                                                        </div>


                                                        <div class="his_item_color his_info_col">
                                                            <div class="his_item_title"><strong style="font-size: 19px;">Address</strong></div>
                                                            <div class="his_item_text">thailand</div>
                                                        </div>

                                                        <div class="his_item_quantity his_info_col">
                                                            <div class="his_item_title"><strong style="font-size: 19px;">Quantity</strong></div>
                                                            <div class="his_item_text">1</div>
                                                        </div>

                                                        <div class="his_item_total his_info_col">
                                                            <div class="his_item_title"><strong style="font-size: 19px;">Total</strong></div>
                                                            <div class="his_item_text">00 ฿</div>
                                                        </div>
                                                    </div>
                                                </li>
                                            </ul>
                                        </div>
                                    </a>
            
            
                                   
                                    <div class="back_buttons">
                                        <a style="text-decoration: none" href="ProductList" type="button" class="button back">Back</a> </div>
                                </div>
                            </div>
                        </div>
                    </div>
          
                    
                    
                    
                </div>






            </td>
        </tr>
    </table>
    <!--จบ ตาราง พื้นที่แสดงผล เพื่อปรับขนาดพื้นที่ให้อยู่ตรงกลางจอภาพ-->

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
