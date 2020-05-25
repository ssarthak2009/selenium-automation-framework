package com.homework13may2020.page;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import com.homework13may2020.common.WebDriverFactory;


public class AddUserPage {

	@FindBy(id="systemUser_userType") WebElement userRole;
	@FindBy(id="systemUser_employeeName_empName") WebElement empName;
	@FindBy(id="systemUser_userName") WebElement userName;
	@FindBy(id="systemUser_status") WebElement userStatus;
	@FindBy(id="systemUser_password") WebElement userPassword;
	@FindBy(id="systemUser_confirmPassword") WebElement userConfirmPassword;
	@FindBy(id="btnSave") WebElement btnSave;
	public AddUserPage()
	{
		PageFactory.initElements(WebDriverFactory.dr.get(), this);
	}
	
	public AddUserPage addUserDetails(int index , String strEmployeeName , String strUserName , String strUserStatus , String strUserPassword , String strUserConfirmPassword)
	{
		Select userRoleDropdown = new Select(userRole);
		userRoleDropdown.selectByIndex(index);
		empName.sendKeys(strEmployeeName);
		userName.sendKeys(strUserName);
		Select userStatusDropDown = new Select(userStatus);
		userStatusDropDown.selectByValue(strUserStatus);
		userPassword.sendKeys(strUserPassword);
		userConfirmPassword.sendKeys(strUserConfirmPassword);
		WebDriverFactory.dr.get().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		btnSave.click();
		return this;
	}
}
