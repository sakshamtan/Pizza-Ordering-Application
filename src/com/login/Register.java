package com.login;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.annotation.Resource;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.sql.DataSource;

@WebServlet("/Register")
public class Register extends HttpServlet {
	private static final long serialVersionUID = 1L;
	@Resource(name="jdbc/web_student_tracker")
	DataSource dataSource;  
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 response.setContentType("text/html;charset=UTF-8");
	        PrintWriter out = response.getWriter();
		
	        String name = request.getParameter("name");
	        String number = request.getParameter("number");
	        String email = request.getParameter("email");
	        String password = request.getParameter("password");
	        try{
	        
	        //loading drivers for mysql
	        Class.forName("com.mysql.jdbc.Driver");

		//creating connection with the database 
	          Connection  con=DriverManager.getConnection("jdbc:mysql://localhost:3306/web_student_tracker","root","rootroot");

	        PreparedStatement ps=con.prepareStatement ("insert into users(name,mobile,email,password) values(?,?,?,?)");

	        ps.setString(1, name);
	        ps.setString(2, number);
	        ps.setString(3, email);
	        ps.setString(4, password);
	        int i=ps.executeUpdate();
	        
	          if(i>0)
	          {
	            RequestDispatcher rs = request.getRequestDispatcher("login.jsp");
		           rs.forward(request, response);
	          }
	        }
	        catch(Exception se)
	        {
	            se.printStackTrace();
	        }
	}
}
