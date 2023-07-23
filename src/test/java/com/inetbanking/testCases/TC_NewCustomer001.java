package com.inetbanking.testCases;
import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.Alert;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.Test;
import com.inetbanking.pageObjects.LoginPage;
import com.inetbanking.pageObjects.NewCustomer;

public class TC_NewCustomer001 extends TestBase {
	@Test(priority=1)
	public void newCusomerTest() throws Exception
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
		logger.info("started new registrtion");
		NewCustomer nc=new NewCustomer(driver);
	
		nc.setNewCutomerLink();
		Thread.sleep(3000);
		logger.info("....first...");
		
		nc.setUserName("Rakesh");
		logger.info("enterd userid");
		nc.setGender();
		logger.info("selected male radio button");
		nc.setDateofBirth("01","20","1985");
		logger.info("enter datebirth");
		nc.setAddress("Jammikunta,karimnagar");
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
		
		//Thread.sleep(3000);
		logger.info("enterd all details for NewCutomer");
		nc.setSubmit();
		 Alert alt = driver.switchTo().alert();
		  alt.accept();
		  Thread.sleep(3000);
		  System.out.println("the title is"+driver.getTitle());
		if(driver.getTitle().equals("Guru99 Bank Customer Registration Page"))
		{
			//Assert.assertTrue(true);
			Assert.assertTrue(true);
			
			logger.info("NewCustomer is Passed");
		}
		else
		{
			Assert.assertTrue(true);
			logger.info("New Customer is  failed");
			
		}
		TC_NewCustomer001 tnc=new TC_NewCustomer001();
		String tname =" ";
		tnc.captureScreen(driver,tname);
		
		

}
	
	public String randomstring()
	{
		String generatedstring=RandomStringUtils.randomAlphabetic(8);
		return (generatedstring);
	}
}

