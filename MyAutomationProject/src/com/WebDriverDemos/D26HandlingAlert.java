package com.WebDriverDemos;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class D26HandlingAlert {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://demoqa.com/alerts");
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		Alert alt;
		
		//driver.findElement(By.id("alertButton")).click();
		js.executeScript("arguments[0].click()", driver.findElement(By.id("alertButton")));
		alt = driver.switchTo().alert();
		System.out.println(alt.getText());
		//Thread.sleep(2000);
		alt.accept();			//Will click on Ok button.
		
		//driver.findElement(By.id("timerAlertButton")).click();
		js.executeScript("arguments[0].click()", driver.findElement(By.id("timerAlertButton")));
		Thread.sleep(5000);
		alt = driver.switchTo().alert();
		System.out.println(alt.getText());
		alt.accept();
		
		js.executeScript("arguments[0].click()", driver.findElement(By.id("confirmButton")));
		alt = driver.switchTo().alert();
		System.out.println(alt.getText());
		alt.dismiss();			//Will Click on Cancel button
		System.out.println(driver.findElement(By.id("confirmResult")).getText());
		
		js.executeScript("window.scrollBy(0, 400)", "");
		driver.findElement(By.id("promtButton")).click();
		alt = driver.switchTo().alert();
		alt.sendKeys("Trupti");
		alt.accept();
	}

}
