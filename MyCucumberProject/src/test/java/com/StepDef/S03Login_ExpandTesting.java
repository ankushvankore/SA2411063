package com.StepDef;

import java.time.Duration;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;

public class S03Login_ExpandTesting {
	WebDriver driver;
	JavascriptExecutor js;
	
	@Given("Open ExpandTesting in browser")
	public void open_expand_testing_in_browser() {
		driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	    driver.get("https://practice.expandtesting.com/login");
	    
	    js = (JavascriptExecutor) driver;
	}
	
	@When("Enter valid username as {string}")
	public void enter_valid_username_as(String un) {
		js.executeScript("window.scrollBy(0,500)", "");
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys(un);
	}

	@When("Enter valid password as {string}")
	public void enter_valid_password_as(String ps) {
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys(ps);
	}
	
	@When("Click on Login button")
	public void click_on_login_button() {
		driver.findElement(By.xpath("//button[@type='submit']")).click();
	}

	@Then("Home page should display")
	public void home_page_should_display() {
	    Assert.assertTrue(driver.getCurrentUrl().contains("secure"));
	}

	//Invalid data
	
	@When("Enter invalid username as {string}")
	public void enter_invalid_username_as(String un) {
		js.executeScript("window.scrollBy(0,500)", "");
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys(un);
	}

	@When("Enter invalid password as {string}")
	public void enter_invalid_password_as(String ps) {
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys(ps);
	}

	@When("I Click on Login button")
	public void i_click_on_login_button() {
		driver.findElement(By.xpath("//button[@type='submit']")).click();
	}

	@Then("Error message should display")
	public void error_message_should_display() {
	    System.out.println(driver.findElement(By.xpath("//b[normalize-space()='Your username is invalid!']")).getText());
	}
}
