package com.WebDriverDemos;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class D06LocateById {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		
		WebElement userNameTxtBox = driver.findElement(By.id("email"));
		userNameTxtBox.sendKeys("ankushvankore@gmail.com");
		WebElement passwordTxtBox = driver.findElement(By.id("pass"));
		passwordTxtBox.sendKeys("1234567890");
		WebElement loginBtn = driver.findElement(By.name("login"));
		loginBtn.click();
		
		String url = driver.getCurrentUrl();
		
		if(url.contains("authentication"))
			System.out.println("Test case pass");
		else
			System.out.println("Test case fail");
	}

}
