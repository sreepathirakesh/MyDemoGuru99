package com.inetbanking.testCases;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import com.inetbanking.utilities.ReadConfig;


 
public class TestBase {
	ReadConfig readconfig=new ReadConfig();
	public  String baseURL=readconfig.getApplicationUrl();
	public String username=readconfig.getUsername();
	public String password=readconfig.getPassword();
	public static WebDriver driver;
	public static Logger logger;
	
	
	
	@BeforeClass
	public void setup()
	{
	System.setProperty("webdriver.chrome.driver",readconfig.getChrome());
	 driver=new ChromeDriver();
	logger=Logger.getLogger("ebanking");
	 
	PropertyConfigurator.configure("Log4j.properties");
	driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	}
	

	public void captureScreen(WebDriver driver, String tname) throws IOException
	{
		String timeStamp = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new Date());//time stamp
		String screenShot=tname;
		screenShot="screenshot-"+timeStamp;
		System.out.println("The result"+screenShot);
		
		TakesScreenshot ts=(TakesScreenshot)driver;
		System.out.println("test"+screenShot);
		File source=ts.getScreenshotAs(OutputType.FILE);
		File target=new File(System.getProperty("user.dir") + "//Screenshots//" +screenShot+ ".png");
		FileUtils.copyFile(source, target);
		System.out.println("Screenshot taken");
	}
	@AfterClass
	public void tearDown()
	{
		driver.quit(); 
	}
	

}
