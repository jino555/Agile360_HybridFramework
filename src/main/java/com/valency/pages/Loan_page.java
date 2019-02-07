package com.zmarta.pages;


import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterTest;


import com.zmarta.base.basetest;
import com.zmarta.utils.TestUtil;


public class Loan_page extends basetest {
	
	
	
	
	String url = pro.getProperty("url");
	 
	//POM with PageFactory
	
	
	 
	@FindBy (xpath = "//a[@class='account_icon']")
	 WebElement account_link;
	 
	 
	 @FindBy (how=How.XPATH , using=".//*[@id='log']")
	 @CacheLookup
	 WebElement username;
	 
	 
	 @FindBy (id = "pwd")
	 WebElement password;
	 
	 
	 @FindBy (id = "login")
	  WebElement submit_button;
	 
	 @FindBy (xpath ="//img[@alt='home']")
	  WebElement logo;
	 
	 
	 @FindBy(css = "input#rememberme")
	 WebElement remember_checkbox;
			 
			 
	 //Intialising PageObjects
	 
	 public Loan_page() {
		 
		 PageFactory.initElements(driver, this);
		 
		 
	 }
	
	 
	 //Actions
	 
	 
	public  void Login(String un, String pw) throws IOException {
		
		 
	   
		
			
		   basetest.extenttest.info("Navigated to " +url);
			
		    account_link.click();
			basetest.extenttest.info("Account clicked");
			
			username.sendKeys(un);
			basetest.extenttest.info("username entered " +un);
			
			password.sendKeys(pw);
			basetest.extenttest.info("Password entered  "+pw);
		
		
			
		
	 }
	 
	//Actions
	 
	 public boolean logo () {
		 
		 
    
	 boolean flag = logo.isDisplayed();
	 basetest.extenttest.info("Logo is Verified");
	
	 return flag;
	
	 }
	 
	 
	 
	//Actions
	 public boolean checkbox() {
		 
		 boolean enabled_status = remember_checkbox.isSelected();
		 basetest.extenttest.info("Remember_me checkbox  enabled is   " +enabled_status);
		 remember_checkbox.click();
		 return enabled_status;
		 
	 }
	 
	 
	 
	 
	 
	
	 
	 
	 
	 
}
 

 


