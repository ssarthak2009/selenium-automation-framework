package com.homework13may2020.page;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.homework13may2020.common.WebDriverFactory;

public class PIMPage {

	@FindBy(id="btnAdd")WebElement btnAdd;
	public PIMPage()
	{
		PageFactory.initElements(WebDriverFactory.dr.get(), this);
	}
	
	public AddEmployeePage navigateToAddEmployeePage()
	{
		
		WebDriverFactory.dr.get().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		btnAdd.click();
		return new AddEmployeePage();
				
	}
}
