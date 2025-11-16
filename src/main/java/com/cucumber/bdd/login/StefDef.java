package com.cucumber.bdd.login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StefDef {
	WebDriver driver;
	
	// import = ctrl+shif+o
	@Given("Open browser")
	public void open_browser() {
	   driver = new ChromeDriver();
	   driver.manage().window().maximize();
	}

	@And ("Go to application")
	public void go_to_application() {
	   driver.get("file:///C:/Users/Owner/AppData/Local/Packages/5319275A.WhatsAppDesktop_cv1g1gvanyjgm/LocalState/sessions/8764AE01145E05702A12B68202D58186A8CE83B4/transfers/2025-43/qa_online%20Banking%20monthly_yearly%20statement%20-bug%20practice%20(2).html");
	    
	}

	@When("Enter valid username")
	public void enter_valid_username() {
	   driver.findElement(By.xpath("//*[@id='username']")).sendKeys("Batch44");
	    
	}

	@And("Enter valid password")
	public void enter_valid_password() {
		driver.findElement(By.xpath("//*[@id='password']")).sendKeys("student123@");
	    
	}

	@And("Click login button")
	public void click_login_button() {
		driver.findElement(By.xpath("//*[@value='Login']")).click();
	    
	}
	@Then("Login status should pass and logout option should be visible")
	public void login_status_should_pass_and_logout_option_should_be_visible() {
	
		//*[@id="logoutButton"]
	Boolean status =	driver.findElement(By.xpath("//*[@id='logoutButton']")).isDisplayed();
	System.out.println("Logout button there or not = " + status);
	
	 driver.quit();
	}

	@And("Enter invalid password")
	public void enter_invalid_password() {
	   
		driver.findElement(By.xpath("//*[@id='password']")).sendKeys("student123");
	}

	@Then("Login status should fail")
	public void login_status_should_fail() {
	   
		try {
			Boolean status = driver.findElement(By.xpath("//*[@id='logoutButton']")).isDisplayed();
			System.out.println("Logout button not there = " + status);
		} catch (Exception e) {
			
		}
		 
		driver.quit();
	}

	@When("Enter invalid username")
	public void enter_invalid_username() {
	   
		driver.findElement(By.xpath("//*[@id='username']")).sendKeys("abcdef");
	}

	@When("Enter null username")
	public void enter_null_username() {
		driver.findElement(By.xpath("//*[@id='username']")).sendKeys("");
	    
	}

	@And("Enter null password")
	public void enter_null_password() {
		driver.findElement(By.xpath("//*[@id='password']")).sendKeys("");
	}

	@And("Enter empty password")
	public void enter_empty_password() {
		driver.findElement(By.xpath("//*[@id='password']")).sendKeys("");
	   
	}

}
	
	
	
	
	
	
	

