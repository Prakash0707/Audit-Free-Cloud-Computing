package com.servlet;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.jasper.tagplugins.jstl.core.Out;

import com.oreilly.servlet.multipart.FilePart;
import com.oreilly.servlet.multipart.MultipartParser;
import com.oreilly.servlet.multipart.ParamPart;
import com.oreilly.servlet.multipart.Part;

import sun.net.NetworkServer;

/**
 * Servlet implementation class Decrypt
 */
@WebServlet("/Decrypt")
public class Decrypt extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Decrypt() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String reading2=null;
		MultipartParser mpp=new MultipartParser(request, 999999999);
		Part part = null;
		FilePart filePart = null;
		String filename =null;
		String realpath=getServletContext().getRealPath("/");
		String tagValue =null;
		ParamPart paramPart = null;
		PrintWriter out=response.getWriter();
		 String s=tagValue;
		//String mergedFilePath =realpath.substring(0,realpath.indexOf("."))+"AuditFree\\WebContent\\uploadata\\fakedata\\"+filename;
		while((part=mpp.readNextPart())!=null)
		{
			//paramPart = (ParamPart) part;
			//tagValue = paramPart.getStringValue();
			//if(tagValue=="one"){
			if(part.isFile())
			{
				filePart = (FilePart) part;
				
				
				
				filename=filePart.getFileName();
			System.out.println("kkkkkkkkkkkkkkkkkkkkkkkk");
				String mergedFilePath =realpath.substring(0,realpath.indexOf("."))+"AuditFree\\WebContent\\uploadata\\fakedata\\";
			          mergedFilePath=mergedFilePath+filename;
			          System.out.println(mergedFilePath);
				File f=new File(mergedFilePath);
				FileInputStream fis5=new FileInputStream(f);
				  byte[] c=new byte[fis5.available()];	
				  fis5.read(c);
					 reading2=new String(c);
//					String decrypt="C:\\Users\\spiro-41\\Desktop\\decrypted files\\"+filename;	
//					File f2=new File(decrypt);
//					FileOutputStream fileOutputStream3=new FileOutputStream(f2);
//					fileOutputStream3.write(reading2.getBytes());
				//System.out.println(reading2);
			
			
		}else if(part.isParam())
		{
			paramPart = (ParamPart) part;
			String tagName = paramPart.getName();
			System.out.println("tagName = " + tagName);
			 tagValue = paramPart.getStringValue();
			 s=tagValue;
			
				 
			System.out.println("tagValue = " + tagValue);
			//paramValues.add(tagValue);
		}
		}
				if(tagValue.equals("one")){
				System.out.println("lllll"+tagValue);
				System.out.println(filename);
				//if(tagValue=="one"){
				String decrypt="D:\\decrypted files\\"+filename;	
				File f2=new File(decrypt);
				FileOutputStream fileOutputStream3=new FileOutputStream(f2);
				fileOutputStream3.write(reading2.getBytes());
				//response.sendRedirect("decrypted.jsp");
				response.sendRedirect("decrypted2.jsp");
				}
				
				
				else if(tagValue.equals(s)){
					
					String originalfile=realpath.substring(0,realpath.indexOf("."))+"AuditFree\\WebContent\\uploadata\\Orginaldata\\";
				originalfile=originalfile+filename;
				File f=new File(originalfile);
				FileInputStream fis5=new FileInputStream(f);
				 byte[] c=new byte[fis5.available()];	
				  fis5.read(c);
				 reading2=new String(c);				
					
					System.out.println("lllll"+tagValue);
					System.out.println(filename);
					//if(tagValue=="one"){
					String decrypt="D:\\decrypted files\\"+filename;	
					File f2=new File(decrypt);
					FileOutputStream fileOutputStream3=new FileOutputStream(f2);
					fileOutputStream3.write(reading2.getBytes());
					//response.sendRedirect("decrypted.jsp");
					
					response.sendRedirect("decrypted.jsp");
					
					
					
				
			}
				
		
		}}
		
		
	
	

