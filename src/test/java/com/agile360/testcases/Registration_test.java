package com.agile360.testcases;

import java.io.IOException;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.agile360.base.basetest;
import com.agile360.pages.Registration_page;
import com.agile36p.utils.Constants;
import com.agile36p.utils.TestUtil;

public class Registration_test extends basetest{
  
	Registration_page register;
	
	
	@BeforeMethod
	public void setup() {
	    
		
		register = new Registration_page();
		
		
	}
	
	
	
	@Test(dataProvider ="testdata")

  public void VerifyRegistrationDetails(String name ,String email,String phone,  String password, String confirm_password) throws Exception {
		
		
		register.registration(name,email,phone ,password ,confirm_password);
		
		
		
  }
	
	
	@DataProvider(name = "testdata")
	   public Object [][] getdata(){
		   
		   
		   Object data [][] = TestUtil.testdata(Constants.path_TestData, Constants.sheet_TestData);
		   
		   return data;
	   }
		   
		 
	
	
}
