package POM_Classes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogOutPage {
	WebDriver driver;
	
	@FindBy (xpath="//div[text()='My Account']")
	private WebElement myAccount;
	
	@FindBy (xpath="//div[text()='Logout']")
	private WebElement LogOut;
	
	public LogOutPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	public void ClickOnMyAccount()
	{
		Actions act = new Actions(driver);
		act.moveToElement(myAccount).perform();
	}
	
	public void ClickOnlogOut()
	{
		LogOut.click();
	}

}
