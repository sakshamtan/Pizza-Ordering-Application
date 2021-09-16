package com.login;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class PlaceOrder
 */	
@WebServlet("/PlaceOrder")
public class PlaceOrder extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		String address= request.getParameter("address");
		HttpSession session = request.getSession();
		String email = (String) session.getAttribute("email");
		PrintWriter out=response.getWriter();
		try
		{
		Class.forName("com.mysql.jdbc.Driver");
		Connection conn=DriverManager.getConnection ("jdbc:mysql://localhost:3306/web_student_tracker","root","rootroot");
		PreparedStatement ps=conn.prepareStatement("select name,mobile from users where email=?");
		ps.setString(1, email);
		ResultSet rs=ps.executeQuery();
		rs.next();
		out.print("<body background='hd.jpg'>");
		out.print("<table width=75% border=.3 align=center style=\" border-radius: 25px;margin-top:140px; background: #350202;  padding: 20px;\">");
		out.print("<caption style=\"color:#f4ffef;font-family:Courier New; font-weight:bold; font-size:50px\">Order Bill</caption>");
		out.print("<tr style=\"color:#f4ffef;padding:30px;font-size:25px;font-weight:bold;text-align:center;\"><td>Name of user:  "+rs.getString(1)+"</td><td>Contact Number: "+rs.getLong(2)+"</td><td>Address: "+address+"</td></tr><tr></tr>");
		ps=conn.prepareStatement("select Name_pizza,size,Quantity,Price from orders");
		rs=ps.executeQuery();
		while(rs.next())  
		{ 
		out.print("<tr></tr><tr></tr><tr></tr><tr></tr><tr style=\"color:#f4ffef;padding:30px;font-size:25px;text-align:center;\"><td>Name of pizza: "+rs.getString(1)+"</td><td>Size: "+rs.getString(2)+"</td><td>Quantity Ordered:   "+rs.getInt(3)+"</td><td>Price Of Pizza: "+rs.getInt(4)+"</td></tr>");
		}
		out.print("</table>");
		ps=conn.prepareStatement("select SUM(Price) from orders");
		rs=ps.executeQuery();
		rs.next();
		out.print("<table width=50% align=center style=\" border-radius: 25px;margin-top:130px;  background: #350202;  padding: 20px;\" >");
		out.print("<form action=\"Checkout2\" method-=\"POST\">");
		out.print("<tr style=\"color:#f4ffef;text-align:center;font-size:25px;\"><td colspan=\"3\">Total Amount to be Paid :</td><th>"+rs.getFloat(1)+"</th></tr>");
		out.print("</form></table></body>");
		out.print("<table align=center style=\" border-radius: 25px;margin-top:30px;  padding: 20px;\">");
		out.print("<form action=\"Logout2\" method=\"POST\">");
		out.print("<tr style=\"font-size:25px\";><td><button onclick=\"window.print();\">Print Order</button></td><td><input type=\"submit\" value=\"Logout\"></td></tr>");
		out.print("</form></table></body>");
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

}
