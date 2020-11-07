<%-- 
    Document   : Forgot
    Created on : Nov 3, 2020, 5:29:04 PM
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

  <title>Forgot Password</title>
  <link href="//maxcdn.bootstrapcdn.com/bootstrap/3.3.0/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">

  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/font-awesome/4.5.0/css/font-awesome.min.css">
  <!--  <link rel="stylesheet" type="text/css" href="css/main.css">
======================-->
  <link href="https://fonts.googleapis.com/css2?family=Prompt:wght@300&display=swap" rel="stylesheet">

      <link rel="icon" href="logo/ทดลอง2.png">


  <style>
    .form-gap {
      padding-top: 200px;
    }
 
    body {
      display: -ms-flexbox;
      display: flex;
      -ms-flex-align: center;
      align-items: center;
      padding-top: 0px;
      padding-bottom: 0px;
    }

    #container {
      display: flexbox;
      align-items: center;
      justify-content: center;

      padding-top: 0px;
      padding-right: 610px;
      padding-left: 610px;
      padding-bottom: 0px;
      width: 100%;
    } 

    body {
            background-image: url('images/pexels-artem-beliaikin-994517.jpg');
            background-repeat: no-repeat;
            background-attachment: fixed;
            background-size: cover;
            background-position-y: bottom;
            filter: opacity(90%);
        }
        
               body {
                font-family: 'Prompt', sans-serif;

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






        <div class="form-gap">
        <div class="container">
          <div class="row">
            <div class="col-md-4 col-md-offset-4">
              <div class="panel panel-default">
                <div class="panel-body">
                  <div class="text-center">
                    <h3><i class="fa fa-lock fa-4x"></i></h3>
                    <h2 class="text-center">Forgot Password?</h2>
                    <p>You can reset your password here.</p>
                    <div class="panel-body">

                        <form action="ResetPassword" id="register-form" role="form" autocomplete="off" class="form" method="post">

                        <div class="form-group">
                          <div class="input-group">
                            <span class="input-group-addon"><i
                                class="glyphicon glyphicon-envelope color-blue"></i></span>
                            <input id="email" name="email" placeholder="email address" class="form-control"
                              type="email">
                        </div>
                        <div class="form-group">
                          <input name="recover-submit" class="btn btn-lg btn-primary btn-block" value="Reset Password"
                            type="submit">
                        </div>

                        <input type="hidden" class="hide" name="token" id="token" value="">
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
