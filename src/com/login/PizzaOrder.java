package com.login;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.annotation.Resource;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.sql.DataSource;

/**
 * Servlet implementation class PizzaOrder
 */
@WebServlet("/PizzaOrder")
public class PizzaOrder extends HttpServlet {
	boolean st=false;
	private static final long serialVersionUID = 1L;
	@Resource(name="jdbc/web_student_tracker")
	DataSource dataSource;
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PreparedStatement ps;
		Connection conn=null;
		int price;
		PrintWriter out = response.getWriter();
		String OrderID="1";
		try
		{Class.forName("com.mysql.jdbc.Driver");
        conn=DriverManager.getConnection ("jdbc:mysql://localhost:3306/web_student_tracker","root","rootroot");
		int selection=0;
		if(request.getParameter("pizza1")!=null)
		{	
				String name1="Paneer Supreme";
				String size1=request.getParameter("size1");
				int quantity1;
				quantity1=Integer.parseInt(request.getParameter("quantity1"));
				if(size1.equals("small"))
				{
					price=210*quantity1;
				}
				else if(size1.equals("medium")) 
				{
					price=350*quantity1;
				}
				else
				{
					price=550*quantity1;
				}
					ps=conn.prepareStatement ("insert into orders(OrderID,Name_pizza,size,Quantity,Price) values(?,?,?,?,?)");
				 	ps.setString(1, OrderID);
			        ps.setString(2, name1);
			        ps.setString(3, size1);
			        ps.setInt(4, quantity1);
			        ps.setInt(5,price);
			        ps.executeUpdate();
				selection++;
		}
		if(request.getParameter("pizza2")!=null)
		{	
				String name2="Chef's Special";
				String size2=request.getParameter("size2");
				int quantity2;
				quantity2=Integer.parseInt(request.getParameter("quantity2"));
				if(size2.equals("small"))
				{
					price=210*quantity2;
				}
				else if(size2.equals("medium")) 
				{
					price=350*quantity2;
				}
				else
				{
					price=550*quantity2;
				}
				ps=conn.prepareStatement ("insert into orders(OrderId,Name_pizza,size,Quantity,Price) values(?,?,?,?,?)");
				 ps.setString(1, OrderID);
			        ps.setString(2, name2);
			        ps.setString(3, size2);
			        ps.setInt(4, quantity2);
			        ps.setInt(5, price);
			        ps.executeUpdate();
				selection++;
		}
		if(request.getParameter("pizza3")!=null)
		{	
				String name3="Chicken Delight";
				String size3=request.getParameter("size3");
				int quantity3;
				quantity3=Integer.parseInt(request.getParameter("quantity3"));
				if(size3.equals("small"))
				{
					price=210*quantity3;
				}
				else if(size3.equals("medium")) 
				{
					price=350*quantity3;
				}
				else
				{
					price=550*quantity3;
				}
				ps=conn.prepareStatement ("insert into orders(OrderId,Name_pizza,size,Quantity,Price) values(?,?,?,?,?)");
				ps.setString(1, OrderID);
				ps.setString(2, name3);
		        ps.setString(3, size3);
		        ps.setInt(4, quantity3);
		        ps.setInt(5, price);
		        ps.executeUpdate();
				selection++;
		}
		if(request.getParameter("pizza4")!=null)
		{	
				String name4="Non Veg Supreme";
				String size4=request.getParameter("size4");
				int quantity4;
				quantity4=Integer.parseInt(request.getParameter("quantity4"));
				if(size4.equals("small"))
				{
					price=210*quantity4;
				}
				else if(size4.equals("medium")) 
				{
					price=350*quantity4;
				}
				else
				{
					price=550*quantity4;
				}
				ps=conn.prepareStatement ("insert into orders(OrderId,Name_pizza,size,Quantity,Price) values(?,?,?,?,?)");
				ps.setString(1, OrderID);
				ps.setString(2, name4);
		        ps.setString(3, size4);
		        ps.setInt(4, quantity4);
		        ps.setInt(5, price);
		        ps.executeUpdate();
				selection++;
		}
		if(selection==0)
		{
			out.println("No item selected");
			 RequestDispatcher rd = request.getRequestDispatcher("PizzaOrder.jsp");
	         rd.forward(request, response);
		}
		 RequestDispatcher rd = request.getRequestDispatcher("Cart.jsp");
         rd.forward(request, response);
		}catch(Exception se){
			se.printStackTrace();
		}
		}
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	}
