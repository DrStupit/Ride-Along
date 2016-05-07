<%-- 
    Document   : registration
    Created on : May 7, 2016, 11:41:09 AM
    Author     : Kerev
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.2/jquery.min.js"></script>
        <script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js"></script>
         <script src="http://ajax.googleapis.com/ajax/libs/angularjs/1.4.8/angular.min.js"></script>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Ride Along - Registration</title>
        <style>
        div.main {
         border: 1px solid black;
         margin-left: 100px;
         margin-right: 100px;
        
        }
</style>
    </head>
    <body>
        <div class="container">
            <div class="page-header">
                <h1>Registration</h1>  
                <h4>Already a Member? Login Here</h4>
                <button type="button"class="btn btn-primary">Login</button>
            </div>
      
        </div>
        
    <div class="main">
    <form style=" align-content: center" class="form-horizontal">
        
        
        <h2>Not a Member Yet? Sign Up Below!</h2>
       
        First Name: <input type="text" placeholder="First Name" name="fname" id="fname"class="form-control"><br/>
        
      
        Surname: <input type="text" placeholder="Surname" name="sname" id="sname" class="form-control"><br/>
     
       
        Email: <input type="email" placeholder="Email" name="email" id="email" class="form-control"><br/>
      
        Surname: <input type="password" placeholder="Password" name="password" id="sname" class="form-control"><br/>
       
        
        Identity Number <input type="text" placeholder="Identity Number" name="idnum" id="idnum" class="form-control"><br/>
    
        <button type="submit" class="btn btn-primary" value="Sign Me UP!">Sign Me Up!</button>
      
     
    </form>
</div>
    </body>
</html>
