package com.StepDef;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class S04NykaaLinks {
	WebDriver driver;
	Set<String>windows;
	Iterator<String>itr;
	String win1, win2;
	
	@Given("Launch {string}")
	public void launch(String url) {
		driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	    driver.get(url);
	    
	}

	@When("Click on Makeup Link")
	public void click_on_makeup_link() {
	    driver.findElement(By.linkText("Makeup")).click();
	}

	@Then("Makeup page should display")
	public void makeup_page_should_display() throws InterruptedException {
		windows = driver.getWindowHandles();
		itr = windows.iterator();
		win1 = itr.next();
		win2 = itr.next();
		
		driver.switchTo().window(win2);
		Thread.sleep(2000);
	    System.out.println(driver.getTitle());
	    Assert.assertTrue(driver.getTitle().contains("Makeup"));
	}

	@When("Click on Skin Link")
	public void click_on_skin_link() {
	    driver.findElement(By.linkText("Skin")).click();
	}

	@Then("Skin Page should display")
	public void skin_page_should_display() throws InterruptedException {
		windows = driver.getWindowHandles();
		itr = windows.iterator();
		win1 = itr.next();
		win2 = itr.next();
		
		driver.switchTo().window(win2);
		Thread.sleep(2000);
		System.out.println(driver.getTitle());
		Assert.assertTrue(driver.getTitle().contains("Skin"));
	}

	@When("Click on Mom and Baby link")
	public void click_on_mom_and_baby_link() {
		driver.findElement(By.linkText("Mom & Baby")).click();
	}

	@Then("Mom and Baby page should display")
	public void mom_and_baby_page_should_display() throws InterruptedException {
		windows = driver.getWindowHandles();
		itr = windows.iterator();
		win1 = itr.next();
		win2 = itr.next();
		
		driver.switchTo().window(win2);
		Thread.sleep(2000);
		System.out.println(driver.getTitle());
		Assert.assertTrue(driver.getTitle().contains("Mom"));
	}

	@When("Click on Men link")
	public void click_on_men_link() {
		driver.findElement(By.linkText("Men")).click();
	}

	@Then("Men page should display")
	public void men_page_should_display() throws InterruptedException {
		windows = driver.getWindowHandles();
		itr = windows.iterator();
		win1 = itr.next();
		win2 = itr.next();
		
		driver.switchTo().window(win2);
		Thread.sleep(2000);
		System.out.println(driver.getTitle());
		
		Assert.assertTrue(driver.getTitle().contains("Men"));
	}
}
