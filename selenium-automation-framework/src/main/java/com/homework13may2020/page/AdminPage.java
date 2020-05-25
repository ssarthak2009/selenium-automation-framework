package com.homework13may2020.page;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.homework13may2020.common.WebDriverFactory;


public class AdminPage {

@FindBy(id="btnAdd")WebElement btnAdd;
	
	public AdminPage()
	{
		PageFactory.initElements(WebDriverFactory.dr.get(), this);
	}
	
	public AddUserPage navigateToAddUserPage()
	{
		WebDriverFactory.dr.get().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		btnAdd.click();
		return new AddUserPage();
	}
}
