package ai.ds.TestLayer;

import org.testng.annotations.Test;

import ai.ds.pageLayer.Dashboard;
import ai.ds.pageLayer.Exchange2LongCustom;

import ai.ds.pageLayer.LoinPage;
import ai.ds.testBase.TestBase;
import ai.ds.utility.UtilClass;

public class BuyFuncTest2 extends TestBase {

	//longterm-custom
	
	@Test
	public void VerifyBuyFunctionality2() throws InterruptedException
	{
		
//      //-------- Login----
//		LoinPage login = new LoinPage();
//		Dashboard dash = new Dashboard();
//		Exchange2LongCustom  ex= new Exchange2LongCustom();
//		
//	//--------- --------
//		login.enterEmail("amarwaghmare573@gmail.com");
//		login.enterPassword("Test@1234");
//		login.clickOnButton();
//		Thread.sleep(4000);
//		
//	//-----------------------

		dash.enterCompanyName("wipro");
		dash.clickOnButton();
		Thread.sleep(3000);
		
	//------------------------
		ex1.clickOnBuyBtn1();
		ex1.selectCustom();
		ex1.enterQuantityOFShare("1"); 
		Thread.sleep(2000);
		UtilClass.scrollby();
		ex1.clickOnBuyBtn2();
		Thread.sleep(2000);
		System.out.println(ex.getstatus());
		
		
		
		
	}
	
}
