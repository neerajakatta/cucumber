package com.stepdefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

public class LoginClass {
	
	   WebDriver driver;

	  
	
	@Given("user is already on login page")
	
	public void login()
	{

		WebDriver driver = new FirefoxDriver();
		driver.get("https:testingmasters.com/hrm");
		driver.manage().window().maximize();
		
	}
	
	
	@When("title of login page is Free crm")
	public void verifyTitle(){
		
		WebElement ele = driver.findElement(By.xpath("//div[@id='divL"));
		String str = ele.getText();
		System.out.println(str);
		
	}
	
	public void user_login(){
		
		
	}
	
	
}
