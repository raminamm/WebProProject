<%-- 
    Document   : Contact
    Created on : Nov 12, 2020, 9:17:10 PM
    Author     : Rachawas
--%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
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

  <title>Start</title>

  <link href="https://fonts.googleapis.com/css2?family=Prompt:wght@300&display=swap" rel="stylesheet">


  <style>
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
        
        <jsp:include page="/WEB-INF/Header.jsp?title=Contact"/>


        <h1 class="h1-responsive font-weight-bold text-center my-5">Contact us</h1>
        <p class="text-center w-responsive mx-auto">
            <ul class="list-unstyled text-small">
              <li>Do you have any questions?</li>
              <li>Please do not hesitate to contact us directly.</li>
              <li>Our team will come back to you within
                a matter of hours to help you.</li></ul>
          </p>

        <div class="pt-4 my-md-5 pt-md-4 border-top" style="margin-left: 60px; margin-right: 60px;">
          <div class="row">
            <div class="col-md-4">
              <h2>Address</h2>
              <p>King Mongkut’s University of 
                126 Pracha Uthit Rd., Bang Mod,
                Thung Khru, Bangkok 10140, Thailand.</p>
            </div>
            
            <div class="col-md-4">
              <h2>Social</h2>
              <p>
                <ul class="list-unstyled text-small">
                  <li><a class="text-muted">Facebook</a><a> : www.facebook.com</a></li>
                  <li><a class="text-muted">Twitter</a><a> : www.twitter.com</a></li>
                  <li><a class="text-muted">Instagram</a><a> : www.instagram.com</a></li>
                </ul>
              </p>
            </div>

            <div class="col-md-4">
              <h2>Contacts</h2>
              <p>
                <ul class="list-unstyled text-small">
                <li><a class="text-muted" >202-469-7717</a></li>
                <li><a class="text-muted" >203-496-1777</a></li>
                <li><a class="text-muted" >204-649-7177</a></li>
                <li><a class="text-muted" >gla@nog.com</a></li>
                <li><a class="text-muted" >oat@nog.com</a></li>
                <li><a class="text-muted" >naem@nog.com</a></li></ul>
              </p>
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

