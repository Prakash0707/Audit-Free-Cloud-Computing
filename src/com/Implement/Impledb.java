package com.Implement;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.sql.*;
import java.util.ArrayList;
import java.util.Random;

import javax.sql.rowset.serial.SerialBlob;

import com.Beanclass.Beanauditor;
import com.Beanclass.Beanclass;
import com.Beanclass.uploadBean;
import com.Dbconnection.Dbcon;
import com.Interface.Interfacee;
import com.mysql.jdbc.ResultSetMetaData;


public class Impledb implements Interfacee {
    int i=0; 
	Connection con=null;
	PreparedStatement ps = null;
	boolean status=false;
	public int insert(Beanclass bean)
	{      try
	       {
		   
			 Dbcon dbcon=new Dbcon();
			 con=dbcon.con();
			 
			 ps=con.prepareStatement("INSERT INTO deniable.registration VALUES(?,?,?,?,?,?)");
			 ps.setString(1,bean.getUname());
			 ps.setString(2,bean.getEmailid());
			 ps.setString(3,bean.getPasswd());
			 ps.setString(4,bean.getConfirm());
			 ps.setString(5,bean.getAddress());
			 ps.setString(6,bean.getMobno());
			 
			 i=ps.executeUpdate();
			 
			 
			 
	       }catch(Exception e)
	       {
	    	   System.out.println(e);
	    	   e.printStackTrace();
	       }
	        return i;
    }
	
	
	
	public boolean getLogin(Beanclass bean)
	{
		try
		{
		    Dbcon db=new Dbcon();
		    con=db.con();
		    
		    ps=con.prepareStatement("SELECT * FROM `deniable`.`registration` where Username=? && Password=?");
			
		    ps.setString(1,bean.getUname());
		    ps.setString(2,bean.getPasswd());
		    
		    ResultSet rs=ps.executeQuery();
		    status=rs.next();
			System.out.println(status);
			
		}catch(Exception e)
		{
			System.out.println(e);
			e.printStackTrace();
		}
		
		  return status;
							
	}



	public int fileUpload(uploadBean up) {
		// TODO Auto-generated method stub
		String s="1234567890ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		Random r=new Random();
		
		  char s1=s.charAt(r.nextInt(s.length()));
		  char s2=s.charAt(r.nextInt(s.length()));
		  char s3=s.charAt(r.nextInt(s.length()));
		  char s4=s.charAt(r.nextInt(s.length()));
		  char s5=s.charAt(r.nextInt(s.length()));
		String random=""+s1+s2+s3+s4+s5;
		
		System.out.println(random);
		int x=0;
		Dbcon dbcon= new Dbcon();
		con=dbcon.con();
		
		try {
			PreparedStatement ps=con.prepareStatement("INSERT INTO deniable.upload VALUES(?,?,?,?,?,?,?)");
		
			for (int i = 0; i < up.getParamValues().size(); i++)                
			    {
				ps.setString(i + 1, up.getParamValues().get(i).toString());
			    }
			ps.setString(2,up.getPublickey());
			ps.setString(3,up.getFiletype());
			ps.setString(4,up.getFilesize());
			ps.setString(5,up.getFilename());
			ps.setString(6,up.getPath());
			ps.setString(7,random.toString());
			
//			InputStream i = new FileInputStream(new File(up.getPath()));
//			ps.setBinaryStream(8, i, up.getUploadContent().available());
			 x=ps.executeUpdate();
			System.out.println(x);
		
			} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		return x;
	}



	public ArrayList UserDetails(uploadBean ub) {
		// TODO Auto-generated method stub
		ArrayList<String> AL = new ArrayList<String>();
		try
		{
			
		Dbcon db=new Dbcon();
	    con=db.con();
	    ps=con.prepareStatement("SELECT * FROM privacycloud.uploadtable");
		
				
		ResultSet rs = ps.executeQuery();
		
		ResultSetMetaData data= (ResultSetMetaData) rs.getMetaData();
		
		while(rs.next())
		{
			for(int i=1; i<data.getColumnCount();i++)
				AL.add(rs.getString(i));
		}
			
		}catch(Exception e)
		{
			System.out.println(e);
			e.printStackTrace();
		}
		return AL;
		
	
	}
	 	public int fileauditor(Beanauditor auditor){
	 		int i=0;
	 		 Dbcon dbcon=new Dbcon();
			 con=dbcon.con();
	 		
			 try {
				ps=con.prepareStatement("INSERT INTO auditor VALUES(?,?,?)");
			          ps.setString(1,auditor.getFilename2());
			          ps.setString(3,auditor.getFiletype2());
			          ps.setString(2,auditor.getFilesize2());
			    i= ps.executeUpdate();
			     System.out.println(i);
			 } catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	 		
	 		
	 		
			return i;
	 	}



		@Override
		public ArrayList<String> getdownload() {
			// TODO Auto-generated method stub
			// TODO Auto-generated method stub
						ArrayList<String> al=new ArrayList();
						
						              Dbcon dbcon=new Dbcon();
						              con=dbcon.con();
						         try {
									ps=con.prepareStatement("SELECT USERNAME,FILETYPE,FILESIZE,FILENAME FROM `upload`");
									
							ResultSet rs=	ps.executeQuery();
							
							
							while(rs.next())
							{
								String user=rs.getString(1);
								String filetype=rs.getString(2);
								String filesize=rs.getString(3);
								String filename=rs.getString(4);
								
								al.add(user);
								al.add(filetype);
								al.add(filesize);
								al.add(filename);
							}
								} catch (SQLException e) {
									// TODO Auto-generated catch block
									e.printStackTrace();
								}     
						              
						
						return al;
			
		}
	}

