package com.homework13may2020.page;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.homework13may2020.common.WebDriverFactory;

public class AddEmployeePage {

	@FindBy(id = "firstName")
	WebElement firstName;
	@FindBy(id = "middleName")
	WebElement middleName;
	@FindBy(id = "lastName")
	WebElement lastName;
	@FindBy(id = "btnSave")
	WebElement btnSave;
	@FindBy(id="menu_admin_viewAdminModule")
	WebElement menu_admin_viewAdminModule;
	
	public AddEmployeePage() {
		PageFactory.initElements(WebDriverFactory.dr.get(), this);
	}

	public AdminPage enterEmployeeDetails(String strFirstName, String strMiddleName, String strLastName) {
		firstName.sendKeys(strFirstName);
		middleName.sendKeys(strMiddleName);
		lastName.sendKeys(strLastName);
		WebDriverFactory.dr.get().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		btnSave.click();
		WebDriverFactory.dr.get().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		menu_admin_viewAdminModule.click();
		return new AdminPage();
	}

}
