package com.zmarta.base;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.zmarta.utils.WebEventListener;
import com.zmarta.utils.TestUtil;

public class basetest {
	
	 public static Properties pro;
	 public static  File src;
	 public static WebDriver driver;
	 public  static EventFiringWebDriver e_driver;
	 public static WebEventListener eventListener;
	 
	 
	 
	 
	
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
	
	
	
	
	
	
	
	
	
	
	
	
   
   
   
}
	
	
	
	
	 

   
	 
	 
	 
	 
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	


