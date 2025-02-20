package com.StepDef;

import java.time.Duration;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;

public class S02GoogleSearch {
	WebDriver driver;
	@Given("Launch Google in browser")
	public void launch_google_in_browser() {
		driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	    driver.get("https://www.google.com");
	}

	@When("Enter text for search in search box")
	public void enter_text_for_search_in_search_box() {
	    driver.findElement(By.name("q")).sendKeys("Chhava Movie");
	}

	@When("Hit Enter key")
	public void hit_enter_key() {
	    driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
	}

	@Then("Valid search result should display")
	public void valid_search_result_should_display() {
	    Assert.assertTrue(driver.getTitle().contains("Chhava Movie"));
	}
}
