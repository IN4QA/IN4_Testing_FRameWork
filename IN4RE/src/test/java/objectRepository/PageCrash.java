package objectRepository;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

import driver.DriverScript;
import methods.Frames;
import testScripts.FullApplicationTestScripts;

public class PageCrash extends FullApplicationTestScripts {
	
	WebDriver ldriver;
	public PageCrash(WebDriver rdriver)
	{
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	@FindBy(css="td")
	private List<WebElement>  mainMenu;
	public  List<WebElement> getMainMenu()
	{
		return mainMenu;
	}
	@FindBy(css= "a")
	private List<WebElement>  subMenu;
	public  List<WebElement> getsubMenu()
	{
		return subMenu;
	}
	 
	@FindBy(css= "a")
	private List<WebElement>  leftMenu;
	public  List<WebElement> getLeftLink()
	{
		return leftMenu;
	}
	@FindBy(css="td")
	private List<WebElement>  tabMenu;
	public  List<WebElement> gettabLink()
	{
		return tabMenu;
	}
	
	
	public String clickOnSubMenu()
	{
		WebElement oEL = null;
		String strStatus="";
		int i=1;
	    try
	    {Frames.SubMenuFrame();
	    	Iterator<WebElement> subMenu = getsubMenu().iterator();
	    	while(subMenu.hasNext())
	    	{
	    		oEL = subMenu.next();
	    		 Frames.SubMenuFrame();
	    		if(pG.clickObject(oEL))
	    		{
	    			try
	    			{
	    				oEL = oBrowser.findElement(By.xpath("html/body/form/table/tbody/tr/td/a["+i+"]"));
	    				appInd.clickObject(oEL);
	    				appInd.isAlertPresent();
	    			} catch(Exception e)
	    			{};
	    			
	    		}
	    		if(Frames.mainFrame());
				{
					strStatus+=String.valueOf(appInd.verifyPageCrash());
				} 
	    		if(Frames.leftFrame())
	    		{
	    			strStatus+=clickOnLeftLing();
	    		}
	    		i++;
	    	} i=1;
	    	return strStatus;
	    } catch(Exception e)
	    {
	    	return null;
	    }
		
	}
	public String clickOnLeftLing()
	{
		WebElement oEL = null;
		String strStatus= "";
		int i=1;
		try
		{ Frames.leftFrame();
			List<WebElement> olist = getLeftLink();
			Iterator<WebElement> leftLink = olist.subList(1, olist.size()).iterator();
			while(leftLink.hasNext())
			{
				 oEL = leftLink.next();	
				 Frames.leftFrame();
				
				if(pG.clickObject(oEL))
				{
					try
	    			{
						oEL = oBrowser.findElement(By.xpath("html/body/form/table/tbody/tr/td/table/tbody/tr[2]/td/table/tbody/tr["+i+"]/td[3]/a"));		
						w2.until(ExpectedConditions.elementToBeClickable(oEL));
	    				appInd.clickObject(oEL);
	    				appInd.isAlertPresent();
	    			} catch(Exception e) {};
				}
				if(Frames.rightFrame())
				{
					strStatus+=String.valueOf(appInd.verifyPageCrash());
					if(Frames.tabFrame())
					{
						strStatus+=clickOntabMenu();
					}
				}
				i++;
			} i=1;
			return strStatus;
		} catch(Exception e)
		{
			return null;
		}
	}
	public String clickOntabMenu()
	{
		WebElement oEL = null;
		String strStatus = "";
		int i=1;
		try
		{Frames.tabFrame();
			List<WebElement> olist = gettabLink();
			Iterator<WebElement> tabMenu = olist.subList(1, olist.size()).iterator();
			while(tabMenu.hasNext())
			{
				Frames.tabFrame();
				
				if(pG.clickObject(tabMenu.next()))
				{
					try
	    			{
						oEL = oBrowser.findElement(By.xpath("//td["+i+"][contains(@class , 'Tab')]"));
						w2.until(ExpectedConditions.elementToBeClickable(oEL));
	    				appInd.clickObject(oEL);
	    				appInd.isAlertPresent();
	    			} catch(Exception e) {};
				}
				if(Frames.mainDnFrame())
				{
					strStatus+=String.valueOf(appInd.verifyPageCrash());
				}
				i++;
			} i=1;
			return strStatus;
		} catch(Exception e)
		{
			return null;
		}
		
	}	
	
	 public  boolean clickObject(WebElement element) {
		    try {
		          if(element.isDisplayed())
		          {   
		    		   ((JavascriptExecutor) oBrowser).executeScript("arguments[0].click();", w2.until(ExpectedConditions.elementToBeClickable(element)));
		    		    appInd.isAlertPresent();
		    		    menuName= element.getText();
		    	  } 
		        return false;  
		    } catch (Exception sere) {
		    	appInd.captureScreenShot();
		        return true;
		    }
	
		}
}
