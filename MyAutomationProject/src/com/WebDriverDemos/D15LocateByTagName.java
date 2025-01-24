package com.WebDriverDemos;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class D15LocateByTagName {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.google.com/");
		
		List<WebElement>allLinks = driver.findElements(By.tagName("a"));
		System.out.println("Total Links: " + allLinks.size());
		
		//get() is used to read any specific element from the list.
		//allLinks.get(0).getText();
		
		driver.close();
	}

}
