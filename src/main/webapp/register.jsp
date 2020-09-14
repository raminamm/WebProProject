<%-- 
    Document   : register
    Created on : Sep 14, 2020, 11:35:33 PM
    Author     : NAMM
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <meta name="description" content="">
    <meta name="author" content="Mark Otto, Jacob Thornton, and Bootstrap contributors">
    <meta name="generator" content="Jekyll v4.1.1">
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css"
        integrity="sha384-JcKb8q3iqJ61gNV9KGb8thSsNjpSL0n8PARn9HuZOnIxN0hoP+VmmDGMN5t9UJ0Z" crossorigin="anonymous">
    <link rel="icon" type="image/gif" href="images/097-user.png">

    <title>Register</title>

    <style>
        .bd-placeholder-img {
            font-size: 1.125rem;
            text-anchor: middle;
            -webkit-user-select: none;
            -moz-user-select: none;
            -ms-user-select: none;
            user-select: none;
        }

        @media (min-width: 768px) {
            .bd-placeholder-img-lg {
                font-size: 3.5rem;
            }
        }

        element.style {
            padding-top: 0px;
            margin-bottom: 0px;
        }

        .text-center {
            text-align: center !important;
        }

        body {
            display: -ms-flexbox;
            display: flex;
            -ms-flex-align: center;
            align-items: center;
            padding-top: 0px;
            padding-bottom: 0px;
        }


        html,
        body {
            height: 100%;
        }

        body {
            margin: 0;
            font-family: -apple-system, BlinkMacSystemFont, "Segoe UI",
                Roboto, "Helvetica Neue", Arial, "Noto Sans", sans-serif, "Apple Color Emoji",
                "Segoe UI Emoji", "Segoe UI Symbol", "Noto Color Emoji";
            font-size: 1rem;
            font-weight: 400;
            line-height: 1.5;
            color: #212529;
            text-align: center;
        }

        *,
        ::after,
        ::before {
            box-sizing: border-box;
        }

        user agent stylesheet body {
            display: block;
            margin: 0px;
        }

        html {
            font-family: sans-serif;
            line-height: 1.15;
            -webkit-text-size-adjust: 100%;
            -webkit-tap-highlight-color: transparent;
        }

        *,
        ::after,
        ::before {
            box-sizing: border-box;
        }

        *,
        ::after,
        ::before {
            box-sizing: border-box;
        }


        .mb-3,
        .my-3 {
            margin-bottom: 1rem;
        }

        #container {
            display: flexbox;
            align-items: center;
            justify-content: center;
            padding-top: 0px;
            padding-right: 508px;
            padding-left: 508px;
            padding-bottom: 0px;
            width: 100%;
        }



        body {
            background-image: url('images/pexels-thaís-silva-3385234.jpg');
            background-repeat: no-repeat;
            background-attachment: fixed;
            background-size: cover;
            background-position-y: bottom;
            filter: opacity(82%);
        }

        .ccc {
            display: flexbox;
            align-items: center;
            justify-content: center;
            width: 520px;
        }

        .btn {
            background-color: #ec5f5f;
        }
    </style>

    <link href="signin.css" rel="stylesheet">


    <form class="form-signin" action="Login" method="POST" />

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

                <form class="form-signin">

                    <div id="container" class="bbb">

                        <div class="ccc">

                            <img class="mb-2" src="images/Asset 1.png" alt="" width="72" height="72">
                            <h1 class="h3 mb-3 font-weight-normal text-white">Register</h1>

                        

                            <div class="row">
                                <div class="col-xs-8 col-sm-6" ><!-- col-xs-12 col-sm-6  -->
                                    <div class="form-group">
                                        <input type="text" name="firstname" id="first_name" 
                                        class="form-control input-lg" placeholder="First Name" tabindex="1" 
                                        style="border-radius: 5px 5px 5px 5px;height: 48px;">
                                    </div>
                                </div>
                                <div class="col-xs-8 col-sm-6">
                                    <div class="form-group">
                                        <input type="text" name="lastname" id="last_name" 
                                        class="form-control input-lg" placeholder="Last Name" tabindex="2"
                                        style="border-radius: 5px 5px 5px 5px;height: 48px;">
                                    </div>
                                </div>
                            </div>

                            <div class="form-group">
                                <label for="email" class="sr-only">Your Email</label>
                                <div class="cols-sm-10">
                                    <div class="input-group">
                                        <span class="input-group-addon"><i class="fa fa-envelope fa"
                                                aria-hidden="true"></i></span>
                                        <input type="text" class="form-control" name="email" id="email"
                                            placeholder="Enter your Email"
                                            style="border-radius: 5px 5px 5px 5px;height: 48px;">
                                    </div>
                                </div>
                            </div>

<!--                            <div class="form-group">
                                <label for="username" class="sr-only">Username</label>
                                <div class="cols-sm-10">
                                    <div class="input-group">
                                        <span class="input-group-addon"><i class="fa fa-users fa"
                                                aria-hidden="true"></i></span>
                                        <input type="text" class="form-control" name="username" id="username"
                                            placeholder="Enter your Username"
                                            style="border-radius: 5px 5px 5px 5px;height: 48px;">
                                    </div>
                                </div>
                            </div>-->

                            <div class="row">
                                <div class="col-xs-12 col-sm-6 col-md-6">
                                    <div class="form-group">
                                        <label for="password" class="sr-only">Password</label>
                                        <input type="password" name="password" id="password" class="form-control"
                                            placeholder="Password" tabindex="5"
                                            style="border-radius: 5px 5px 5px 5px;height: 48px;">
                                    </div>
                                </div>
                                <div class="col-xs-12 col-sm-6 col-md-6">
                                    <div class="form-group">
                                        <label for="confirm" class="sr-only">Confirm Password</label>
                                        <input type="password" name="password_confirmation" id="password_confirmation"
                                            class="form-control" placeholder="Confirm Password" tabindex="6"
                                            style="border-radius: 5px 5px 5px 5px;height: 48px;">
                                    </div>
                                </div>
                            </div>

                            <div class="form-group">
                                <input type="number" min="0" name="phone_no" id="phone" class="form-control my-input" 
                                placeholder="Phone" style="border-radius: 5px 5px 5px 5px;height: 48px;">
                             </div>

                            <div class="form-group">
                                <label for="birthDate" class="sr-only">Date of Birth</label>
                                <input type="date" id="birthDate" name="date_of_birth" class="form-control" placeholder="birthDate"
                                    style="border-radius: 5px 5px 5px 5px;height: 48px;">
                            </div>

                            <div class="form-group">
                                <label for="gender" class="sr-only">Your Gender</label>
                                <select id="gender" class="form-control" name="gender" id="gender" placeholder="Gender"
                                    style="height: 48px;">
                                    <option value="Gender" DISABLED selected>Your Gender</option>
                                    <option value="Male">Male</option>
                                    <option value="Female">Female</option>
                                    <option value="other">Other</option>
                                </select>
                            </div>

<!--                             <div class="form-group">
                                <label for="address" class="sr-only">Your Address</label>
                                <textarea class="form-control" id="address" name="address" placeholder="address"
                                    style="border-radius: 5px 5px 5px 5px;height: 48px;"></textarea>
                            </div> -->

                            <form>
                                <div class="form-row">
                                <div class="form-group col-md-4">
                                <label for="province"class="sr-only">province</label>
                                <select name="province_id" id="province" class="form-control">
                                <option value="">Select province</option>
                                </select>
                                </div>

                                <div class="form-group col-md-4">
                                    <label for="amphure"class="sr-only">amphure</label>
                                    <select name= "amphure_id" id="amphure" class="form-control">
                                    <option value="">Select amphure</option>
                                    </select>
                                    </div>
                                    <div class="form-group col-md-4">
                                    <label for="district"class="sr-only">district</label>
                                    <select name="district_id" id="district" class="form-control">
                                    <option value=" ">Select district</option>
                                    </select>
                                    </div>

                            <!-- <div class="mb-3 text-white"> -->
<!--                                 <p style="color:white">Terms and Conditions</p>
                                <div class="input-group" style="color:white">
                                    <input type="checkbox" id="terms">
                                    <label for="terms">I accept the terms and conditions for signing up to this service,
                                        and hereby confirm I have read the privacy policy.</label>
                                </div> -->
<!--                             </div>
 -->
                            <button class="btn btn-lg btn-danger btn-block" type="submit">Register</button>



                        </div>
                    </div>
                </form>

            </td>
        </tr>
    </table>

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
