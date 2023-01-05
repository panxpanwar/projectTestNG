package Util;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class ExcelData {
	
	XSSFWorkbook wb;
	XSSFSheet sh;
	
	
	public ExcelData(String excelPath) {		
   	
    	try  { 
        File src = new File(excelPath);
    	FileInputStream fin = new FileInputStream(src);
    	wb = new XSSFWorkbook(fin);  
    	wb.close();

    	     }   catch (Exception ee){}		
	 }
	
		
	public String getExcelData(String sheetName,  int rowNumber, int columnNumer) {
   	    sh = wb.getSheet(sheetName);					
		String excelData = sh.getRow(rowNumber).getCell(columnNumer).getStringCellValue();		
		return excelData;
	}
	
	public int getExcelRowCount(String sheetName){
   	    sh = wb.getSheet(sheetName);		
		int rowCount = sh.getLastRowNum();		
		return rowCount;
	}

	
}
