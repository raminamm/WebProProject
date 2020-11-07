<%-- 
    Document   : ResetPasword
    Created on : Nov 4, 2020, 6:26:08 PM
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

        <title>Check Email</title>
        <link href="//maxcdn.bootstrapcdn.com/bootstrap/3.3.0/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
        <script src="//maxcdn.bootstrapcdn.com/bootstrap/3.3.0/js/bootstrap.min.js"></script>
        <script src="//code.jquery.com/jquery-1.11.1.min.js"></script>
        <!------ Include the above in your HEAD tag ---------->

        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/font-awesome/4.5.0/css/font-awesome.min.css">
        <!--================================================-->

        <link rel="stylesheet" type="text/css" href="css/main.css">
        <link href="https://fonts.googleapis.com/css2?family=Prompt:wght@300&display=swap" rel="stylesheet">
        <link rel="icon" href="logo/ทดลอง2.png">

        <style>
            .form-gap {
                padding-top: 240px;
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
                background-image: url('images/pexels-eberhard-grossgasteiger-1287145.jpg');
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






        <div class="form-gap"></div>
        <div class="container">
          <div class="row">
            <div class="col-md-4 col-md-offset-4">
              <div class="panel panel-default">
                <div class="panel-body">
                  <div class="text-center">
                    <i style="font-size: 3.0em;" class="fa fa-key"></i>
                    <form action="UpdatePassword" method="POST" class="form-signin">
                        <h1 class="h2 mb-3 font-weight-normal">Reset Password</h1>
                        <label for="password" class="sr-only">Password</label>
                        <input name ="password" type="password" id="password" class="form-control" placeholder="Password" required autofocus>
                        <label for="verifiedPassword" class="sr-only">Confirm Password</label>
                        <input name = "conpassword" type="password" id="verifiedPassword" class="form-control" placeholder="Confirm Password" required>
                        <input type="hidden" id="key" name="key" value=""/>
                        <br><button type="submit" class="btn btn-lg btn-primary btn-block" >Reset</button>
                      </form>
                  </div>
                </div>
              </div>
            </div>
          </div>
        </div>





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
        let url = window.location.href
        let key = url.split("=")
        document.getElementById("key").value = key[1]
        console.log(key[1])
    </script>
</body>
        
   
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






                    <div class="form-gap"></div>
                    <div class="container">
                        <div class="row">
                            <div class="col-md-4 col-md-offset-4">
                                <div class="panel panel-default">
                                    <div class="panel-body">
                                        <div class="text-center">
                                            <i style="font-size: 3.0em;" class="fa fa-key"></i>
                                            <form class="form-signin">
                                                <h1 class="h2 mb-3 font-weight-normal">Reset Password</h1>                                                
                                                <%--<input id="email" name="email" placeholder="email address" class="form-control" type="email"><br>--%>
                                                <label for="password" class="sr-only">Password</label>
                                                <input type="password" id="password" class="form-control" placeholder="Password" required autofocus>
                                                <label for="verifiedPassword" class="sr-only">Confirm Password</label>
                                                <input type="password" id="verifiedPassword" class="form-control" placeholder="Confirm Password" required>
                                                <br><a class="btn btn-lg btn-primary btn-block" >Reset</a>
                                            </form>
                                        </div>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>






                    <script>
                        function resetPassword() {
                            var token = document.location.href.split('token=')[1];
                            var password = document.forms[0].elements[0].value;
                            var verifiedPassword = document.forms[0].elements[1].value;

                            if (password !== verifiedPassword) {
                                window.alert('passwords do not match');
                            } else {
                                var data = {
                                    password: password,
                                    verifiedPassword: verifiedPassword,
                                    token: token,
                                };
                                $.ajax({
                                    type: 'POST',
                                    url: '/reset-password',
                                    data,
                                    success: function (data) {
                                        window.alert(data.message);
                                        window.location.replace('/index.html');
                                    },
                                    error: function (xhr) {
                                        window.alert(JSON.stringify(xhr));
                                        window.location.replace('/reset-password.html');
                                    }
                                });
                            }
                        }
                    </script>




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
