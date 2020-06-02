package com.homework13may2020.common;

import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.IInvokedMethod;
import org.testng.IInvokedMethodListener;
import org.testng.ITestResult;

public class InvokedMethodListnerImpl implements IInvokedMethodListener {

	public void afterInvocation(IInvokedMethod arg0, ITestResult arg1) {
		// TODO Auto-generated method stub
		WebDriverFactory.dr.get().quit();
	}

	public void beforeInvocation(IInvokedMethod arg0, ITestResult arg1) {
		// TODO Auto-generated method stub

		//System.setProperty("webdriver.chrome.driver","C:\\Selenium\\chromedriver.exe");
		//WebDriverFactory.dr.set(new ChromeDriver());
		try {

			DesiredCapabilities capabilities = new DesiredCapabilities();
			capabilities.setBrowserName("chrome");
			capabilities.setVersion("72");
			capabilities.setPlatform(Platform.WINDOWS);

			WebDriver dr = new RemoteWebDriver(new URL("http://192.168.0.105:4444/wd/hub"), capabilities);
			WebDriverFactory.dr.set(dr);
			
			WebDriverFactory.dr.get().get("http://127.0.0.1/orangehrm-3.3.1/symfony/web/index.php/auth/login");
			WebDriverFactory.dr.get().manage().window().maximize();
			WebDriverFactory.dr.get().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
