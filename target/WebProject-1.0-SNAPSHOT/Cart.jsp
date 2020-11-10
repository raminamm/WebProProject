<%-- 
    Document   : Cart
    Created on : Oct 28, 2020, 8:30:00 PM
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

        <title>Cart</title>
        <link rel="icon" href="logo/ทดลอง2.png">


        <link href="//maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
        <script src="//maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js"></script>
        <script src="//cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
        <!------ Include the above in your HEAD tag ---------->

        <link href="https://maxcdn.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css" rel="stylesheet"
              integrity="sha384-wvfXpqpZZVQGK6TAh5PVlGOfQNHSoD2xbE+QkPxCAFlNEevoEH3Sl0sibVcOQVnN" crossorigin="anonymous">


        <style>
            .bloc_left_price {
                color: #c01508;
                text-align: center;
                font-weight: bold;
                font-size: 150%;
            }

            .category_block li:hover {
                background-color: #007bff;
            }

            .category_block li:hover a {
                color: #ffffff;
            }

            .category_block li a {
                color: #343a40;
            }

            .add_to_cart_block .price {
                color: #c01508;
                text-align: center;
                font-weight: bold;
                font-size: 200%;
                margin-bottom: 0;
            }

            .add_to_cart_block .price_discounted {
                color: #343a40;
                text-align: center;
                text-decoration: line-through;
                font-size: 140%;
            }

            .product_rassurance {
                padding: 10px;
                margin-top: 15px;
                background: #ffffff;
                border: 1px solid #6c757d;
                color: #6c757d;
            }

            .product_rassurance .list-inline {
                margin-bottom: 0;
                text-transform: uppercase;
                text-align: center;
            }

            .product_rassurance .list-inline li:hover {
                color: #343a40;
            }

            .reviews_product .fa-star {
                color: gold;
            }

            .pagination {
                margin-top: 20px;
            }

            footer {
                background: #343a40;
                padding: 40px;
            }

            footer a {
                color: #f8f9fa !important
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



    <body bgcolor=white leftmargin=0 topmargin=0 onLoad="ResizeTable();">
        <!--ตาราง พื้นที่แสดงผล เพื่อปรับขนาดพื้นที่ให้อยู่ตรงกลางจอภาพ-->
        <table id=maintable border=0 cellpadding=0 cellspacing=0 align=center width=100%>
            <tr>
                <td align=center valign=middle>
                    <!--                 ข้อความนี้อยู่กลางจอภาพ
                    <br />มีความกว้างทั้งหมดไม่เกินความกว้าง
                    <br />และสูงของ จอภาพ -->

                    <jsp:include page="/WEB-INF/Header.jsp?title=Cart"/>

                            <section class="jumbotron text-center">
                                <div class="container">
                                    <h1 class="jumbotron-heading">CART</h1>
                                </div>
                            </section>

                    <c:choose>
                        <c:when test="${cart!=null}">                    

                            <div class="container mb-4">
                                <div class="row">
                                    <div class="col-12">
                                        <div class="table-responsive">
                                            <table class="table table-striped">
                                                <thead>
                                                    <tr>
                                                        <th scope="col"> </th>
                                                        <th scope="col">Product</th>
                                                        <th scope="col">Size</th>
                                                        <th scope="col" class="text-center">Quantity</th>
                                                        <th scope="col" class="text-right">Price</th>
                                                        <th> </th>
                                                    </tr>
                                                </thead>
                                                <tbody>
                                                    <c:forEach items="${cart.items}"var="lineItem" varStatus="vs">
                                                        <tr>
                                                            <td><img style="width:210px ;height:210px ;" src="Product-images/${lineItem.category.category}/${lineItem.product.productId}.jpg" /> </td>
                                                            <td>${lineItem.product.name}</td>
                                                    <td>${lineItem.size}</td>
                                                    <form action="Cart?cartid=${lineItem.cartid}" method="POST">
                                                        <td><input name="updatequantity" class="form-control" type="number" value="${lineItem.quantity}"/></td>
                                                    </form>
                                                    <td class="text-right">${lineItem.price} ฿</td>
                                                    <td class="text-right"><a href="RemoveProductFromCart?cartid=${lineItem.cartid}" class="btn btn-sm btn-danger"><i
                                                                class="fa fa-trash"></i> </a> </td>
                                                    </tr>
                                                </c:forEach>
                                                <tr>
                                                    <td></td>
                                                    <td></td>
                                                    <td></td>
                                                    <td></td>
                                                    <td>Sub-Total</td>
                                                    <td class="text-right">${cart.getTotalPrice()} ฿</td>
                                                </tr>
                                                <%--<tr>
                                                    <td></td>
                                                    <td></td>
                                                    <td></td>
                                                    <td></td>
                                                    <td>Shipping</td>
                                                    <td class="text-right"> ฿</td>
                                                </tr>--%>
                                                <tr>
                                                    <td></td>
                                                    <td></td>
                                                    <td></td>
                                                    <td></td>
                                                    <td><strong>Total</strong></td>
                                                    <td class="text-right"><strong>${total} ฿</strong></td>
                                                </tr>
                                                </tbody>
                                            </table>
                                        </div>
                                    </div>


                                    <div class="container">
                                        <div class="row justify-content-end">
                                            <div class="col-12 col-md-8">
                                                <!--                                     <button class="btn btn-lg btn-block btn btn-outline-dark text-uppercase">Continue Shopping</button>
                                                -->                                </div>
                                            <div class="col-6 col-md-4">
<<<<<<< Updated upstream
                                                <a href="CheckOut" class="btn btn-lg btn-block btn btn-success text-uppercase">Buy</a>
=======
                                                <a href="CheckOut" class="btn btn-lg btn-block btn btn-success text-uppercase">Check Out</a>
>>>>>>> Stashed changes
                                            </div>
                                        </div>
                                    </div>

                                </div>
                            </div>
                        </c:when>
                        <c:otherwise>
                            <div class="row justify-content-center">
                                <div class="col-xl-3 col-lg-7 col-md-9">
                                    <div class="card shadow-lg">
                                        <div class="card-body p-4 p-md-10">
                                            <i style="font-size: 50px" class="fa fa-cart-plus"></i><br><br>
                                            <p style="color: black;font-size: 20px;" class="display-4">${nocart}</p>
                                            <p class="lead"></p><br>
                                            <a href="ProductList" class="btn btn-primary btn-lg">Home</a>
                                        </div>
                                    </div>
                                </div>
                            </div>

                        </c:otherwise>
                    </c:choose>

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


