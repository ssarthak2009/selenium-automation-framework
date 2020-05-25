package com.homework13may2020.page;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ListsExample {
	
	public static void main(String arg[])
	{

	System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
	WebDriver dr = new ChromeDriver();
	dr.get("http://127.0.0.1/orangehrm-3.3.1/symfony/web/index.php/auth/login");
	dr.manage().window().maximize();
	dr.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
	WebElement obj;
	List<WebElement> links = dr.findElements(By.tagName("a"));
	
	for(WebElement link : links)
	{
		System.out.println("Links on this page are : " +link.getAttribute("href"));
	}
	dr.quit();
	}
}
