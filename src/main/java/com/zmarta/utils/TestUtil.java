package com.zmarta.utils;

	
	
	import java.io.File;
	import java.io.IOException;

	import org.apache.commons.io.FileUtils;
	import org.openqa.selenium.OutputType;
	import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import com.zmarta.base.basetest;

	public class TestUtil extends basetest	 {
		
		 public static long PAGE_LOAD_TIMEOUT = 40;
		 public static long IMPLICIT_WAIT = 20;
		 
		
		 public static Object[][] testdata(String excelpath, String sheetname) {
				
				
				
				ExcelUtil excel = new ExcelUtil(excelpath, sheetname);
				int  RowCount = excel.getRowcount();
				int ColCount =  excel.getColcount();
				
				Object data  [][] = new Object[RowCount-1][ColCount];
				
				for (int i=1;i<RowCount;i++) {
					
					for (int j=0;j<ColCount; j++) {
						
						
						
						String celldata = ExcelUtil.getCelldataString(i, j);
						System.out.println("Exceldata is  "  +celldata) ;
				        data[i-1][j]= celldata;
						
						
					}
				
				
				
				
				}
				
				
				return data;
				
			}	
		 
		 
		
		        public static String takeScreenshotAtEndOfTest() throws IOException {
				File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
				String currentDir = System.getProperty("user.dir");
				
				FileUtils.copyFile(scrFile, new File(currentDir +"/screenshots/" +System.currentTimeMillis() + ".jpeg"));
				return currentDir;
		      }
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	


}
