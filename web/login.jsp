<%-- 
    Document   : login
    Created on : 02-03-2017, 10:49:28
    Author     : felesiah
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
      <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>
       <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
          <title>JSP Page</title>
     <style>
form {
    border: 3px solid #f1f1f1;
}
input[type=text], input[type=password] {
    width: 100%;
    padding: 12px 20px;
    margin: 8px 0;
    display: inline-block;
    border: 1px solid #ccc;
    box-sizing: border-box;
}
button {
    background-color: #4CAF50;
    color: white;
    padding: 14px 20px;
    margin: 8px 0;
    border: none;
    cursor: pointer;
    width: 100%;
}
.cancelbtn {
    width: auto;
    padding: 10px 18px;
    background-color: #f44336;
}

.imgcontainer {
    text-align: center;
    margin: 24px 0 12px 0;
}

img.avatar {
    width: 40%;
    border-radius: 50%;
}

.container {
    padding: 16px;
}

span.psw {
    float: right;
    padding-top: 16px;
}

/* Change styles for span and cancel button on extra small screens */
@media screen and (max-width: 300px) {
    span.psw {
       display: block;
       float: none;
    }
    .cancelbtn {
       width: 100%;
    }
}
</style>
<body style="background-color:powderblue;">
 <nav class="navbar navbar-inverse">
           
  <div class="container-fluid">
    <div class="navbar-header">
      <button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#myNavbar">
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>                        
      </button>
      <a class="navbar-brand" href="#">Logo</a>
    </div>
    <div class="collapse navbar-collapse" id="myNavbar">
      <ul class="nav navbar-nav">
          <li class="active"><a href="home.jsp">Home</a></li>
        <li><a href="#">Contact</a></li>
      </ul>
      <ul class="nav navbar-nav navbar-right">
        <li><a href="login.jsp"><span class="glyphicon glyphicon-user"></span> Your Account</a></li>
        <li><a href="orderconfirmation.jsp"><span class="glyphicon glyphicon-shopping-cart"></span> Cart</a></li>
      </ul>
    </div>
  </div>
    </nav>
    <% if ( "login".equals( request.getAttribute( "error" ) ) ) {%>
          <div class="alert alert-danger">
           <strong>SORRY</strong> Username does not match your password!
             </div>
                <%}%>  
<form role="form" method="POST" action="customer.jsp">
  <div class="imgcontainer">
    <img src="http://static.boredpanda.com/blog/wp-content/uploads/2016/09/galaxy-cake-wedding-space-cupcakes-skozorbit-3.jpg"
           alt="Cupcakes" class="img-responsive">
  </div>
       
  <div class="container">
    <label><b>Username</b></label>
    <input type="text" placeholder="Enter Username" class="form-control" name="name" required>

    <label><b>Password</b></label>
    <input type="password" class="form-control" placeholder="Enter Password" name="password" required>
        
    <button type="submit" class="btn btn-success">Login</button>
    <input type="checkbox" checked="checked"> Remember me
  </div>

  <div class="container" style="background-color:#f1f1f1">
    <button type="button" class="cancelbtn">Cancel</button>
    <span class="psw">Forgot <a href="#">password?</a></span>
  </div>
</form>
</body>
</head>
</html>
