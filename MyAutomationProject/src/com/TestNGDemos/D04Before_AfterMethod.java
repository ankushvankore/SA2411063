package com.TestNGDemos;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class D04Before_AfterMethod {
	WebDriver driver;
	@BeforeTest
	public void launchBrowser()
	{
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		System.out.println("Before Test");
	}
	@AfterTest
	public void closeBrowser()
	{
		driver.close();
		System.out.println("After Test");
	}
	@BeforeMethod
	public void beforeMethod()
	{
		System.out.println("Before Method");
	}
	@AfterMethod
	public void printTitle()
	{
		System.out.println("Title: " + driver.getTitle());
		System.out.println("After Method");
	}
	@Test (priority = 2)
	public void testMyntra() {
		driver.get("https://www.myntra.com/");
	}
	@Test (priority = 2)
	public void testAmazon() {
		driver.get("https://www.amazon.in/");
	}
	@Test (priority = 3)
	public void testUrbanic() {
		driver.get("https://in.urbanic.com/?srsltid=AfmBOoozr_i8397LFZYmWN5hGkAwtVZqJLVcXPH2lLMSYwrz4pBNCt8y");
	}
	@Test (priority = 1)
	public void testH_M() {
		driver.get("https://www2.hm.com/en_in/index.html");
	}
}
