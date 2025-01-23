package com.WebDriverDemos;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class D04RedURL {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://github.com/ankushvankore/SA2411063");
		
		String url = driver.getCurrentUrl();
		System.out.println("URL: " + url);
		
		driver.close();
	}

}
