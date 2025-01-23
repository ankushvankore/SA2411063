package com.WebDriverDemos;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class D05LocateByName {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		
		WebElement userName = driver.findElement(By.name("email"));
		//Read the control on the page whose name is email and 
		//store it in userName object.
		//userName object is pointing to the control on the web page
		userName.sendKeys("ankushvankore@gmail.com");
		
		WebElement password = driver.findElement(By.name("pass"));
		password.sendKeys("1234567890");
		
		WebElement loginBtn = driver.findElement(By.name("login"));
		loginBtn.click();
	}

}
