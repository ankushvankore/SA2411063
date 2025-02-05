package com.Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class A01EchotrackLogin_ClassName {

	public static void main(String[] args) throws InterruptedException {
		/*WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.echotrak.com/Login.aspx?ReturnUrl=%2f");
		
		WebElement userName = driver.findElement(By.className("form-control"));
		userName.sendKeys("Ankush");
		WebElement password = driver.findElement(By.cssSelector("input[class=\"form-control\"][type=\"password\"]"));
		password.sendKeys("ankush123");
*/
		/*WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://istqb.in/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		List<WebElement> menus=driver.findElements(By.xpath("//nav[@class=\"sp-megamenu-wrapper d-flex\"]/ul/li"));
		System.out.println("total no of Menus:"+menus.size());
	    for(WebElement e: menus)
	    {
	    	System.out.print(e.getText()+" ");
	    }*/
		
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("https://www.hotstar.com/in/mypage");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//*[@id=\"page-container\"]/div/div[3]/div[1]/div/div[3]/div/button")).click();
		
		Actions ent=new Actions(driver);
		ent.moveToElement(driver.findElement(By.xpath("//*[@id=\"7\"]"))).perform();
		Thread.sleep(5000);
		WebElement mob=driver.findElement(By.xpath("/html/body/div[3]/div[2]/div/div/div/div/div[2]/div[3]/div[1]/div/div/form/div[2]/div/div[1]/div[1]/div/div[2]/div/input"));
		Thread.sleep(5000);
		mob.sendKeys("888999728");

	}

}
