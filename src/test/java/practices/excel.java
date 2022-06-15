package practices;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Date;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class excel {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		  /**
		FileInputStream fis = new FileInputStream("./data/excel.xlsx");
		  
		            Workbook book = WorkbookFactory.create(fis);
		           String str = book.getSheet("Sheet1").getRow(1).getCell(3).getStringCellValue();
               
		  
		  FileInputStream fp= new FileInputStream("./data/excel.xlsx");
                Workbook book1 = WorkbookFactory.create(fp);
				  
               Sheet sheet = book1.getSheet("Sheet2");
               Row row = sheet.getRow(1);
              Cell cell = row.createCell(2);
               cell.setCellValue("manufacture");
              
             //FileOutputStream fos = new FileOutputStream("./data/excel.xlsx");
             
             //  book.write(fos);
               
            //   FileInputStream fi = new FileInputStream("./data/excel.xlsx"); 
                      //   Workbook mn = WorkbookFactory.create(fi);
                         //  mn.getSheet("sheet1").getRow(0).set**/
              // public String  getSystemDate() {
           	/**	Date date = new Date();
           		String currentDate = date.toString();
           		System.out.println(currentDate);
           		String[] arr = currentDate.split(" ");
           		
           		String yyyy = arr[5];
           		String dd = arr[2];
           		int mm = date.getMonth()+1;
           	
           			String formate = yyyy+"-"+mm+"-"+dd;
           			System.out.println(formate);
           	//return formate;**/
           		       Date date = new Date();
           		            String currentdate = date.toString();
           		            System.out.println(currentdate);

                                  String[] arr = currentdate.split(" ");
                              String yyyy = arr[5];
                                    String dd = arr[2];
                                   int mm = date.getMonth()+1;
                                   
                                   String format = yyyy+"-"+mm+"-"+dd;
                                  System.out.println(format);
	}//

}
