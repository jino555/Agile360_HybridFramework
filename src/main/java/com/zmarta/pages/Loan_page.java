package com.zmarta.pages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.zmarta.base.basetest;


public class Loan_page extends basetest {

	
	 
	//POM with PageFactory
	 
	 @FindBy (xpath = "//a[@class='account_icon']")
	
	   WebElement account;
	 
	 
	 @FindBy (xpath = ".//*[@id='log']")
	   WebElement username;
	 
	 
	 @FindBy (id = "pwd")
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
	 
	 
	 public  void Login(String un, String pw) {
		 
		account.click();
		username.sendKeys(un);
		password.sendKeys(pw);
		
	
	 }
	 
	 public boolean logo () {
		 
	return logo.isDisplayed();
		 
 
		 
		 
	 }
	 
	 
	 
	 
	 
	 
}
 

 


