package com.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.Beanclass.Beanclass;
import com.Implement.Impledb;
import com.Interface.Interfacee;

/**
 * Servlet implementation class Registerserv
 */
public class RegisterPage extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RegisterPage() {
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
		
		String Uname=request.getParameter("Uname");
		String Emailid=request.getParameter("Emailid");
		String Passwd=request.getParameter("Passwd");
		String Confirm=request.getParameter("Confirm");
	    String Address=request.getParameter("Address");
		String Mobno=request.getParameter("Mobno");
		
		Beanclass bean=new Beanclass();
		
		bean.setUname(Uname);
		bean.setEmailid(Emailid);
		bean.setPasswd(Passwd);
		bean.setConfirm(Confirm);
		
		bean.setAddress(Address);		
		bean.setMobno(Mobno);
		
		
		Interfacee im= new Impledb();
		int i =im.insert(bean);
		
		if(i==1)
		{
			response.sendRedirect("login.jsp");
		}
		
		
		
		
	}
	}


