package com.WebDriverDemos;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class D12ReadTextOnControl {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.echotrak.com/Login.aspx?ReturnUrl=%2f");
		
		driver.findElement(By.className("form-control")).sendKeys("Tejavathi");
		driver.findElement(By.id("txtPassword")).sendKeys("teja123");
		
		driver.findElement(By.id("Butsub")).click();
		
		WebElement error = driver.findElement(By.id("lblMsg"));
		String errMsg = error.getText();
		
		System.out.println("Error Message: " + errMsg);
		
		if(errMsg.contains("Invalid"))
			System.out.println("Test case pass");
		else
			System.out.println("Test case fail");
		
		driver.close();
		
	}

}
