package generic_utility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
                    /**
                     * its developed using Apache POi libraries , which used to handle Microsoft Excel sheet
                     * @author pravin 
                     *
                     */

public class Excel_Utility {
	
	                
					/**
	                  *   its used to read the data from Excel-Workbook based on below 
	                  * @param sheetName
	                  * @param rowNum
	                  * @param celNum
	                  * @return String data

	               * @throws Throwable
	                  */


	  public String getDataFromExcel(String sheetname,int rownum,int cellnum) throws EncryptedDocumentException, IOException
	  {
		      FileInputStream fis = new  FileInputStream("./data/excel.xlsx");
		        Workbook book = WorkbookFactory.create(fis);
		            String str = book.getSheet(sheetname).getRow(rownum).getCell(cellnum).toString();
		              return str;
	  }
	    
	    public String getDataFromExcel2(String sheetname,int rownum,int cellnum) throws Throwable
	    {
	    	  FileInputStream fi = new FileInputStream("./data/excel.xlsx");
	    	     Workbook book1 = WorkbookFactory.create(fi);
	    	     
	    	      DataFormatter format = new  DataFormatter();
	    	     return format.formatCellValue(book1.getSheet(sheetname).getRow(rownum).getCell(cellnum));
	    }
	    
	    
	    /**
         *   its used to read the data from Excel-Workbook based on below 
         * @param sheetName
         * @param rowNum
         * @param celNum
         */

	                 
	            public void writeDataInExcel(String sheetname,int rownum,int cellnum,String data) throws Throwable {
	            	
	            	  FileInputStream fd = new FileInputStream("./data/excel.xlsx");
	 	    	     Workbook book1 = WorkbookFactory.create(fd);
	 	    	             Sheet sheet = book1.getSheet(sheetname);
	 	    	                 Row row = sheet.getRow(rownum);
	 	    	                Cell cel = row.createCell(cellnum);
	 	    	                        cel.setCellValue(data);
	 	    	         FileOutputStream fos = new FileOutputStream("./data/excel.xlsx");
	 	    	                           book1.write(fos);
	 	    	                       book1.close();
	            }
	            public void writeintdataInExcel(String sheetname,int rownum,int cellnum,int data) throws Throwable {
	            	
	            	  FileInputStream fd = new FileInputStream("./data/excel.xlsx");
	 	    	     Workbook book1 = WorkbookFactory.create(fd);
	 	    	             Sheet sheet = book1.getSheet(sheetname);
	 	    	                 Row row = sheet.getRow(rownum);
	 	    	                Cell cel = row.createCell(cellnum);
	 	    	                        cel.setCellValue(data);
	 	    	         FileOutputStream fos = new FileOutputStream("./data/excel.xlsx");
	 	    	                           book1.write(fos);
	 	    	                       book1.close();
	            }
}
