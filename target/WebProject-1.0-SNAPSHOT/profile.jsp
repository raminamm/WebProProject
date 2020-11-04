<%-- 
    Document   : profile
    Created on : Nov 4, 2020, 8:14:30 PM
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

  <title>Profile</title>
  <link href="https://maxcdn.bootstrapcdn.com/font-awesome/4.3.0/css/font-awesome.min.css" rel="stylesheet">

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
        <jsp:include page="/WEB-INF/Header.jsp?title=profile"/>

<body bgcolor=white leftmargin=0 topmargin=0 onLoad="ResizeTable();">
  <!--ตาราง พื้นที่แสดงผล เพื่อปรับขนาดพื้นที่ให้อยู่ตรงกลางจอภาพ-->
  <table id=maintable border=0 cellpadding=0 cellspacing=0 align=center width=100%>
    <tr>
      <td align=center valign=middle>
        <!--                 ข้อความนี้อยู่กลางจอภาพ
                <br />มีความกว้างทั้งหมดไม่เกินความกว้าง
                <br />และสูงของ จอภาพ -->

        <section class="section-pagetop bg" style="padding: 1.5ex;">
          <h2 style="text-align: left;" class="title-page">Profile</h2>
          <nav>
            <ol class="breadcrumb">
                <li class="breadcrumb-item"><a href="ProductList.jsp">Home</a></li>
              <li class="breadcrumb-item" aria-current="page">Profile</li>
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
                              <!-- <div class="d-flex justify-content-center align-items-center rounded"
                                style="height: 140px; background-color: rgb(233, 236, 239);">
                                <span style="color: rgb(166, 168, 170); font: bold 8pt Arial;">140x140</span>
                              </div> -->
                              <img style="width: 100px;" src="images/personnn.png">
                            </div>
                          </div>
                          <div class="col d-flex flex-column flex-sm-row justify-content-between mb-3">
                            <div class="text-center text-sm-left mb-2 mb-sm-0">
                              <h4 class="pt-sm-2 pb-1 mb-0 text-nowrap">John Smith</h4>
                              <div class="mt-1">
                                <p style="color: lightslategray;">@Email</p>
                                <!-- <button class="btn btn-primary" type="button">
                                  <i class="fa fa-fw fa-camera"></i>
                                  <span>Change Photo</span>
                                </button> -->
                              </div>
                            </div>

                          </div>
                        </div>
                        <ul class="nav nav-tabs">
                          <li class="nav-item"><a href="" class="active nav-link">Profile</a></li>
                        </ul>
                        <div class="tab-content pt-3">
                          <div class="tab-pane active">
                            <form class="form" novalidate="">
                              <div class="row">
                                <div class="col">
                                  <div class="row">
                                    <div class="col">
                                      <div class="form-group" style="text-align: left;">
                                        <label>Firstname</label>
                                        <%--<input class="form-control" type="text" name="Firstname" value="Firstname"
                                          placeholder="Firstname">--%>
                                        <p>Firstname</p>
                                      </div>
                                    </div>
                                    <div class="col">
                                      <div class="form-group" style="text-align: left;">
                                        <label>Lastname</label>
                                        <%--<input class="form-control" type="text" name="Lastname" value="Lastname" placeholder="Lastname">
                                        --%><p>Lastname</p>
                                      </div>
                                    </div>
                                  </div>
                                  <div class="row">
                                    <div class="col">
                                      <div class="form-group" style="text-align: left;">
                                        <label>Sex</label>
                                        <%--<input class="form-control" type="text" placeholder="user@example.com">
                                      --%>
                                      <p>sex</p>
                                        </div>
                                    </div>
                                  </div>
                                  <div class="row">
                                    <div class="col">
                                      <div class="form-group" style="text-align: left;">
                                        <label>Email</label>
                                        <%--<input class="form-control" type="text" placeholder="user@example.com">
                                      --%>
                                      <p>Email</p>
                                    </div>
                                    </div>
                                  </div>
                                  <div class="row">
                                    <div class="col">
                                      <div class="form-group" style="text-align: left;">
                                        <label>Birthday</label>
                                        <%--<input class="form-control" type="text" placeholder="user@example.com">
                                      --%>
                                      <p>Birthday</p>
                                      </div>
                                    </div>
                                  </div>
                                  <div class="row">
                                    <div class="col">
                                      <div class="form-group" style="text-align: left;">
                                        <label>Phone</label>
                                        <%--<input class="form-control" type="text" placeholder="user@example.com">
                                      --%>
                                      <p>Phone</p>
                                      </div>
                                    </div>
                                  </div>
                                  <div class="row">
                                    <div class="col mb-3">
                                      <div class="form-group" style="text-align: left;">
                                        <label>Address</label>
                                        <%--<textarea class="form-control" rows="5" placeholder="My Address"></textarea>
                                      --%>
                                      <p>Address</p>
                                      </div>
                                    </div>
                                  </div>
                                </div>
                              </div>

                              <div class="row">
                                <div class="col d-flex justify-content-end">
                                  <button class="btn btn-dark" type="submit">Back</button>
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
</body>

</html>

