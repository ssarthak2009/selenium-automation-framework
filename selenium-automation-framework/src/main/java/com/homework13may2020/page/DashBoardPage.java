package com.homework13may2020.page;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import com.homework13may2020.common.WebDriverFactory;

public class DashBoardPage {

	@FindBy(id="welcome")WebElement txtWelcome;
	@FindBy(id="menu_pim_viewPimModule")WebElement menu_pim_viewPimModule;
	
	public DashBoardPage()
	{
		PageFactory.initElements(WebDriverFactory.dr.get(), this);
	}
	
	public DashBoardPage verifyWelcomeText(String expectedWelcomeText)
	{
		Assert.assertEquals(txtWelcome.getText(), expectedWelcomeText);
		return this;
	}
	public PIMPage navigateToPIMPage()
	{
		WebDriverFactory.dr.get().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		menu_pim_viewPimModule.click();
		return new PIMPage();
	}
}
