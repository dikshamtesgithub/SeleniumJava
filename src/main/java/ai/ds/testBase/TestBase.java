package ai.ds.testBase;

import java.time.Duration;


import java.util.logging.Logger;

import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import ai.ds.pageLayer.Dashboard;
import ai.ds.pageLayer.Exchange2LongCustom;
import ai.ds.pageLayer.ExchangePage;
import ai.ds.pageLayer.LoinPage;
import ai.ds.pageLayer.Trasaction;
import io.github.bonigarcia.wdm.WebDriverManager;

public class TestBase {
	
	public static WebDriver driver;
	public static Logger logger;
	
     public LoinPage  login; 
	 public  Dashboard dash ;
     public ExchangePage ex;
     public Trasaction trans;
     public  Exchange2LongCustom ex1;
     
    @BeforeClass
	public void start()
	{
		 logger = Logger.getLogger("DalalStreet Auto framework");
		 PropertyConfigurator.configure("Log4j.properties");
		 
		 logger.info("framework execution started");
	}

	
	@AfterClass
	public void end()
	{
		logger.info("framework execution completed");
	}
	
	
	
	@Parameters("browser")
	@BeforeMethod
	public void setup(String br) throws InterruptedException        // String br = "chrome"
	{
	                                                                         
	  
	  if(br.equalsIgnoreCase("Chrome"))
	  {
	  WebDriverManager.chromedriver().setup();
	  driver = new ChromeDriver();
	  }
	  else  if(br.equalsIgnoreCase("firefox"))
	  {
	  WebDriverManager.chromedriver().setup();
	  driver = new FirefoxDriver();
	  }
	  else  if(br.equalsIgnoreCase("edge"))
	  {
	  WebDriverManager.chromedriver().setup();
	  driver = new EdgeDriver();
	  }
	  else
	  {
		  System.out.println("Please provide correct browser");
	  }
	  
	//----------luanch---
	  
	  driver.get("https://www.apps.dalalstreet.ai/login");
		driver.manage().window().maximize();
		//driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		logger.info("url launches, maximize, and provided waits");
	  
	  //-------obj creation---------
	    login = new LoinPage();
	    dash = new Dashboard();
	    ex= new ExchangePage();
	    trans = new Trasaction();
	    ex1= new Exchange2LongCustom();
		logger.info("Object Creation");
	  
	//---------- Login steps -----------
	    login.enterEmail("amarwaghmare573@gmail.com");
		login.enterPassword("Test@1234");
		login.clickOnButton();
		Thread.sleep(4000);
		logger.info("login successfully");
	}
	
	   @AfterMethod
	   private void tearDown()
	   {
		//driver.quit();
	   }
		
	

}
