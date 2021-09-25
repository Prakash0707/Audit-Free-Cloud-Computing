package com.servlet;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class Download
 */
@WebServlet("/Download")
public class Download extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Download() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out=response.getWriter();
		String filename=request.getParameter("file");
			System.out.println("file name\t"+filename);
			String realpath=getServletContext().getRealPath("/");

			
		
			String mergedFilePath =realpath.substring(0,realpath.indexOf("."))+"AuditFree\\WebContent\\uploadata\\Orginaldata\\";
		          mergedFilePath=mergedFilePath+filename;
		         // session.invalidate();
			File f=new File(mergedFilePath);
			FileInputStream fis5=new FileInputStream(f);
			  byte[] c=new byte[fis5.available()];	
			 fis5.read(c);
				String a=new String(c);
				out.println(a);
				// session.invalidate(); 
	}
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
//		PrintWriter out=response.getWriter();
//		String a=request.getParameter(" resultSet.getString(5)");
//		System.out.println(a);
		
		
		
		
//		
//		PrintWriter out=response.getWriter();
//		String filename1=request.getParameter("name"); 
//		
//		System.out.println(filename1+"&&&&&&&&");
//		HttpSession session=request.getSession();
//		String filename =(String) session.getAttribute("KK");
//		//session.invalidate();
//		System.out.println("file name\t"+filename);
//		String realpath=getServletContext().getRealPath("/");
//
//		
//	
//		String mergedFilePath =realpath.substring(0,realpath.indexOf("."))+"AuditFree\\WebContent\\uploadata\\fakedata\\";
//	          mergedFilePath=mergedFilePath+filename;
//	         // session.invalidate();
//		File f=new File(mergedFilePath);
//		FileInputStream fis5=new FileInputStream(f);
//		  byte[] c=new byte[fis5.available()];	
//		 fis5.read(c);
//			String a=new String(c);
//			out.println(a);
//		
//		
//		
//		
//		
//	}

}
}