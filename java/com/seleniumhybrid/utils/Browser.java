package com.seleniumhybrid.utils;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Browser {

	 private static WebDriver driver;

	  public static WebDriver GetBrowser() 
	  {
	  	if (driver != null) return driver;
	          else {
	        	  
	        	  Log.info("Driver Initiated");
	        	  System.setProperty("webdriver.chrome.driver", Constants.chromedriver);
	        	  driver = new ChromeDriver();
                  driver.get(Constants.URL);
                  Log.info("Application Opening");
	        	  driver.manage().window().maximize();
	      
	              return driver;
	              
	          }     
	      }
   
}



