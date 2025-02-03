package com.WebDriverDemos;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class D28DisableNotification {

	public static void main(String[] args) {
		ChromeOptions op = new ChromeOptions();
		op.addArguments("--disable-notifications");
		WebDriver driver = new ChromeDriver(op);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://demoqa.com/alerts");
	}

}
