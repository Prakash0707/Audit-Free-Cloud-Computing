package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class TpaLogin
 */
public class TpaLogin extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public TpaLogin() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		 
						
		String Username=request.getParameter("Uname");
		String Password=request.getParameter("Passwd");
		
		   
        HttpSession session=request.getSession();  
        session.setAttribute("uname",Username); 
		
		out.print(Username);
		out.print(Password);
		
	if(Username.equals("Admin") && Password.equals("Admin"))
	{
			response.sendRedirect("TpaHomepage.jsp");
			
	}
	else 
	{
		    response.sendRedirect("TpaLogin1.jsp");
	}
		
		
		
		
		
		
		
	}

}
