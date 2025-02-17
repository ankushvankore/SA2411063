package com.Assignments;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.AfterTest;

public class A09ReadingNumbersFromExcel {
	File file;
	FileInputStream fis;
	XSSFWorkbook wb;
	XSSFSheet sheet;
	XSSFRow row;
	XSSFCell cell;
	int i, j, rows;

	@Test
	public void readData() {
		rows = sheet.getPhysicalNumberOfRows();
		
		for(int i = 0; i < rows; i++)
		{
			for(int j = 0; j < 3; j++)
			{
				cell = sheet.getRow(i).getCell(j);
				
				switch(cell.getCellType())
				{
				case NUMERIC:
					System.out.println(cell.getNumericCellValue());
					break;
				case STRING:
					System.out.println(cell.getStringCellValue());
					break;
				default:
					break;
				}
			}
		}
	}

	@BeforeTest
	public void beforeTest() throws IOException {
		file = new File("ExcelFiles\\FriendsData.xlsx");
		fis = new FileInputStream(file);
		wb = new XSSFWorkbook(fis);
		sheet = wb.getSheet("Friends Data");
	}

	@AfterTest
	public void afterTest() throws IOException {
		wb.close();
		fis.close();
	}

}
