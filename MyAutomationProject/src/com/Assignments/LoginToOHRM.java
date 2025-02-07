package com.Assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class LoginToOHRM {
	WebDriver driver;

	@Test
	public void loginToOHRM1() {
		driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
	}

	@Test
	public void loginToOHRM2() {
		driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("neha");
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("neha123");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
	}

	@Test
	public void loginToOHRM3() {
		driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
	}
	@Test
	public void loginToOHRM4() {
		driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("pavan");
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("pavan123");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
	}

	@AfterMethod
	public void logout() {
		if (driver.getCurrentUrl().contains("dashboard")) {
			System.out.println("Test case pass");
			driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[1]/div[3]/ul/li/span/i")).click();
			driver.findElement(By.linkText("Logout")).click();
		} 
		else {
			System.out.println("Test case fail");
		}
	}

	@BeforeTest
	public void beforeTest() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	}

	@AfterTest
	public void afterTest() {
		driver.close();
	}

}
