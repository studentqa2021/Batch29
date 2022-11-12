package com.generic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.util.Constant;

import io.github.bonigarcia.wdm.WebDriverManager;

public class OrangeHRMLogin extends Constant{// open
	
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
		//3 seconds==> checked = compilation issue before code run
		driver.findElement(By.xpath("//*[@name='username']")).click();//encapsulation
		driver.findElement(By.xpath("//*[@name='username']")).sendKeys(USER);
		//put password
		driver.findElement(By.xpath("//*[@name='password']")).click();
		driver.findElement(By.xpath("//*[@name='password']")).sendKeys(PASSWORD);
		
		//click sign in btn
		driver.findElement(By.xpath("//*[@type='submit']")).click();
		//close browser
		driver.quit();
		
	}

}
