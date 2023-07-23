package com.inetbanking.testCases;

import java.io.IOException;


import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.inetbanking.pageObjects.LoginPage;

public class TC_LoginTest_Valid_Values_Test_001 extends TestBase {
	
	@Test
	public void loginTest() throws IOException
	{
		driver.get(baseURL);
		logger.info("URL is Opened");
		driver.manage().window().maximize();
		LoginPage lp=new LoginPage(driver);
		lp.setUserName(username);
		logger.info("Enterd username");
		lp.setPassword(password);
		logger.info("enterd password");
		lp.clickSubmit();
		if(driver.getTitle().equals("Guru99 Bank Manager HomePage"))
		{
			//Assert.assertTrue(true);
			Assert.assertTrue(true);
			logger.info("Login test passed");
		}
		else
		{
			Assert.assertTrue(false);
			logger.info("Login test failed");
		}
		TC_LoginTest_Valid_Values_Test_001 tt=new TC_LoginTest_Valid_Values_Test_001();
		String tname ="";
		tt.captureScreen(driver,tname);
		
	}
	

}
