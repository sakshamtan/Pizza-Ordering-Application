<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<!DOCTYPE html>
<html>
<head>
<style type="text/css">
.form{
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
    padding:30px;  
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
    font-size:25px;
    font-weight:bold;
    text-align:left;
    float:left; 
    padding:25px;
    margin:15px;
}
#stylized input{
    display: block;
    font-size:15px;
    color:#000000;
    padding:4px 2px;
    border:solid 1px #aacfe4;
    padding:5px;
    margin:15px;
}
</style>
<meta charset="ISO-8859-1">
<title>Menu</title>
</head>
<body background="hd.jpg">
	
	<h1> Select your Order </h1>
	<form method='POST' action="PizzaOrder">
		<div id="stylized" class="form">
		<table align="center">
			<tr>
				<td>
					<input type="checkbox" name="pizza1" value="Paneer"/>
			</td>
				<td style="color:#f4ffef;font-family:Courier New; font-size:22px">
				Paneer Supreme</td>
				<td>
					<!-- &nbsp;&nbsp;&nbsp; -->
					<select name='size1'>
					<option value="small"> Small Rs. 210</option>
					<option value="medium"> Medium Rs. 350</option>
					<option value="large"> Large Rs. 550</option>
				</select>
				</td>
				<td style="color:#f4ffef;font-family:Courier New; font-size:22px">
					Quantity :
					</td>
					<td colspan="2" style="color:#f4ffef;font-family:Courier New; font-size:18px"> 
					<input type='number' name='quantity1' value="1" min="1"/>
				</td>
			</tr>

			<tr>
				<td>
					<input type="checkbox" name="pizza2" value="Chef"/>
				</td>
				<td  style="color:#f4ffef;padding:25px;font-family:Courier New; font-size:22px">
				Chef's special</td>
				<td>
					<!-- &nbsp;&nbsp;&nbsp; -->
					<select name='size2'>
					<option value="small"> Small Rs. 210</option>
					<option value="medium"> Medium Rs. 350</option>
					<option value="large"> Large Rs. 550</option>
				</select>
				</td>
				<td  style="color:#f4ffef;font-family:Courier New; font-size:22px; padding:30px;">
					Quantity :
					</td>
					<td colspan="2" style="color:#f4ffef;font-family:Courier New; font-size:18px">
					<input type='number' name='quantity2' value="1" min="1"/>
				</td>
			</tr>
			<tr>
				<td>
					<input type="checkbox" name="pizza3" value="Chicken"/>
				</td>
				<td  style="color:#f4ffef;padding:25px;font-family:Courier New; font-size:22px">
				Chicken Delight</td>
				<td>
					<!-- &nbsp;&nbsp;&nbsp; -->
					<select name='size3'>
					<option value="small"> Small Rs. 210</option>
					<option value="medium"> Medium Rs. 350</option>
					<option value="large"> Large Rs. 550</option>
				</select>
				</td>
				<td  style="color:#f4ffef;font-family:Courier New; font-size:22px">
					Quantity : 
					</td>
					<td colspan="2" style="color:#f4ffef;font-family:Courier New; font-size:18px">
					<input type='number' name='quantity3' value="1" min="1"/>
				</td>
			</tr>
			<tr>
				<td style="color:#f4ffef;font-family:Courier New; font-size:18px">
					<input type="checkbox" name="pizza4"value="NonVeg"/>
				</td>
				<td  style="color:#f4ffef;padding:25px;font-family:Courier New; font-size:22px">
				Non Veg Supreme</td>
				<td>
					<!-- &nbsp;&nbsp;&nbsp; -->
					<select name='size4'>
					<option value="small"> Small Rs. 210</option>
					<option value="medium"> Medium Rs. 350</option>
					<option value="large"> Large Rs. 550</option>
				</select>
				</td>
				<td  style="color:#f4ffef;font-family:Courier New; font-size:22px">
					Quantity : 
					</td>
					<td colspan="2" style="color:#f4ffef;font-family:Courier New; font-size:18px">
					<input type='number' name='quantity4' value="1" min="1"/>
				</td>
			</tr>
		</table>
		</div>
		<br/>
		<br/>
		<input type="submit" value="Add to Cart" name="Order"/>
		<input type="reset" value="Reset" name="reset"/>
	</form>
</body>

</html>