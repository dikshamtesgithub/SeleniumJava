package ai.ds.TestLayer;

import org.testng.annotations.Test;

import ai.ds.pageLayer.Dashboard;

import ai.ds.pageLayer.Exchange3IntraCust;
import ai.ds.pageLayer.LoinPage;
import ai.ds.testBase.TestBase;
import ai.ds.utility.UtilClass;

public class ByuFunc3 extends TestBase {

	@Test
	public void VerifyBuyFunctionality3() throws InterruptedException
	{
		
//      //-------- Login----
//		LoinPage login = new LoinPage();
//		Dashboard dash = new Dashboard();
		Exchange3IntraCust  ex3= new Exchange3IntraCust();
//		
//	//--------- --------
//		login.enterEmail("amarwaghmare573@gmail.com");
//		login.enterPassword("Test@1234");
//		login.clickOnButton();
//		Thread.sleep(4000);
		
	//-----------------------

		dash.enterCompanyName("wipro");
		dash.clickOnButton();
		Thread.sleep(3000);
		
	//------------------------
		ex3.clickOnBuyBtn1();
		ex3.selectIntraday();
		ex3.enterQuantityOFShare("1"); 
		Thread.sleep(3000);
		UtilClass.scrollby();
		//Thread.sleep(2000);
		ex.clickOnBuyBtn2();
		Thread.sleep(2000);
		System.out.println(ex.getstatus());
		
	}
		

}
