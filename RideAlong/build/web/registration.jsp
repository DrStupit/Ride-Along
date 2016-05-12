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
            @import url(http://fonts.googleapis.com/css?family=Vibur);     
            
* {
  box-sizing: border-box;
  -moz-box-sizing: border-box;
  -webkit-box-sizing: border-box;
  font-family: arial;
}

body {
  background-image: url("http://www.coolwallpapers.org/photo/43651/2-road-hd-wallpaper.jpg");
}

h1 {
  color: #ccc;
  text-align: left;
  font-family: 'Vibur', cursive;
  font-size: 50px;
}

.main {
  width: 350px;
  padding: 40px 30px;
  background: #eee;
  -moz-border-radius: 4px;
  -webkit-border-radius: 4px;
  border-radius: 4px;
  margin: auto;
  position: absolute;
  left: 0;
  right: 0;
  top: 65%;
  -moz-transform: translateY(-50%);
  -ms-transform: translateY(-50%);
  -webkit-transform: translateY(-50%);
  transform: translateY(-50%);
}

.form-group {
  position: relative;
  margin-bottom: 15px;
}

.form-control {
  width: 100%;
  height: 40px;
  border: none;
  padding: 5px 7px 5px 15px;
  background: #fff;
  color: #666;
  border: 2px solid #ddd;
  -moz-border-radius: 4px;
  -webkit-border-radius: 4px;
  border-radius: 4px;
}
.form-control:focus, .form-control:focus + .fa {
  border-color: #10CE88;
  color: #10CE88;
}

.form-group .fa {
  position: absolute;
  right: 15px;
  top: 17px;
  color: #999;
}

.log-status.wrong-entry {
  -moz-animation: wrong-log 0.3s;
  -webkit-animation: wrong-log 0.3s;
  animation: wrong-log 0.3s;
}

.log-status.wrong-entry .form-control, .wrong-entry .form-control + .fa {
  border-color: #ed1c24;
  color: #ed1c24;
}

.reg-btn {
  background: #0AC986;
  dispaly: inline-block;
  width: 100%;
  font-size: 16px;
  height: 50px;
  color: #fff;
  text-decoration: none;
  border: none;
  -moz-border-radius: 4px;
  -webkit-border-radius: 4px;
  border-radius: 4px;
}

.link {
  text-decoration: none;
  color: #C6C6C6;
  float: right;
  font-size: 12px;
  margin-bottom: 15px;
}
.link:hover {
  text-decoration: underline;
  color: #8C918F;
}

.alert {
  display: none;
  font-size: 12px;
  color: #f00;
  float: left;
}

@-moz-keyframes wrong-log {
  0%, 100% {
    left: 0px;
  }
  20% , 60% {
    left: 15px;
  }
  40% , 80% {
    left: -15px;
  }
}
@-webkit-keyframes wrong-log {
  0%, 100% {
    left: 0px;
  }
  20% , 60% {
    left: 15px;
  }
  40% , 80% {
    left: -15px;
  }
}
@keyframes wrong-log {
  0%, 100% {
    left: 0px;
  }
  20% , 60% {
    left: 15px;
  }
  40% , 80% {
    left: -15px;
  }
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
            </div>
      
        </div>
        
    <div class="main">
   
       <div class="form-group ">
        First Name: <input type="text" placeholder="First Name" name="fname" ng-model="fname" id="fname"class="form-control">
        <i class="fa fa-user"></i>
       </div>
        <div class="form-group ">
        Surname: <input type="text" placeholder="Surname" name="sname" ng-model="sname" id="sname" class="form-control">
        <i class="fa fa-user"></i>
        </div>
        <div class="form-group ">
        Username: <input type="text" placeholder="Username" name="username" ng-model="username" id="username" class="form-control">
        <i class="fa fa-user"></i>
        </div>
        <div class="form-group ">
        Email: <input type="email" placeholder="Email" name="email" ng-model="email" id="email" class="form-control">
        <i class="fa fa-user"></i>
        </div>
        <div class="form-group ">
        Password: <input type="password" placeholder="Password" name="password" ng-model="password" id="password" class="form-control">
        <i class="fa fa-user"></i>
        </div>
        <div class="form-group ">
        Identity Number <input type="text" placeholder="Identity Number" name="id_no" ng-model="id_no" id="id_no" class="form-control">
        <i class="fa fa-user"></i>
        </div>
        <div class="form-group ">
        <button type="submit" class="reg-btn" value="Sign Me UP!" ng-click="addUser()" >Sign Me Up!</button>
        <i class="fa fa-user"></i>
        </div>
</div>
       
        
    </body>
</html>
