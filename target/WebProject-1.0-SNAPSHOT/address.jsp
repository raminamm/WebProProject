<%-- 
    Document   : address
    Created on : Nov 4, 2020, 8:14:42 PM
    Author     : Rachawas
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

        <title>Address</title>
        <link href="https://maxcdn.bootstrapcdn.com/font-awesome/4.3.0/css/font-awesome.min.css" rel="stylesheet">
        <link rel="icon" href="images/logo/ทดลอง2.png">
        <style>
            body {
                margin-top: 20px;
                background: #f8f8f8
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
    <jsp:include page="/WEB-INF/Header.jsp?title=address"/>

    <body bgcolor=white leftmargin=0 topmargin=0 onLoad="ResizeTable();">
        <!--ตาราง พื้นที่แสดงผล เพื่อปรับขนาดพื้นที่ให้อยู่ตรงกลางจอภาพ-->
        <table id=maintable border=0 cellpadding=0 cellspacing=0 align=center width=100%>
            <tr>
                <td align=center valign=middle>
                    <!--                 ข้อความนี้อยู่กลางจอภาพ
                    <br />มีความกว้างทั้งหมดไม่เกินความกว้าง
                    <br />และสูงของ จอภาพ -->

                    <section class="section-pagetop bg" style="padding: 1.5ex;">
                        <h2 style="text-align: left;" class="title-page">Address</h2>
                        <nav>
                            <ol class="breadcrumb">
                                <li class="breadcrumb-item"><a href="ProductList.jsp">Home</a></li>
                                <li class="breadcrumb-item" aria-current="page">My Address</li>
                            </ol>
                        </nav>
                    </section>

                    <div class="container">
                        <div class="row flex-lg-nowrap">

                            <div class="col">
                                <div class="row">
                                    <div class="col mb-3">
                                        <div class="card">
                                            <div class="card-body">
                                                <div class="e-profile">
                                                    <div class="row">
                                                        <div class="col-12 col-sm-auto mb-3">
                                                            <div class="mx-auto" style="width: 140px;">

                                                                <img style="width: 100px;" src="images/address.png">
                                                            </div>
                                                        </div>
                                                        <div
                                                            class="col d-flex flex-column flex-sm-row justify-content-between mb-3">
                                                            <div class="text-center text-sm-left mb-2 mb-sm-0">
                                                                <h4 class="pt-sm-2 pb-1 mb-0 text-nowrap">${customer.firstname} ${customer.lastname}</h4>
                                                                <div class="mt-1">
                                                                    <p style="color: lightslategray;">${customer.email}</p>

                                                                </div>
                                                            </div>

                                                        </div>
                                                    </div>
                                                    <ul class="nav nav-tabs">
                                                        <li class="nav-item"><a href="" class="active nav-link">Address</a>
                                                        </li>
                                                    </ul>
                                                    <div class="tab-content pt-3">
                                                        <div class="tab-pane active">
                                                                <div class="row">
                                                                    <div class="col">
                                                                        <form class="form" action="address" method="POST">
                                                                        <div class="row">
                                                                            <div class="col">

                                                                                <div class="row">
                                                                                    <div class="col mb-3">
                                                                                        <div class="form-group"
                                                                                             style="text-align: left;">
                                                                                            <label>Address</label>
                                                                                            <%--<textarea class="form-control"
                                                                                                rows="5" name="address" placeholder="address"
                                                                                                value="address"></textarea>--%>
                                                                                            <input class="form-control" type="text" name="address" value="${customer.address}"
                                                                                                   placeholder="${customer.address}">                                                                                    </div>
                                                                                    </div>
                                                                                </div>
                                                                                <div class="row">
                                                                                    <div class="col mb-3">
                                                                                        <div class="form-group"
                                                                                             style="text-align: left;">
                                                                                            <label>Address 2</label>
                                                                                            <input class="form-control" name="address1"
                                                                                                   rows="5" value="${customer.address1}"
                                                                                                      placeholder="${customer.address1}">
                                                                                        </div>
                                                                                    </div>
                                                                                </div>
                                                                            </div>
                                                                        </div>

                                                                        <div class="row">
                                                                            <div class="col d-flex justify-content-end">
                                                                                <button class="btn btn-dark"
                                                                                        type="submit">Save</button>
                                                                            </div>
                                                                        </div>
                                                                        </form>

                                                                    </div>
                                                                </div>
                                                        </div>
                                                    </div>
                                                </div>
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
                            <script>
                                console.log(`${customer.address}`, "Address")
                            </script>
                            </body>

                            </html>

