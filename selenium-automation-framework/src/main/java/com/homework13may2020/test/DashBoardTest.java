package com.homework13may2020.test;

import org.testng.annotations.Test;
import com.homework13may2020.common.BaseTest;
import com.homework13may2020.common.WebDriverFactory;
import com.homework13may2020.page.LoginPage;

public class DashBoardTest extends BaseTest{

	@Test
	public void verifyDashboardTest()
	{
		LoginPage lp = new LoginPage();
		lp.navigateToPage()
			.login("Admin", "admin")
				.verifyWelcomeText("Welcome Admin");
		
			System.out.println("Current URL is : " +lp.currentURL);
			System.out.println("Current Page Title is : " +lp.pageTitle);
			
	WebDriverFactory.dr.get().quit();
	}
}
