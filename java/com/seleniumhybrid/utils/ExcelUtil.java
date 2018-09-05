package com.seleniumhybrid.utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtil{
    	
	XSSFWorkbook wb;
	XSSFSheet sheet;
	
	
    	
    	public ExcelUtil (String Excelpath) throws Exception {
    		
    		
    		
    		File src = new File(Excelpath);
    		FileInputStream fis = new FileInputStream(src);
    		wb = new XSSFWorkbook(fis);
    	}
    	
    	
    	
    	
    	public String getdata(int Sheetnumber , int Row , int Col)
    	
    	
    	{
    		/*sheet1 = wb.getSheetAt(Sheetnumber);
    		
    		String data = sheet1.getRow(Row).getCell(Col).getStringCellValue();
    		
    		return data;*/
    		
    		DataFormatter formatter = new DataFormatter();

    	        sheet=wb.getSheetAt(Sheetnumber);
    	        String data = formatter.formatCellValue(sheet.getRow(Row).getCell(Col));
    	    //  String data =sheet.getRow(row).getCell(column).getStringCellValue();
    	    //  return data;
    	        return data;
    		
    		
    	}
    	
    	
    	
    	
    	
    	
    	
    	public int getRowcount(int Sheetindex) {
    		
    		int row = wb.getSheetAt(Sheetindex).getLastRowNum();
    		row = row+1;
    		return row;
    		
    		
    		
    	}
    	
    	 
    }
    
    
    
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
