package com.StepDef;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.*;

public class S05DemoQARegistration {
	WebDriver driver;
	
	//@Before
	public void launchBrowser()
	{
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://web.archive.org/web/20220111143933/https://demoqa.com/automation-practice-form");
	}
	//@After
	public void closeBrowser()
	{
		driver.close();
	}
	
	@Given("Launch DemoQA")
	public void launch_demo_qa() {
	}

	@When("Enter firstName as {string}")
	public void enter_first_name_as(String fn) {
		driver.findElement(By.xpath("//input[@id='firstName']")).sendKeys(fn);
	}

	@When("Enter lastName as {string}")
	public void enter_last_name_as(String ln) {
		driver.findElement(By.xpath("//input[@id='lastName']")).sendKeys(ln);
	}

	@Then("Reigstration should successful")
	public void reigstration_should_successful() throws InterruptedException {
		System.out.println("Registration successful");
		Thread.sleep(5000);
	}
}
