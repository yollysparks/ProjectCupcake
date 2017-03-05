<%-- 
    Document   : home
    Created on : 02-03-2017, 10:50:04
    Author     : felesiah
--%>

<%@page import="Model.ModelFacade"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
    <title>Login Page</title>
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
.carousel-inner > .item > img,
.carousel-inner > .item > a > img
    {
      width: 70%;
      margin: auto;
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
    <div class="collapse navbar-collapse"      id="myNavbar">
      <ul class="nav navbar-nav">
          <li class="active"><a href="home.jsp">Home</a></li>
        <li><a href="#">Contact</a></li>
      </ul>
      <ul class="nav navbar-nav navbar-right">
        <li><a href="login.jsp"><span class="glyphicon glyphicon-user"></span> Your Account</a></li>
        <li><a href="cart.jsp"><span class="glyphicon glyphicon-shopping-cart"></span> Cart</a></li>
      </ul>
    </div>
  </div>
</nav>
    <div class="container">
       <div class="jumbotron">
         <h1>Cupcake Delights.</h1> 
         <p style="color:blue;">A balanced diet is having a cupcake in each hand!!</p>
  </div>
    <div class="container">
  <br>
  <div id="myCarousel" class="carousel slide" data-ride="carousel">
    <!-- Indicators -->
    <ol class="carousel-indicators">
      <li data-target="#myCarousel" data-slide-to="0" class="active"></li>
      <li data-target="#myCarousel" data-slide-to="1"></li>
      <li data-target="#myCarousel" data-slide-to="2"></li>
      <li data-target="#myCarousel" data-slide-to="3"></li>
    </ol>

    <!-- Wrapper for slides -->
    <div class="carousel-inner" role="listbox">

      <div class="item active">
        <img src="https://i.ytimg.com/vi/i944XxUXkzs/maxresdefault.jpg" alt="Cupcake" width="460" height="345">
        <div class="carousel-caption">
        </div>
      </div>

      <div class="item">
        <img src="https://raw.githubusercontent.com/cphdat2sem2017-Cos/Week04-Frontend/master/CupcakeImage.jpg" alt="Galaxy" width="460" height="345">
        <div class="carousel-caption">
        </div>
      </div>
    
      <div class="item">
        <img src="http://sweetapolita.com/wp-content/uploads/2013/04/cupcakeduorev-e1365280388370.jpg" alt="Vanilla" width="460" height="345">
        <div class="carousel-caption">
        </div>
      </div>

      <div class="item">
        <img src="http://www.cookingclassy.com/wp-content/uploads/2014/05/cherry-limade-cupcakes-step3+srgb..jpg" alt="Pistacio" width="460" height="345">
        <div class="carousel-caption">
        </div>
      </div>
  
    </div>

    <!-- Left and right controls -->
    <a class="left carousel-control" href="#myCarousel" role="button" data-slide="prev">
      <span class="glyphicon glyphicon-chevron-left" aria-hidden="true"></span>
      <span class="sr-only">Previous</span>
    </a>
    <a class="right carousel-control" href="#myCarousel" role="button" data-slide="next">
      <span class="glyphicon glyphicon-chevron-right" aria-hidden="true"></span>
      <span class="sr-only">Next</span>
    </a>
  </div>
   <% String[] toppings = ModelFacade.getToppings();
     String[] bottoms = ModelFacade.getBottoms();
   %>
   <div class="col-md-6">
                        <form role="form" method="POST" action="orderconfirmation.jsp">
                            <div class="row">
                                <div class="form-group col-md-4">
                                    <label for="seltop">Topping:</label>
                                    <select name="Bottom" class="form-control" id="seltop">
                                        <% for ( String b : bottoms ) {%>
                                        <option><%=b%></option>
                                        <%}%>
                                    </select>
                                </div>
                                <div class="form-group col-md-4">
                                    <label for="selbot">Bottom</label>
                                    <select name="Topping" class="form-control" id="selbot">>
                                        <% for ( String b : toppings ) {%>
                                        <option><%=b%></option>
                                        <%}%>
                                    </select>
                                </div>
                                <div class="form-group col-md-4">
                                    <input type="hidden" name="action" value="buyCake">
                                    <label><br></label>
                                    <button type="submit" class="btn btn-success">Buy</button>
                                </div>
                            </div>
                        </form>                        
                    </div>
                    <div class="clearfix"></div>
                </div>

    <div class ="container">
       <table class="table">
    <thead>
      <tr>
          <th>Bottoms</th>
          <th>Price</th>
          <th>Toppings</th>
            <th>Price</th>
      </tr>
    </thead>
    <tbody>
      <tr>
        <td>Chocolate</td>
          <td>5</td>
        <td>Chocolate</td>
        <td>5</td>
      </tr>      
      <tr class="success">
        <td>Almond</td>
          <td>7</td>
        <td>Rasberry</td>
         <td>5</td>
      </tr>
      <tr class="danger">
        <td>Vanilla</td>
          <td>5</td>
        <td>Blueberry</td>
         <td>5</td>
      </tr>
      <tr class="info">
        <td>Nutmeg</td>
          <td>5</td>
        <td>Rum/Rasins</td>
        <td>7</td>
      </tr>
      <tr class="active">
          <td>Pistacio</td>
          <td>6</td>
          <td>Lemon</td>
          <td>8</td>
        </tr>
          <tr class="info">
            <td></td>
            <td></td>
            <td>Crispy</td>
            <td>6</td>
       </tr>
        <tr class="warning">
            <td></td>
            <td></td>
           <td>Strawberry</td>
         <td>6</td>
      </tr>
         <tr class="active">
          <td></td>
          <td></td>
          <td>Orange</td>
          <td>8</td>
        </tr>
         <tr class="danger">
           <td></td>
           <td></td>
          <td>Blue cheese</td>
         <td>5</td>
      </tr>
    </tbody>
  </table>
</div> 
</div> 
</body>
</head>
</html>
