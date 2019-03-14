package com.agile36p.utils;

import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.text.Format;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Objects;
import java.util.Random;
import java.util.UUID;

import javax.imageio.ImageIO;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.agile360.base.basetest;

public class TestUtil extends basetest	 {
	
	 public static long PAGE_LOAD_TIMEOUT = 40;
	 public static long IMPLICIT_WAIT = 30;
	 static Date date;
	 static Format formatter;
	 
	 
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
	 
	 public static String getScreenshot(WebDriver driver) throws IOException
	 
	 {
		 TakesScreenshot ts=(TakesScreenshot) driver;
			
			File src=ts.getScreenshotAs(OutputType.FILE);
			 date = new Date();
			 formatter = new SimpleDateFormat("yyyy-MM-dd_hh-mm-ss");
			String path=System.getProperty("user.dir")+"./Screenshots/" + formatter.format(date) + ".png";
			
			File destination=new File(path);
			
			try 
			{
				FileUtils.copyFile(src, destination);
			} catch (IOException e) 
			{
				System.out.println("Capture Failed "+e.getMessage());
			}
			
			return path;
		 

	
	 }
	 
	 
	 public static  String email() {
		 
		 
		 
		date = new Date();
		formatter = new SimpleDateFormat("hhmm");
		 String email = "jino" +formatter.format(date) + "@gmail.com";
		 System.out.println("email is"  +email);
		 return email;
		 
		 
	 }
	 
	 
	 
	/* public  static String randomEmail() {
	        return "random-" + UUID.randomUUID().toString() + "@gmail.com";
	        
	    }
	
	 public static String getemailid() {
	        String SALTCHARS = "ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";
	        StringBuilder salt = new StringBuilder();
	        Random rnd = new Random();
	        while (salt.length() < 3) { // length of the random string.
	            int index = (int) (rnd.nextFloat() * SALTCHARS.length());
	            salt.append(SALTCHARS.charAt(index));
	        }
	        
	        String saltStr = salt.toString() + "@gmail.com";
	        return saltStr;

	    }
	 
	 
	 */
	 
	   
	
	  
	 }
	 
	 
	 
