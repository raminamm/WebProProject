<%-- 
    Document   : CheckOut
    Created on : Nov 8, 2020, 8:35:22 PM
    Author     : Rachawas
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
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

  <title>Payment</title>
  <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
  <link rel="icon" href="logo/ทดลอง2.png">

  <style>
    body {
      font-family: Arial;
      font-size: 17px;

    }

    * {
      box-sizing: border-box;
    }

    .row {
      display: -ms-flexbox;
      /* IE10 */
      display: flex;
      -ms-flex-wrap: wrap;
      /* IE10 */
      flex-wrap: wrap;
      margin: 0 -16px;
    }

    .col-25 {
      -ms-flex: 25%;
      /* IE10 */
      flex: 25%;
    }

    .col-50 {
      -ms-flex: 50%;
      /* IE10 */
      flex: 50%;
    }

    .col-75 {
      -ms-flex: 75%;
      /* IE10 */
      flex: 75%;
    }

    .col-25,
    .col-50,
    .col-75 {
      padding: 0 16px;
    }

    .container {
      background-color: #f2f2f2;
      padding: 5px 20px 15px 20px;
      border: 1px solid lightgrey;
      border-radius: 3px;
    }

    input[type=text] {
      width: 100%;
      margin-bottom: 20px;
      padding: 12px;
      border: 1px solid #ccc;
      border-radius: 3px;
    }

    label {
      margin-bottom: 10px;
      display: block;
      text-align: left;
    }

    .icon-container {
      margin-bottom: 20px;
      padding: 7px 0;
      font-size: 24px;
    }

    .btn {
      background-color: #000000;
      color: white;
      padding: 12px;
      margin: 10px 0;
      border: none;
      width: 100%;
      border-radius: 3px;
      cursor: pointer;
      font-size: 17px;
    }

    .btn:hover {
      background-color: #757575;
    }

    a {
      color: #2196F3;
    }

    hr {
      border: 1px solid lightgrey;
    }

    span.price {
      float: right;
      color: grey;
    }

    @media (max-width: 800px) {
      .row {
        flex-direction: column-reverse;
      }

      .col-25 {
        margin-bottom: 20px;
      }
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



<section class="section-pagetop" style="padding: 1.5ex;">
  <h2 class="title-page">Checkout</h2>
  <nav>
      <ol class="breadcrumb">
          <li class="breadcrumb-item"><a href="ProductList">Home</a></li>
          <li class="breadcrumb-item"><a href="">Product List</a></li>
          <li class="breadcrumb-item"><a href="">Product detail</a></li>
          <li class="breadcrumb-item"><a href="">Cart</a></li>
          <li class="breadcrumb-item" aria-current="page">checkout</li>
      </ol>
  </nav>
</section>

<body bgcolor=white leftmargin=0 topmargin=0 onLoad="ResizeTable();">
  <!--ตาราง พื้นที่แสดงผล เพื่อปรับขนาดพื้นที่ให้อยู่ตรงกลางจอภาพ-->
  <table id=maintable border=0 cellpadding=0 cellspacing=0 align=center width=100%>
    <tr>
      <td align=center valign=middle>
        <!--                 ข้อความนี้อยู่กลางจอภาพ
                <br />มีความกว้างทั้งหมดไม่เกินความกว้าง
                <br />และสูงของ จอภาพ -->

                

        <div class="row" style="padding: 8px;padding-right: 50px;padding-left: 50px;border-top-width: 50px;padding-bottom: 50px;padding-top: 50px;">
          <div class="col-75">
            <div class="container">
                <form action="AddOrder" method="POST" id="addorder">
                <div class="row-2">
                  <div class="col-50">
                    <h3>Billing Address</h3>
                    <label for="fname"><i class="fa fa-user"></i> Full Name</label>
                    <input type="text" id="fname" name="firstname" value="${email.firstname} ${email.lastname}">
                    <label for="Phone"><i class="fa fa-mobile"></i> Phone</label>
                    <input type="text" id="phone" name="phone" value="${email.phoneNo}">
                    <input type="hidden" name="hidcode" value="${Redeem.getDiscountId()}"/>
                    <label for="email"><i class="fa fa-mobile"></i> Email</label>
                    <p style="text-align: left;color: #757575;">&nbsp;&nbsp;${email.email}</p>

                    <div class="d-block my-3">
                      <div class="custom-control custom-radio">
                        <input id="credit" name="address" type="radio" class="custom-control-input" checked=""
                               required="" value="${email.address}">
                        <label class="custom-control-label" for="credit"><i class="fa fa-address-card-o"></i> Address
                          <p style="color: #757575;">
                            ${email.address}
                          </p></label>
                      </div>
                      <div class="custom-control custom-radio">
                          <input id="debit" name="address" type="radio" class="custom-control-input" required="" value="${email.address1}">
                        <label class="custom-control-label" for="debit" ><i class="fa fa-address-card-o"></i> Address 2
                          <p style="color: #757575;">
                            ${email.address1}
                          </p></label>

                      </div>
                    </div>

                    <label for="fname"><i class="fa fa-credit-card"></i> Payment</label>
                    <p style="text-align: left;" for="fname">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Cash on delivery &nbsp;
                      &nbsp; &nbsp; 50 ฿</p>


                  </div>


                </div>
                          
          
        </form>
            </div>
          </div>
          <div style="text-align: left;" class="col-25">


            <ul class="list-group mb-3">
              <h4 class="d-flex justify-content-between align-items-center mb-3">
                <span class="text-muted">Your cart</span>
                <span class="badge badge-secondary badge-pill">${cart.getItemCount()}</span>
              </h4>
                <c:forEach items="${cart.items}"var="lineItem" varStatus="vs">
                    
              <li class="list-group-item d-flex justify-content-between lh-condensed">
                <div>
                  <h6 class="my-0">${lineItem.product.name}</h6>
                  <small class="text-muted"></small>
                </div>
                <span class="text-muted">${lineItem.price} x ${lineItem.quantity} ฿</span>
              </li>
              </c:forEach>
              <li class="list-group-item d-flex justify-content-between bg-light">
                <div class="text-success">
                  <h6 class="my-0">Payment</h6>
                  <small>Cash on delivery</small>
                </div>
                <span class="text-success">50 ฿</span>
              </li>

              <li class="list-group-item d-flex justify-content-between bg-light">
                <div class="text-danger">
                  <h6 class="my-0">Promo code</h6>
                </div>
                <span class="text-danger"> ${Redeem.getDiscount()} ฿</span>
              </li>

              <li class="list-group-item d-flex justify-content-between">
                <span>Total</span>
                <strong>${total} ฿</strong>
              </li>



            </ul>
              
              
              <form action="CheckOut" method ="POST">
            <div class="input-group">
                
              <div class="input-group-prepend">
                  
                      <input type="submit" class="input-group-text" id="btnGroupAddon" value="Redeem"/>
              
              </div>
                
              <input type="text" name="Redeem" class="form-control" placeholder="Promo code" aria-label="Input group example"
                     aria-describedby="btnGroupAddon" value="${Redeem.getDiscountId()}"/>
              
              ${massage}
              
            </div>
            </form>
            

              
              <button type="submit" value="Continue to checkout" class="btn btn-outline-dark" form="addorder">Continue to checkout</button>
              
          </div>




        </div>

</body>

</html>









</td>
</tr>
</table>
<!--จบ ตาราง พื้นที่แสดงผล เพื่อปรับขนาดพื้นที่ให้อยู่ตรงกลางจอภาพ-->

<!-- Optional JavaScript -->
<!-- jQuery first, then Popper.js, then Bootstrap JS -->
<script src="https://code.jquery.com/jquery-3.5.1.slim.min.js"
  integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js"
  integrity="sha384-9/reFTGAW83EW2RDu2S0VKaIzap3H66lZH81PoYlFhbGU+6BZp6G7niu735Sk7lN" crossorigin="anonymous"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"
  integrity="sha384-B4gt1jrGC7Jh4AgTPSdUtOBvfO8shuf57BaghqFfPlYxofvL8/KUEfYiJOMMV+rV" crossorigin="anonymous"></script>
</body>

</html>
