package com.homework13may2020.test;

import org.testng.annotations.Test;
import com.homework13may2020.common.BaseTest;
import com.homework13may2020.page.LoginPage;

public class LoginTest extends BaseTest{

	@Test(dataProvider="excelData")
	public void verifyLoginTest(String usr,String password)
	{
		LoginPage lp = new LoginPage();
		lp.navigateToPage()
			.printLinks()
			  .login(usr,password)
				.verifyWelcomeText("Welcome Admin");
		
			System.out.println("!!LoginPage Passed!!");
				
	}
}
