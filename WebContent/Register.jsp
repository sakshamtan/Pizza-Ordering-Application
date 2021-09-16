<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<style type="text/css">
h1 {
    font-size:54px;
    font-weight:bold;
    color:#f4ffef;
    margin-bottom:20px;
    border-width:0px;
    border-style:solid;
    padding-bottom:20px;
    text-align:center;
}
body{
	text-align: center;
	}
.form
{
    margin:0 auto;
    padding:14px;
     display: inline-block;
}
#stylized
{
    background:#350202;
     border-radius: 25px;  
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
    font-size:17px;
    color:#000000;
    padding:4px 2px;
    border:solid 1px #aacfe4;
    width:200px;
    margin:20px 20px 20px 20px;
    margin-left:80px;
}
</style>
<title>Insert title here</title>
</head>
<body background="hd.jpg">
    <table align="center" style="margin-top:70px;margin-bottom:35px;">
    <form action="Register3" method="POST">
    <tr>
    <td>
    <img src="icon.jpg" alt="pizza"width="96" height="96px"></td><td colspan="2" style="color:#f4ffef; font-size:54px;text-align:center;font-weight:bold">Sign Up
    </td>
    </tr>
    </table>
     <div id="stylized" class="form">
    <table >
    <tr>
    <td colspan="2" style="color:#f4ffef; font-size:30px;text-align:center">
    Please fill up this form to create an account
   </td>
   </tr>
   <tr>
   </tr> <tr>
   </tr> <tr>
   </tr> <tr>
   </tr>
   <tr>
   <td>
	<label>Name*</label>
	</td>
	<td>
    <input type="text" placeholder="Enter Name" name="name" required>  
   </td>
   </tr>
   <tr>
   <td>
    <label>Mobile Number*</label>
    </td>
    <td>
    <input type="number" placeholder="Enter Mobile" name="number" required>
   </td>
   </tr>
   <tr>
   <td> 
    <label>Email*</label>
    </td>
    <td>
    <input type="text" placeholder="Enter Email" name="email" required>
	 </td>
   </tr>
   <tr>
   <td>
    <label>Password*</label>
    </td>
    <td>
    <input type="password" placeholder="Enter Password" name="password" required>
	 </td>
   </tr>
   <tr>
   <td>
<a href="login.jsp" style="color:dodgerblue">Back to Login</a>
    </td>
    <td>  
    <input type="submit" value="Register"/>
    </td>
    </tr>
    </form>
      </table>
      </div>
</body>
</html>