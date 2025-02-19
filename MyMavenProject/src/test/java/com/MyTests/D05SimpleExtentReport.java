package com.MyTests;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class D05SimpleExtentReport {

	public static void main(String[] args) {
		ExtentSparkReporter htmlReport = new ExtentSparkReporter("SimpleReport.html");
		//File which will store the report
		ExtentReports report = new ExtentReports();
		//This will generate the report
		report.attachReporter(htmlReport);
		//Specify that store the report in this html file
		
		ExtentTest test1;
		
		//Add some environment details
		report.setSystemInfo("Project Name", "EchoTrak");
		report.setSystemInfo("Machine", "Dell");
		report.setSystemInfo("OS", "Windows 10");
		report.setSystemInfo("Company", "Star Agile");
		report.setSystemInfo("User", "Mohit");
		report.setSystemInfo("Browser", "Chrome");
		
		//Configuration of report about look and feel
		htmlReport.config().setDocumentTitle("My Simple Extent Report");
		htmlReport.config().setReportName("EchoTrak Test");
		htmlReport.config().setTheme(Theme.STANDARD);
		htmlReport.config().setTimeStampFormat("dd-MMMM-yyyy");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.echotrak.com/Login.aspx?ReturnUrl=%2f");
		
		System.out.println(driver.getTitle());
		
		driver.close();
		
		test1 = report.createTest("EchoTrak Title Test");
		test1.log(Status.PASS, MarkupHelper.createLabel("EchoTrak Title: Pass", ExtentColor.GREEN));
		
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.echotrak.com/Login.aspx?ReturnUrl=%2f");
		
		WebElement userName = driver.findElement(By.className("form-control"));
		userName.sendKeys("Ankush"); 
		WebElement password = driver.findElement(By.cssSelector("input[class=\"form-control\"][type=\"password\"]"));
		password.sendKeys("ankush123");
		
		driver.close();
		
		test1 = report.createTest("EchoTrak Login Test");
		test1.log(Status.FAIL, MarkupHelper.createLabel("EchoTrak Login: Fail", ExtentColor.RED));
		
		report.flush();
		//Will generate the report
	}

}
