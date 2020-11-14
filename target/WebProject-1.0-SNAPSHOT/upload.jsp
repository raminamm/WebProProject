<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">
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
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>File Upload Demo</title>
</head>
<body>
    <center>
        <form method="post" action="uploadFile" enctype="multipart/form-data">
            Select file to upload:
            <input type="file" name="uploadFile" />
            <br/><br/>
            <input type="submit" value="Upload" />
        </form>
    </center>
</body>
>>>>>>> master
</html>