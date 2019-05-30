package baseClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import driver.DriverScript;
import methods.Frames;

public class FinanceSubMenu extends DriverScript  {
	
	WebDriver iDriver;
	
	public FinanceSubMenu(WebDriver oDriver)
	{
		iDriver= oDriver;
		PageFactory.initElements(iDriver, this);
	}
	
	@FindBy(partialLinkText="Approvals")
	private WebElement approvals;
	public WebElement getApprovals()
	{
		return approvals;
	}

	@FindBy(partialLinkText="Payments")
	private WebElement payments;
	public WebElement getPayments()
	{
		return payments;
	}
	
	@FindBy(partialLinkText="Configure") 
	private WebElement configure;
	public WebElement getConfigure()
	{
		return configure;
	}

	@FindBy(partialLinkText="Accounting")
	private WebElement accounting;
	public WebElement getAccounting()
	{
		return accounting;
	}

	@FindBy(partialLinkText="Audit")
	private WebElement audit;
	public WebElement getAudit()
	{
		return audit;
	}
		
	@FindBy(partialLinkText="Global COA Config")
	private WebElement globalCOAConfig;
	public WebElement getGlobalCOAConfig()
	{
		return globalCOAConfig;
	}
	
	@FindBy(partialLinkText="Budget")
	private WebElement budget;
	public WebElement getBudget()
	{
		return budget;
	}
	
	@FindBy(partialLinkText="Loan")
	private WebElement loan;
	public WebElement getLoan()
	{
		return loan;
	}
	
	@FindBy(partialLinkText="Masters")
	private WebElement masters;
	public WebElement getMasters()
	{
		return masters;
	}

	@FindBy(partialLinkText="Payroll")
	private WebElement payroll;
	public WebElement getPayroll()
	{
		return payroll;
	}
	
	@FindBy(partialLinkText="Search")
	private WebElement search;
	public WebElement getSearch()
	{
		return search;
	}
	
	@FindBy(partialLinkText="Reports")
	private WebElement reports;
	public WebElement getReports()
	{
		return reports;
	}
	
	@FindBy(partialLinkText="Utilities")
	private WebElement utilities;
	public WebElement getUtilities()
	{
		return utilities;
	}
	
	@FindBy(partialLinkText="GST Migration")
	private WebElement gstMigration;
	public WebElement getGSTMigration()
	{
		return gstMigration;
	}
	
	public void clickApprovals() throws Exception
	{
		Frames.SubMenuFrame();
		appInd.clickObject(financeSubMenu.getApprovals());
	}
	
	public void clickPayments() throws Exception
	{
		Frames.SubMenuFrame();
		appInd.clickObject(financeSubMenu.getPayments());
	}
	
	public void clickConfigure() throws Exception
	{
		Frames.SubMenuFrame();
		appInd.clickObject(financeSubMenu.getConfigure());
	}
	
	public void clickAccounting() throws Exception
	{
		Frames.SubMenuFrame();
		appInd.clickObject(financeSubMenu.getAccounting());
	}
	
	public void clickAudit() throws Exception
	{
		Frames.SubMenuFrame();
		appInd.clickObject(financeSubMenu.getAudit());
	}
	
	public void clickGlobalCOAConfig() throws Exception
	{
		Frames.SubMenuFrame();
		appInd.clickObject(financeSubMenu.getGlobalCOAConfig());
	}
	
	public void clickBudget() throws Exception
	{
		Frames.SubMenuFrame();
		appInd.clickObject(financeSubMenu.getBudget());
	}
	
	public void clickLoan() throws Exception
	{
		Frames.SubMenuFrame();
		appInd.clickObject(financeSubMenu.getLoan());
	}
	
	public void clickMasters() throws Exception
	{
		Frames.SubMenuFrame();
		appInd.clickObject(financeSubMenu.getMasters());
	}
	
	public void clickPayroll() throws Exception
	{
		Frames.SubMenuFrame();
		appInd.clickObject(financeSubMenu.getPayroll());
	}
	
	public void clickSearch() throws Exception
	{
		Frames.SubMenuFrame();
		appInd.clickObject(financeSubMenu.getSearch());
	}
	
	public void clickReports() throws Exception
	{
		Frames.SubMenuFrame();
		appInd.clickObject(financeSubMenu.getReports());
	}
	
	public void clickUtilities() throws Exception
	{
		Frames.SubMenuFrame();
		appInd.clickObject(financeSubMenu.getUtilities());
	}
	
	public void clickGSTMigration() throws Exception
	{
		Frames.SubMenuFrame();
		appInd.clickObject(financeSubMenu.getGSTMigration());
	}

}
