<%-- 
    Document   : Editproductadmin
    Created on : Nov 9, 2020, 4:08:22 PM
    Author     : Rachawas
--%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <meta http-equiv="X-UA-Compatible" content="ie=edge" />
    <title>Edit Product</title>
    <link href="admin/css/templatemoa-style.css" rel="stylesheet"/>
    <link href="admin/css/fontawesome.min.css" rel="stylesheet"/>
    <link href="admin/css/bootstrap.min.css" rel="stylesheet"/>
    <link rel="icon" href="logo/ทดลอง2.png">

</head>
        <jsp:include page="/WEB-INF/Headeradmin.jsp?title=Editproductadmin"/>

<body id="reportsPage">
    <div class="container mt-5">
        <div class="row tm-content-row">
            <div class="col-sm-12 col-md-12 col-lg-8 col-xl-8 tm-block-col">
                <div class="tm-bg-primary-dark tm-block tm-block-products">
                    <div class="tm-product-table-container">
                        <table class="table table-hover tm-table-small tm-product-table">
                            <thead>
                                <tr>
                                    <th scope="col">&nbsp;</th>
                                    <th scope="col">PRODUCT NAME</th>
                                    <th scope="col">PRICE</th>
                                    <th scope="col">IN STOCK</th>
                                    <th scope="col">&nbsp;</th>
                                </tr>
                            </thead>
                            <tbody>
                                <tr>
                                    <th scope="row"><input type="checkbox" /></th>
                                    <td class="tm-product-name">Product 1</td>
                                    <td>1,800</td>
                                    <td>200</td>
                                    <td>
                                        <a href="#" class="tm-product-delete-link">
                                            <i class="far fa-trash-alt tm-product-delete-icon"></i>
                                        </a>
                                    </td>
                                </tr>
                                <tr>
                                    <th scope="row"><input type="checkbox" /></th>
                                    <td class="tm-product-name">Product 2</td>
                                    <td>1,000</td>
                                    <td>1,000</td>
                                    <td>
                                        <a href="#" class="tm-product-delete-link">
                                            <i class="far fa-trash-alt tm-product-delete-icon"></i>
                                        </a>
                                    </td>
                                </tr>
                                <tr>
                                    <th scope="row"><input type="checkbox" /></th>
                                    <td class="tm-product-name">Product 3</td>
                                    <td>1,100</td>
                                    <td>900</td>
                                    <td>
                                        <a href="#" class="tm-product-delete-link">
                                            <i class="far fa-trash-alt tm-product-delete-icon"></i>
                                        </a>
                                    </td>
                                </tr>
                                <tr>
                                    <th scope="row"><input type="checkbox" /></th>
                                    <td class="tm-product-name">Product 4</td>
                                    <td>1,400</td>
                                    <td>600</td>
                                    <td>
                                        <a href="#" class="tm-product-delete-link">
                                            <i class="far fa-trash-alt tm-product-delete-icon"></i>
                                        </a>
                                    </td>
                                </tr>
                                <tr>
                                    <th scope="row"><input type="checkbox" /></th>
                                    <td class="tm-product-name">Product 5</td>
                                    <td>1,800</td>
                                    <td>200</td>
                                    <td>
                                        <a href="#" class="tm-product-delete-link">
                                            <i class="far fa-trash-alt tm-product-delete-icon"></i>
                                        </a>
                                    </td>
                                </tr>
                                <tr>
                                    <th scope="row"><input type="checkbox" /></th>
                                    <td class="tm-product-name">Product 6</td>
                                    <td>1,000</td>
                                    <td>1,000</td>
                                    <td>
                                        <a href="#" class="tm-product-delete-link">
                                            <i class="far fa-trash-alt tm-product-delete-icon"></i>
                                        </a>
                                    </td>
                                </tr>

                            </tbody>
                        </table>
                    </div>
                    <!-- table container -->
                    <a href="add-product.html" class="btn btn-primary btn-block text-uppercase mb-3">Add new product</a>
                    <button class="btn btn-primary btn-block text-uppercase">
                        Delete selected products
                    </button>
                </div>
            </div>
            <div class="col-sm-12 col-md-12 col-lg-4 col-xl-4 tm-block-col">
                <div class="tm-bg-primary-dark tm-block tm-block-product-categories">
                    <h2 class="tm-block-title">Product Categories</h2>
                    <div class="tm-product-table-container">
                        <table class="table tm-table-small tm-product-table">
                            <tbody>
                                <tr>
                                    <td class="tm-product-name">jeans
                                        </td>
                                    <td class="text-center">
                                        <a href="#" class="tm-product-delete-link">
                                            <i class="far fa-trash-alt tm-product-delete-icon"></i>
                                        </a>
                                    </td>
                                </tr>
                                <tr>
                                    <td class="tm-product-name">
                                        long-sleeve shirt
                                        </td>
                                    <td class="text-center">
                                        <a href="#" class="tm-product-delete-link">
                                            <i class="far fa-trash-alt tm-product-delete-icon"></i>
                                        </a>
                                    </td>
                                </tr>
                                <tr>
                                    <td class="tm-product-name">loose-t-shirt
                                        pants
                                        </td>
                                    <td class="text-center">
                                        <a href="#" class="tm-product-delete-link">
                                            <i class="far fa-trash-alt tm-product-delete-icon"></i>
                                        </a>
                                    </td>
                                </tr>
                                <tr>
                                    <td class="tm-product-name">polo-shirt
                                        </td>
                                    <td class="text-center">
                                        <a href="#" class="tm-product-delete-link">
                                            <i class="far fa-trash-alt tm-product-delete-icon"></i>
                                        </a>
                                    </td>
                                </tr>
                                <tr>
                                    <td class="tm-product-name">shirt
                                        </td>
                                    <td class="text-center">
                                        <a href="#" class="tm-product-delete-link">
                                            <i class="far fa-trash-alt tm-product-delete-icon"></i>
                                        </a>
                                    </td>
                                </tr>
                                <tr>
                                    <td class="tm-product-name">shorts
                                        </td>
                                    <td class="text-center">
                                        <a href="#" class="tm-product-delete-link">
                                            <i class="far fa-trash-alt tm-product-delete-icon"></i>
                                        </a>
                                    </td>
                                </tr>
                                <tr>
                                    <td class="tm-product-name">Sport Unity
                                        </td>
                                    <td class="text-center">
                                        <a href="#" class="tm-product-delete-link">
                                            <i class="far fa-trash-alt tm-product-delete-icon"></i>
                                        </a>
                                    </td>
                                </tr>
                                <tr>
                                    <td class="tm-product-name">sweater
                                        </td>
                                    <td class="text-center">
                                        <a href="#" class="tm-product-delete-link">
                                            <i class="far fa-trash-alt tm-product-delete-icon"></i>
                                        </a>
                                    </td>
                                </tr>
                                <tr>
                                    <td class="tm-product-name">t-shirt
                                        </td>
                                    <td class="text-center">
                                        <a href="#" class="tm-product-delete-link">
                                            <i class="far fa-trash-alt tm-product-delete-icon"></i>
                                        </a>
                                    </td>
                                </tr>
                                <tr>
                                    <td class="tm-product-name">v-neck-t-shirt</td>
                                    <td class="text-center">
                                        <a href="#" class="tm-product-delete-link">
                                            <i class="far fa-trash-alt tm-product-delete-icon"></i>
                                        </a>
                                    </td>
                                </tr>

                            </tbody>
                        </table>
                    </div>
                    <!-- table container -->
                    <button class="btn btn-primary btn-block text-uppercase mb-3">
                        Add new category
                    </button>
                </div>
            </div>
        </div>
    </div>


    <script src="js/jquery-3.3.1.min.js"></script>
    <!-- https://jquery.com/download/ -->
    <script src="js/bootstrap.min.js"></script>
    <!-- https://getbootstrap.com/ -->
    <script>
        $(function () {
            $(".tm-product-name").on("click", function () {
                window.location.href = "edit-product.html";
            });
        });
    </script>
</body>

</html>
