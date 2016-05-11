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
  <script>
        var mod = angular.module("app", []);
	mod.controller("reg", function($scope,$http)
	{
		$scope.addUser = function(){		
		
		//		
		var dataObj = 
                { 
                    id_no: $scope.id_no,
                    fname : $scope.fname,
                    sname : $scope.sname,
                    email: $scope.email,
                    password : $scope.password,
                    username : $scope.username,
                    cell_no :"0767646593",
                    gender : "Male",
                    bio : "Hello world",
                    photo: "photo",
                    verified:"Yes"
                                
		};	
                var parameter = JSON.stringify(dataObj);
                var res = $http.post("./service/RegUser", parameter);
             res.success(function() {
			
                        alert( "found" );
		});
		res.error(function() {
			alert( "failure message: error" );
		});
                
                
                
                
	}
		
	 
	});
              
        </script>

    </head>
    <body ng-app="app" ng-controller="reg">
        <div class="container">
            <div class="page-header">
                <h1>Registration</h1>  
                <h4>Already a Member? Login Here</h4>
                <button type="button"class="btn btn-primary">Login</button>
            </div>
      
        </div>
        
    <div class="main">
    <form class="form-horizontal" >
        
        
        <h2>Not a Member Yet? Sign Up Below!</h2>
       
        First Name: <input type="text" placeholder="First Name" name="fname" ng-model="fname" id="fname"class="form-control"><br/>
        
      
        Surname: <input type="text" placeholder="Surname" name="sname" ng-model="sname" id="sname" class="form-control"><br/>
     
        Username: <input type="text" placeholder="Username" name="username" ng-model="username" id="username" class="form-control"><br/>
     
        
        Email: <input type="email" placeholder="Email" name="email" ng-model="email" id="email" class="form-control"><br/>
      
        
        Password: <input type="password" placeholder="Password" name="password" ng-model="password" id="password" class="form-control"><br/>
       
        
        Identity Number <input type="text" placeholder="Identity Number" name="id_no" ng-model="id_no" id="id_no" class="form-control"><br/>
    
        
        <button type="submit" class="btn btn-primary" value="Sign Me UP!" ng-click="addUser()" >Sign Me Up!</button>
      
             
    </form>
</div>
        <p>{{items}}</p>
        
    </body>
</html>
