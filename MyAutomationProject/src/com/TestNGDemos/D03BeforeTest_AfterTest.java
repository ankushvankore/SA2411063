package com.TestNGDemos;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class D03BeforeTest_AfterTest {
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
	
	@Test (priority = 2)
	public void testMyntra() {
		driver.get("https://www.myntra.com/");
		System.out.println("Title: " + driver.getTitle());
	}
	@Test (priority = 2)
	public void testAmazon() {
		driver.get("https://www.amazon.in/");
		System.out.println("Title: " + driver.getTitle());
	}
	@Test (priority = 3)
	public void testUrbanic() {
		driver.get("https://in.urbanic.com/?srsltid=AfmBOoozr_i8397LFZYmWN5hGkAwtVZqJLVcXPH2lLMSYwrz4pBNCt8y");
		System.out.println("Title: " + driver.getTitle());
	}
	@Test (priority = 1)
	public void testH_M() {
		driver.get("https://www2.hm.com/en_in/index.html");
		System.out.println("Title: " + driver.getTitle());
	}
}
