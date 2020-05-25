package com.homework13may2020.test;

import org.testng.annotations.Test;
import com.homework13may2020.common.BaseTest;
import com.homework13may2020.page.LoginPage;

public class AddEmployeeTest extends BaseTest{

	@Test
	public void addEmployeeTest()
	{
		LoginPage lp = new LoginPage();
		lp.navigateToPage()
			.login("Admin", "admin")
				.verifyWelcomeText("Welcome Admin")
					.navigateToPIMPage()
						.navigateToAddEmployeePage()
							.enterEmployeeDetails("TSarthakT", "TSunilT", "TSamdurkarT");
		
	}
}
