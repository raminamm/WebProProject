<%-- 
    Document   : TestHead
    Created on : Sep 24, 2020, 12:40:43 AM
    Author     : NAMM
--%>

<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

      <nav class="site-header sticky-top py-3">
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
            <a class="py-2 d-none d-md-inline-block" href="#" style="text-decoration:none">Cart</a>
            <a class="py-2 d-none d-md-inline-block" href="${email==null ?'Login' : 'Logout'}" style="text-decoration:none">${email==null ?'Login' : 'Logout'}</a>
                
             
        </div>
    </nav>
  