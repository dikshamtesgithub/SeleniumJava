package ai.ds.utility;

import java.io.IOException;


import org.testng.ITestListener;
import org.testng.ITestResult;
import ai.ds.testBase.TestBase;

public class ListenerSetup extends TestBase implements ITestListener {

	@Override
	public void onTestStart(ITestResult result) {
		logger.info("TestCase execution started:"+ result.getName());
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		logger.info("TestCase execution completed:"+ result.getName());
	}

	@Override
	public void onTestFailure(ITestResult result) {
		
		logger.info("TestCase execution failed" + result.getName());
		
		try {
			UtilClass.takeScreenshot(result.getName()+System.currentTimeMillis());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}																													
 logger.info("Take a screenshot");
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		System.out.println("TestCase execution skipped"+ result.getName());
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		
	}

	@Override
	public void onTestFailedWithTimeout(ITestResult result) {
		System.out.println("TestCase execution timeout"+ result.getName());
	}

	   
	    
}
