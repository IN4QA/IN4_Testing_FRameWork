package baseClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import driver.DriverScript;

public class HRSubMenu extends DriverScript{
	WebDriver iDriver;
	public HRSubMenu(WebDriver oDriver)
	{
		iDriver = oDriver;
		PageFactory.initElements(iDriver, this);
	}
	
	@FindBy(partialLinkText="My Profile")
	private WebElement myProfile;
	public WebElement getMyProfile()
	{
		return myProfile;
	}
	
	public void clickMyProfile() throws Exception
	{
		appInd.clickObject(hrSubMenu.getMyProfile());
	}
	
	@FindBy(partialLinkText="Emp List")
	private WebElement empList;
	public WebElement getEmpList()
	{
		return empList;
	}
	
	@FindBy(partialLinkText="Leave Requisition")
	private WebElement leaveRequisition;
	public WebElement getLeaveRequisition()
	{
		return leaveRequisition;
	}
	
	public void clickLeaveRequisition() throws Exception
	{
		appInd.clickObject(hrSubMenu.getLeaveRequisition());
	}
	
	@FindBy(partialLinkText="Team Info")
	private WebElement teamInfo;
	public WebElement getTeamInfo()
	{
		return teamInfo;
	}
	
	public void clickTeamInfo() throws Exception
	{
		appInd.clickObject(hrSubMenu.getTeamInfo());
	}
	
	@FindBy(partialLinkText="Configure HR")
	private WebElement configureHR;
	public WebElement getConfigureHR()
	{
		return configureHR;
	}
	
	public void clickConfigureHR() throws Exception
	{
		appInd.clickObject(hrSubMenu.getConfigureHR());
	}
	
	@FindBy(partialLinkText="Inbox")
	private WebElement inbox;
	public WebElement getInbox()
	{
		return inbox;
	}
	
	public void clickInbox() throws Exception
	{
		appInd.clickObject(hrSubMenu.getInbox());
	}
	
	@FindBy(partialLinkText="Outbox")
	private WebElement outbox;
	public WebElement getOutbox()
	{
		return outbox;
	}
	
	public void clickOutbox() throws Exception
	{
		appInd.clickObject(hrSubMenu.getOutbox());
	}
	
	@FindBy(partialLinkText="Alerts")
	private WebElement alerts;
	public WebElement getAlerts()
	{
		return alerts;
	}
	
	public void clickAlerts() throws Exception
	{
		appInd.clickObject(hrSubMenu.getAlerts());
	}
	
	@FindBy(partialLinkText="Payroll")
	private WebElement payroll;
	public WebElement getPayroll()
	{
		return payroll;
	}
	
	public void clickPayroll() throws Exception
	{
		appInd.clickObject(hrSubMenu.getPayroll());
	}
	
	@FindBy(partialLinkText="Leave Calendar")
	private WebElement leaveCalendar;
	public WebElement getLeaveCalendar()
	{
		return leaveCalendar;
	}
	
	public void clickLeaveCalendar() throws Exception
	{
		appInd.clickObject(hrSubMenu.getLeaveCalendar());
	}
	
	@FindBy(partialLinkText="Reports")
	private WebElement reports;
	public WebElement getReports()
	{
		return reports;
	}
	
	public void clickReports() throws Exception
	{
		appInd.clickObject(hrSubMenu.getReports());
	}
	
	@FindBy(partialLinkText="Attendance")
	private WebElement attendance;
	public WebElement getAttendance()
	{
		return attendance;
	}
	
	public void clickAttendance() throws Exception
	{
		appInd.clickObject(hrSubMenu.getAttendance());
	}

}
