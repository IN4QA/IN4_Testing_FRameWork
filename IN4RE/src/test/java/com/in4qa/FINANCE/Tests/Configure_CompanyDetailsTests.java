package com.in4qa.FINANCE.Tests;

import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.in4qa.FINANCE.Object.Configure_CompanyDetails;

import driver.DriverScript;

public class Configure_CompanyDetailsTests extends DriverScript {
	public static Configure_CompanyDetails company_details = null;
	public static Map<String, String> map = null;
	@Test
	public void CreateCompany()
	{
		//oBrowser.manage().timeouts().implicitlyWait(1000, TimeUnit.MILLISECONDS);
		String strStatus=null;
		int rows = 0;
		try
		{
			strTestName ="CreateCompany";
			map= datatable.getDataFromExcel("./TestData/Finance/Configure.xlsx", "Company Details");
			rows = datatable.getRowNum("./TestData/Finance/Configure.xlsx", "Company Details");
			company_details = new Configure_CompanyDetails(oBrowser);
			for(int i=1; i<=rows; i++)
			{
				strStatus+=company_details.create_company(i);
			}
			if(strStatus.contains("false"))
			{
				datatable.setCellData(strController, "", "Sheet1", strTestName, "fails");
				Assert.assertTrue(false);
			} else
			{
				datatable.setCellData(strController, "", "Sheet1", strTestName, "pass");
			}
			
		} catch(Exception e)
		{
			appInd.captureScreenShot();
		}
	}

}
