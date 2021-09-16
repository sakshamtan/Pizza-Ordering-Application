package com.login;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Validate {
	public static boolean CheckUser(String email, String password) {
		 boolean status =false;
		 Connection conn=null;
	     try
	     {
	    	 //registering the jdbc driver here  
	    	 Class.forName("com.mysql.jdbc.Driver");
	    	 conn=DriverManager.getConnection ("jdbc:mysql://localhost:3306/web_student_tracker","root","rootroot");
	    	 //creating connection with the database 
	    	 PreparedStatement pst =conn.prepareStatement("select * from users where email=? and password=?");     
	    	 pst.setString(1, email);
	    	 pst.setString(2, password);
	    	 ResultSet rs =pst.executeQuery();
	    	 status = rs.next();	       
	     }
	     catch(Exception e)
	     {
	    	 e.printStackTrace();
	     }
	        return status;  
	}   
}
