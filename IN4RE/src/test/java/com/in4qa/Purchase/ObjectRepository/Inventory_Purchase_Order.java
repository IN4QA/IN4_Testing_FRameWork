package com.in4qa.Purchase.ObjectRepository;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import driver.DriverScript;
import com.in4qa.Purchase.Tests.Inventory_Purchase_Order_Test;
import baseClasses.PurchaseSubMenu;
import methods.Frames;

public class Inventory_Purchase_Order extends Inventory_Purchase_Order_Test

{
	WebDriver iDriver;
	public Inventory_Purchase_Order(WebDriver oDriver)
	{
		iDriver = oDriver;
		PageFactory.initElements(iDriver, this);
	}
	
	@FindBy(id="Purchase Orders")
	private WebElement Purchase_Order;
	public WebElement getPurchase_Order()
	{
		return Purchase_Order;
	}
	
	@FindBy(xpath="//*[@id='btnCreate']") // create Indent/PO
	private WebElement CreatePurchase_Order;
	public WebElement getCreatePurchase_order()
	{
		return CreatePurchase_Order;
    }
	@FindBy(id="frmViewPOIndent_rdoPOCategoryList_0")
	private WebElement PO_Category_Material;
	public WebElement getPO_Category_Material()
	{
		return PO_Category_Material;
	}
	
	@FindBy(id="frmViewPOIndent_rdoPOCategoryList_1")
	private WebElement PO_Category_Asset;
	public WebElement getPO_CategoryAsset()
	{
		return PO_Category_Asset;
	}
	
	@FindBy(id="frmViewPOIndent_ddlProjectList")
	private WebElement PO_Project;
	public WebElement getPO_Project()
	{
		return PO_Project;
	}
	
	@FindBy(id="frmViewPOIndent_ddlPOTypeList")
	private WebElement PO_Type;
	public WebElement getPO_Type()
	{
		return PO_Type;
	}
	
	@FindBy(id="frmViewPOIndent_dtPODate_txtDatePicker")
	private WebElement PO_Date;
	public WebElement getPO_date()
	{
		return PO_Date;
	}
	
	@FindBy(id="frmViewPOIndent_lnkSupplier")
	private WebElement PO_Supplier_Select;
	public WebElement getPO_Supplier_Select()
	{
		return PO_Supplier_Select;
	}
	
	@FindBy(id="txtSupplierName")
	private WebElement PO_Supplier_Name;
	public WebElement getPO_Supplier_Name()
	{
		return PO_Supplier_Name;
	}
	
	@FindBy(id="txtSupplierName")
	private WebElement PO_Supplier_ContackName;
	public WebElement getPO_Supplier_ContackName()
	{
		return PO_Supplier_ContackName;
	}
	
	@FindBy(id="ddlFilterMaterialTypeList")
	private WebElement PO_Supplier_MaterialType;
	public WebElement getPO_Supplier_MaterialType()
	{
		return  PO_Supplier_MaterialType;
	}
	
	@FindBy(id="ddlFilterMaterialSubTypeList")
	private WebElement PO_Supplier_Material_SubType;
	public WebElement getPO_Supplier_Material_SubType()
	{
		return  PO_Supplier_Material_SubType;
	}
	
	@FindBy(id="ddlFilterMaterialList")
	private WebElement PO_Supplier_Material;
	public WebElement getPO_Supplier_Material()
	{
		return  PO_Supplier_Material;
	}
	
	@FindBy(id="btnSearch")
	private WebElement PO_Supplier_Search;
	public WebElement getPO_Supplier_Search()
	{
		return  PO_Supplier_Search;
	}
	
	@FindBy(id="gdvSupplierList_ctl04_lnkSupplierName")
	private WebElement PO_SupplierSelect;
	public WebElement getPO_SupplierSelect()
	{
		return  PO_SupplierSelect;
	}
	
	@FindBy(id="frmViewPOIndent_lnkAddIndent")
	private WebElement PO_AddIndent;
	public WebElement getPO_AddIndent()
	{
		return  PO_AddIndent;
	}
	
	@FindBy(id="btnFilterGO")
	private WebElement PO_AddIndent_Search;
	public WebElement getPO_AddIndent_Search()
	{
		return  PO_AddIndent_Search;
	}
	
	@FindBy(id="gvIndentList_ctl02_chkBoxIndent")
	private WebElement PO_AddIndent_SelectIndent;
	public WebElement getPO_AddIndent_SelectIndent()
	{
		return  PO_AddIndent_SelectIndent;
	}
	
	@FindBy(id="frmViewPOIndent_dtPODate_txtDatePicker")
	private WebElement PO_Calender;
	public WebElement getPO_Calender()
	{
		return  PO_Calender;
	}
	
	@FindBy(css="select[title='Change the month']")
	private WebElement PO_Calender_Month;
	public WebElement getPO_Calender_Month()
	{
		return PO_Calender_Month;
	}
	
	@FindBy(css="select[title='Change the year']")
	private WebElement PO_Calender_Year;
	public WebElement getPO_Calender_Year()
	{
		return PO_Calender_Year;
	}
	
	
	@FindBy(id="frmViewPOIndent_lnkSupplier")
	private WebElement Select_Supplier;
	public WebElement getSelect_Supplier()
	{
		return Select_Supplier;
	}
	
	
	@FindBy(id="gdvSupplierList_ctl05_lnkSupplierName")
	private WebElement AddSupplier;
	public WebElement getAddSupplier()
	{
		return AddSupplier;
	}
    
	@FindBy(id="frmViewPOIndent_lnkAddIndent")
	private WebElement AddIndent;
	public WebElement getAddIndent()
	{
		return AddIndent;
	}
	
	@FindBy(id="ddlSubProject")
	private WebElement SubProject;
	public WebElement getSubProject()
	{
		return SubProject;
	}
	
	@FindBy(id="btnFilterGO")
	private WebElement Search;
	public WebElement getSearch()
	{
		return Search;
	}
	
	
	@FindBy(id="gvIndentList_ctl02_chkBoxIndent")
	private WebElement SelectIndentChkBox;
	public WebElement getSelectIndentChkBox()
	{
		return SelectIndentChkBox;
	}
	
	@FindBy(id="lnkAcceptSelected")
	private WebElement AceeptSelected;
	public WebElement getAceeptSelected()
	{
		return AceeptSelected;
	}
	
	@FindBy(id="btnCreate")
	private WebElement PO_Create;
	public WebElement getPO_Create()
	{
		return PO_Create;
	}
	

	@FindBy(partialLinkText ="Purchase Orders")
	private WebElement PurchaseOrders;
	public WebElement getPurchaseOrders()
	{
		return PurchaseOrders;
	}
	//---------------------Create Domestic Type PO----------------
	public void Create_Purchase_Order_DomesticType(int i) 
	{
		try
		{
			mainMenu.clickPurchase();
			purchaseSubMenu.clickInventory();
			Frames.leftFrame();
			appInd.clickObject(PurchaseObj.getPurchaseOrders());
			Frames.rightFrame();
			appInd.clickObject(PurchaseObj.getCreatePurchase_order());
			appInd.clickObject(PurchaseObj.getPO_Category_Material());
			appInd.selectDropDown(PurchaseObj.getPO_Project(),purmap.get("Project")+i);
			appInd.selectDropDown(PurchaseObj.getPO_Type(),purmap.get("PO Type")+i);
		    appInd.clickOnCalender(PurchaseObj.getPO_date(),PurchaseObj.getPO_Calender_Month(), purmap.get("month"+i),PurchaseObj.getPO_Calender_Year(), purmap.get("year"+i),purmap.get("date"+i));
			Thread.sleep(200);
			appInd.clickObject(PurchaseObj.getSelect_Supplier());
			appInd.clickObject(PurchaseObj.getAddSupplier());
			appInd.clickObject(PurchaseObj.getAddIndent());
			appInd.selectDropDown(PurchaseObj.getSubProject(),purmap.get("SubProject"+i));
			appInd.clickObject(PurchaseObj.getSearch());
			appInd.clickObject(PurchaseObj.getSelectIndentChkBox());
			appInd.clickObject(PurchaseObj.getAceeptSelected());
			appInd.clickObject(PurchaseObj.getPO_Create());
			
					
				
				
		}
				
			  
			
		catch(Exception e)
		{}
}



	
		
	}