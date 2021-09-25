package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.Beanclass.Beanclass;
import com.Implement.Impledb;
import com.Interface.Interfacee;

/**
 * Servlet implementation class Login
 */
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Login() {
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
		PrintWriter out=response.getWriter();
		
		String Uname=request.getParameter("username");
		
		  
        out.print("Welcome "+Uname);  
          
        HttpSession session=request.getSession();  
        session.setAttribute("uname",Uname);  
		
		String Passwd=request.getParameter("password");
		
		Beanclass bean = new Beanclass();
		
		bean.setUname(Uname);
		bean.setPasswd(Passwd);
		
		Interfacee im=new Impledb();
		
		Boolean status=im.getLogin(bean);
		
		if(status == true)
		{
			request.getRequestDispatcher("homepage.jsp").forward(request, response);
			//response.sendRedirect("homepage.jsp");
		}
		else
		{
			response.sendRedirect("loginpage1.jsp");
		}
		
		
	}

}
