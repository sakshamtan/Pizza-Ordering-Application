<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<style type="text/css">
.forms{
    margin-top:200px;
    padding:14px;
     display: inline-block;
}
body{
	text-align: center;
	 
	}
#stylized{
     border-radius: 25px;  
     background:#350202;
}

#stylized label{
    display:block;
    color:#f4ffef;
    font-family:Courier New;
    font-size:44px;
    font-weight:bold;
    text-align:center;
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
<meta charset="ISO-8859-1">
<title>Cart</title>
</head>
<body background="hd.jpg">
<form method="GET" action="Cart4">
<div id="stylized" class="forms">
<table width=75% align="center" >
<tr>
<td>
<label>Cart Updated</label>
</td>
<td>
</td>
</tr>
<tr>
<td>
<input TYPE=submit name="Cart" value="Display Cart">
</td>
</tr>
</table>
</form>
</div>   
</body>
</html>