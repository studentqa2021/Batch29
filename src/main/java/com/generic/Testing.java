package com.generic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.pageobjectmodel.PageObjectModelWithByMethod;
import com.util.Constant;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Testing extends Constant{// open
	
	public void login() {//static =no
		//open browser
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		//put URL
		
		driver.get(URL);//basic= static ==> OOPs
		//put user name
		// java wait==> Selenium wait(better)
	
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			PageObjectModelWithByMethod po=new PageObjectModelWithByMethod(driver);
		//3 seconds==> checked = compilation issue before code run
		po.getUserName().click();//encapsulation
		po.getUserName().sendKeys(USER);
		//put password
		po.getPassWord().click();
		po.getPassWord().sendKeys(PASSWORD);
		
		//click sign in btn
		po.getLogIn().click();
		//close browser
		//driver.quit();
		
	}

}
