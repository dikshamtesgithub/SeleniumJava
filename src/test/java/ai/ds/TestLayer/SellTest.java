package ai.ds.TestLayer;

import org.testng.annotations.Test;

import ai.ds.testBase.TestBase;
import ai.ds.utility.UtilClass;

public class SellTest extends TestBase{
	
	@Test()
	public void ToverifySell_1() throws InterruptedException
	{
		dash.enterCompanyName("Wipro");
		dash.clickOnButton();
		Thread.sleep(3000);	
		ex.clickOnSellButton1();
		Thread.sleep(2000);
		ex.enterQuantityOFShare("2"); 
		Thread.sleep(2000);
		
		UtilClass.scrollby();
		ex.clickOnSellButton2();
		Thread.sleep(2000);
		System.out.println(ex.getstatus());	
		
	}
	
	@Test(enabled=false)
	public void RoVerifySell_2() throws InterruptedException
	{
		dash.enterCompanyName("wipro");
		dash.clickOnButton();
		Thread.sleep(3000);	
		ex.clickOnSellButton1();
		ex1.selectCustom();
		ex.enterQuantityOFShare("1"); 
		Thread.sleep(2000);
		UtilClass.scrollby();
		ex.clickOnSellButton2();
		Thread.sleep(2000);
		System.out.println(ex.getstatus());	
	}
	
	@Test(enabled=false)
	public void RoVerifySell_3() throws InterruptedException
	{
		dash.enterCompanyName("Wipro");
		dash.clickOnButton();
		Thread.sleep(3000);	
		ex.clickOnSellButton1();
		ex.clickOnIntraday();
		ex.enterQuantityOFShare("1"); 
		Thread.sleep(2000);
		UtilClass.scrollby();
		ex.clickOnSellButton2();
		Thread.sleep(2000);
		System.out.println(ex.getstatus());	
	}
	
	@Test
	public void RoVerifySell_4() throws InterruptedException
	{
		dash.enterCompanyName("wipro ");
		dash.clickOnButton();
		Thread.sleep(3000);	
		ex.clickOnSellButton1();
		ex.clickOnIntraday();
		ex.clickOncustom();
		ex.enterQuantityOFShare("1"); 
		Thread.sleep(2000);
		UtilClass.scrollby();
		ex.clickOnSellButton2();
		Thread.sleep(2000);
		System.out.println(ex.getstatus());	
	}
	
	
	
	
	

	
}
