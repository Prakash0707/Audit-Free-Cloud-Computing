package com.Interface;

import java.util.ArrayList;

import com.Beanclass.Beanauditor;
import com.Beanclass.Beanclass;
import com.Beanclass.uploadBean;


public interface Interfacee {

	public int insert(Beanclass bean);
	
	public boolean getLogin(Beanclass bean);
	
	public int fileUpload(uploadBean up);
	
	public ArrayList<String> UserDetails(uploadBean ub);
	 
	public int fileauditor(Beanauditor auditor);
	public ArrayList<String> getdownload();
	
}
