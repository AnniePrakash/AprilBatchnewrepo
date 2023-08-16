package org.newMaven;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class CreateFile {

	public static void main(String[] args) throws IOException {
		
		//To locate the file where we have to create
		
		File file=new File("C:\\Users\\USER\\Desktop\\Prakash\\BooksampleApril.xlsx");
		
		Workbook book=new XSSFWorkbook();
		
		//To create Excel sheet from the workbook
		
		Sheet createSheet = book.createSheet("sanityTesting");
		
		//To create the row from the sheet
		
		Row createRow = createSheet.createRow(4);
		
		//To create cell from the row
		
		Cell createCell = createRow.createCell(4);
		
		//To set value tothe created cell
		
		createCell.setCellValue("Login teasting");
		
		
		FileOutputStream out=new FileOutputStream(file);
				
		//To write values to the created workbook
				
				book.write(out);
		
		
	}
	
}
