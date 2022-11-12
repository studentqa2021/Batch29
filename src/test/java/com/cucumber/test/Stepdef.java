package com.cucumber.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.practicejava.TestData;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Stepdef extends TestData{
	WebDriver driver;
	@Given("Open a browser")
	public void open_a_browser() {
		WebDriverManager.chromedriver().setup();
		 driver = new ChromeDriver();
	}

	@Given("go to application URL")
	public void go_to_application_URL() {
		driver.get(URL);
	}

	@When("click signin button")
	public void click_signin_button() {
	
	
	}

	@When("put user name")
	public void put_user_name() throws InterruptedException {
		Thread.sleep(4000);
		driver.findElement(By.xpath("//*[@placeholder='Username']")).click();// click email
		driver.findElement(By.xpath("//*[@placeholder='Username']")).sendKeys(user);// write my email
	}

	@When("put password")
	public void put_password() {
		driver.findElement(By.xpath("//*[@name='password']")).click();
		driver.findElement(By.xpath("//*[@name='password']")).sendKeys(password);// XXXXXXXXXXXX
	}

	@When("click sign in button")
	public void click_sign_in_button() {
		driver.findElement(By.xpath("//*[@type='submit']")).click();

	}

	@Then("Validate login was success")
	public void check_sign_otu_button_there_or_not() {
	
	}


}
