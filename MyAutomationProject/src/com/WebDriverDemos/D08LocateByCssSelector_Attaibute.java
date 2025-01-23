package com.WebDriverDemos;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class D08LocateByCssSelector_Attaibute {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		
		WebElement userName = driver.findElement(By.cssSelector("input[type=\"text\"]"));
		userName.sendKeys("ankushvankore@gmail.com");
		WebElement password = driver.findElement(By.cssSelector("input[data-testid=\"royal_pass\"][placeholder=\"Password\"]"));
		password.sendKeys("1234");
		//Please write the code for login button
	}

}
