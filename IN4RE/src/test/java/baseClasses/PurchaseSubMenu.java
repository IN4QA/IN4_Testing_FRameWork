package baseClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import driver.DriverScript;
import methods.Frames;

public class PurchaseSubMenu extends DriverScript
{
	WebDriver iDriver;
	public PurchaseSubMenu(WebDriver oDriver)
	{
		iDriver=oDriver;
		PageFactory.initElements(iDriver, this);
	} 
	
	@FindBy(partialLinkText ="Inventory")
	private WebElement inventory;
	public WebElement getInventory()
	{
		return inventory;
	}
	
	public void clickInventory() throws Exception
	{
		Frames.SubMenuFrame();
		appInd.clickObject(purchaseSubMenu.getInventory());
	}
}
