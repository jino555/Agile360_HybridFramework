package com.seleniumdata.zmartano;

import org.openqa.selenium.By;
import org.testng.annotations.AfterTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.seleniumdatadriven.base.basetest;
import com.seleniumhybrid.utils.Constants;


public class LoanDetails extends basetest {
	
	 
	  @Test(dataProvider = "testdata")
	  public void verifylogin(String username ,String password ) throws Exception {
		  
		  //ConfigReader();
		  driver.findElement(By.xpath(pro.getProperty("account_xpath"))).click();
		  driver.findElement(By.xpath(pro.getProperty("username_xpath"))).sendKeys(username);
		  driver.findElement(By.id(pro.getProperty("password_id"))).sendKeys(password);
		  
	  }
	   
	  
	  
	  
	   @DataProvider(name = "testdata")
	   public Object [][] getdata(){
		   
		  
		   Object data [][] = testdata(Constants.path_TestData, Constants.sheet_TestData);
		   
		   return data;
	   }
		   
		   
	
	



	   
	   
	   
	
	
	
	
	
	
	
	
	
	
	
	
	

	
	
			      
			      
 
			      
			      
	     
   /*@BeforeTest
	    public  void beforetest() throws Exception { 
    	           
	              driver = Browser.GetBrowser();
	             
	              
	       
	   
       }
*/
 

			   /*   @DataProvider(name = "testdata")
				  
				   public Object [][] getdata(){
					  
					   Object data [][] = testdata(Constants.path_TestData, Constants.sheet_TestData);
					   
					   return data;
			      }
 
  
         @Test(dataProvider = "testdata")
  
   
		 public  void VerifyLoanDetails(String username) throws Exception {
    	 System.setProperty("webdriver.chrome.driver", "E:\\Jino_testing\\Test Automation\\Chrome_driver\\chromedriver.exe");
    	// setup();
         driver = new ChromeDriver();
         String baseurl = "http://store.demoqa.com/";
         driver.get(baseurl);
    	System.out.println("data loaded");
	driver.findElement(By.xpath("//a[@class='account_icon']")).click();
	driver.findElement(By.xpath(".//*[@id='log']")).sendKeys(username);
		 
 
	}
}
    
*/










 

	 @AfterTest
  public void afterTest() {
	  
  }
  
}



 




 

