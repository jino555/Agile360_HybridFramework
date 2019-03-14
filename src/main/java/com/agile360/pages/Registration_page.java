//Userspage_locators

package com.agile360.pages;


import java.io.IOException;
import java.util.Random;
import java.util.UUID;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterTest;

import com.agile360.base.basetest;
import com.agile36p.utils.TestUtil;


public class Registration_page extends basetest {
	
	
	
	
	String url = pro.getProperty("stagingurl");
	 
	//POM with PageFactory
	
	
	 
	 @FindBy (xpath = "//*[@id='carousel1___BV_indicator_2_']")
	 WebElement newuser;
	 
	 
	 @FindBy (how=How.ID , using="txtName")
	 @CacheLookup
	 WebElement name;
	 
	 
	 @FindBy (how=How.ID , using="txtRegEmail")
	 @CacheLookup
	 WebElement email;
	 
	 @FindBy (id ="txtPhone")
	  WebElement phone;
	 
	 
	 
	 @FindBy (id = "txtRegPassword")
	 WebElement password;
	 
	 
	 @FindBy (id = "txtConfirmPassword")
	  WebElement confirm_password;
	 
	
	 
	 @FindBy(xpath = "//input[@type='submit']")
	 WebElement submit;
			 
			 
	 //Intialising PageObjects
	 
	 public Registration_page() {
		 
		 PageFactory.initElements(driver, this);
		 
		 
	 }
	
	 
	 //Actions
	 
		
			 
	 
	public  void registration(String nm,String em, String pn, String pw, String cpw) throws IOException, Exception {
		
	
	   
		
			
		   basetest.extenttest.info("Navigated to " +url);
			
		     newuser.click();
		     basetest.extenttest.info("Clicked on New User");
		     Thread.sleep(3000);
			    
		  
		    name.sendKeys(nm);
		    basetest.extenttest.info("Name entered " +nm);
		    Thread.sleep(3000);
		    
		    email.sendKeys(TestUtil.randomEmail());
		    basetest.extenttest.info("Email entered " +TestUtil.randomEmail());
		  
		    phone.sendKeys(pn);
		    basetest.extenttest.info("Phone number entered " +pn );
		   
		    
		    password.sendKeys(pw);
		    basetest.extenttest.info("Password entered " +pw);
		    
		    
		    confirm_password.sendKeys(cpw);
		    basetest.extenttest.info("Confirmpassword entered " +cpw);
		     
		     
			
	 
	
	 
	}
	 
}
 

 


