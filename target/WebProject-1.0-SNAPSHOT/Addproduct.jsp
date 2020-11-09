<%-- 
    Document   : Addproduct
    Created on : Nov 9, 2020, 3:17:18 PM
    Author     : Rachawas
--%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <title>Add Product</title>
    <link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Roboto:400,700">
    <%--<link rel="stylesheet" href="css/fontawesome.min.css">
    <link rel="stylesheet" href="css/bootstrap.min.css">
    <link rel="stylesheet" href="css/templatemo-style.css"> --%>
    <link href="admin/css/templatemo-style.css" rel="stylesheet"/>
    <link href="admin/css/fontawesome.min.css" rel="stylesheet"/>
    <link href="admin/css/bootstrap.min.css" rel="stylesheet"/>
    <link rel="icon" href="logo/?????2.png">


</head>

<style>
  body {
    background-color: white;
  }
</style>

        <jsp:include page="/WEB-INF/Headeradmin.jsp?title=Addproduct"/>

<body>
  <div class="container tm-mt-big tm-mb-big">
    <div class="row">
      <div class="col-xl-9 col-lg-10 col-md-12 col-sm-12 mx-auto">
        <div class="tm-bg-primary-dark tm-block tm-block-h-auto">
          <div class="row">
            <div class="col-12">
              <h2 class="tm-block-title d-inline-block">Add Product</h2>
            </div>
          </div>
          <div class="row tm-edit-product-row">
            <div class="col-xl-6 col-lg-6 col-md-12">
              <form action="" class="tm-edit-product-form">
                <div class="form-group mb-3">
                  <label for="name">Product Name
                  </label>
                  <input id="name" name="name" type="text" class="form-control validate" required />
                </div>
                <div class="form-group mb-3">
                  <label for="description">Description</label>
                  <textarea class="form-control validate" rows="3" required></textarea>
                </div>
                <div class="form-group mb-3">
                  <label for="category">Category</label>
                  <select class="custom-select tm-select-accounts" id="category">
                    <option selected>Select category</option>
                    <option value="1">jeans</option>
                    <option value="2">long-sleeve shirt</option>
                    <option value="3">loose-t-shirt</option>
                    <option value="4">pants</option>
                    <option value="5">polo-shirt</option>
                    <option value="6">shirt</option>
                    <option value="7">shorts</option>
                    <option value="8">Sport Unity</option>
                    <option value="9">sweater</option>
                    <option value="10">t-shirt</option>
                    <option value="11">v-neck-t-shirt</option>

        
                  </select>
                </div>
                <div class="row">
                  <div class="form-group mb-3 col-xs-12 col-sm-6">
                    <label for="category">Size</label>
                    <select class="custom-select tm-select-accounts" id="category">
                      <option selected>Select Size</option>
                      <option value="1">S</option>
                      <option value="2">M</option>
                      <option value="3">L</option>
                      <option value="4">XL</option>
                    </select>
                  </div>
                  <div class="form-group mb-3 col-xs-12 col-sm-6">
                    <label for="category">Color</label>
                    <input id="name" name="name" type="text" class="form-control validate" required />
                  </div>
                </div>

            </div>
            <div class="col-xl-6 col-lg-6 col-md-12 mx-auto mb-4">
              <div class="tm-product-img-dummy mx-auto">
                <i class="fas fa-cloud-upload-alt tm-upload-icon"
                  onclick="document.getElementById('fileInput').click();"></i>
              </div>
              <div class="custom-file mt-3 mb-3">
                <input id="fileInput" type="file" style="display:none;" />
                <input type="button" class="btn btn-primary btn-block mx-auto" value="UPLOAD PRODUCT IMAGE"
                  onclick="document.getElementById('fileInput').click();" />
              </div>
            </div>
            <div class="col-12">
              <button type="submit" class="btn btn-primary btn-block text-uppercase">Add Product Now</button>
            </div>
            </form>
          </div>
        </div>
      </div>
    </div>
  </div>

    <%--<script src="js/jquery-3.3.1.min.js"></script>
  <script src="jquery-ui-datepicker/jquery-ui.min.js"></script>
<script src="js/bootstrap.min.js"></script>--%>
    <script src="admin/js/jquery-3.3.1.min.js" ></script>
    <script src="admin/jquery-ui-datepicker/external/jquery/jquery.js" ></script>
    <script src="admin/js/bootstrap.min.js" ></script>
  <script>
    $(function () {
      $("#expire_date").datepicker();
    });
  </script>
</body>

</html>
