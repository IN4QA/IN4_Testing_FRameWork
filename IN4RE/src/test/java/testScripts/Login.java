package testScripts;

import org.testng.annotations.Test;

import driver.DriverScript;
import objectRepository.LoginPage;

public class Login extends DriverScript {
  @Test
  public void loginTest() {
	  
	  try
		{
			strTestName = "loginTest";
			lgnpage = new LoginPage(oBrowser);
			lgnpage.setUserName(appInd.readConfig("username"));
			lgnpage.setPassword(appInd.readConfig("password"));
			lgnpage.clickLogin();
		    datatable.setCellData(strController, "Sheet1", "Status", strTestName, "Pass");
			 	 
		} catch(Exception e)
		{
			
			datatable.setCellData(strController, "Sheet1", "Status", strTestName, "Fail");
		}	
  }
}
