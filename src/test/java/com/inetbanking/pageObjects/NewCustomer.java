package com.inetbanking.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;


public class NewCustomer {
	WebDriver ldriver;
	public NewCustomer(WebDriver rdriver)
	{
		ldriver=rdriver;
		PageFactory.initElements(rdriver,this);
	}
	@FindBy(how =How.XPATH,using = "/html/body/div[3]/div/ul/li[2]/a")
	@CacheLookup
	WebElement newCustomer_link;
	@FindBy(how =How.XPATH,using="//input[@name='name']")
	@CacheLookup
	WebElement username;
	@FindBy(how =How.XPATH,using="//input[@value='m']")
	@CacheLookup
	WebElement gender;
	@FindBy(how =How.XPATH,using="//input[@id='dob']")
	@CacheLookup
	WebElement dob;
	@FindBy(how =How.XPATH,using="//textarea[@name='addr']")
	@CacheLookup
	WebElement address;
	@FindBy(how =How.XPATH,using="//input[@name='city']")
	@CacheLookup
	WebElement city ;
	@FindBy(how =How.XPATH,using="//input[@name='state']")
	@CacheLookup
	WebElement state;
	@FindBy(how =How.XPATH,using="//input[@name='pinno']")
	@CacheLookup
	WebElement pin;
	@FindBy(how =How.XPATH,using="//input[@name='telephoneno']")
	@CacheLookup
	WebElement MobileNumber;
	@FindBy(how =How.XPATH,using="//input[@name='emailid']")
	@CacheLookup
	WebElement EmailId;
	@FindBy(how =How.XPATH,using="//input[@name='password']")
	@CacheLookup
	WebElement Password;
	@FindBy(how =How.XPATH,using="//input[@name='sub']")
	@CacheLookup
	WebElement Submit;
	
	/*WebElement newCustomer_link=ldriver.findElement(By.xpath("/html/body/div[3]/div/ul/li[2]/a"));
	WebElement username=ldriver.findElement(By.xpath("//input[@name='name']"));
	WebElement gender=ldriver.findElement(By.xpath("//input[@value='m']"));
	WebElement dob=ldriver.findElement(By.xpath("//input[@id='dob']"));
	WebElement address=ldriver.findElement(By.xpath("//textarea[@name='addr']"));
	WebElement city=ldriver.findElement(By.xpath("//input[@name='city']"));
	WebElement state=ldriver.findElement(By.xpath("//input[@name='state']"));
	WebElement pin=ldriver.findElement(By.xpath("//input[@name='pinno']"));
	WebElement MobileNumber=ldriver.findElement(By.xpath("//input[@name='telephoneno']"));
	WebElement EmailId=ldriver.findElement(By.xpath("//input[@name='emailid']"));
	WebElement Password=ldriver.findElement(By.xpath("//input[@name='password']"));
	WebElement Submit=ldriver.findElement(By.xpath("//input[@value='Submit']"));
	/html/body/table/tbody/tr/td/table/tbody/tr[14]/td[2]/input[1]
	 * /html/body/table/tbody/tr/td/table/tbody/tr[14]/td[2]/input[1]*/
	public void  setNewCutomerLink()
	{
		newCustomer_link.click();
	}
	public void setUserName(String userName)
	{
		username.sendKeys(userName);
	}
	public void setGender()
	{
		gender.click();
	}
	public void setDateofBirth(String mm,String dd,String yyyy)
	{
		dob.sendKeys(mm);
		dob.sendKeys(dd);
		dob.sendKeys(yyyy);
	}
	public void setAddress(String adder)
	{
		address.sendKeys(adder);
	}
	public void setCity(String cities)
	{
		city.sendKeys(cities);
	}
	public void setState(String states)
	{
		state.sendKeys(states);
	}
	public void setPin(String pinNo)
	{
		pin.sendKeys(pinNo);
	}
	public void setMobileNo(String contact)
	{
		MobileNumber.sendKeys(contact);
		
	}
	public void setEmail(String mailId)
	{
		EmailId.sendKeys(mailId);
	}

	public void setPassword(String Pwd)
	{
		Password.sendKeys(Pwd);
	}
	public void setSubmit()
	{
		Submit.click();
	}
}
