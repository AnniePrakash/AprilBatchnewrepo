package org.newMaven;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;


import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Ex {


	public static void main(String[] args) throws IOException {
		
		//Accessing File
		
		File file=new File("C:\\Users\\USER\\Desktop\\Prakash\\Book1.xlsx");
		
		//InputSteam
		
		FileInputStream stream=new FileInputStream(file);
		
		//Accessing Workbook
		
		Workbook workbook=new XSSFWorkbook(stream);
		
		//Accessing Sheet
		
		Sheet sheet = workbook.getSheet("Sheet1");
		
		for(int i=0; i<sheet.getPhysicalNumberOfRows();i++) {
			
			Row row = sheet.getRow(i);
			
			for(int j=0;j<row.getPhysicalNumberOfCells();j++) {
				
				Cell cell = row.getCell(j);
							
					

					//To find the cell type
					
					CellType cellType = cell.getCellType();
					
					switch (cellType) {
					case STRING:
						
						String stringCellValue = cell.getStringCellValue();
if(stringCellValue.equals("Hanno")) {
							
							cell.setCellValue("Air");
							
							FileOutputStream out=new FileOutputStream(file);
							
							workbook.write(out);
							break;
					

						}
					default:
						break;
					
						
					
					
					}
			
			System.out.println();
			
					
					
					
					}
			
			
					
		}
		
		
		
		}
	
}
		
		





