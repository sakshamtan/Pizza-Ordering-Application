package com.login;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Logout")
public class Logout extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try 
		{
		 Class.forName("com.mysql.jdbc.Driver");
			Connection conn=DriverManager.getConnection ("jdbc:mysql://localhost:3306/web_student_tracker","root","rootroot");
			PreparedStatement ps=conn.prepareStatement("truncate orders");
			ps.executeUpdate();
			 request.getSession().invalidate();
		     response.sendRedirect(request.getContextPath() + "/login.jsp");
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
