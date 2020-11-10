<%-- 
    Document   : TestHead
    Created on : Sep 24, 2020, 12:40:43 AM
    Author     : NAMM
--%>

<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
          
<!DOCTYPE html>
<html lang="en">
 
<head>
    <link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Roboto|Varela+Round">
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css">
    <link rel="stylesheet" href="https://fonts.googleapis.com/icon?family=Material+Icons">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css">
    <%--<script src="https://code.jquery.com/jquery-3.5.1.min.js"></script>
    <script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/js/bootstrap.min.js"></script>--%>
    <style>
        body {
            background: #eeeeee;
            font-family: 'Varela Round', sans-serif;
        }
 
        .navbar {
            color: #fff;
            background: #222222 !important;
            padding: 5px 16px;
            border-radius: 0;
            border: none;
            box-shadow: 0 0 4px rgba(0, 0, 0, .1);
        }
 
        .navbar img {
            border-radius: 50%;
            width: 36px;
            height: 36px;
            margin-right: 10px;
        }
 
        .navbar .navbar-brand {
            color: #efe5ff;
            padding-left: 0;
            padding-right: 50px;
            font-size: 24px;
        }
 
        .navbar .navbar-brand:hover,
        .navbar .navbar-brand:focus {
            color: #fff;
        }
 
        .navbar .navbar-brand i {
            font-size: 25px;
            margin-right: 5px;
        }
 
        .search-box {
            position: relative;
        }
 
        .search-box input {
            padding-right: 35px;
            min-height: 38px;
            border: none;
            background: #faf7fd;
            border-radius: 3px !important;
        }
 
        .search-box input:focus {
            background: #fff;
            box-shadow: none;
        }
 
        .search-box .input-group-addon {
            min-width: 35px;
            border: none;
            background: transparent;
            position: absolute;
            right: 0;
            z-index: 9;
            padding: 10px 7px;
            height: 100%;
        }
 
        .search-box i {
            color: #a0a5b1;
            font-size: 19px;
        }
 
        .navbar .nav-item i {
            font-size: 18px;
        }
 
        .navbar .nav-item span {
            position: relative;
            top: 3px;
        }
 
        .navbar .navbar-nav>a {
            color: #efe5ff;
            padding: 8px 15px;
            font-size: 14px;
        }
 
        .navbar .navbar-nav>a:hover,
        .navbar .navbar-nav>a:focus {
            color: #fff;
            text-shadow: 0 0 4px rgba(255, 255, 255, 0.3);
        }
 
        .navbar .navbar-nav>a>i {
            display: block;
            text-align: center;
        }
 
        .navbar .dropdown-item i {
            font-size: 16px;
            min-width: 22px;
        }
 
        .navbar .dropdown-item .material-icons {
            font-size: 21px;
            line-height: 16px;
            vertical-align: middle;
            margin-top: -2px;
        }
 
        .navbar .nav-item.open>a,
        .navbar .nav-item.open>a:hover,
        .navbar .nav-item.open>a:focus {
            color: #fff;
            background: none !important;
        }
 
        .navbar .dropdown-menu {
            border-radius: 1px;
            border-color: #e5e5e5;
            box-shadow: 0 2px 8px rgba(0, 0, 0, .05);
        }
 
        .navbar .dropdown-menu a {
            color: #777 !important;
            padding: 8px 20px;
            line-height: normal;
            font-size: 15px;
        }
 
        .navbar .dropdown-menu a:hover,
        .navbar .dropdown-menu a:focus {
            color: #333 !important;
            background: transparent !important;
        }
 
        .navbar .navbar-nav .active a,
        .navbar .navbar-nav .active a:hover,
        .navbar .navbar-nav .active a:focus {
            color: #fff;
            text-shadow: 0 0 4px rgba(255, 255, 255, 0.2);
            background: transparent !important;
        }
 
        .navbar .navbar-nav .user-action {
            padding: 9px 15px;
            font-size: 15px;
        }
 
        .navbar .navbar-toggle {
            border-color: #fff;
        }
 
        .navbar .navbar-toggle .icon-bar {
            background: #fff;
        }
 
        .navbar .navbar-toggle:focus,
        .navbar .navbar-toggle:hover {
            background: transparent;
        }
 
        .navbar .navbar-nav .open .dropdown-menu {
            background: #faf7fd;
            border-radius: 1px;
            border-color: #faf7fd;
            box-shadow: 0 2px 8px rgba(0, 0, 0, .05);
        }
 
        .navbar .divider {
            background-color: #e9ecef !important;
        }
 
        @media (min-width: 1200px) {
            .form-inline .input-group {
                width: 350px;
                margin-left: 30px;
            }
        }
 
        @media (max-width: 1199px) {
            .navbar .navbar-nav>a>i {
                display: inline-block;
                text-align: left;
                min-width: 30px;
                position: relative;
                top: 4px;
            }
 
            .navbar .navbar-collapse {
                border: none;
                box-shadow: none;
                padding: 0;
            }
 
            .navbar .navbar-form {
                border: none;
                display: block;
                margin: 10px 0;
                padding: 0;
            }
 
            .navbar .navbar-nav {
                margin: 8px 0;
            }
 
            .navbar .navbar-toggle {
                margin-right: 0;
            }
 
            .input-group {
                width: 100%;
            }
        }
 
    </style>
</head>
 
<body>
    <nav style="background: #222222;" class="site-header sticky-top py-3">
        <div class="container d-flex flex-column flex-md-row justify-content-between" ;>
            <a class="py-2" href="" aria-label="Product"></a>
            <a class="py-2 d-none d-md-inline-block" href="ProductList?search=" style="text-decoration:none">N O G</a>
            <a class="nav-link dropdown-toggle" href="#" id="dropdown09" data-toggle="dropdown" aria-haspopup="true"
                aria-expanded="false" style="text-decoration:none">Categories</a>
            <div class="dropdown-menu" aria-labelledby="dropdown09">
                <c:forEach items="${allcat}" var="c">
                    <a class="dropdown-item" href="ProductList?category=${c.category}">${c.category}</a>
                </c:forEach> 
            </div>
            <form class="form-inline my-2 my-md-0">
                <input class="form-control" type="text" placeholder="Search for products" maxlength="128"
                    aria-label="Search" autocomplete="off" value="${param.search}" style="width: 500px;" name="search"
                    action="ProductList" method="GET">
            </form>
 
                    <a href="Cart" class="nav-item nav-link"><span>Cart </span><i class="fa fa-cart-arrow-down fa-6"><span
                                class="badge"><%--( 1 )--%>(${cart.getItemCount()})</span></i></a>
 
 
            <div class="nav-item dropdown">
                <a href="#" data-toggle="dropdown" class="nav-item nav-link dropdown-toggle user-action">
                    <i class="fa fa-user-circle fa-6 avatar" alt="Avatar"></i><b class="caret"></b></a>
                <div class="dropdown-menu">
                    <a href="Profile" class="dropdown-item"><i class="fa fa-user-o"></i> Profile</a>
                    <a href="Orderhistory" class="dropdown-item"><i class="fa fa-truck"></i> Purchase History</a>
                    <a href="address" method="GET" class="dropdown-item"><i class="fa fa-address-card-o"></i> My Address</a>
                    <div class="divider dropdown-divider"></div>
                    <a href="${email==null ?'Login' : 'Logout'}" class="dropdown-item"><i class="material-icons">&#xE8AC;</i>${email==null ?'Login' : 'Logout'} </a>
                </div>
            </div>
 
                    <%--
                          <nav style="background: #222222;" class="site-header sticky-top py-3">
        <div class="container d-flex flex-column flex-md-row justify-content-between" ;>
            <a class="py-2" href="" aria-label="Product"></a>
            <a class="py-2 d-none d-md-inline-block" href="ProductList?search=" style="text-decoration:none">N O G</a>
            <a class="nav-link dropdown-toggle" href="#" id="dropdown09" data-toggle="dropdown" aria-haspopup="true"
                aria-expanded="false" style="text-decoration:none">Categories</a>
            <div class="dropdown-menu" aria-labelledby="dropdown09">
                <c:forEach items="${allcat}" var="c">
                    <a class="dropdown-item" href="ProductList?category=${c.category}">${c.category}</a>                    
                </c:forEach>
            </div>
            <form class="form-inline my-2 my-md-0" >
                <input class="form-control" type="text" placeholder="Search for products" maxlength="128" aria-label="Search"
                       autocomplete="off" value="${param.search}" style="width: 500px;" name="search" action="ProductList" method="GET">
            </form>
            <a class="py-2 d-none d-md-inline-block" href="#" style="text-decoration:none">Contact</a>
            <a class="py-2 d-none d-md-inline-block" href="Cart" style="text-decoration:none">Cart (${cart.getItemCount()})</a>
            <a class="py-2 d-none d-md-inline-block" href="${email==null ?'Login' : 'Logout'}" style="text-decoration:none">${email==null ?'Login' : 'Logout'}</a>
                
             
        </div>
    </nav>
                    --%>
 
        </div>
    </nav>
 
 
</body>
 
</html>
