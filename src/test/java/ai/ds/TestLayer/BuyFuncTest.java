package ai.ds.TestLayer;

import org.testng.annotations.Test;

import ai.ds.pageLayer.Dashboard;
import ai.ds.pageLayer.ExchangePage;
import ai.ds.pageLayer.LoinPage;
import ai.ds.testBase.TestBase;
import ai.ds.utility.UtilClass;

public class BuyFuncTest extends TestBase {
	
	@Test
	
	public void VerifyBuyFunctionalityWipro() throws InterruptedException
	{
			
	//--------- --------
//		login.enterEmail("amarwaghmare573@gmail.com");
//		login.enterPassword("Test@1234");
//		login.clickOnButton();
//		Thread.sleep(4000);
	//-----------------------
		
		dash.enterCompanyName("wipro");
		dash.clickOnButton();
		Thread.sleep(3000);
	//-------------------------------
		ex.clickOnBuyBtn1();
		ex.enterQuantityOFShare("1"); 
		
		UtilClass.scrollby();
		Thread.sleep(2000);
		ex.clickOnBuyBtn2();
		Thread.sleep(2000);
		System.out.println(ex.getstatus());	
			
	}
	
	
	@Test
	public void VerifyBuyFunctionalityAxis() throws InterruptedException
	{
//		
//      //-------- Login----
//		LoinPage login = new LoinPage();
//		Dashboard dash = new Dashboard();
//		ExchangePage  ex= new ExchangePage();
//	//--------- --------
//		login.enterEmail("amarwaghmare573@gmail.com");
//		login.enterPassword("Test@1234");
//		login.clickOnButton();
//		Thread.sleep(4000);
//	//-----------------------
		
		dash.enterCompanyName("Axis");
		dash.clickOnButton();
		Thread.sleep(4000);
	//------------------------
		ex.clickOnBuyBtn1();
		ex.enterQuantityOFShare("1"); 
		
		UtilClass.scrollby();
		ex.clickOnBuyBtn2();
		Thread.sleep(2000);
		System.out.println(ex.getstatus());	
			
	}
}















