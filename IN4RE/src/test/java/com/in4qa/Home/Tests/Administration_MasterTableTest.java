package com.in4qa.Home.Tests;

import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.in4qa.Home.Object.Administration_MasterTable;

import driver.DriverScript;


public class Administration_MasterTableTest extends DriverScript {
	
	public static Administration_MasterTable master = null;
	
	
	
	@Test
	public void CreateHomeMasters()
	{
		String strStatus = null;
		Map< String, String> omap = null;
		int rows=0;
		try
		{
			strTestName = "CreateHomeMasters";
			master = new Administration_MasterTable(oBrowser);
			omap = datatable.getDataFromExcel("./TestData/Home/Administration.xlsx", "HomeMasters");
			rows = datatable.getRowNum("./TestData/Home/Administration.xlsx", "HomeMasters");

			for(int i=1; i<=rows; i++)
			{
				strStatus+=String.valueOf(master.createTitleMaster(omap.get("TitileName"+i).toString()));
				strStatus+=String.valueOf(master.createRegionsMaster(omap.get("RegionName"+i).toString()));
				strStatus+=String.valueOf(master.createCountryMaster(omap.get("CountryName"+i).toString(),omap.get("RegionName"+i).toString(), omap.get("IsdCode"+i)));
				strStatus+=String.valueOf(master.createStateMaster(omap.get("StateName"+i).toString() , omap.get("StateCode"+i).toString(), omap.get("TinNo"+i).toString(), omap.get("CountryName"+i).toString(), omap.get("RegionName"+i).toString()));
				strStatus+=String.valueOf(master.createCityMaster(omap.get("CityName"+i).toString(), omap.get("StateName"+i).toString(), omap.get("RegionName"+i).toString()));
				strStatus+=String.valueOf(master.createLocalityMaster(omap.get("LocalityName"+i).toString() , omap.get("CityName"+i).toString()));	
			}
			Assert.assertFalse(strStatus.contains("false") );

		} catch(Exception e)
		{
			
		}
	}
	


}
