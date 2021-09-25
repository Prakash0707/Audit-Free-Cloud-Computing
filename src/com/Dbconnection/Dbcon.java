package com.Dbconnection;

import java.sql.*;

public class Dbcon {

	    Connection con;
		
		public Connection con()
		{
		try
		{			
					
			Class.forName("com.mysql.jdbc.Driver");
			
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/Deniable","root","root");
			
			System.out.println("DataBase Connected");
			
		}catch(Exception e)
		{
			System.out.println(e);
			e.printStackTrace();
		}
		
		return con;
		
	}

}
