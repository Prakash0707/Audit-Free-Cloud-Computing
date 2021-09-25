package com.servlet;

import java.util.Random;

public class ma {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="1234567890ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		Random r=new Random();
		
		   char  s1= s.charAt(r.nextInt(s.length()));
		  char s2=s.charAt(r.nextInt(s.length()));
		  char s3=s.charAt(r.nextInt(s.length()));
		  char s4=s.charAt(r.nextInt(s.length()));
		  char s5=s.charAt(r.nextInt(s.length()));
		String ran=""+s1+s2+s3+s4+s5;
		System.out.print(ran);

}
}