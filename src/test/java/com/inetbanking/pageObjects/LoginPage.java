package com.inetbanking.pageObjects;


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
		PageFactory.initElements(rdriver,this);
	}
	@FindBy(name="uid")
	@CacheLookup
	WebElement txtUserName;
	//WebElement txtUserName=ldriver.findElement(By.xpath("//input[@name='uid']"));
	@FindBy(name="password")
	@CacheLookup
	WebElement txtPassword;
	//WebElement txtPassword=ldriver.findElement(By.xpath("//input[@name='password']"));

	@FindBy(name="btnLogin")
	@CacheLookup
	WebElement btnLogin;
	//WebElement btnLogin=ldriver.findElement(By.xpath("//input[@name='btnLogin']"));
	@//FindBy(linkText="Logout.php")
    FindBy(xpath="/html/body/div[3]/div/ul/li[15]/a")
	@CacheLookup
	//FindBy((linkText="Logout.php")
			WebElement logoutbtn;
	public void setUserName(String username)
	{
		txtUserName.sendKeys(username);
	}
	public void setPassword(String password)
	{
		txtPassword.sendKeys(password);
	}
	public void clickSubmit()
	{
		btnLogin.click();
	}
	public void clickLogout()
	{
		logoutbtn.click();
	}
	
}
