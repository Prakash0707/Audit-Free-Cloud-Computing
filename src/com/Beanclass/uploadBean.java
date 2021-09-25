package com.Beanclass;

import java.io.FileInputStream;
import java.util.ArrayList;

public class uploadBean {

	/**
	 * @param args
	 */
	private String username;
	private String filename;
	private ArrayList<String> paramValues;
	
	public ArrayList<String> getParamValues() {
		return paramValues;
	}
	public void setParamValues(ArrayList<String> paramValues2) {
		this.paramValues = paramValues2;
	}
	public String getFilename() {
		return filename;
	}
	public void setFilename(String filename) {
		this.filename = filename;
	}
	public String getFilesize() {
		return filesize;
	}
	public void setFilesize(String filesize) {
		this.filesize = filesize;
	}
	public String getFiletype() {
		return filetype;
	}
	public void setFiletype(String filetype) {
		this.filetype = filetype;
	}
	public String getPath() {
		return path;
	}
	public void setPath(String path) {
		this.path = path;
	}
	private String filesize;
	private String filetype;
	private String path;
	
	
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public FileInputStream getUploadContent() {
		return uploadContent;
	}
	public void setUploadContent(FileInputStream fis) {
		this.uploadContent = fis;
	}
	private String password;
	private FileInputStream uploadContent;
	
	private String Publickey;

	public String getPublickey() {
		return Publickey;
	}
	public void setPublickey(String publickey) {
		Publickey = publickey;
	}

}
