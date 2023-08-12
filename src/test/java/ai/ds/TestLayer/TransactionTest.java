package ai.ds.TestLayer;

import org.testng.annotations.Test;



import ai.ds.pageLayer.Dashboard;
import ai.ds.pageLayer.LoinPage;
import ai.ds.pageLayer.Trasaction;
import ai.ds.testBase.TestBase;

public class TransactionTest extends TestBase {
	
	@Test
	
	public void VerifyGetTransDetails() throws InterruptedException
	{
		
		
		//---------------------------------------------
		/*login.enterEmail("amarwaghmare573@gmail.com");
		login.enterPassword("Test@1234");
		login.clickOnButton();
		Thread.sleep(4000);*/
		
		//---------------------------------------------
		dash.clickOnTransactionDetails();
		Thread.sleep(4000);
		trans.getTransactionDetails();
		
	}
}
