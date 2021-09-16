<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<link rel="icon" type="image/jpg" href="icon.jpg" sizes="96x96" />
<meta name="viewport" content="width=device-width, initial-scale=1">
<style type="text/css">
.myform{
    margin:0 auto;
    padding:14px;
     display: inline-block;
}
body{
	text-align: center;
	}
#stylized{
    background:#350202;
     border-radius: 25px;  
}
h1 {
    font-size:54px;
    font-weight:bold;
    color:#f4ffef;
    margin-bottom:20px;
    border-width:0px;
    border-style:solid;
    padding-bottom:20px;
}
#stylized label{
    
    display:block;
    color:#f4ffef;
    font-family:Courier New;
    font-size:20px;
    font-weight:bold;
    text-align:left;
    float:left; 
}
#stylized input{
    display: block;
    font-size:20px;
    color:#000000;
    padding:4px 2px;
    border:solid 1px #aacfe4;
    width:200px;
    margin:20px 20px 20px 20px;
    margin-left:80px;
}
</style>
</head>
<body background="hd.jpg">
  <table align="center"style="margin-top:60px;margin-bottom:35px">
  <tr>
  <td>
  <img src="icon.jpg" alt="pizza"width="96" height="96px">
</td> 
</tr>
<tr>
<td colspan="2" style="color:#f4ffef; font-size:54px;text-align:center;font-weight:bold;">
  Twisted Toppings Pizzeria
	</td>
	</tr>
	</table>
	 <div id="stylized" class="myform">
	<table >
	<form id="form" name="form" action="Hello" method="POST">
	<tr>
	<td>
	<td style="color:#f4ffef; font-size:44px;font-family:Courier New;font-weight:bold;text-align:left;">
	LOGIN
	</td>
	</td>
	</tr>
	<tr>
	<td>	
	<label>Enter Email ID: </label>
	</td>
	<td>
	<input type="text" name="email">
	</td>
	</tr>
	<tr>
	<td>
	<label>Enter Password:</label>
	 </td>
	 <td>
	 <input type="password" name="password">
	</td>
	</tr>
	<tr>
	<td colspan="2">
	<input type="submit" value="Login">
	</td>
	</tr>
	<tr><td colspan="2" style="color:#f4ffef;font-family:Courier New; font-size:18px">
	Not a member yet ? <a href="Register.jsp" style="color:dodgerblue">Register here</a>
	</td>
	</tr>

	</form>
	</table>
	</div>
	</body>
</html> 