package com.login;

import java.io.IOException;
import javax.annotation.Resource;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.sql.DataSource;
/**
 * Servlet implementation class Login
 */
@WebServlet("/Login")
public class Login extends HttpServlet {

	private static final long serialVersionUID = 5714397158127256942L;
	@Resource(name="jdbc/web_student_tracker")
	DataSource dataSource;
	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		String email= req.getParameter("email");
		String password= req.getParameter("password");
		HttpSession session = req.getSession();
		session.setAttribute("email",email);
		if(Validate.CheckUser(email, password))
        { 	
            RequestDispatcher rs = req.getRequestDispatcher("PizzaOrder.jsp");
            rs.forward(req, res);
        }
		else
		{
	           RequestDispatcher rs = req.getRequestDispatcher("login.jsp");
	           rs.forward(req, res);
		}
		}
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}
}
