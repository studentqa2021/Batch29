package com.pageobjectmodel;

public class PageObjectModel {

	private  String userName = "//*[@name='username']";
	private  String passWord = "//*[@name='password']";
	private  String logIn = "//*[@type='submit']";
	
	
	public  String getUserName() {
		return userName;
	}
	public  String getPassWord() {
		return passWord;
	}
	public  String getLogIn() {
		return logIn;
	}

	
	
	
	
	
	
}
