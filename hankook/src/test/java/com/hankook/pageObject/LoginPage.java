package com.hankook.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	WebDriver ldriver;
	
	public LoginPage(WebDriver rdriver)
	{
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	//Locators
	@FindBy(xpath="//button[@id='onboardingMenu']")
	@CacheLookup
	WebElement logPopUp;
	
	@FindBy(xpath="/html/body/header/div[2]/ul/li[2]/a")
	@CacheLookup
	WebElement fLogBtn;
	
	@FindBy(xpath="/html/body/div[1]/div/div/div/form/div[1]/input")
	@CacheLookup
	WebElement txtUserName;
	
	@FindBy(xpath="/html/body/div[1]/div/div/div/form/div[2]/input")
	@CacheLookup
	WebElement txtPassword;
	
	@FindBy(xpath="/html/body/div[1]/div/div/div/form/div[3]/button")
	@CacheLookup
	WebElement btnLogin;
	
	@FindBy(xpath="//header/div[2]/ul[1]/li[4]/a[1]")
	@CacheLookup
	WebElement btnLogOut;
	
	@FindBy(xpath="//button[@id='onboardingMenu']")
	@CacheLookup
	WebElement logOutPopUp;
	
	/*
	 * @FindBy(xpath="")
	 * 
	 * @CacheLookup WebElement lnkLogout;
	 */
	
	//Action methods
	
	public void clickFLogBtn()
	{
		fLogBtn.click();
	}	
	
	public void clickLogPopUp()
	{
		logPopUp.click();
	}	
	
	public void setUserName(String uname)
	{
		txtUserName.sendKeys(uname);
	}
	
	public void setPassword(String pwd)
	{
		txtPassword.sendKeys(pwd);
	}
	
	
	public void clickSubmit()
	{
		btnLogin.click();
	}	
	
	public void clickLogOutPopUp()
	{
		logOutPopUp.click();
	}
	  public void clickLogout() 
	  { 
		  btnLogOut.click(); 
		  }
	  
	
	 
	
	
	
}









