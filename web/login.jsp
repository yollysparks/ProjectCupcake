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
<form role="form" method="POST" action="/Cupcake">
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
