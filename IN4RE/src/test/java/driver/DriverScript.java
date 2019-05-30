package driver;
/************************************
 * Class Name	: driver.DriverScript
 * Purpose		: to run the testscripts
 * Author		: Sachin
 * Reviewer		: Ganesh
 * Example		: 
 * ***********************************
 */
import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import baseClasses.FinanceSubMenu;
import baseClasses.HRSubMenu;
import baseClasses.HomeSubMenu;
import baseClasses.LandSubMenu;
import baseClasses.MainMenu;
import methods.AppDependentMethods;
import methods.AppIndependentMethods;
import methods.Datatable;
import methods.XMLUtility;
import objectRepository.LoginPage;
public class DriverScript {
	public static AppDependentMethods appDep;
	public static AppIndependentMethods appInd;
	public static String strController;
	public static WebDriver oBrowser;
	public static Datatable datatable;
	public static LoginPage lgnpage;
	public static String menuName;
	public static WebDriverWait w2;
	public static String strReportFile;
	public static Map omap;
	public static XMLUtility utility;
	public static String strTestName;
	public static String sceenShotPath;
	public static String finalReport;
	public static MainMenu mainMenu;
	public static HomeSubMenu homeSubMenu;
	public static LandSubMenu landSubMenu;
	public static FinanceSubMenu financeSubMenu;
	public static HRSubMenu hrSubMenu;
	/************************************
	 * Method Name	: loadClassFiles()
	 * Purpose		: to create Object to all class files
	 * Author		: Sachin
	 * Reviewer		: Ganesh
	 * Example		: loadClassFiles();
	 * ***********************************
	 */
	@BeforeSuite
	public  void loadClassFiles()
	{
		try {
			utility = new XMLUtility();
			appInd = new AppIndependentMethods();
			appDep = new AppDependentMethods();
			omap = new HashMap();
			strController = System.getProperty("user.dir")+"\\ExecutionController\\TestSet1.xlsx";	
			datatable = new Datatable();
			finalReport = "FinalReport"+appInd.getDateTime("ddMMyyyy_hhmmss");
			

		}catch(Exception e)
		{
			System.out.println(e);
		}
	}
	/************************************
	 * Method Name	: preRequisite()
	 * Purpose		: prerequisete before running the tests
	 * Author		: Sachin
	 * Reviewer		: Ganesh
	 * Example		: preRequisite();
	 * ***********************************
	 */
	@BeforeClass
	public void preRequisite()
	{
		try
		{
		
		
           appInd.moveanddeleteFile(System.getProperty("user.dir")+"\\test-output", "");
		} catch(Exception e)
		{
			System.out.println(e);
		}
		
	}
	

	/************************************
	 * Method Name	: runTset()
	 * Purpose		: to run the test dynamically
	 * Author		: Sachin
	 * Reviewer		: Ganesh
	 * Example		: runTset(Browser name);
	 * ***********************************
	 */
	@Test
	@Parameters("Browser")
	public void runTset(String strBrowser)
	{
		try
		{
			oBrowser= appDep.launchBrowser(strBrowser);
			appDep.navigateToApp();
			mainMenu = new MainMenu(oBrowser);
			homeSubMenu = new HomeSubMenu(oBrowser);
			financeSubMenu = new FinanceSubMenu(oBrowser);
			hrSubMenu = new HRSubMenu(oBrowser);
		    w2= new WebDriverWait(oBrowser,60);
			utility.createXml();
			utility.autoRunXml();
		} catch(Exception e)
		{
			System.out.println(e);
		}
		
	}
	
	/************************************
	 * Method Name	: endTest()
	 * Purpose		: after test activity
	 * Author		: Sachin
	 * Reviewer		: Ganesh
	 * Example		: endTest();
	 * ***********************************
	 */
	@AfterSuite
	public void endTest()
	{
		try
		{
			appDep.closeDriver();
			appInd.moveFileZipandMail(System.getProperty("user.dir")+"\\ExecutionController", sceenShotPath.substring(0, sceenShotPath.indexOf("\\screenShots")));
			utility = null;
			appInd = null;
			appDep = null;
			datatable = null;
			omap = null;
			oBrowser= null;
		} catch(Exception e)
		{
			
		}
		
	}
}
