package com.zmarta.base;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.reflect.Method;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.zmarta.utils.WebEventListener;



import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.ChartLocation;
import com.aventstack.extentreports.reporter.configuration.Theme;
import com.zmarta.utils.TestUtil;

public class basetest {
	
	 public static Properties pro;
	 public static  File src;
	 public static WebDriver driver;
	 public  static EventFiringWebDriver e_driver;
	 public static WebEventListener eventListener;
	public ExtentHtmlReporter htmlreporter;
	public static ExtentReports extent;
	public static ExtentTest parenttest;
	public static ExtentTest childtest;
	// public String url;
	
	
	public basetest() {
		
		
		       try {
					pro = new Properties();
					src = new File ("./src/test/resources/config.properties");
					FileInputStream fis = new  FileInputStream(src);
					pro.load(fis);
					System.out.println("Property file loaded");
					
				}
		       
		        catch (FileNotFoundException e) {
		        	
				      e.printStackTrace();
				
				} 
		        catch (IOException e) {	
					
					e.printStackTrace();
				}
		
			
			
	
	}
	
	
	@Parameters("browser")
	@BeforeTest
	 public   void BrowserInitialisation(String browser) throws Exception {
	
		
	if(browser.equalsIgnoreCase("chrome"))
	{
		System.setProperty("webdriver.chrome.driver", pro.getProperty("ChromeDriver"));
        driver = new ChromeDriver();
        System.out.println(" Browser is " +browser);
      
        
        
        
	}
	
	
        else if (browser.equalsIgnoreCase("firefox"))
    	{
    		System.setProperty("webdriver.gecko.driver", pro.getProperty("GeckoDriver"));
            driver = new FirefoxDriver(); 
            System.out.println(" Browser loaded  is " +browser);
            
            
    	}
	
	    e_driver = new EventFiringWebDriver(driver);
	// create object of EventListerHandler to register it with EventFiringWebDriver
	   eventListener = new WebEventListener();
	   e_driver.register(eventListener);
	   driver = e_driver;
	   
	      
        
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_WAIT, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(TestUtil.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
        
        
        driver.get(pro.getProperty("url"));
       
        
		
	}
	

	   
	  @BeforeTest
	   public void report() throws FileNotFoundException {
		   
		    
		    //htmlreporter = new ExtentHtmlReporter("AutomationReport.html");
		    htmlreporter = new ExtentHtmlReporter("./test-output/AutomationReport.html");
		    htmlreporter.config().setDocumentTitle("Project Result");
		    htmlreporter.config().setReportName("ZMARTA AUTOMATION REPORT");
	        htmlreporter.config().setTestViewChartLocation(ChartLocation.TOP);
	        htmlreporter.config().setTheme(Theme.DARK);
	    
	        extent = new ExtentReports();
	        extent.setSystemInfo("OS", "Windows 10");
	        
	        extent.setSystemInfo("Environment", "QA");
	        extent.setSystemInfo("User Name", "Jino Philip");
	        extent.setSystemInfo("Host Name ", "Jino Philip");
			extent.attachReporter(htmlreporter);
		   
	   }
	   
	@BeforeMethod
	   
	   public void methodname (Method method) {
		   
		   
		   parenttest = extent.createTest(method.getName());
		   
		   
	   }
	
	@AfterTest
	
	public void end() {
		
		extent.flush();
		

		
	}
	
	
	
	@AfterMethod
	public void tearDown(ITestResult result) throws IOException
	{
		
		if(result.getStatus()==ITestResult.FAILURE)
		{
			String temp=TestUtil.getScreenshot(driver);
			
			childtest.fail(result.getThrowable().getMessage(), MediaEntityBuilder.createScreenCaptureFromPath(temp).build());
		}
		
		else if(result.getStatus()==ITestResult.SKIP){
			childtest.log(Status.SKIP, "Test Case SKIPPED IS " + result.getName());
		}
		else if(result.getStatus()==ITestResult.SUCCESS){
			childtest.log(Status.PASS, "Test Case PASSED IS " + result.getName());

		}
	    extent.flush();
		//driver.quit();
		
	}
		
   
   

}