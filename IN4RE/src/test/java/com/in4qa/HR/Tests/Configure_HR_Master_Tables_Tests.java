package com.in4qa.HR.Tests;

import java.util.Map;

import org.testng.annotations.Test;

import com.in4qa.HR.Object.Configure_HR_Master_Tables;

import driver.DriverScript;

public class Configure_HR_Master_Tables_Tests extends DriverScript {
	
	public static String strFile;
	public static Map<String, String> hrmap;
	public static Configure_HR_Master_Tables hr_master_table;
	@Test
	public void CreateHRMasters()
	{
		int rows=0;
		try
		{
			strFile = "./TestData/HR/ConfigureHR.xlsx";
			hr_master_table = new Configure_HR_Master_Tables(oBrowser);
			hrmap = datatable.getDataFromExcel(strFile, "HRMasters");
			
			
		} catch(Exception e)
		{
			
		}
		
		
		

	}

}
