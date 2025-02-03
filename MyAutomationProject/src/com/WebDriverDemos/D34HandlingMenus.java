package com.WebDriverDemos;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class D34HandlingMenus {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		driver.findElement(By.name("username")).sendKeys("admin");
		driver.findElement(By.name("password")).sendKeys("admin123");
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")).sendKeys(Keys.ENTER);
		//driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")).submit();
		//If button has type="submit" attribute, instead of calling .click() you can call .submit()
		List<WebElement>menus = driver.findElements(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/aside/nav/div[2]/ul/li/a/span"));
		System.out.println("Total menus: " + menus.size());
		
		for(WebElement m : menus)
			System.out.println(m.getText());
		
		driver.close();
	}

}
