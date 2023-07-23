package com.inetbanking.testCases;

import java.io.IOException;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.Alert;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.inetbanking.pageObjects.LoginPage;
import com.inetbanking.pageObjects.NewCustomer;

public class TC_NewCutomerRegistration002 extends TestBase {
	@Test
	public void testNewUserRegister() throws IOException
	{
		driver.get(baseURL);
		driver.manage().window().maximize();
		LoginPage lp=new LoginPage(driver);
		lp.setUserName(username);
		logger.info("Enterd username");
		lp.setPassword(password);
		logger.info("enterd password");
		lp.clickSubmit();
		NewCustomer nc=new NewCustomer(driver);
		nc.setNewCutomerLink();
		nc.setUserName("Rakesh");
		logger.info("enterd userid");
		nc.setGender();
		logger.info("selected male radio button");
		nc.setDateofBirth("01","20","1985");
		logger.info("enter datebirth");
		nc.setAddress("Jammikunta karimnagar");
		nc.setCity("Hyderabad");
		nc.setState("Telangana");
		nc.setPin("505122");
		nc.setMobileNo("9100585881");
		String Email=randomstring()+"@gmail.com";
		System.out.println(Email);
		nc.setEmail(Email);
		logger.info(Email);
		nc.setPassword("Sreepathi1@");
		logger.info("password enterd");
		
		// Alert alt = driver.switchTo().alert();
		// alt.accept();
		 nc.setSubmit();
		System.out.println("the title is..."+driver.getTitle());
		if(driver.getTitle().equals("Guru99 Bank Customer Registration Page"))
		{
			Assert.assertTrue(true);
			logger.info("New Customer Passed");
					
		}
		else
		{
			Assert.assertTrue(false);
			logger.info("New Customer Failed");			
		}
		
		TC_NewCutomerRegistration002 tnc=new TC_NewCutomerRegistration002();
		String tname ="";
		tnc.captureScreen(driver,tname);
	}
	public String randomstring()
	{
		String generatedstring=RandomStringUtils.randomAlphabetic(8);
		return (generatedstring);
	}

}
