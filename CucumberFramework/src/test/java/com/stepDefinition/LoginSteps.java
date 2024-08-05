package com.stepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class LoginSteps 
{
	WebDriver driver;
	@Given("user is on login page")
	public void user_is_on_login_page()
	{
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		//driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.get("https://practicetestautomation.com/practice-test-login/");
	}
	@When("user enters username and password")
	public void user_enters_username_and_password()
	{
//		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
//		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("admin123");
		
		driver.findElement(By.id("username")).sendKeys("student");
		driver.findElement(By.id("password")).sendKeys("Password123");
		
	}
	@And("click on login button")
	public void click_on_login_button()
	{
		driver.findElement(By.id("submit")).click();
	}
	@Then("user will land on home page")
	public void user_will_land_on_home_page()
	{
//		String actual=driver.getTitle();
//		String expected="OrangeHRM";
//		System.out.println(expected);
		
		System.out.println("Successfully login.....");
		//Assert.assertEquals(actual, expected);
		driver.close();	    
	}
}
