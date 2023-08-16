package org.newMaven;


import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.math.BigDecimal;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelRead {
	
	public static void main(String[] args) throws IOException {
		
		//Accessing File
		
		File file=new File("C:\\Users\\USER\\Desktop\\Prakash\\Book1.xlsx");
		
		//InputSteam
		
		FileInputStream stream=new FileInputStream(file);
		
		//Accessing Workbook
		
		Workbook workbook=new XSSFWorkbook(stream);
		
		//Accessing Sheet
		
		Sheet sheet = workbook.getSheet("Sheet1");
		
		int physicalNumberOfRows = sheet.getPhysicalNumberOfRows();
		
		System.out.println("Total no of Rows : "+physicalNumberOfRows);
		
		//Access the rows
		
		Row row = sheet.getRow(0);
		
		int physicalNumberOfCells = row.getPhysicalNumberOfCells();
		
		System.out.println("Total no of cells :"+physicalNumberOfCells);
		
		
					

					
		}
		
		
		
		}
		
		




