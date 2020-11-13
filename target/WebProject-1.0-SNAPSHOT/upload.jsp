<%-- 
    Document   : upload
    Created on : Nov 12, 2020, 12:07:08 AM
    Author     : glajaja
--%>

<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<<<<<<< HEAD
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>File Upload Demo</title>
    </head>
    <body>
        <center>
            <form method="POST" action="Upload" enctype="multipart/form-data">
                Select file to upload:
                <input type="file" name="uploadFile" />
                <br/><br/>
                <input type="submit" value="Upload" />
            </form>
        </center>
    </body>
=======
<head>
    <title>Uploading a file</title>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="https://unpkg.com/purecss@2.0.3/build/pure-min.css"
          integrity="sha384-cg6SkqEOCV1NbJoCu11+bm0NvBRc8IYLRGXkmNrqUBfTjmMYwNKPWBTIKyw9mHNJ" 
          crossorigin="anonymous">
    <style>
        main { margin:1em }
    </style>
</head>
<body>
<main>
<form class="pure-form pure-form-stacked" method="post" action="UploadFile"
      enctype="multipart/form-data">
    <fieldset>
        <legend>File:</legend>
        <input  type="file" name="myfile">
        <button type="submit" class="pure-button pure-button-primary">Upload</button>
    </fieldset>
</form>
</main>
</body>
>>>>>>> master
</html>