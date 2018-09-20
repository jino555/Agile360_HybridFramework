package com.zmarta.pages;


import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterTest;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import com.zmarta.base.basetest;


public class Loan_page extends basetest {

	ExtentReports extent;
    ExtentTest test;
	String url = pro.getProperty("url");
	 
	//POM with PageFactory
	 
	 @FindBy (xpath = "//a[@class='account_icon']l")
	
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
	 
	 
	 public  void Login(String un, String pw) throws IOException {
		
		 
	   
		try {
			
			basetest.childtest.pass("Navigated to " +url);
			account.click();
			basetest.childtest.pass("Account clicked");
			username.sendKeys(un);
			basetest.childtest.pass("username entered " +un);
			password.sendKeys(pw);
			basetest.childtest.pass("Password entered  "+pw);
		} catch (Exception e) {
			basetest.childtest.fail("Exception is  "+e  +basetest.childtest.addScreenCaptureFromPath("currentDir"));
		}
		
		
		
		
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
 

 


