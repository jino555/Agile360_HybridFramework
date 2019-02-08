package com.valency.testcases;

import java.io.IOException;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.valency.base.basetest;
import com.valency.pages.users_page;
import com.valency.utils.Constants;
import com.valency.utils.TestUtil;

public class users_test extends basetest{
  
	users_page user;
	
	
	@BeforeMethod
	public void setup() {
	    
		
		user = new users_page();
		
		
	}
	
	
	
	@Test(dataProvider ="testdata")

  public void VerifyUserDetails(String name ,String username, String password, String confirm_password) throws IOException {
		
		
		user.userdetails(name,username, password ,confirm_password);
		
		
		
  }
	
	
	@DataProvider(name = "testdata")
	   public Object [][] getdata(){
		   
		   
		   Object data [][] = TestUtil.testdata(Constants.path_TestData, Constants.sheet_TestData);
		   
		   return data;
	   }
		   
		 
	
	
}
