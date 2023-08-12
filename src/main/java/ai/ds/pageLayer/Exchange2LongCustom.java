package ai.ds.pageLayer;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import ai.ds.testBase.TestBase;

public class Exchange2LongCustom extends TestBase{
  // Longterm - custom
	public Exchange2LongCustom()
	{
		PageFactory.initElements(driver, this);
	}
  
  //------------ obj repo --------
	@FindBy(xpath="//a[contains(text(),'Buy')]") 
	private WebElement buy_btn1;
	
	@FindBy(xpath="//label[text()='Custom Limit']")
	private WebElement Custom_sel;
	;
	
	@FindBy(xpath="//input[@name='input-Qunatity']") 
	private WebElement quantity_txt;
	
	@FindBy(xpath="//button[contains(text(),'Buy')]")
	private WebElement buy_btn2;
	
	@FindBy(xpath="//div[text()='Limit Order Created Successfully']")
	private WebElement status_msg;
	
	
	//label[text()='Custom Limit']
	
  //------ action method ---------
	
	public void clickOnBuyBtn1()
	{
		Custom_sel.click();
	}
	

	
	public void selectCustom()
	{
		buy_btn1.click();
	}
	
	public void enterQuantityOFShare(String count)
	{
		quantity_txt.click();
		quantity_txt.sendKeys(count);
	}
	public void clickOnBuyBtn2()
	{
		buy_btn2.click();
	}

	public String getstatus()
	{
		String txt = status_msg.getText();
		return txt;
	}
	
	public void scrollby()
	{
	 JavascriptExecutor js = (JavascriptExecutor)driver;                      //casting of JavascriptExecutor
	 
	 js.executeScript("window.scrollBy(0,4700)");
	}
	
	
}
