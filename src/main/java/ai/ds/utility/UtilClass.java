package ai.ds.utility;

import java.io.File;


import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import ai.ds.testBase.TestBase;

public class UtilClass extends TestBase {
	public UtilClass()
	{
		PageFactory.initElements(driver,this);
	}
	
	
	public static void takeScreenshot(String Filename) throws IOException
	{
	try
	   {
		
		String path="C:\\Users\\usere\\eclipse-workspace\\MyDemoDalalStreet\\Screenshot\\";
		TakesScreenshot ts = (TakesScreenshot)driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File des  = new File(path+ Filename+".png");
		FileHandler.copy(src, des);
		}
		catch (IOException e) 
		{
			System.out.println("IO Exception - file not found");
			e.printStackTrace();
		}
		
		
	}
	
	public static void scrollby()
	{
		JavascriptExecutor js = (JavascriptExecutor)driver;                      //casting of JavascriptExecutor
		 
		 js.executeScript("window.scrollBy(0,400)");
	}
	
	
   


	

}
