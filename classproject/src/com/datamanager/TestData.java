package com.datamanager;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Calendar;

import org.apache.poi.hssf.usermodel.HSSFDateUtil;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.Assert;

public class TestData {

	private static String getExcelCellData(String sheetName, int colNum, int rowNum) throws IOException {
		String cellData = null;
		FileInputStream file = new FileInputStream(new File("testdata.xlsx"));
		XSSFWorkbook book = new XSSFWorkbook(file);
		XSSFSheet s = book.getSheetAt(0);
		XSSFRow row;
		XSSFCell cell;
				s = book.getSheetAt(0);
				row = s.getRow(rowNum - 1);
				if (row == null) {
					return cellData;
				}
				cell = row.getCell(colNum);
				if (cell.getCellType() == Cell.CELL_TYPE_NUMERIC
						|| cell.getCellType() == Cell.CELL_TYPE_FORMULA) {
					cellData = String
							.valueOf(cell.getNumericCellValue());
				}
					
		
		return cellData;
	}
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		String[][] sheetData;
		String sheetName = "Sheet1";
		FileInputStream file = new FileInputStream("testdata.xlsx");
		XSSFWorkbook book = new XSSFWorkbook(file);
		XSSFSheet s = book.getSheetAt(0);
		XSSFRow r =s.getRow(0);
		
		int rowCount = s.getLastRowNum()+1;
		System.out.println(rowCount);
		int colCount  = r.getLastCellNum();
		System.out.println(colCount);
		
		sheetData = new String[rowCount - 1][colCount];
		for (int i = 2; i <= rowCount; i++)
			for (int j = 0; j < colCount; j++)
				sheetData[i - 2][j] = getExcelCellData(sheetName, j, i);
		
		System.out.println(sheetData[0][0]);
			
	}
}
