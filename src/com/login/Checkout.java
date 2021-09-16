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

@WebServlet("/Checkout")
public class Checkout extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 HttpSession session = request.getSession();
		 String email = (String) session.getAttribute("email");
		 response.setContentType("text/html");
		 PrintWriter out=response.getWriter();
		try 
		{
		 Class.forName("com.mysql.jdbc.Driver");
			Connection conn=DriverManager.getConnection ("jdbc:mysql://localhost:3306/web_student_tracker","root","rootroot");
			out.print("<body background='hd.jpg'>");
			out.print("<table width=50% align=center style=\" border-radius: 25px; margin-top:140px;  background: #350202;  padding: 20px;\" >");
			out.print("<caption style=\"color:#f4ffef;font-family:Courier New; font-weight:bold; font-size:50px\">Checkout</caption>");
			PreparedStatement ps=conn.prepareStatement("select name from users where email=?");
			ps.setString(1,email);
			ResultSet rs=ps.executeQuery();
			rs.next();
			out.print("<form action=\"PlaceOrder5\" method=\"POST\">");
			out.print("<tr style=\"color:#f4ffef;text-align:left;font-size:23px;\"><td>Hello "+rs.getString(1)+" currently only Cash On Delivery(COD) is available</td></tr><tr><td style=\"color:#f4ffef;text-align:leftS;font-size:25px;\"> Please enter your delivery address</td><td style=\"font-size:30px;\"><input type=\"text\" name=\"address\"></td></tr></table>");
			out.print("<table align=center style=\"font-size:30px;border-radius: 25px; margin-top:30px; padding: 20px;\"> <tr><td><input type=\"submit\" value=\"PlaceOrder\"/</td></tr>");
			out.print("</table>");
		}
		catch(Exception se)
		{
			se.printStackTrace();
		}
}
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

}
