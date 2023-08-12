package ai.ds.pageLayer;

import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;

import ai.ds.testBase.TestBase;

public class Trasaction extends TestBase {
	
	
	public Trasaction()
	{
		PageFactory.initElements(driver,this);
	}
	
	//----------- obj repo-----
		private By data1 = By.xpath("//table/tbody/tr[1]/td[2]"); 
	
//
//		public String getTrans1()
//		{
//	      String data =driver.findElement(data1).getText();
//				return data;
//		}
//		
		
	public void getTransactionDetails()
	{
		for(int i=1;i<=10;i++)
		{
			for(int j=1;j<=9;j++)
			{
				String data = driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td["+j+"]")).getText();
	             System.out.println(data + "  ");
			}
             // System.out.println();
			
		}
	}
}
