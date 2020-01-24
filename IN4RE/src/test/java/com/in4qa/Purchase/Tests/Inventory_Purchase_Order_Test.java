package com.in4qa.Purchase.Tests;

import java.util.Map;

import org.testng.annotations.Test;
import com.in4qa.Purchase.ObjectRepository.Inventory_Purchase_Order;
import driver.DriverScript;

public class Inventory_Purchase_Order_Test extends DriverScript
{
	public static Inventory_Purchase_Order PurchaseObj = null;
	public static String strFile;
	public static Map<String, String> purmap= null;
	@Test
	public void create_Purchase_Order()
	{
		int rows =0;
		try
		{
			strFile="./TestData/Purchase/Inventory.xlsx";
			PurchaseObj = new Inventory_Purchase_Order(oBrowser);
			purmap = datatable.getDataFromExcel(strFile, "Purchase Order");
			rows  = datatable.getRowNum(strFile, "Purchase Order");
	
			
		}catch(Exception e)
		{
			
		}
}
}