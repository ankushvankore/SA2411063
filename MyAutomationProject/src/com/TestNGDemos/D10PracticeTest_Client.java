package com.TestNGDemos;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class D10PracticeTest_Client {
	WebDriver driver;
	PracticeTestUtilityClass p1;
	@Test
	public void loginLogout1() {
		p1.setUserName("practice");
		p1.setPassword("SuperSecretPassword!");
		p1.clickOnLoginBtn();
		
		System.out.println(p1.getMessage());
		
		p1.logout();
	}
	@Test
	public void loginLogout2() {
		p1.setUserName("malathi");
		p1.setPassword("Password!");
		p1.clickOnLoginBtn();
		
		System.out.println(p1.getMessage());
		
		p1.logout();
	}

	@BeforeTest
	public void beforeTest() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://practice.expandtesting.com/login");
		
		p1 = new PracticeTestUtilityClass(driver);
	}

	@AfterTest
	public void afterTest() {
		driver.close();
	}

}
