package com.servlet;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.poi.hwpf.HWPFDocument;
import org.apache.poi.hwpf.extractor.WordExtractor;

import com.Beanclass.Beanauditor;
import com.Beanclass.uploadBean;
import com.Implement.Impledb;
import com.Interface.Interfacee;
import com.itextpdf.text.pdf.PdfReader;
import com.itextpdf.text.pdf.parser.PdfTextExtractor;
import com.lowagie.text.Chunk;
import com.lowagie.text.Document;
import com.lowagie.text.Element;
import com.lowagie.text.Font;
import com.lowagie.text.PageSize;
import com.lowagie.text.Paragraph;
import com.lowagie.text.pdf.PdfWriter;
import com.oreilly.servlet.multipart.FilePart;
import com.oreilly.servlet.multipart.MultipartParser;
import com.oreilly.servlet.multipart.ParamPart;
import com.oreilly.servlet.multipart.Part;




/**
 * Servlet implementation class FileUpload
 */
public class FileUpload extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public FileUpload() {
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
		
		Part part = null;
		FilePart filePart = null;
		ParamPart paramPart = null;
		String type = null;
		double fileSize=0.0;
		String filename =null;
		String tagValue =null;
		//String items=null;
		String filecontent="";
		
		response.setContentType("text/html");											
        PrintWriter out=response.getWriter();
        
		MultipartParser mpp=new MultipartParser(request, 999999999);
		
		uploadBean bean=new uploadBean();
		
		
		ArrayList<String> paramValues = new ArrayList<String>();
		
		String realpath=getServletContext().getRealPath("/");
		//System.out.println(realpath+"===I am Real Path");
		String path=realpath.substring(0,realpath.indexOf("."))+"AuditFree\\WebContent\\uploadata\\Orginaldata\\";
		String path2=realpath.substring(0,realpath.indexOf("."))+"AuditFree\\WebContent\\uploadata\\fakedata\\";
		String path1=realpath.substring(0,realpath.indexOf("."))+"AuditFree\\WebContent\\uploadata\\encryptdata\\";
	//////	String path2=realpath.substring(0,realpath.indexOf("."))+"AuditFree\\WebContent\\uploadata\\fakedata\\";
		String secretpath="D:\\secretfiles\\";
		while((part=mpp.readNextPart())!=null)
		{
			if(part.isFile())
			{
				filePart = (FilePart) part;
				
				path=path+filePart.getFileName();
				
				filename=filePart.getFileName();
				
				System.out.println("Filename*****"+filename);
				
				File uploadedFile = new File(path);
				
				type = filePart.getContentType();
				
				fileSize = filePart.writeTo(uploadedFile);
				//System.out.println(fileSize);
				
				FileInputStream fis=new FileInputStream(uploadedFile);// FileInputStrean get bytes from file
				//System.out.println(fis);
				//bean.setUploadContent(fis);
				
				File encrypt=new File(path);
				FileInputStream fis1=new FileInputStream(encrypt);
				
				
				
				if(filename.endsWith(".txt")){
					byte[] b=new byte[fis1.available()];
					fis1.read(b);
					String reading=new String(b);
					filecontent=filecontent+reading;
				    
					String encrpt;
					try {
						encrpt = encryptdata.encrypt(filecontent);
					
					FileOutputStream fileOutputStream=new FileOutputStream(new File(path1+filename));
					//FileOutputStream fileOutputStream7=new FileOutputStream(new File(secretpath+filename));
					fileOutputStream.write(encrpt.getBytes());
					FileOutputStream fileOutputStream7=new FileOutputStream(new File(secretpath+filename));
					System.out.println("hhhhhhhhh"+fileOutputStream7);
					fileOutputStream7.write(encrpt.getBytes());
					System.out.println(encrpt);
					FileWriter fstream = null;
					BufferedWriter out5 = null;
					FileInputStream fis2=new FileInputStream(uploadedFile);
					
					
					
					String mergedFilePath =realpath.substring(0,realpath.indexOf("."))+"AuditFree\\WebContent\\uploadata\\fakedata\\"+filename;
				     File f=new File(mergedFilePath);
				     byte[] c=new byte[fis2.available()];
				   //  char[] a={'k','l'};
				     fis2.read(c);
						String reading2=new String(c);
						String d=reading2.replace('s','u');
						String d1=d.replace('a','e');
						String d2=d1.replace('k','a');
						FileOutputStream fileOutputStream3=new FileOutputStream(f);
						System.out.println("hhhhhhhhh"+fileOutputStream3);
						fileOutputStream3.write(d2.getBytes());
					
					
						
						
						
					//	filecontent=filecontent+reading;
					    
				
					} catch (Exception e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
		
				}
				else if (filename.endsWith(".doc")) 
				{  
					WordExtractor extractor = null;
					
					FileInputStream fis2=new FileInputStream(path);
					System.out.println("file is"+fis);
					HWPFDocument document=new HWPFDocument(fis2);
					extractor = new WordExtractor(document);
					String [] fileData = extractor.getParagraphText();
					String mydate=extractor.getTextFromPieces();
					System.out.println("DATASSSSSSSSSSSSSSSSSss "+fileData);
					System.out.println("THE MYYYYYYYYYYY "+mydate);
					String text1=null;
					System.out.println("filedata len  "+fileData.length);
					String encrpt;
					try {
						encrpt = encryptdata.encrypt(mydate);
					
					System.out.println("encrypted data is"+encrpt);
					FileOutputStream fileOutputStream=new FileOutputStream(new File(path1+filename));
					fileOutputStream.write(encrpt.getBytes());
					//File f7=new File("D:\\secretfiles");
					//FileOutputStream fileOutputStream7=new FileOutputStream(new File(f7+filename));
					//fileOutputStream7.write(encrpt.getBytes());
					} catch (Exception e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				
				else if(filename.endsWith(".pdf"))
				{ 
					//System.out.println("padf file name"+file1.getName());
				
					String text="";
					com.itextpdf.text.pdf.PdfReader pdfReader=new PdfReader(path);
				
					int pages=pdfReader.getNumberOfPages();
					for(int i1=1;i1<pages;i1++)
					{
						 text=PdfTextExtractor.getTextFromPage(pdfReader, i1);
						System.out.println("page:"+i1+" "+text);
					}
				String encrpt;
				try {
					encrpt = encryptdata.encrypt(text);
				Document document=new Document(PageSize.A4);
				/*  File file=new File("C:\\Users\\spiro13\\Desktop\\naga\\"+pdffilename);
				  System.out.println(file.delete());*/
				PdfWriter.getInstance(document, new FileOutputStream(new File(path1+filename)));
				//FileOutputStream fileOutputStream=new FileOutputStream("C:\\Users\\spiro13\\Desktop\\naga\\pdffilename1.pdf");
				Chunk chunk=new Chunk(encrpt);
				document.open();
				Font font=new Font(Font.TIMES_ROMAN);
				font.setStyle(font.BOLD);
				Paragraph p1=new Paragraph(chunk);
				p1.setAlignment(Element.ALIGN_LEFT);
				document.add(p1);
				document.close();
				System.out.println("pdf writing is completed");
				//fileOutputStream.write(encrpt.getBytes());
				System.out.println(encrpt);
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				  
				}
				

			}else if(part.isParam())
			{
				paramPart = (ParamPart) part;
				String tagName = paramPart.getName();
				System.out.println("tagName = " + tagName);
				 tagValue = paramPart.getStringValue();
				System.out.println("tagValue = " + tagValue);
				paramValues.add(tagValue);
			}
			
		}
		      bean.setPublickey("500");
		      bean.setFilename(filename);
		      bean.setFiletype(type);
		      bean.setFilesize(fileSize+"");
		      bean.setPath(path);
		      bean.setParamValues(paramValues);
		Interfacee mi=new Impledb();
	    int status=	mi.fileUpload(bean);
	if(status==1)
	{
		
		//String sourcefile =path;
	//	System.out.println("Source&&&&&"+sourcefile);
		//String constant=realpath.substring(0,realpath.indexOf("."))+"AuditFree\\WebContent\\uploadata\\constant";
	     //System.out.println("Cons****"+constant);
			String mergedFilePath =realpath.substring(0,realpath.indexOf("."))+"AuditFree\\WebContent\\uploadata\\fakedata\\"+filename;
		//  System.out.println("Fake@@@@@@@@"+mergedFilePath );
			//File files[]=new File[2];
	   //files[1]=new File(sourcefile);
	   //files[0]=new File(constant);
   File fakedata = new File(mergedFilePath );
//		   String g=files[1].getName();
//		   System.out.println("name........."+g);
// encryptdata.mergeFiles(files,fakedata);
// 
//FileInputStream fis5=new FileInputStream(mergedFilePath);
// System.out.println(fis5);	                 fis5.read();
//     	byte[] C=new byte[fis5.available()];
//         	fis5.read(C);
//         	
// 
//         String read=new String(C);
//        
////            System.out.println("read................."+read);
////            
                  File f=new File(mergedFilePath);	
         String filename2=         f.getName();
        long l= f. getTotalSpace();
        System.out.println("nnnnnnnnn"+l);
                  System.out.println("name........."+filename2);
                   long filesize2=f.length();
                  System.out.println(filesize2);
                
                 
          String filetype2=        filename2.substring(filename2.lastIndexOf("."));
          System.out.println(filetype2);
          Beanauditor auditor=new Beanauditor();
          auditor.setFilename2(filename2);
          auditor.setFilesize2(filesize2+"");
          auditor.setFiletype2(filetype2);
          Impledb db=new Impledb();
          int i=db.fileauditor(auditor);
          System.out.println("i value   "+i);
		

		response.sendRedirect("uploaded.jsp");
	}
	else
	{
		response.sendRedirect("HomepageError.jsp");
	}
		
		
		
		
	}

	
}
