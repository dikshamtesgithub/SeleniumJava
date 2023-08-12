package ai.ds.pageLayer;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import ai.ds.testBase.TestBase;

public class LoinPage extends TestBase {
	
	
	public LoinPage()
	{
		PageFactory.initElements(driver,this);
	}
	
 // ----------- obj repo----
	
	@FindBy(xpath="//input[@name='email']")
	private WebElement email_txt;
	
	@FindBy(xpath="//input[@name='password']")
	private WebElement password_txt;
	
	@FindBy (xpath="//button[text()='Log In']")
	private WebElement login_btn;
	
//---------Action method---------
	
	public void enterEmail(String email)
	
	{
		email_txt.sendKeys(email);
	}
	
	public void enterPassword(String pass)
	{
		password_txt.sendKeys(pass);
	} 
	
	public void clickOnButton()
	{
		login_btn.click();
	}
	
	public String getCurUrl()
	{
		String url = driver.getCurrentUrl();
		return url;
	}
	
	
	
}
