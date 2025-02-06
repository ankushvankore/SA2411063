package com.TestNGDemos;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class D02LaunchShoppingApps {
	@Test
	public void testMyntra() {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://www.myntra.com/");
		System.out.println("Title: " + driver.getTitle());

		driver.close();
	}
	@Test
	public void testAmazon() {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://www.amazon.in/");
		System.out.println("Title: " + driver.getTitle());

		driver.close();
	}
	@Test
	public void testUrbanic() {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://in.urbanic.com/?srsltid=AfmBOoozr_i8397LFZYmWN5hGkAwtVZqJLVcXPH2lLMSYwrz4pBNCt8y");
		System.out.println("Title: " + driver.getTitle());

		driver.close();
	}
	@Test
	public void testH_M() {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://www2.hm.com/en_in/index.html");
		System.out.println("Title: " + driver.getTitle());

		driver.close();
	}
}
