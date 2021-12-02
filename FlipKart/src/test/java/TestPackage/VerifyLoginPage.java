package TestPackage;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import POM_Classes.LogINPage;
import pom_package.LogOutPage;

public class VerifyLoginPage {
	WebDriver driver;
	LogINPage login;
	LogOutPage logout;
	
	@BeforeClass
	public void beforeClass()
	{
		System.setProperty("webdriver.chrome.driver","C:\\Automation\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		logout = new LogOutPage(driver);
	    login = new LogINPage(driver);
	}
	
	@BeforeMethod
	public void beforeMethod()
	{
		driver.navigate().to("https://www.flipkart.com/");
		driver.manage().window().maximize();
	    login.ClickOnSignIN();
	}
	
	@Test
	public void TestA() throws InterruptedException, EncryptedDocumentException, IOException
	{
		login.SendMobileNumber();
		Thread.sleep(3000);
		login.SendPassword();
		Thread.sleep(3000);
		login.ClickOnLogIN();
	}
	
	@AfterMethod
	public void afterMethod() throws InterruptedException
	{
		logout.ClickOnMyAccount();
		Thread.sleep(3000);
		logout.ClickOnlogOut();
	}
	
	@AfterClass
	public void afterClass()
	{
		driver.close();
	}

}
