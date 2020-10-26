<%-- 
    Document   : TestHead
    Created on : Sep 24, 2020, 12:40:43 AM
    Author     : NAMM
--%>

<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

      <nav class="site-header sticky-top py-3">
        <div class="container d-flex flex-column flex-md-row justify-content-between" ;>
            <a class="py-2" href="#" aria-label="Product"></a>
            <a class="py-2 d-none d-md-inline-block" href="#" style="text-decoration:none">N O G</a>
            <a class="nav-link dropdown-toggle" href="#" id="dropdown09" data-toggle="dropdown" aria-haspopup="true"
                aria-expanded="false" style="text-decoration:none">Categories</a>
            <div class="dropdown-menu" aria-labelledby="dropdown09">
                <a class="dropdown-item" href="#">T-Shirt</a>
                <a class="dropdown-item" href="#">Long Sleeve T-Shirt</a>
                <a class="dropdown-item" href="#">Loose T-Shirt</a>
                <a class="dropdown-item" href="#">V-Neck T-Shirt</a>
                <a class="dropdown-item" href="#">Shirt</a>
                <a class="dropdown-item" href="#">Long Sleeve Shirt</a>
                <a class="dropdown-item" href="#">Polo Shirt</a>
                <a class="dropdown-item" href="#">Undershirt</a>
                <a class="dropdown-item" href="#">Shorts</a>
                <a class="dropdown-item" href="#">Jeans</a>
                <a class="dropdown-item" href="#">Trousers</a>
            </div>
            <form class="form-inline my-2 my-md-0">
                <input class="form-control" type="text" placeholder="Search for products" maxlength="128" aria-label="Search"
                    autocomplete="off" value="" style="width: 500px;">
            </form>
            <a class="py-2 d-none d-md-inline-block" href="#" style="text-decoration:none">Contact</a>
            <a class="py-2 d-none d-md-inline-block" href="#" style="text-decoration:none">Cart</a>
            <a class="py-2 d-none d-md-inline-block" href="${email==null ?'Login' : 'Logout'}" style="text-decoration:none">${email==null ?'Login' : 'Logout'}</a>
                
             
        </div>
    </nav>
  