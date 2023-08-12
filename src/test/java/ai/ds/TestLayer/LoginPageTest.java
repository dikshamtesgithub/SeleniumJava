package ai.ds.TestLayer;

import org.testng.Assert;
import org.testng.annotations.Test;

import ai.ds.pageLayer.LoinPage;
import ai.ds.testBase.TestBase;

public class LoginPageTest extends TestBase {

	String expected_url="https://www.apps.dalalstreet.ai/dashboard";
	
	@Test
	
	public void verifyLoginId() throws InterruptedException
	{
		/*LoinPage login = new LoinPage();
		login.enterEmail("amarwaghmare573@gmail.com");
	    login.enterPassword("Test@1234");
		login.clickOnButton();
		Thread.sleep(4000);*/
		
		
		String actual_url=login.getCurUrl();
		
		Assert.assertEquals(actual_url, expected_url);
		
	
		
	}
	
	
	
}

