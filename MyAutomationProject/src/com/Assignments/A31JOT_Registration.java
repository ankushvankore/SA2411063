package com.Assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class A31JOT_Registration {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.jotform.com/form-templates/exam-registration-form");
		
		driver.switchTo().frame(driver.findElement(By.xpath("//*[@id=\"formPreviewArea\"]")));
		
		driver.findElement(By.id("first_9")).sendKeys("Vidya");
	}
}
