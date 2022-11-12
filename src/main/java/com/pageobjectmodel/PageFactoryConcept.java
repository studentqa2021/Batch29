package com.pageobjectmodel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

public class PageFactoryConcept {
	WebDriver driver;
	public PageFactoryConcept(WebDriver driver){
		this.driver = driver;
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(xpath ="//*[@name='username']")
	private  WebElement userName;
	@FindBy(xpath ="//*[@name='password']")
	private  WebElement passWord;
	@FindBy(xpath ="//*[@type='submit']")
	private  WebElement logIn;
	
	
	public  WebElement getUserName() {
		return userName;
	}
	public  WebElement getPassWord() {
		return passWord;
	}
	public  WebElement  getLogIn() {
		return logIn;
	}
}
