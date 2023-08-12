package ai.ds.pageLayer;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import ai.ds.testBase.TestBase;

public class ExchangePage extends TestBase {
	
	public ExchangePage()
	{
		PageFactory.initElements(driver, this);
	}
  
  //------------ obj repo --------
	@FindBy(xpath="//a[contains(text(),'Buy')]") 
	private WebElement buy_btn1;
	
	@FindBy(xpath="//input[@name='input-Qunatity']") 
	private WebElement quantity_txt;
	
	@FindBy(xpath="//button[contains(text(),'Buy')]")
	private WebElement buy_btn2;
	
	@FindBy(xpath="//div[text()='Order Created successfully']")
	private WebElement status_msg;
	
	
	//--------------------sell------------------
	
	@FindBy(xpath="//a[contains(text(),'Sell')]")
	private WebElement sell_btn1;
	
	@FindBy(xpath="//button[contains(text(),'Sell')]")
	private WebElement sell_btn2;
	
	@FindBy(xpath="(//label[contains(text(),'Custom Limit')])[2]")
	private WebElement custom_btn;
	
	@FindBy(xpath="//label[contains(text(),'Intraday')]")
	private WebElement Intaday;
	
	
	
	public void clickOnSellButton1()
	{
		sell_btn1.click();
	}
	
	public void clickOnSellButton2()
	{
		sell_btn2.click();
	}
	
	public void clickOnIntraday()
	{
		Intaday.click();
	}
	public void clickOncustom()
	{
		custom_btn.click();
	}
	
	
	
  //------ action method ---------
	
	public void clickOnBuyBtn1()
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
	 
	 js.executeScript("window.scrollBy(0,4600)");
	}
	
	
}
