package methods;
/*********************************
 * class Name	: methods.Frames
 * Purpose		: for frames related operations
 * Author		: Ganesh
 * Date Creation: 05th-August-2019
 * Example		: 
 * 
 * ******************************
 */

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;


import driver.DriverScript;
import net.sf.cglib.core.ReflectUtils;


public class Frames extends DriverScript
{
	/*********************************
	 * Method Name	: MainMenuFrame()
	 * Purpose		: to switch to the MainMenuFrame
	 * Author		: Ganesh
	 * Date Creation: 05th-August-2019
	 * Example		: MainMenuFrame;
	 * 
	 * ******************************
	 */
	
	public static void MainMenuFrame()
	{
		try
		{
			oBrowser.switchTo().defaultContent();
		    
			w2.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt("mainmenuFrame"));
		
		} catch(Exception e)
		{
			
		}
	
	}
	/*********************************
	 * Method Name	: SubMenuFrame()
	 * Purpose		: to switch to the SubMenuFrame
	 * Author		: Ganesh
	 * Date Creation: 05th-August-2019
	 * Example		: SubMenuFrame;
	 * 
	 * ******************************
	 */
	
	public static boolean SubMenuFrame()
	{
		try
		{
			oBrowser.switchTo().defaultContent();
			  if(oBrowser.findElements(By.cssSelector("frame[name='submenuFrame']")).size()>0)
			  {
			w2.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt("submenuFrame"));
			return true;
			  } else
			  {
				  return false;
			  }
		} catch(Exception e)
		{
			return false;
		}
	
		  
	}
	/*********************************
	 * Method Name	: mainFrame()
	 * Purpose		: to switch to the mainFrame
	 * Author		: Ganesh
	 * Date Creation: 05th-August-2019
	 * Example		: mainFrame;
	 * 
	 * ******************************
	 */
	
	public static boolean mainFrame()
	{
		try
		{
			   oBrowser.switchTo().defaultContent();
			   if(oBrowser.findElements(By.cssSelector("frame[name='mainFrame']")).size()>0)
			   {
				w2.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt("mainFrame"));
				
				return true;
			   } else
			   {
				   return false;
			   }
		} catch(Exception e)
		{
			return false;
		}
	  
	
	}
	
	/*********************************
	 * Method Name	: rightFrame()
	 * Purpose		: to switch to the rightFrame
	 * Author		: Ganesh
	 * Date Creation: 05th-August-2019
	 * Example		: rightFrame;
	 * 
	 * ******************************
	 */
	public static boolean rightFrame()
	{
		try
		{
			mainFrame();
			if(oBrowser.findElements(By.cssSelector("frame[name='rightframe']")).size()>0)
			{
			w2.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt("rightframe"));
			
			return true;
			} else
			{
				System.out.println("Exception While Switching to right frame");
				appInd.captureScreenShot();
				return false;
			}
		} catch(Exception e)
		{
			return false;
		}
		
	}	
	/*********************************
	 * Method Name	: leftFrame()
	 * Purpose		: to switch to the leftFrame
	 * Author		: Ganesh
	 * Date Creation: 05th-August-2019
	 * Example		: leftFrame;
	 * 
	 * ******************************
	 */

	public static boolean leftFrame()
	{
		try
		{
			mainFrame();
			
			if(oBrowser.findElements(By.cssSelector("frame[name='frameLeft']")).size()>0)
			{
			w2.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt("frameLeft"));
			return true;
			} else
			{
				return false;
			}
			
		} catch(Exception e)
		{
			return false;
		}

		
	}
	/*********************************
	 * Method Name	: tabFrame()
	 * Purpose		: to switch to the tabFrame
	 * Author		: Ganesh
	 * Date Creation: 05th-August-2019
	 * Example		: tabFrame;
	 * 
	 * ******************************
	 */
	
	public static boolean tabFrame()
	{
		try
		{
			rightFrame();
			if(oBrowser.findElements(By.cssSelector("frame[name='TabFrame']")).size()>0)
			{
			w2.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt("TabFrame"));
			return true;
			} else
			{
				return false;
			}
		} catch(Exception e)
		{
			return false;
		}

		

	}
	
	/*********************************
	 * Method Name	: contentFrame()
	 * Purpose		: to switch to the contentFrame
	 * Author		: Ganesh
	 * Date Creation: 05th-August-2019
	 * Example		: contentFrame;
	 * 
	 * ******************************
	 */
	public static void contentFrame()
	{

		mainFrame();
		w2.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt("ContentFrame"));

	}
	/*********************************
	 * Method Name	: mainDnFrame()
	 * Purpose		: to switch to the mainDnFrame
	 * Author		: Ganesh
	 * Date Creation: 05th-August-2019
	 * Example		: mainDnFrame;
	 * 
	 * ******************************
	 */
	public static boolean mainDnFrame()
	{
		try
		{
			rightFrame();
			if(oBrowser.findElements(By.cssSelector("frame[name='mainDn']")).size()>0)
			{
			w2.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt("mainDn"));
			return true;
			} else
			{
				return false;
			}
			
		} catch(Exception e)
		{
			return false;
		}
	}
	
	public static boolean iFrame()
	{
		try
		{
			rightFrame();
			if(oBrowser.findElements(By.cssSelector("iframe[class*= 'Iframe']")).size()>0)
			{
			//w2.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(By.cssSelector("iframe[class*= 'Iframe']")));
			oBrowser.switchTo().frame(oBrowser.findElement(By.cssSelector("iframe[class*= 'Iframe']")));
			return true;
			} else
			{
				return false;
			}
			
		} catch(Exception e)
		{
			return false;
		}
	}
}