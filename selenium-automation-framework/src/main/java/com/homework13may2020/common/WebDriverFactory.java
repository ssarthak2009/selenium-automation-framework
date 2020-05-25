package com.homework13may2020.common;

import org.openqa.selenium.WebDriver;

public class WebDriverFactory {

	//public static WebDriver dr;
	public static ThreadLocal<WebDriver> dr = new ThreadLocal<WebDriver>();
	
}
