

<%@page import="java.util.Iterator"%>
<%@page import="java.util.ArrayList"%>
<%@page import="com.Implement.Impledb"%>
<%@page import="com.Interface.Interfacee"%>
<%@page import="java.io.FileReader"%>
<%@page import="java.io.BufferedReader"%>
<%@page import="java.io.File"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body bgcolor="pink">
 <center>

  <TABLE BORDER="1" style="background-color: PINK">
<tr>
<th>USERNAME</th>
<th>FILESIZE</th>
<th>FILETYPE</th>
<th>FILENAME</th>
<th>FILEDOWNLOAD</th>


</tr>
<%Interfacee mi=new Impledb();
ArrayList al=mi.getdownload();

Iterator it=al.iterator();
while(it.hasNext())
{
	String user=it.next().toString();
	
	String size=it.next().toString();
	
	String type=it.next().toString();
	
	String file=it.next().toString();
	
	
	%>
	
	<tr>
	<td><%=user %></td>
	<td><%=size %></td>
	<td><%=type %></td>
	<td><%=file %></td>
	<td><a href="Download?file=<%=file %>" download>   Download</a></td>
	
	
	
	</tr>
         
	
<%} %>


          

</TABLE>
</center>
</body>
</html>