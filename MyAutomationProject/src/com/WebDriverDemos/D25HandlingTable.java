package com.WebDriverDemos;

import java.time.Duration;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class D25HandlingTable {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://money.rediff.com/gainers/bse/daily/groupa?src=gain_lose");
		
		List<WebElement>headers = driver.findElements(By.xpath("//*[@id=\"leftcontainer\"]/table/thead/tr/th"));
		for(WebElement h : headers)
			System.out.println(h.getText());
		
		List<WebElement>rows = driver.findElements(By.xpath("//*[@id=\"leftcontainer\"]/table/tbody/tr"));
		System.out.println("Total Rows: " + rows.size());
		
		Random rnd = new Random();
		int index = rnd.nextInt(rows.size());
		
		System.out.println(rows.get(index).getText());
		System.out.println(driver.findElement(By.xpath("//*[@id=\"leftcontainer\"]/table/tbody/tr[" + (index+1) + "]")).getText());
		
		List<WebElement>currentPriceList = driver.findElements(By.xpath("//*[@id=\"leftcontainer\"]/table/tbody/tr/td[4]"));
		double[]cpArray = new double[currentPriceList.size()];
		
		for(int i = 0; i < cpArray.length; i++)
		{
			cpArray[i] = Double.parseDouble(currentPriceList.get(i).getText().replace(",", ""));
		}
		Arrays.sort(cpArray);
		System.out.println("Heighest Price: " + cpArray[cpArray.length-1]);
		
		driver.close();
	}

}
