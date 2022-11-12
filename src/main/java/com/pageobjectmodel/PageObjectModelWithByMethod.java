package com.pageobjectmodel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class PageObjectModelWithByMethod {
	WebDriver driver;
	public PageObjectModelWithByMethod(WebDriver driver){
		this.driver = driver;
		PageFactory.initElements(driver,this);
	}
	
	
	private  By userName = By.xpath("//*[@name='username']");
	private  By passWord = By.xpath("//*[@name='password']");
	private  By logIn = By.xpath("//*[@type='submit']");
	
	
	public  WebElement getUserName() {
		return driver.findElement(userName);
	}
	public  WebElement getPassWord() {
		return driver.findElement(passWord);
	}
	public  WebElement getLogIn() {
		return driver.findElement(logIn);
	}

	
}
