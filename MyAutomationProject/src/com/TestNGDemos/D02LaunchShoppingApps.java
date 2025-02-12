package com.TestNGDemos;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class D02LaunchShoppingApps {
	@Test (priority = 2)
	public void testMyntra() {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://www.myntra.com/");
		System.out.println("Title: " + driver.getTitle());

		driver.close();
	}
	@Test (priority = 2)
	public void testFlipkart() {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://www.flipkart.com/");
		System.out.println("Title: " + driver.getTitle());

		driver.close();
	}
	@Test (priority = 3)
	public void testUrbanic() {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://in.urbanic.com/?srsltid=AfmBOoozr_i8397LFZYmWN5hGkAwtVZqJLVcXPH2lLMSYwrz4pBNCt8y");
		System.out.println("Title: " + driver.getTitle());

		driver.close();
	}
	@Test (priority = 1)
	public void testH_M() {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://www2.hm.com/en_in/index.html");
		System.out.println("Title: " + driver.getTitle());

		driver.close();
	}
}
