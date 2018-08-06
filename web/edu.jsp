<%-- 
    Document   : sch3
    Created on : Dec 23, 2017, 11:56:38 PM
    Author  :  Digit
--%>
<%@page import="see.school.schools"%>
<%@page import="Account.DBConnection"%>
<%@page import="java.sql.*"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@page language="java" contentType="text/html" pageEncoding="UTF-8"%>
  <%schools getschool = new schools();%>
<!DOCTYPE html>
<html>
    <head>
        <title>Education Management System</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link rel="stylesheet" href="bower_components/bootstrap/dist/css/bootstrap.min.css">
        <!-- Font Awesome -->
  <link rel="stylesheet" href="bower_components/font-awesome/css/font-awesome.min.css">
  
   <link rel="stylesheet" href="Css/style.css">
   <link rel="stylesheet" href="loginface.css" />

   <script src="jquery.validate.js" type="text/javascript"></script>
   <script src="Jquery/jquery.validate.min.js" type="text/javascript"></script>
</head>
   
    <body>
  <div class="heading">Leo Management System</div>
  <h1 class="adminlog">Education Login Portal</h1>
    
  <div  class="main" align="center">   
<div class="signin-form">
    <form method="post" action="Account" id="Alogin"  >
        <div class="message">
            ADMINISTRATOR STAFF<br>STUDENT CAN ACCESS THEIR SCHOOL PORTAL HERE FOR THEIR SCHOOL ACTIVITIES KINDLY LOGIN 
        </div>
        <br><br>
        
       <select style="width:auto; max-width:200px" name ="school"  required="true" id="skul" >
     <option  value="0">&nbsp;&nbsp;&nbsp;
&nbsp;&nbsp;&nbsp;Pick your School</option>
     <option><%=(getschool.getName())%></option>
</select>
 <br>
 <div class="login-form">
<div id="error" style="color:black"></div>
<input type="text" align="right" name="username" align="center" placeholder=" EduSoft Login ID" autocomplete="true" id="username" required>
<br>
    <input type="password" name="password" align="center" placeholder="EduSoft Password" minlength="6" id="password" required>
<br>
<span style="color:red; font-weight: bold">${errmsg}</span>
<br>
<span>

<input type="submit"  class="logbtn" align="left" value="Login">
&nbsp;&nbsp;&nbsp;&nbsp;
<input type="submit" class="forgottenbtn"  align="right" value="Forgotten Password &quest;">
</span>
<div>&nbsp;</div>
<p><a href="sch2.html" style="color:white; font-family:cursive; font-weight:bolder ; font-size: 20px; margin-top:35px; ">Find Assistance Here &quest;&nbsp;<i class="fa fa-home"></i></a></p>
   
</div> 
</form>
</div>
</div>
<br><br>

<footer style="padding-bottom:20px; font-weight: bold; color:#dbdb6a;background-color:transparent;text-align:center;"> &copy;
                    <script>                            document.write(new Date().getFullYear());
                    </script> <a href="@yourDigit" style="color:orangered; font-size:35px; font-family:The New Times,serif;">Digit</a>&nbsp;It is our commitment to make it easy and better</footer>
                 
               <script type="text/javacript" src="bower_components/bootstrap/dist/js/bootstrap.min.js"></script>
              
                    <script src="jquery.js" type="text/javascript"></script>
                    
                    <script src="validate.js" type="text/javascript"></script>      
                    <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
        <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.1.1/js/bootstrap.min.js" integrity="sha384-smHYKdLADwkXOn1EmN1qk/HfnUcbVRZyYmZ4qpPea6sjB/pTJ0euyQp0Mk8ck+5T" crossorigin="anonymous"></script>
   </body>
   
</html>
