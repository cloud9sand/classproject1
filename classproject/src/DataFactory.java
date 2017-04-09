

import java.io.File;
import java.io.FileInputStream;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import webDriver.*;

public class DataFactory {
	
	private String dataResourcePath = Prop.getProp("dataResourcePath");
	private String dataResourceFileType = Prop.getProp("dataResourceFileType");
	
	public Iterator<Object[]> getTestDataSet(Method method) {
		String[] testNameSplit = method.getName().split("_");
		String filePath = this.dataResourcePath 
				+ testNameSplit[1].toLowerCase() 
				+ "/" 
				+ testNameSplit[2] 
				+ "." 
				+ this.dataResourceFileType;
		return this.xlsxFileReader(filePath, testNameSplit[0]).iterator();
	}
	
	
	public List<Object[]> xlsxFileReader(String filePath, String workSheetName) {
		List<Object[]> result = new ArrayList<Object[]>();
		boolean firstRowFlag = true;
		
		try {
			FileInputStream file = new FileInputStream(new File(filePath));
			//Create Workbook instance holding reference to .xlsx file
			@SuppressWarnings("resource")
			//xls->HSSFWorkbook
			XSSFWorkbook workbook = new XSSFWorkbook(file);
			//Get first/desired sheet from the workbook
			XSSFSheet sheet = workbook.getSheet(workSheetName);
			//Iterate through each rows one by one
			Iterator<Row> rowIterator = sheet.iterator();
			while (rowIterator.hasNext())
	        {
				if (firstRowFlag) {
					firstRowFlag = false;
					rowIterator.next();
				}
	            Row row = rowIterator.next();
	            //For each row, iterate through all the columns
	            Iterator<Cell> cellIterator = row.cellIterator();
	            List<Object> rowItems = new ArrayList<Object>();

	            while (cellIterator.hasNext()) 
	            {
	                Cell cell = cellIterator.next();
	                int cellType = cell.getCellType();	                
	                //Check the cell type and format accordingly
	                switch (cellType) 
	                {
	                	case Cell.CELL_TYPE_FORMULA:
	                		rowItems.add(handleString(cell));
	                        break;
	                	case Cell.CELL_TYPE_BOOLEAN:
	                		rowItems.add(cell.getBooleanCellValue());
	                        break;
	                    case Cell.CELL_TYPE_NUMERIC:
			                rowItems.add(cell.getNumericCellValue());
		                    break;
	                    case Cell.CELL_TYPE_STRING:
	                    	rowItems.add(handleString(cell));
	                        break;
	                }
	            }
	            System.out.println(rowItems);
	            result.add(rowItems.toArray());
	            //sandeep
	            //selenium
	            //abc
	            //qtp
	            //webdriver
	            //bbc
	        }
	        file.close();
		} catch (Exception e) {
		}
		return cleanDataSetOfEmptyObjects(result);		
	}
	
	private List<Object[]> cleanDataSetOfEmptyObjects(List<Object[]> resultSet) {
		for (int i=resultSet.size();i>0;i--) {
			if (resultSet.get(i-1).length == 0) {
				resultSet.remove(i-1);
			}
		}
		return resultSet;
	}
	
	public String handleString(Cell cell) {
		String handledString = "";
		if (!cell.getStringCellValue().equals(" ")) {
			handledString = cell.getStringCellValue();
		}
		return handledString;
	}
}
