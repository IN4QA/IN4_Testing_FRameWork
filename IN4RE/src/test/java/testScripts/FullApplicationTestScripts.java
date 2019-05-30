package testScripts;




import java.util.Iterator;

import org.openqa.selenium.By;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import driver.DriverScript;
import methods.Frames;
import objectRepository.PageCrash;
public class FullApplicationTestScripts extends DriverScript  {
	
	public static PageCrash pG= null;
	@Test
	public void verify()
	{
		strTestName = "verify";
		WebElement oEL = null;
		 //oBrowser.manage().timeouts().implicitlyWait(300, TimeUnit.MILLISECONDS);
		  pG = new PageCrash(oBrowser);
		 int i= 1;
		 String strStatus = null;
		 try
		 {
			 Frames.MainMenuFrame();
			 Iterator<WebElement> mainMenu = pG.getMainMenu().iterator();
			 while(mainMenu.hasNext())
			 {
				 Frames.MainMenuFrame();
				 oEL = mainMenu.next(); 
				try
				{menuName = oEL.getAttribute("class");} 
				catch(Exception e)
				{
					try
					{
						menuName= oBrowser.findElement(By.xpath("//body[@id='MainBody']/form/table/tbody/tr/td["+i+"]")).getAttribute("class");
					} catch(Exception r) {};	
				};
				 if(menuName.contains("DASH")) {
					 i++;
					 continue;
				 }		 
				  if(pG.clickObject(oEL))
				  {
					  try
					  {
				          oEL = oBrowser.findElement(By.xpath("//body[@id='MainBody']/form/table/tbody/tr/td["+i+"]"));
						  appInd.clickObject(oEL);
						  appInd.isAlertPresent();
					  }catch(Exception e) {};
				  }
				  i++;
				  if(Frames.mainFrame())
					{
					  strStatus+=String.valueOf(appInd.verifyPageCrash() );
					}
				  if(Frames.SubMenuFrame())
				  {
					 strStatus+=pG.clickOnSubMenu();
				  }
			 }
			 if(strStatus.contains("false"))
			 {
				 datatable.setCellData("./ExecutionController/TestSet1.xlsx", "Sheet1", "Status", strTestName, "fail");
				 Assert.assertTrue(false);
			 } else
			 {
				 datatable.setCellData("./ExecutionController/TestSet1.xlsx", "Sheet1", "Status", strTestName, "fail");
			 }
			 
		 }catch(Exception e)
		 {
			 System.out.println(e);
		 }	
	}
}
		