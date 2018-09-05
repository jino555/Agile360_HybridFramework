package com.seleniumdata.zmartano;

import java.util.logging.Logger;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.seleniumhybrid.utils.Log;


public class Loan_page {

	 WebDriver driver;
	
 

 
  public  Loan_page(WebDriver driver) {
	  
	  
	  this.driver = driver;
	  
  }

	 
	 public   void Loan (String username, String password, String search  ) throws Exception {
		


		 Log.startTestCase("Account Test Case started");
	 
		 driver.findElement(By.xpath("//a[@class='account_icon']")).click();
		 Log.info("My Account link is clicked");
		 
		 driver.findElement(By.xpath("//input[@id='log']")).sendKeys(username);
		 Log.info(username);
		 
	     driver.findElement(By.xpath("//input[@id='pwd']")).sendKeys(password);
	     Log.info(password);
	     
	     driver.findElement(By.xpath("//input[@class='search']")).sendKeys(search);
	     Log.info(search);
	     
	    Log.endTestCase("Account Test Case ended ");
	   
	 }
	 
	 
	 
	 
	 
	 
	 
}
