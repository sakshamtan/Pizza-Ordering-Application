package com.login;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class Cart
 */
@WebServlet("/Cart")
public class Cart extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		try 
		{
		Class.forName("com.mysql.jdbc.Driver");
		Connection conn=DriverManager.getConnection ("jdbc:mysql://localhost:3306/web_student_tracker","root","rootroot");
		PreparedStatement ps=conn.prepareStatement("select Name_pizza,size,Quantity,Price from orders");
		ResultSet rs=ps.executeQuery();
		out.print("<body background='hd.jpg'>");
		out.print("<table width=50% border=.3 align=center style=\" border-radius: 25px; margin-top:100px;  background: #350202;  padding: 20px;\" >");  
		out.print("<caption style=\"color:#f4ffef;font-family:Courier New; font-weight:bold; font-size:52px\">Order Details :</caption>");
		/* Printing column names */  
		ResultSetMetaData rsmd=rs.getMetaData();  
		int total=rsmd.getColumnCount();  
		out.print("<tr style=\"color:#f4ffef;font-family:Courier New;font-size:25px;\">");  
		for(int i=1;i<=total;i++)  
		{  
		out.print("<th>"+rsmd.getColumnName(i)+"</th>");  
		}  
		  
		out.print("</tr>");  
		              
		/* Printing result */  
		  
		while(rs.next())  
		{  
			out.print("<tr><td style=\"color:#f4ffef;font-family:Courier New;\">"+rs.getString(1)+"</td><td style=\"color:#f4ffef;font-family:Courier New;\">"+rs.getString(2)+"</td><td style=\"color:#f4ffef;font-family:Courier New;\">"+rs.getInt(3)+"</td><td  style=\"color:#f4ffef;font-family:Courier New;\">"+rs.getInt(4)+"</td></tr>");                   
			 
		}  
		out.print("</table>");
		ps=conn.prepareStatement("select SUM(Price) from orders");
		rs=ps.executeQuery();
		rs.next();
		out.print("<table width=50% align=center style=\" border-radius: 25px;margin-top:130px;  background: #350202;  padding: 20px;\" >");
		out.print("<form action=\"Checkout2\" method=\"POST\">");
		out.print("<tr style=\"color:#f4ffef;text-align:center;\"><td colspan=\"3\">Total :</td><th>"+rs.getFloat(1)+"</th>");
		out.print("<td><input type=\"submit\" value=\"Checkout\"</td></tr>"); 
		out.print("</form></table></body>");
		}
        catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
