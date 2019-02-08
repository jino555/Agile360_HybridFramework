//Userspage_locators

package com.valency.pages;


import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterTest;

import com.valency.base.basetest;
import com.valency.utils.TestUtil;


public class users_page extends basetest {
	
	
	
	
	String url = pro.getProperty("stagingurl");
	 
	//POM with PageFactory
	
	
	 
	 @FindBy (id = "name")
	 WebElement name;
	 
	 
	 @FindBy (how=How.ID , using="userid")
	 @CacheLookup
	 WebElement username;
	 
	 
	 @FindBy (id = "password")
	 WebElement password;
	 
	 
	 @FindBy (id = "confirm_password")
	  WebElement confirm_password;
	 
	 @FindBy (id ="select-hub-list")
	  WebElement hub_id;
	 
	 
	 @FindBy(xpath = "//input[@type='submit']")
	 WebElement submit;
			 
			 
	 //Intialising PageObjects
	 
	 public users_page() {
		 
		 PageFactory.initElements(driver, this);
		 
		 
	 }
	
	 
	 //Actions
	 
	 
	 
	public  void userdetails(String nm, String un, String pw, String cpw) throws IOException {
		
		 
	   
		
			
		   basetest.extenttest.info("Navigated to " +url);
			
		  
		    name.sendKeys(nm);
		    basetest.extenttest.info("Name entered " +nm);
		    
		    
		    username.sendKeys(un);
		    basetest.extenttest.info("Username entered " +un);
		    
		    
		    password.sendKeys(pw);
		    basetest.extenttest.info("Password entered " +pw);
		    
		    
		    confirm_password.sendKeys(cpw);
		    basetest.extenttest.info("Confirmpassword entered " +cpw);
		     
		     
			
	 
	
	 
	}
	 
}
 

 


