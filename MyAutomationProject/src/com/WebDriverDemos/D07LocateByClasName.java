package com.WebDriverDemos;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class D07LocateByClasName {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.google.co.in/");
		
		WebElement searchBox = driver.findElement(By.className("gLFyf"));
		searchBox.sendKeys("tmkoc");
		//searchBox.sendKeys(Keys.ENTER);		//Will hit enter key from keyboard
		searchBox.sendKeys(Keys.RETURN);
	}

}
