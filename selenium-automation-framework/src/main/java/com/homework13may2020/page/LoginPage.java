package com.homework13may2020.page;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.homework13may2020.common.WebDriverFactory;

public class LoginPage {

	@FindBy(id="txtUsername")WebElement username;
	@FindBy(id="txtPassword")WebElement txtPassword;
	@FindBy(id="btnLogin")WebElement btnLogin;
	@FindBy(tagName = "a") List<WebElement> links;
	
	
	public String currentURL;
	public String pageTitle;
	
	public LoginPage()
	{
		PageFactory.initElements(WebDriverFactory.dr.get(), this);
	}
	
	public LoginPage printLinks()
	{
		for(WebElement link : links)
		{
			System.out.println("Links on this page : " +link.getAttribute("href"));
		}
		return this;
	}
	
	public DashBoardPage login(String strUserName ,String strPassword)
	{
		username.sendKeys(strUserName);
		txtPassword.sendKeys(strPassword);
		btnLogin.click();
		DashBoardPage db = new DashBoardPage();
		return db;
	}
	
	public LoginPage navigateToPage()
	{
		WebDriverFactory.dr.get().get("http://127.0.0.1/orangehrm-3.3.1/symfony/web/index.php/auth/login");
		WebDriverFactory.dr.get().manage().window().maximize();
		currentURL = WebDriverFactory.dr.get().getCurrentUrl();
		pageTitle = WebDriverFactory.dr.get().getTitle();
		return this;
	}
}
