package com.zmarta.testcases;

import static org.testng.Assert.assertTrue;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


import com.zmarta.base.basetest;
import com.zmarta.pages.Loan_page;
import com.zmarta.utils.Constants;

import com.zmarta.utils.TestUtil;


public class LoanPagetest extends basetest {
	
	 Loan_page login;
	 
	   
	
	/*public LoanPagetest() {
		
		
		super();
		
	}
	*/
	
	@BeforeMethod
	public void setup() {
	    
		
		login = new Loan_page();
		
		
	}
	
	
	
	  @Test(priority=0,dataProvider = "testdata")
	  
	  public void VerifyLogin(String username, String password) throws Exception  {
		 
	     
		  basetest.extenttest =  basetest.extenttest.createNode("VerifyLogin");
		  
         login.Login(username, password);	
       
         
	  }
		 
		 
		 
	 @Test(priority=1)
	 
	 public void VerifyLogo() {
		 
		 basetest.extenttest =  basetest.extenttest.createNode("VerifyLogo");
		 
		 boolean displayed_status = login.logo();
	     Assert.assertTrue(displayed_status);
	   	
	 }	 
		 
	 
       @Test(priority=2)
        public void VerifyCheckbox() {
			  
    	   basetest.extenttest =  basetest.extenttest.createNode("VerifyCheckbox");
    	   boolean enabled_status  = login.checkbox();
		
		Assert.assertEquals(false, enabled_status);
		  
       }
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
	  
	   
	  
	  
	 
	   @DataProvider(name = "testdata")
	   public Object [][] getdata(){
		   
		   
		   Object data [][] = TestUtil.testdata(Constants.path_TestData, Constants.sheet_TestData);
		   
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




 

