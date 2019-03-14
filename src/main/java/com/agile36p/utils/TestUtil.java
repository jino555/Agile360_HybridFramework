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
	//String randomemail = randomEmail();
	
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
			Date date = new Date();
			Format formatter = new SimpleDateFormat("yyyy-MM-dd_hh-mm-ss");
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
	 
	 public  static String randomEmail() {
	        return "random-" + UUID.randomUUID().toString() + "@gmail.com";
	    }
	
	 
	 
	 
	
	
	  
	 }
	 
	 
	 
