package com.in4qa.Purchase.Tests;

import java.util.Map;

import org.testng.annotations.Test;

import com.in4qa.Purchase.ObjectRepository.Inventory_Indents;

import driver.DriverScript;

public class Inventory_Indents_tests extends DriverScript
{
public static Inventory_Indents indentsObj = null;
	public static String strFile;
	public static Map<String, String> purmap= null;
	@Test
	public void create_Indent()
	{
		int rows =0;
		try
		{
			strFile="./TestData/Purchase/Inventory.xlsx";
			indentsObj = new Inventory_Indents(oBrowser);
			purmap = datatable.getDataFromExcel(strFile, "Create Indent");
			rows  = datatable.getRowNum(strFile, "Create Indent");
			for(int i=1; i<=rows; i++)
			{
			indentsObj.create_Indent_WithWorkOrder(i);
//   		indentsObj.create_Indent_Without_Worklorder(i);
			//indentsObj.Create_Indent_Minor_Material_WithOutWorkOrder(i);
			}
			
			
		}catch(Exception e)
		{
			
		}
		
		
	}

}
