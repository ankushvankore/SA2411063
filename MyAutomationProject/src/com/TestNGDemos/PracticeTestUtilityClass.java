package com.TestNGDemos;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PracticeTestUtilityClass {
	WebDriver driver;
	JavascriptExecutor js;
	//PageFactory
	@FindBy (id="username") WebElement userName;
	@FindBy (xpath = "//*[@id=\"login\"]/button") WebElement loginBtn;
	
	public PracticeTestUtilityClass(WebDriver d)
	{
		driver = d;
		js = (JavascriptExecutor) driver;
		PageFactory.initElements(driver, this);
	}
	
	public void setUserName(String un)
	{
		js.executeScript("window.scrollBy(0, 200)", "");
		//driver.findElement(By.id("username")).sendKeys(un);
		userName.sendKeys(un);
	}
	public void setPassword(String ps)
	{
		driver.findElement(By.id("password")).sendKeys(ps);
	}
	public void clickOnLoginBtn()
	{
		//driver.findElement(By.xpath("//*[@id=\"login\"]/button")).click();
		loginBtn.click();
	}
	public String getMessage()
	{
		return(driver.findElement(By.xpath("//*[@id=\"flash\"]/b")).getText());
	}
	public void logout()
	{
		if(driver.getCurrentUrl().contains("secure"))
			driver.findElement(By.linkText("Logout")).click();
	}
}
