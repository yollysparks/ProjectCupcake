<%-- 
    Document   : ororderconfirmation
    Created on : 03-03-2017, 15:09:52
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
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
         <meta name="viewport" content="width=device-width, initial-scale=1">
        <link rel="stylesheet" href="style.css">
        <title>Order</title> 
    <body>
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
        <li><a href="customer.jsp"><span class="glyphicon glyphicon-user"></span> Your Account</a></li>
        <li><a href="orderconfirmation.jsp"><span class="glyphicon glyphicon-shopping-cart"></span> Cart</a></li>
      </ul>
    </div>
  </div>       
    </nav>
         <div class="invoice-box">
        <table cellpadding="0" cellspacing="0">
            <tr class="top">
                <td colspan="2">
                    <table>
                        <tr>
                            <td class="title">
                                <img src="http://graphicdesignjunction.com/wp-content/uploads/2014/11/psd-logo-11.jpg" style="width:100%; max-width:300px;">
                            </td> 
                             <td>
                                Invoice #: 1<br>
                                Created: March 1, 2017 <br>
                            </td>
                        </tr>
                    </table>
                </td>
            </tr>
        </table>
             <tr class="information">
                <td title="2">
                    <table>
                        <tr>
                            <td>
                                Cupcake Delghts, Inc.<br>
                                2100, København Ø<br>
                                Østbanegade 1223,1 sal tv.
                            </td>
                            </table>
        <h1>Your order</h1>
        <p>Bottom: <%=request.getParameter( "Bottom")%> </p>
        <p>Topping: <%=request.getParameter( "Topping")%> </p>
        <table>
           <tr class="heading">
                <td>
                    Payment Method
                </td>
                
                <td>
                    Visa #
                </td>
            </tr>
            
            <tr class="details">
                <td>
                    Visa
                </td>
                
                <td>
                    1000
                </td>
            </tr>
            
            <tr class="heading">
                <td>
                    Item
                </td>
                
                <td>
                    Price
                </td>
            </tr>
            
            <tr class="item">
                <td>
                    Topping: <%=request.getParameter( "Topping")%>
                </td>
                
                <td>
                    5.00 dkk
                </td>
            </tr>
            
            <tr class="item">
                <td>
                    Bottom: <%=request.getParameter( "Bottom")%> 
                </td>
                
                <td>
                    5.00 dkk
                </td>
            </tr> 
            
            <tr class="total">
                <td></td>
                
                <td>
                   Total: 10.00 dkk
                </td>
            </tr>
        </table>          
       </body>
    </head>
</html>
