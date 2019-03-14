package com.agile36p.utils;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;



	 

  public class ExcelUtil{
	  
	  
	  
	
	  static  XSSFWorkbook workbook;
	  static XSSFSheet sheet;

	public  ExcelUtil(String excelpath, String sheetname) {
		  
		
		try {
			workbook = new XSSFWorkbook(excelpath);
			sheet  = workbook.getSheet(sheetname);
		} catch (Exception e) {
			
			e.printStackTrace();
		}
	}
		  
	
	
	
		public static int  getRowcount() {
			int rowcount = 0;
			try {
				rowcount = sheet.getPhysicalNumberOfRows();
				System.out.println("Rowcount is" +rowcount);
			} catch (Exception exp) {
				System.out.println(exp.getMessage());
				System.out.println(exp.getCause());
				exp.printStackTrace();
			}
			 return rowcount;
	
		}
		
      public static int  getColcount() {
			
    	  int colcount= 0;
			try {
				colcount = sheet.getRow(1).getPhysicalNumberOfCells();
				System.out.println("colcount is" +colcount);
			} catch (Exception exp) {
				System.out.println(exp.getMessage());
				System.out.println(exp.getCause());
				exp.printStackTrace();
			}
			
	 return colcount;
		}
		
		
		public static String  getCelldataString (int Rownum , int Colnum) {
			 String celldata = null;
			 
			try {
				 celldata = sheet.getRow(Rownum).getCell(Colnum).getStringCellValue();
				
			} catch (Exception exp) {
				System.out.println(exp.getMessage());
				System.out.println(exp.getCause());
				exp.printStackTrace();
			}
			
	      return celldata;
		}
		
		
		
			
			
		
  }
				
		
		
		
		
		
		
		
		
		
		  
		  
		  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	 
		     
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
  
	  
	  /*
	  
	WebDriver driver;
	static Workbook book;
	static Sheet  sheet;
	public static String Testdata_sheet = Constants.path_TestData;
	
	
	
	public  static Object  [][] getTestdata(String sheetname) {
		
		
		
		FileInputStream file = null;
		try{
		file = new FileInputStream(Testdata_sheet);
		}
		catch(FileNotFoundException e) {
			
			e.printStackTrace();
		}
			
			
		try {
			
			book = WorkbookFactory.create(file);
			System.out.println(book);
		}
		catch(InvalidFormatException e ) {
			
			e.printStackTrace();
		}
		
		catch (IOException e) {
			
			e.printStackTrace();
			
		}
		
		
		sheet = book.getSheet(sheetname);
		System.out.println(sheet);
		Object [][]data = new Object[sheet.getLastRowNum()][sheet.getRow(0).getLastCellNum()];
		for (int i=0;i<sheet.getLastRowNum();i++) {
			
			for(int k=0;k<sheet.getRow(0).getLastCellNum();k++) {
				
				data[i][k]= sheet.getRow(i+1).getCell(k).toString();
				
			}
			
			
		}
		System.out.println(data);
		return data;
		
		
		
	}

	
	
	
	
	
	
  }
	
	
	
	
	*/
	
	
	
	
	
    	
    	/*public ExcelUtil (String Excelpath) throws Exception {
    		
    		
    		
    		File src = new File(Excelpath);
    		FileInputStream fis = new FileInputStream(src);
    		wb = new XSSFWorkbook(fis);
    	}
    	
    	
    	
    	
    	public String getdata(int Sheetnumber , int Row , int Col)
    	
    	
    	{
    		sheet = wb.getSheetAt(Sheetnumber);
    		
    		//String data = sheet.getRow(Row).getCell(Col).getStringCellValue();
    		
    		
    	
    	        DataFormatter formatter = new DataFormatter();

    	       sheet=wb.getSheetAt(Sheetnumber);
    	       String data = formatter.formatCellValue(sheet.getRow(Row).getCell(Col));
    	      
    	     return data;
    	       
    	
    	        
    	}
    	
    	
    	
    	
    	
    	/*
    	
    	public int getRowcount(int Sheetindex) {
    		
    	int row = wb.getSheetAt(Sheetindex).getLastRowNum();
    	row = row+1;
    		return row;
    		
    		
    		
    }
    	}


    	
    	 public int getColcount(int Sheetindex) {
    		 
    		   sheet = wb.getSheetAt(Sheetindex);
    	       row = sheet.getRow(0);
    	       int col = row.getLastCellNum();
    	       return col;
    		 
    		 
    	 }
    	
    	
    	
    
    
    }
    
  
*/
	
    	
	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
