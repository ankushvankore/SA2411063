package com.WebDriverDemos;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class D40ClearMethod {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
		
		WebElement firstName = driver.findElement(By.xpath("/html[1]/body[1]/center[1]/form[1]/div[1]/table[2]/tbody[1]/tr[3]/td[3]/input[1]"));
		
		firstName.sendKeys("Ankush");
		Thread.sleep(5000);
		firstName.clear();
		
	}

}
