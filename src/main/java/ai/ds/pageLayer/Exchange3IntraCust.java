package ai.ds.pageLayer;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import ai.ds.testBase.TestBase;

public class Exchange3IntraCust extends TestBase {
	
	
	public Exchange3IntraCust()
	{
		PageFactory.initElements(driver, this);
	}
  
  //------------ obj repo --------
	@FindBy(xpath="//a[contains(text(),'Buy')]") 
	private WebElement buy_btn1;
	
	@FindBy(xpath="//label[text()='Intraday']")
	private WebElement Intra_sel;
	;
	
	@FindBy(xpath="//input[@name='input-Qunatity']") 
	private WebElement quantity_txt;
	
	@FindBy(xpath="//button[contains(text(),'Buy')]")
	private WebElement buy_btn2;
	
	@FindBy(xpath="//div[text()='Order Created successfully']")
	private WebElement status_msg;
	
	
	//label[text()='Custom Limit']
	
  //------ action method ---------
	
	public void clickOnBuyBtn1()
	{
		buy_btn1.click();
	}
	

	
	public void selectIntraday()
	{
		Intra_sel.click();
	}
	
	public void enterQuantityOFShare(String count)
	{
		quantity_txt.click();
		quantity_txt.sendKeys(count);
	}
	public void clickOnBuyBtn2()
	{
//		 WebElement elem = driver.findElement(By.xpath("\"//button[contains(text(),'Buy')]\""));
//
//	    int width = elem.getSize().getWidth();
//
//	    Actions act = new Actions(driver);
//	    act.moveToElement(elem).moveByOffset((width/2)-2, 0).click().perform();
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
	 
	 js.executeScript("window.scrollBy(0,2700)");
	}
	
	

}
