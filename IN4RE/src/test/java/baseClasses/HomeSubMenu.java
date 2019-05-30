package baseClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import driver.DriverScript;
import methods.Frames;

public class HomeSubMenu extends DriverScript{
	
	WebDriver iDriver;
	
	public HomeSubMenu(WebDriver oDriver)
	{
		iDriver = oDriver;
		PageFactory.initElements(iDriver, this);
	}
	
	@FindBy( xpath= "//a[text()='My Home']")
	private WebElement myHome;
	public WebElement getMyHome()
	{
		return myHome;
	}
	
	@FindBy(xpath = "//a[text()='Staffing']")
	private WebElement staffing;
	public WebElement getStaffing()
	{
		return staffing;
	}
	
	@FindBy(xpath = "//a[text()='Company Updates']")
	private WebElement CompanyUpdates;
	public WebElement getCompanyUpdates()
	{
		return CompanyUpdates;
	}
	
	@FindBy(xpath= "//a[text()='Administration']")
	private WebElement administration;
	public WebElement getAdministration()
	{
		return administration;
	}
	
	@FindBy(xpath= "//a[text()='Alerts']")
	private WebElement alerts;
	public WebElement getAlerts()
	{
		return alerts;
	}
	
	@FindBy(xpath = "//a[text()='Personalize']")
	private WebElement personalize;
	public WebElement getPersonalize()
	{
		return personalize;
	}
	
	@FindBy(xpath= "//a[text()='Favorites']")
	private WebElement favorites;
	public WebElement getFavorites()
	{
		return favorites;
	}
	
	@FindBy(xpath = "//a[text()='Reports']")
	private WebElement reports;
	public WebElement getReports()
	{
		return reports;
	}
	
	@FindBy(xpath = "//a[text()='Help']")
	private WebElement help;
	public WebElement getHelp()
	{
		return help;
	}
	
	@FindBy(xpath="//a[text()='Invoice Tracking']")
	private WebElement invoiceTracking;
	public WebElement getinvoiceTracking()
	{
		return invoiceTracking;
	}
	
	@FindBy(xpath = "//a[text()='Approvals']")
	private WebElement approvals;
	public WebElement getApprovals()
	{
		return approvals;
	}
	
	public boolean clickmyHome()
	{
		try
		{
			Frames.SubMenuFrame();
			appInd.clickObject(homeSubMenu.getMyHome());
			return true;
		} catch(Exception e)
		{
			return false;
		}
	}
	
	public boolean clickStaffing()
	{
		try
		{
			Frames.SubMenuFrame();
			appInd.clickObject(homeSubMenu.getStaffing());
			return true;
		} catch(Exception e)
		{
			return false;
		}
	}
	
	public boolean clickCompanyUpdates()
	{
		try
		{
			Frames.SubMenuFrame();
			appInd.clickObject(homeSubMenu.getCompanyUpdates());
			return true;
		} catch(Exception e)
		{
			return false;
		}
	}
	
	public boolean clickAdministration()
	{
		try
		{
			Frames.SubMenuFrame();
			appInd.clickObject(homeSubMenu.getAdministration());
			return true;
		} catch(Exception e)
		{
			appInd.captureScreenShot();
			return false;
		}
	}
	
	public boolean clickAlerts()
	{
		try
		{
			Frames.SubMenuFrame();
			appInd.clickObject(homeSubMenu.getAlerts());
			return true;
		} catch(Exception e)
		{
			return false;
		}
	}
	
	public boolean clickPersonalize()
	{
		try
		{
			Frames.SubMenuFrame();
			appInd.clickObject(homeSubMenu.getPersonalize());
			return true;
		} catch(Exception e)
		{
			return false;
		}
	}
	
	public boolean clickFavorites()
	{
		try
		{
			Frames.SubMenuFrame();
			appInd.clickObject(homeSubMenu.getFavorites());
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
			appInd.clickObject(homeSubMenu.getReports());
			return true;
		} catch(Exception e)
		{
			return false;
		}
	}
	
	public boolean clickHelp()
	{
		try
		{
			Frames.SubMenuFrame();
			appInd.clickObject(homeSubMenu.getHelp());
			return true;
		} catch(Exception e)
		{
			return false;
		}
	}
	
	public boolean clickinvoiceTracking()
	{
		try
		{
			Frames.SubMenuFrame();
			appInd.clickObject(homeSubMenu.getinvoiceTracking());
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
			appInd.clickObject(homeSubMenu.getApprovals());
			return true;
		} catch(Exception e)
		{
			return false;
		}
	}

}
