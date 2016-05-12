<%-- 
    Document   : homepage
    Created on : May 7, 2016, 10:20:27 AM
    Author     : Kerev
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.2/jquery.min.js"></script>
        <script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js"></script>
         <script src="http://ajax.googleapis.com/ajax/libs/angularjs/1.4.8/angular.min.js"></script>
         <script>
        var mod = angular.module("app", []);
	mod.controller("cti", function($scope,$http)
	{
            $scope.firstname = "";
            $scope.surname = "";
            $scope.email = "";
            $scope.gender = "";
            $scope.password = "";
            $scope.idnum = "";
	});
         
      
     
}); 
        </script>
         <style>
    body{
    background-image: url("http://www.coolwallpapers.org/photo/43651/2-road-hd-wallpaper.jpg");
    opacity: 0.5;
    filter: alpha(opacity=60); /* For IE8 and earlier */
    }
   
    
    </style>
        <title>Homepage</title>
    </head>
    <body>
 <div id="custom-bootstrap-menu" class="navbar navbar-default " role="navigation">
    <div class="container-fluid">
        <div class="navbar-header"><a class="navbar-brand" href="#">Ride Along<span class="glyphicon glyphicon-home"></span></a>
            <button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".navbar-menubuilder"><span class="sr-only">Toggle navigation</span><span class="icon-bar"></span><span class="icon-bar"></span><span class="icon-bar"></span>
            </button>
        </div>
        <div class="collapse navbar-collapse navbar-menubuilder">
            <ul class="nav navbar-nav navbar-left">
                
            </ul>
            <ul class="nav navbar-nav navbar-right">
                <li><a href="./registration.jsp">Sign Up<span class="glyphicon glyphicon-user"></span></a> </li>
                <li><a href="./login.jsp">Login<span class="glyphicon glyphicon-log-in"></span></a> </li>
            </ul>
        </div>
    </div>
</div>
   
    </body> <body ng-app="app" ng-controller="cti">
        
          
   
    </body>
</html>
