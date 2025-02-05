package com.Assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class A07RedbusDateAssignment {

	public static void main(String[] args) {
		String expMonth = "Nov", day = "30";
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://www.redbus.in/");
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
		
		//Source City
		driver.findElement(By.id("src")).sendKeys("Kolh");
		driver.findElement(By.xpath("//*[@id=\"autoSuggestContainer\"]/div/div/div[1]/div/div[1]/ul/li[1]/div/text")).click();
		
		//Target City
		driver.findElement(By.id("dest")).sendKeys("Nash");
		driver.findElement(By.xpath("//*[@id=\"autoSuggestContainer\"]/div/div/div[3]/div[1]/ul/li[1]/div/text")).click();
		
		//Calender
		driver.findElement(By.xpath("//*[@id=\"onwardCal\"]/div/i")).click();
		
		WebElement rArraow = driver.findElement(By.xpath("//*[@id=\"onwardCal\"]/div/div[2]/div/div/div[1]/div[3]"));
		WebElement month = driver.findElement(By.xpath("//*[@id=\"onwardCal\"]/div/div[2]/div/div/div[1]/div[2]"));
		
		while(!month.getText().contains(expMonth))
			rArraow.click();

		driver.findElement(By.xpath("//span[contains(text(),"+day+")]")).click();
	}

}
