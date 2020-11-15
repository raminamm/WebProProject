<!DOCTYPE html>
<html lang="en">

<head>
  <meta charset="UTF-8" />
  <meta name="viewport" content="width=device-width, initial-scale=1.0" />
  <meta http-equiv="X-UA-Compatible" content="ie=edge" />
  <title>Add Images</title>
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

<body>

  <div class="container tm-mt-big tm-mb-big">
    <div class="row">
      <div class="col-xl-9 col-lg-10 col-md-12 col-sm-12 mx-auto">
        <div class="tm-bg-primary-dark tm-block tm-block-h-auto">
          <div class="row">
            <div class="col-12">
              <h2 class="tm-block-title d-inline-block">Add Images</h2>
            </div>
          </div>

          <div class="row tm-edit-product-row">
            <div class="col-md-12">
                

            <form method="POST" action="Uploadimage" class="tm-edit-product-form" enctype="multipart/form-data">
                <p style="color: white;">Select image to upload:
                <input type="file" name="uploadFile" /><br>

            <div class="col-12">
                <input type="submit" class="btn btn-primary btn-block text-uppercase" value="Add product"/>
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
