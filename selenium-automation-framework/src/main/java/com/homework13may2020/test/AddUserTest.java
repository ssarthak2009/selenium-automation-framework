package com.homework13may2020.test;

import org.testng.annotations.Test;
import com.homework13may2020.common.BaseTest;
import com.homework13may2020.page.LoginPage;

public class AddUserTest extends BaseTest{

	@Test
	public void addUserTest()
	{
		LoginPage lp = new LoginPage();
		lp.login("Admin", "admin")
		.verifyWelcomeText("Welcome Admin")
		.navigateToPIMPage()
		.navigateToAddEmployeePage()
		.enterEmployeeDetails("SarthakT", "SunilT", "SamdurkarT")
		.navigateToAddUserPage()
		.addUserDetails(0, "SarthakT SunilT SamdurkarT", "sarthak2009", "0", "abc@1234", "abc@1234");
	}
	
	@Test
	public void addUserNegativeTest()
	{
		LoginPage lp = new LoginPage();
		lp.login("Admin", "admin123")
		.verifyWelcomeText("Welcome Admin")
		.navigateToPIMPage()
		.navigateToAddEmployeePage()
		.enterEmployeeDetails("SarthakT", "SunilT", "SamdurkarT")
		.navigateToAddUserPage()
		.addUserDetails(0, "SarthakT SunilT SamdurkarT", "sarthak2009", "0", "abc@1234", "abc@1234");	

	}
}
