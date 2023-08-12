package ai.ds.pageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import ai.ds.testBase.TestBase;

public class Dashboard extends TestBase {

	   public Dashboard()
	   {
		   PageFactory.initElements(driver,this);
	   }
	 
	//--------- obj repo-------------------
	   @FindBy(xpath="(//input[@class='form-control'])[1]")
	   private WebElement Serchbox_txt;
	   
	   @FindBy(xpath="(//div[contains(@class,'m-4 card')])[2]")
		private WebElement option;
	   
	   @FindBy(xpath="//a[text()='Transactions']")
	 		private WebElement transaction_link;
	   
//	   
//	   @FindBy(xpath="(//a[text()='WIPRO'])[2]")
//	   private WebElement wipro_option;
	   
   //--------- action method -----
	   
	   public void enterCompanyName(String name)
	   {
		   Serchbox_txt.sendKeys(name);
	   }
	   
	   public void clickOnButton()
	   {
		   option.click(); 
	   }
	   
	   public void clickOnTransactionDetails()
	   {
		   transaction_link.click();
	   }
	   
	   

}
