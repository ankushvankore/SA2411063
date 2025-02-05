package com.WebDriverDemos;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;

public class D39Screenshot {
	public static void main(String[] args) throws IOException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://jqueryui.com/");
		
		Actions act = new Actions(driver);
		
		driver.findElement(By.linkText("Slider")).click();
		driver.switchTo().frame(0);
		
		WebElement slider = driver.findElement(By.xpath("//*[@id=\"slider\"]/span"));
		
		act.dragAndDropBy(slider, slider.getLocation().x+100, slider.getLocation().y).perform();
		
		File screenShot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileHandler.copy(screenShot, new File("JQuery_Slider.jpeg"));
		System.out.println("Screenshot captured!!!");
		
		File file = new File("JQuery_Slider.jpeg");
		
		if(file.exists())
			System.out.println("File Created!!!");
		else
			System.out.println("File not created!!!");
		
		driver.close();
	}
}
