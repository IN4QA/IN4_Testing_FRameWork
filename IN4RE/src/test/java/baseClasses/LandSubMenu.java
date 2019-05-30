package baseClasses;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import driver.DriverScript;
import methods.Frames;

public class LandSubMenu extends DriverScript {
	
	WebDriver iDriver;
	
	public LandSubMenu(WebDriver oDriver)
	{
	 	iDriver = oDriver;
	 	PageFactory.initElements(iDriver, this);
	}
	
	
	@FindBy(xpath = "//a[text()='Property List']")
	private WebElement propertyList;
	public WebElement getPropertyList()
	{
		return propertyList;
	}
	
	@FindBy(xpath= "//a[text()='Land List']")
	private WebElement landList;
	public WebElement getLandList()
	{
		return landList;
	}
	
	@FindBy(xpath= "//a[text()='Billing']")
	private WebElement billing;
	public WebElement getBilling()
	{
		return billing;
	}
	
	@FindBy(xpath= "//a[text()='Budget']")
	private WebElement budget;
	public WebElement getBudget()
	{
		return budget;
	}
	
	@FindBy(xpath= "//a[text()='Approvals']")
	private WebElement approvals;
	public WebElement getApprovals()
	{
		return approvals;
	}
	
	@FindBy(xpath= "//a[text()='Masters']")
	private WebElement masters;
	public WebElement getMasters()
	{
		return masters;
	}
	
	@FindBy(xpath= "//a[text()='Search']")
	private WebElement search;
	public WebElement getSearch()
	{
		return search;
	}
	
	@FindBy(xpath= "//a[text()='Reports']")
	private WebElement reports;
	public WebElement getReports()
	{
		return reports;
	}
	
	@FindBy(xpath= "//a[text()='Bulk Upload']")
	private WebElement bulkUpload;
	public WebElement getBulkUpload()
	{
		return bulkUpload;
	}
	
	public boolean clickPropertyList()
	{
		try
		{
			Frames.SubMenuFrame();
			appInd.clickObject(landSubMenu.getPropertyList());
			return true;
		} catch(Exception e)
		{
			return false;
		}	
	}
	
	public boolean clickLandList()
	{
		try
		{
			Frames.SubMenuFrame();
			appInd.clickObject(landSubMenu.getLandList());
			return true;
		} catch(Exception e)
		{
			return false;
		}	
	}
	public boolean clickBilling()
	{
		try
		{
			Frames.SubMenuFrame();
			appInd.clickObject(landSubMenu.getBilling());
			return true;
		} catch(Exception e)
		{
			return false;
		}	
	}
	
	public boolean clickBudget()
	{
		try
		{
			Frames.SubMenuFrame();
			appInd.clickObject(landSubMenu.getBudget());
			return true;
		} catch(Exception e)
		{
			return false;
		}	
	}
	
	public boolean clickApprovals()
	{
		try
		{
			Frames.SubMenuFrame();
			appInd.clickObject(landSubMenu.getApprovals());
			return true;
		} catch(Exception e)
		{
			return false;
		}	
	}
	
	public boolean clickMasters()
	{
		try
		{
			Frames.SubMenuFrame();
			appInd.clickObject(landSubMenu.getMasters());
			return true;
		} catch(Exception e)
		{
			return false;
		}	
	}
	
	public boolean clickSearch()
	{
		try
		{
			Frames.SubMenuFrame();
			appInd.clickObject(landSubMenu.getSearch());
			return true;
		} catch(Exception e)
		{
			return false;
		}	
	}
	
	public boolean clickReports()
	{
		try
		{
			Frames.SubMenuFrame();
			appInd.clickObject(landSubMenu.getReports());
			return true;
		} catch(Exception e)
		{
			return false;
		}	
	}
	
	public boolean clickBulkUpload()
	{
		try
		{
			Frames.SubMenuFrame();
			appInd.clickObject(landSubMenu.getBulkUpload());
			return true;
		} catch(Exception e)
		{
			return false;
		}	
	}
	
	
	

}
