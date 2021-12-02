package POM_Classes;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;






public class LogINPage {
	WebDriver driver;
	int value;
	@FindBy (xpath="//a[text()='Login']")
	private WebElement SignIn;
	
	@FindBy (xpath="(//input[@type='text'])[2]")
	private WebElement MobileNumber;
	
	@FindBy (xpath="//input[@type='password']")
	private WebElement Password;
	
	@FindBy (xpath="(//button[@type='submit'])[2]")
	private WebElement LogIN;
	
	
	
	
	
	public LogINPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}


	public void ClickOnSignIN()
	{
		JavascriptExecutor js = (JavascriptExecutor)driver;
	    js.executeScript("arguments[0].click();",SignIn);
	}
	
	public void SendMobileNumber()
	{
	 
		MobileNumber.sendKeys("8600315002");
	}
	



	public void SendPassword()
	{
		Password.sendKeys("5002");
	}
	
	public void ClickOnLogIN()
	{
		LogIN.click();
	}

}
