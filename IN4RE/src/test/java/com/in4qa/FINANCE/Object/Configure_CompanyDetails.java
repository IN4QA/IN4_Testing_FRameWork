package com.in4qa.FINANCE.Object;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.in4qa.FINANCE.Tests.Configure_CompanyDetailsTests;

import methods.Frames;

public class Configure_CompanyDetails extends Configure_CompanyDetailsTests {
	WebDriver iDriver;
	
	public Configure_CompanyDetails(WebDriver oDriver)
	{
		this.iDriver = oDriver;
		
		PageFactory.initElements(iDriver, this);
	}
	
	@FindBy(partialLinkText="Company Details")
	private WebElement companyDetails;
	public WebElement getCompanyDetailsLink()
	{
		return companyDetails;
	}
	
	@FindBy(css="select[id='ddlCompany']")
	private WebElement companyDropDown;
	public WebElement getCompanyDropDown()
	{
		return companyDropDown;
	}
	
	@FindBy(id="btnCreate")
	private WebElement btnCreate;
	public WebElement getCreateProjectButton()
	{
		return btnCreate;
	}
	
	@FindBy(css="input[id='txtCompanyName']")
	private WebElement txtCompanyName;
	public WebElement getCompanyName()
	{
		return txtCompanyName;
	}
	
	@FindBy(css="input[id='txtCompanyCode']")
	private WebElement txtCompanyCode;
	public WebElement getCompanyCode()
	{
		return txtCompanyCode;
	}
	
	@FindBy(css="input[id='dtFromDate_txtDatePicker']")
	private WebElement fromCalender;
	public WebElement getFromCalender()
	{
		return fromCalender;
	}
	
	@FindBy(css="input[id='dtToDate_txtDatePicker']")
	private WebElement toCalender;
	public WebElement getToCalender()
	{
		return toCalender;
	}
	
	@FindBy(css="select[class='datepick-month-year']")
	private WebElement monthDropDown;
	public WebElement getCalenderMonthDropDown()
	{
		return monthDropDown;
	}
	
	@FindBy(css="select[title='Change the year']")
	private WebElement yearDropDown;
	public WebElement getCalenderYearDropDown()
	{
		return yearDropDown;
	}
	
	@FindBy(id="txtCompanyPrint")
	private WebElement txtCompanyPrint;
	public WebElement getCompanyPrintName()
	{
		return txtCompanyPrint;
	}
	
	@FindBy(css="select[name='ddlPackage']")
	private WebElement accountingPackage;
	public WebElement getAccountingPackage()
	{
		return accountingPackage;
	}
	
	@FindBy(css="input[id='txtCIN']")
	private WebElement corporateIdentityNo;
	public WebElement getCorporateIdentityNo()
	{
		return corporateIdentityNo;
	}
	
	@FindBy(css="input[id='txtDeductionTax']")
	private WebElement taxDeductionAccNo;
	public WebElement getTaxDeductionAccNo()
	{
		return taxDeductionAccNo;
	}
	
	@FindBy(css="input[id='txtPAN']")
	private WebElement panNo;
	public WebElement getPanNo()
	{
		return panNo;
	}
	
	@FindBy(css="input[id='btnSubmit']")
	private WebElement submitButton;
	public WebElement getSubmitButton()
	{
		return submitButton;
	}
	
	@FindBy(css="input[id='txtAddress1']")
	private WebElement addressField1;
	public WebElement getAddressFiled1()
	{
		return addressField1;
	}
	
	@FindBy(css="input[id='txtAddress2']")
	private WebElement addressField2;
	public WebElement getAddressFiled2()
	{
		return addressField2;
	}
	
	@FindBy(css="select[id='ddlCountry']")
	private WebElement countryDropDown;
	public WebElement getCountryDropDown()
	{
		return countryDropDown;
	}
	
	@FindBy(css="select[id='ddlState']")
	private WebElement stateDropDown;
	public WebElement getStateDropDown()
	{
		return stateDropDown;
	}
	
	@FindBy(css="select[id='ddlCity']")
	private WebElement cityDropDown;
	public WebElement getCityDropDown()
	{
		return cityDropDown;
	}
	
	@FindBy(css="input[id='chkSameAsOfficeAddress']")
	private WebElement chkSameAsOfficeAddress;
	public WebElement getSameAsOfficeAddressCheckBox()
	{
		return chkSameAsOfficeAddress;
	}
	
	@FindBy(css="input[id='txtPrintAddress1']")
	private WebElement printAddress1;
	public WebElement getPrintAddress1()
	{
		return printAddress1;
	}
	
	@FindBy(css="input[id='txtPrintAddress2']")
	private WebElement PrintAddress2;
	public WebElement getPrintAddress2()
	{
		return PrintAddress2;
	}
	
	@FindBy(css="select[id='ddlPrintCountry']" )
	private WebElement printCountry;
	public WebElement getPrintCountryDropDown()
	{
		return printCountry;
	}
	
	@FindBy(css="select[id='ddlPrintState']")
	private WebElement printState;
	public WebElement getPrintStateDropDown()
	{
		return printState;
	}
	
	@FindBy(css="select[id='ddlPrintCity']")
	private WebElement printCity;
	public WebElement getPrintCityDropDown()
	{
		return printCity;
	}
	
	@FindBy(css="input[id='txtPrintPin']")
	private WebElement printPin;
	public WebElement getPrintPin()
	{
		return printPin;
	}
	
	@FindBy(css="input[id='txtDomain']")
	private WebElement domainName;
	public WebElement getDomainName()
	{
		return domainName;
	}
	
	@FindBy(css="input[id='txtEMail']")
	private WebElement email;
	public WebElement getEmailTextField()
	{
		return email;
	}
	@FindBy(css="input[id='txtServerHost']")
	private WebElement serverHost;
	public WebElement getServerHost()
	{
		return serverHost;
	}
	
	@FindBy(css="input[id='txtServiceTax']")
	private WebElement serviceTaxNo;
	public WebElement getServiceTaxNo()
	{
		return serviceTaxNo;
	}
	
	@FindBy(css="input[id='txtVAT']")
	private WebElement VatNo;
	public WebElement getVatNo()
	{
		return VatNo;
	}
	
	@FindBy(id="txtTAN")
	private WebElement tanNo; 
	public WebElement getTanNo()
	{
		return tanNo;
	}
	
	@FindBy(id="chkPFApplicable")
	private WebElement pfApplicable;
	public WebElement getPFApplicable()
	{
		return pfApplicable;
	}
	
	@FindBy(id="chkESIApplicable")
	private WebElement esiApplicable;
	public WebElement getESIApplicable()
	{
		return esiApplicable;
	}
	
	@FindBy(id="ddlSalaryCalculation")
	private WebElement salaryCalculation;
	public WebElement getSalaryCalculationDropDown()
	{
		return salaryCalculation;
	}
	
	@FindBy(id="txtCompanyPin")
	private WebElement companyPin;
	public WebElement getCompanyPin()
	{
		return companyPin;
	}
	
	@FindBy(id="txtCompanyTelephone")
	private WebElement companyTelephone;
	public WebElement getCompanyTelephone()
	{
		return companyTelephone;
	}
	
	@FindBy(id="txtCompanyFax")
	private WebElement companyFax;
	public WebElement getCompanyFax()
	{
		return companyFax;
	}
	
	@FindBy(id="txtPrintTelephone")
	private WebElement printTelephone;
	public WebElement getPrintTelephone()
	{
		return printTelephone;
	}
	
	@FindBy(id="txtPrintFax")
	private WebElement printFax;
	public WebElement getPrintFax()
	{
		return printFax;
	}
	
	@FindBy(id="txtPF")
	private WebElement pfNo;
	public WebElement getPfNo()
	{
		return pfNo;
	}
	
	@FindBy(id="txtESI")
	private WebElement txtESI;
	public WebElement getTxtESI()
	{
		return txtESI;  
	}
	
	
	public void clickCompanyDetailsLink() throws Exception
	{
		Frames.leftFrame();
		appInd.clickObject(company_details.getCompanyDetailsLink());
	}
	
	
	public boolean isNotCompanyExist(String strCompany) throws Exception
	{
		Select osle = null;String strText=null;
		int flag=0;
	
			osle = new Select(company_details.getCompanyDropDown());
			for(WebElement option: osle.getOptions())
			{
				strText = option.getText();
				if(strText.equals(strCompany))
				{
					flag=1;
					break;
				}
			}
			if(flag==1)
			{
				return false;
			} else
			{
				return true;
			}	
					
	}
	
	public boolean create_company(int i)
	{
		try
		{
			mainMenu.clickFinance();
			financeSubMenu.clickConfigure();
			company_details.clickCompanyDetailsLink();
			Frames.mainDnFrame();
			if(company_details.isNotCompanyExist(map.get("Company Name"+i)))
			{
				appInd.clickObject(company_details.getCreateProjectButton());
				appInd.setObject(company_details.getCompanyName(), map.get("Company Name"+i));
				appInd.setObject(company_details.getCompanyCode(), map.get("Company Code"+i));
				appInd.clickOnCalender(company_details.getFromCalender(), company_details.getCalenderMonthDropDown(), map.get("FromMonth"+i), company_details.getCalenderYearDropDown(), map.get("FromYear"+i), map.get("FromDate"+i));
				appInd.clickOnCalender(company_details.getToCalender(), company_details.getCalenderMonthDropDown(), map.get("ToMonth"+i), company_details.getCalenderYearDropDown(), map.get("ToYear"+i), map.get("ToDate"+i));
				appInd.setObject(company_details.getCompanyPrintName(), map.get("Company Print Name"+i));
				appInd.setObject(company_details.getDomainName(), map.get("Domain Name"+i));
				appInd.setObject(company_details.getEmailTextField(), map.get("E-Mail"+i));
				appInd.setObject(company_details.getServerHost(), map.get("Server Host"+i));
				appInd.selectDropDown(company_details.getAccountingPackage(), map.get("Accounting Package"+i));
				appInd.setObject(company_details.getCorporateIdentityNo(), map.get("Corporate Identity No"+i));
				appInd.setObject(company_details.getTaxDeductionAccNo(), map.get("Tax Deduction Acc No"+i));
				appInd.setObject(company_details.getServiceTaxNo(), map.get("Service Tax No"+i));
				appInd.setObject(company_details.getPanNo(), map.get("PAN No"+i));
				appInd.setObject(company_details.getVatNo(), map.get("VAT No"+i));
				appInd.setObject(company_details.getTanNo(), map.get("TAN No"+i));
				if(datatable.getCellData("./TestData/Finance/Configure.xlsx", "Company Details", "PF Applicable", i).equalsIgnoreCase("yes"))
				{
					appInd.clickObject(company_details.getPFApplicable());
					appInd.setObject(company_details.getPfNo() , map.get("PF No"+i));
				}
				if(datatable.getCellData("./TestData/Finance/Configure.xlsx", "Company Details", "ESI Applicable", i).equalsIgnoreCase("yes"))
				{
					appInd.clickObject(company_details.getESIApplicable());
					appInd.setObject(company_details.getTxtESI(), map.get("ESI No"+i));
				}
				appInd.selectDropDown(company_details.getSalaryCalculationDropDown(), map.get("Salary Calculation"+i));
				appInd.setObject(company_details.getAddressFiled1(), map.get("Address1"+i));
				appInd.setObject(company_details.getAddressFiled2(), map.get("Address2"+i));
				appInd.selectDropDown(company_details.getCountryDropDown(),  map.get("Country"+i));
				appInd.selectDropDown(company_details.getStateDropDown(), map.get("State/Province"+i));
				appInd.selectDropDown(company_details.getCityDropDown(), map.get("City"+i));
				appInd.setObject(company_details.getCompanyPin() , map.get("Pin/Zip"+i));
				appInd.setObject(company_details.getCompanyTelephone(), map.get("Telephone"+i));
				appInd.setObject(company_details.getCompanyFax(), map.get("Fax"+i));
				appInd.setObject(company_details.getPrintAddress1(), map.get("PrintAddress1"+i));
				appInd.setObject(company_details.getPrintAddress2(), map.get("PrintAddress2"+i));
				appInd.selectDropDown(company_details.getPrintCountryDropDown() , map.get("PrintCountry"+i));
				appInd.selectDropDown(company_details.getPrintStateDropDown() , map.get("Print State/Province"+i));
				appInd.selectDropDown(company_details.getPrintCityDropDown() , map.get("PrintCity"+i));
				appInd.setObject(company_details.getPrintPin(), map.get("PrintPin/Zip"+i));
				appInd.setObject(company_details.getPrintTelephone() , map.get("PrintTelephone"+i));
				appInd.setObject(company_details.getPrintFax(), map.get("PrintFax"+i));
				appInd.clickObject(company_details.getSubmitButton());	
			}
			if(company_details.isNotCompanyExist(map.get("Company Name"+i)))
			{
				return false;
			} else
			{
				return true;
			}
		
			
		} catch(Exception e)
		{
			appInd.captureScreenShot();
			return false;
		}
	}
	

}
