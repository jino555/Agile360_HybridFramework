package com.seleniumdatadriven.base;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.seleniumhybrid.utils.ExcelUtil;

public class basetest {
	
	 public static Properties pro;
	 public static  File src;
	 public static WebDriver driver;
	
	 
	 
	 @BeforeTest
	public static void ConfigReader() throws Exception {
		
		  
	      
		
			pro = new Properties();
			src = new File ("./src/test/resources/config.properties");
			FileInputStream fis = new  FileInputStream(src);
			
			pro.load(fis);
			System.out.println("Property file loaded");
	
	}
	 
	 
	
	@Parameters("browser")
	@BeforeTest
	 public   void GetBrowser(String browser) throws Exception {
	
	
	if(browser.equalsIgnoreCase("chrome"))
	{
		System.setProperty("webdriver.chrome.driver", pro.getProperty("ChromeDriver"));

        driver = new ChromeDriver();
        String baseurl = pro.getProperty("url");
        driver.get(baseurl);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		System.out.println(" Browser is " +browser);
		
		
	}
	
	else if(browser.equalsIgnoreCase("firefox"))
	{
		System.setProperty("webdriver.gecko.driver", pro.getProperty("GeckoDriver"));

        driver = new FirefoxDriver();
        String baseurl = pro.getProperty("url");
        driver.get(baseurl);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		System.out.println(" Browser is " +browser);
		
	}
	
	
	
	
	
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	 /*public   void GetBrowser() throws Exception {
			
		  	
		        	 
		              System.setProperty("webdriver.chrome.driver", pro.getProperty("ChromeDriver"));

		              driver = new ChromeDriver();
		              String baseurl = pro.getProperty("url");
		              driver.get(baseurl);
		              driver.manage().window().maximize();
		              driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		              System.out.println("Browser loaded");
		             
		              
		          }     
	
	*/
	
	

    public static Object[][] testdata(String excelpath, String sheetname) {
		
		
		
		ExcelUtil excel = new ExcelUtil(excelpath, sheetname);
		int  RowCount = excel.getRowcount();
		int ColCount =  excel.getColcount();
		
		Object data  [][] = new Object[RowCount-1][ColCount];
		
		for (int i=1;i<RowCount;i++) {
			
			for (int j=0;j<ColCount; j++) {
				
				
				
				String celldata = ExcelUtil.getCelldataString(i, j);
				System.out.println("Exceldata is  "  +celldata) ;
		        data[i-1][j]= celldata;
				
				
			}
		
		
		
		
		}
		
		
		return data;
		
	}	
	 
	 
	 
	 }
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	


