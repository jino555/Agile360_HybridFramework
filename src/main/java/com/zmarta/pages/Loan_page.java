package com.zmarta.pages;


import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterTest;

	

import com.zmarta.base.basetest;
import com.zmarta.utils.TestUtil;


public class Loan_page extends basetest {

	
	String url = pro.getProperty("url");
	 
	//POM with PageFactory
	 
	 @FindBy (xpath = "//a[@class='account_icon']")
	
	   WebElement account;
	 
	 
	 @FindBy (xpath = ".//*[@id='log']")
	   WebElement username;
	 
	 
	 @FindBy (id = "pwdk")
	 WebElement password;
	 
	 
	 @FindBy (id = "login")
	  WebElement submit;
	 
	 @FindBy (xpath ="//img[@alt='home']")
	  WebElement logo;
			 
			 
	 //Intialising PageObjects
	 
	 public Loan_page() {
		 
		 PageFactory.initElements(driver, this);
		 
		 
	 }
	
	 
	 //Actions
	 
	 
	 public  void Login(String un, String pw) throws IOException {
		
		 
	   
		
			
			 basetest.childtest.pass("Navigated to " +url);
			
			account.click();
			  basetest.childtest.pass("Account clicked");
			
			username.sendKeys(un);
			  basetest.childtest.pass("username entered " +un);
			
			password.sendKeys(pw);
			  basetest.childtest.pass("Password entered  "+pw);
		
		
			
		
		 

			
		 
		 
		
		
		
	 }
	 
	 
	 
	 
	 public boolean logo () {
		 
		 
    
	 boolean flag = logo.isDisplayed();
	 basetest.childtest.pass("Logo is Verified");
	 return flag;
		 
	 }
	 
	 
	 
	 
	 
	 @AfterTest
	  public void afterTest() {
			 
	 // extent.flush();
	  
	}
	 
	 
	 
	 
}
 

 


