package com.Assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class A30JOT_Registration {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.nimblework.com/resources/?tx_post_tag=case-studies");
		
		SearchContext ss = driver.findElement(By.xpath("//*[@id=\"kairon-client-container\"]/div")).getShadowRoot();
		Thread.sleep(5000);
		WebElement img = ss.findElement(By.className("buttonInternal"));
		
		img.click();

		//driver.findElement(By.xpath("//*[@id=\"kairon-client-container\"]/div")).getShadowRoot().findElement(By.className("buttonInternal")).click();
		
		driver.findElement(By.xpath("//*[@id=\"kairon-client-container\"]/div")).getShadowRoot().findElement(By.className("msgInput-0-3-60")).sendKeys("Hello");
		driver.findElement(By.xpath("//*[@id=\"kairon-client-container\"]/div")).getShadowRoot().findElement(By.className("msgInput-0-3-60")).sendKeys(Keys.ENTER);
	}

}
