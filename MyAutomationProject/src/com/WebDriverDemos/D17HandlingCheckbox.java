package com.WebDriverDemos;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class D17HandlingCheckbox {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
		
		WebElement altEmail = driver.findElement(By.cssSelector("input[name^=\"chk_altemail\"]"));
		
		System.out.println("Before Clicking");
		System.out.println("Checkbox Selected: " + altEmail.isSelected());
		System.out.println("Checkbox Enabled : " + altEmail.isEnabled());
		System.out.println("Checkbox Visible : " + altEmail.isDisplayed());
		
		//if(altEmail.isSelected() == false)
		if(!altEmail.isSelected())
			altEmail.click();
		
		System.out.println("\nAfter Clicking");
		System.out.println("Checkbox Selected: " + altEmail.isSelected());
		System.out.println("Checkbox Enabled : " + altEmail.isEnabled());
		System.out.println("Checkbox Visible : " + altEmail.isDisplayed());
		
	}

}
