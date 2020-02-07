package com.in4qa.Engineering.Tests;

import java.util.Map;

import org.testng.annotations.Test;

import com.in4qa.Engineering.Object.Master_BOQ;
import com.in4qa.Purchase.ObjectRepository.Inventory_Indents;

import driver.DriverScript;

public class Master_BOQ_Test extends DriverScript
{

	public static Master_BOQ BOQObj = null;
	public static String strFile;
	public static Map<String, String> purmap= null;
	@Test
	public void create_BOQ() throws Throwable
	{
		int rows =0;
		try
		{
			
			strFile="./TestData/Engineering/Master.xlsx";
			BOQObj = new Master_BOQ(oBrowser);		
			purmap = datatable.getDataFromExcel(strFile, "Create BOQ");			
			rows  = datatable.getRowNum(strFile, "Create BOQ");
			
			for(int i=1; i<=rows; i++)
			{
			    
				BOQObj.create_BOQ(i);
   		
			}
			
			
		}catch(Exception e)
		{
			
		}
		
		
	}

}



