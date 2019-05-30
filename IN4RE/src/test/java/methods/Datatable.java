package methods;



import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Map;


import org.apache.poi.hssf.usermodel.HSSFDateUtil;
import org.apache.poi.ss.usermodel.Cell;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;



import driver.DriverScript;

public class Datatable extends DriverScript{
	public static Workbook wb = null;
	public static Sheet sh = null;
	


	/*********************************
	 * Method Name	: getRowNum
	 * Purpose		: to get the count of the used rows
	 * Author		: Sachin
	 * Date Creation: 05th-August-2019
	 * Example		: getRowNum(filePath, sheetName);
	 * 
	 * ******************************
	 */
	public int getRowNum(String strFile, String strSheetName)
	{
		FileInputStream fin = null;
		Workbook wb = null;
		Sheet sh = null;
		int rows = 0;
		try {
			fin = new FileInputStream(strFile);
			wb = new XSSFWorkbook(fin);
			sh = wb.getSheet(strSheetName);
			
			if(sh==null)
			{
				return -1;
			}
			
			rows = sh.getPhysicalNumberOfRows();
			return rows;
		}catch(Exception e)
		{
			System.out.println(e);
			return -1;
		}
		finally
		{
			try {
				fin.close();
				fin = null;
				sh = null;
				wb = null;
			}catch(Exception e)
			{
				System.out.println(e);
				return -1;
			}
		}
	}
	
	
	
	/*********************************
	 * Method Name	: getCellData
	 * Purpose		: to read the specific cell value
	 * Author		: Sachin
	 * Date Creation: 05th-August-2019
	 * Example		: getCellData("excel.xlsx", "testData", "TestCaseName", 1);
	 * 
	 * ******************************
	 */
	public String getCellData(String strFile, String strSheetName, String strColName, int rowNum)
	{
		FileInputStream fin = null;
		Workbook wb = null;
		Sheet sh = null;
		Row row = null;
		Cell cell = null;
		int colNum = 0;
		String strData = null;
		String sDay = null;
		String sMonth = null;
		String sYear = null;
		try {
			fin = new FileInputStream(strFile);
			wb = new XSSFWorkbook(fin);
			sh = wb.getSheet(strSheetName);
			
			if(sh==null)
			{
				return null;
			}
			
			//To find the column Number based on column name
			row = sh.getRow(0);
			for(int r=0; r<row.getLastCellNum(); r++)
			{
				cell = row.getCell(r);
				if(cell.getStringCellValue().trim().equals(strColName))
				{
					colNum = r;
					break;
				}
			}
			
			row = sh.getRow(rowNum);
			cell = row.getCell(colNum);
			
			if(cell==null || cell.getCellType()==Cell.CELL_TYPE_BLANK)
			{
				strData = "";
			}
			else if(cell.getCellType()==Cell.CELL_TYPE_BOOLEAN)
			{
				strData = String.valueOf(cell.getBooleanCellValue());
			}
			else if(cell.getCellType()==Cell.CELL_TYPE_STRING)
			{
				strData = cell.getStringCellValue();
			}
			else if(cell.getCellType()==Cell.CELL_TYPE_NUMERIC)
			{
				if(HSSFDateUtil.isCellDateFormatted(cell))
				{
					double dt = cell.getNumericCellValue();
					Calendar cal = Calendar.getInstance();
					cal.setTime(HSSFDateUtil.getJavaDate(dt));
					
					if(cal.get(Calendar.DAY_OF_MONTH)<10)
					{
						sDay = "0"+cal.get(Calendar.DAY_OF_MONTH);
					}else {
						sDay = String.valueOf(cal.get(Calendar.DAY_OF_MONTH));
					}
					
					if((cal.get(Calendar.MONTH)+1)<10)
					{
						sMonth = "0"+(cal.get(Calendar.MONTH)+1);
					}else {
						sMonth = String.valueOf((cal.get(Calendar.MONTH)+1));
					}
					
					sYear = String.valueOf(cal.get(Calendar.YEAR));
					
					strData = sDay+"-"+sMonth+"-"+sYear;
				}else {
					strData = String.valueOf(cell.getNumericCellValue());
				}
			}
			
			return strData;
		}catch(Exception e)
		{
			System.out.println(e);
			return null;
		}
		finally
		{
			try {
				fin.close();
				fin = null;
				cell = null;
				row = null;
				sh = null;
				wb = null;
			}catch(Exception e)
			{
				System.out.println(e);
				return null;
			}
		}
	}
	
	
	/*********************************
	 * Method Name	: getCellData
	 * Purpose		: to read the specific cell value
	 * Author		: Sachin
	 * Date Creation: 06th-August-2019
	 * Example		: getCellData("excel.xlsx", "testData", "TestCaseName", 1);
	 * 
	 * ******************************
	 */
	public void setCellData(String strFile, String strSheetName, String strColName, String testName, String strData)
	{
		FileInputStream fin = null;
		FileOutputStream fout = null;
		Workbook wb = null;
		Sheet sh = null;
		Row row = null;
		Cell cell = null;
		int colNum = 0;
		int rowNum =0;
		int rows =0;
		try {
			fin = new FileInputStream(strFile);
			wb = new XSSFWorkbook(fin);
			sh = wb.getSheet(strSheetName);
			if(sh==null) {
				
			}
			
			//To find the column Number based on column name
			row = sh.getRow(0);
			for(int c=0; c<row.getLastCellNum(); c++)
			{
				cell = row.getCell(c);
				if(cell.getStringCellValue().trim().equals(strColName))
				{
					colNum = c;
					break;
				}
			}
			rows = sh.getPhysicalNumberOfRows();
			for(int r=0; r<rows; r++)
			{
				row = sh.getRow(r);
				
					cell = row.getCell(0);
					if(cell.getStringCellValue().trim().equals(testName))
					{
						rowNum = r;
						break;
					}	
			}
			
			row = sh.getRow(rowNum);
			cell = row.getCell(colNum);
			if(cell==null) {
				cell = row.createCell(colNum);
			}
			
			cell.setCellValue(strData);
			
			fout = new FileOutputStream(strFile);
			wb.write(fout);
		}catch(Exception e)
		{
			System.out.println(e);
		}
		finally
		{
			try {
				fout.flush();
				fout.close();
				fout = null;
				fin.close();
				fin = null;
				cell = null;
				row = null;
				sh = null;
				wb = null;
			}catch(Exception e)
			{
				System.out.println(e);
			}
		}
	}
	
	
	
	
	
	
	
	
	/***************************************
	 * Method Name	: getDataFromExcel
	 * Purpose		: to read the test data from the excel sheet
	 *              : based on the LogicalName
	 * 
	 * *************************************
	 */
	public Map<String, String> getDataFromExcel(String strFile, String strSheetName)
	{
		FileInputStream fin = null;
		Workbook wb = null;
		Sheet sh = null;
		Row row1 = null;
		Row row2 = null;
		Cell cell1 = null;
		Cell cell2 = null;
		String sKey = null;
		String sValue = null;
		int rowNum = 0;
		Map<String, String> oDataMap = null;
		try {
			oDataMap = new HashMap<String, String>();
			fin = new FileInputStream(strFile);
			wb = new XSSFWorkbook(fin);
			sh = wb.getSheet(strSheetName);
			if(sh==null) {
		
				return null;
			}
			
			//Find rownumber for the given logicalName
			int rows = sh.getPhysicalNumberOfRows();
			for(int r=1;r<rows;r++)
			{
				row1 = sh.getRow(r);
				cell1 = row1.getCell(0);
				row1 = sh.getRow(0);
				row2 = sh.getRow(r);
				for(int c=0;c<row1.getLastCellNum();c++)
				{
					cell1 = row1.getCell(c);
					sKey = cell1.getStringCellValue();
					cell2 = row2.getCell(c);
					if(cell2==null||cell2.getCellType()==Cell.CELL_TYPE_BLANK)
					{
						sValue = "";
					}else if(cell2.getCellType()==Cell.CELL_TYPE_BOOLEAN)
					{
						sValue = String.valueOf(cell2.getBooleanCellValue());
					}
					else if(cell2.getCellType()==Cell.CELL_TYPE_STRING)
					{
						sValue = cell2.getStringCellValue();
					}
					else if(cell2.getCellType()==Cell.CELL_TYPE_NUMERIC)
					{
						if(HSSFDateUtil.isCellDateFormatted(cell2))
						{
							double dt = cell2.getNumericCellValue();
							Calendar cal = Calendar.getInstance();
							cal.setTime(HSSFDateUtil.getJavaDate(dt));
							String day;
							String month;
							String year;
							if(cal.get(Calendar.DAY_OF_MONTH)<10)
							{
								day="0"+cal.get(Calendar.DAY_OF_MONTH);
							}else {
								day=String.valueOf(cal.get(Calendar.DAY_OF_MONTH));
							}
							
							if((cal.get(Calendar.MONTH)+1)<10)
							{
								month="0"+(cal.get(Calendar.MONTH)+1);
							}else {
								month=String.valueOf(cal.get(Calendar.MONTH)+1);
							}
							
							year = String.valueOf(cal.get(Calendar.YEAR));
							
							sValue = day+"/"+month+"/"+year;
								
						}else {
							sValue = String.valueOf(cell2.getNumericCellValue());
							sValue = sValue.subSequence(0, sValue.lastIndexOf(".")).toString();
						}
					}
					oDataMap.put(sKey+r, sValue);
				}
				
			}
			
			return oDataMap;
		}catch(Exception e)
		{
	
			return null;
		}
		finally {
			try {
				
				fin = null;
				cell1 = null;
				cell2 = null;
				row1 = null;
				row2 = null;
				sh = null;
				wb = null;
			}catch(Exception e)
			{
				
				return null;
			}
		}
	}
	

	
	/*********************************
	 * Method Name	: GetFlaggedMethods
	 * Purpose		: to get the no of test to run and put in the map
	 * Author		: Sachin
	 * Date Creation: 05th-August-2019
	 * Example		: Map = GetFlaggedMethods(strFile,  strSheet, ColumnName);
	 * 
	 * ******************************
	 */
	public  Map GetFlaggedMethods( String strFile, String strSheet, String ColumnName) {
		
		try {
			// Load all the dictionary
			//ColumnDictionary();
			int methodcount = 1; // keycount flag will track of
									// method count
			
			int rows = datatable.getRowNum(strFile, strSheet);
			for (int row = 0; row<rows-1; row++) {
				String  cellValue = datatable.getCellData(strFile, strSheet, ColumnName, row+1);
				if ( cellValue.equalsIgnoreCase("yes")) {
					// put method keycount and the method name
					omap.put(methodcount, datatable.getCellData(strFile, strSheet, "TestName", row+1)+"#"+datatable.getCellData(strFile, strSheet, "ClassName", row+1));
							
					methodcount++;
				}
			}
 
		} catch (Exception e) {
 
		}
		return 	omap;
	}
	
	/***************************************
	 * Method Name	: getLocatorsAndConvertToMap
	 * Purpose		: to read all the locators from objectMapping
	 *              : and convert to Map.
	 * 
	 * *************************************
	 */
//	public Map<String, String> getLocatorsAndConvertToMap(String strFile, String strSheet, String colName, String logicalNAme)
//	{
//		FileInputStream fin = null;
//		Workbook wb = null;
//		Sheet sh = null;
//		Row row = null;
//		Cell cell = null;
//		String sKey = null;
//		String sValue = null;
//		Map<String, String> oLocatorsMap = null;
//		int colNum=0;
//		int rows=0;
//		try {
//			oLocatorsMap = new HashMap<String, String>();
//			fin = new FileInputStream(strFile);
//			wb = new XSSFWorkbook(fin);
//			sh = wb.getSheet(strSheet);
//			if(sh==null) {
//				
//				return null;
//			}
//			
//			row = sh.getRow(0);
//			for(int c=0; c<row.getLastCellNum(); c++)
//			{
//				cell = row.getCell(c);
//				if(cell.getStringCellValue().equals(colName))
//				{
//					colNum = c;
//					break;
//				}
//				
//			}
//			
//			rows = sh.getPhysicalNumberOfRows();
//			for(int r=0; r<rows; r++)
//			{
//				row = sh.getRow(r);
//				cell = row.getCell(0);
//				sKey = cell.getStringCellValue();
//				cell = row.getCell(colNum);
//				sValue = cell.gets
//				if(sKey.contains(logicalNAme) )
//				{
//					omap
//				}
//			}
//			
//			
//			
////			for(int r=0;r<rows;r++)
////			{
////				row = sh.getRow(r);
////				cell = row.getCell(0);
////				sKey = cell.getStringCellValue();
////				sValue = row.getCell(1)+"#"+row.getCell(2);
////				oLocatorsMap.put(sKey, sValue);
////			}
//			return oLocatorsMap;
//		}catch(Exception e)
//		{
//			
//			return null;
//		}
//		finally {
//			try {
//				fin.close();
//				fin = null;
//				cell = null;
//				row = null;
//				sh = null;
//				wb = null;
//			}catch(Exception e)
//			{
//				
//				return null;
//			}
//		}
//	}
//	  
	    

	  

	    
}
