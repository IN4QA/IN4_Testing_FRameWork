package com.in4qa.Purchase.ObjectRepository;

import java.sql.Time;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

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
	
	@FindBy(id="frmViewPOIndent_ddlProjectList")//
	private WebElement PO_Project;
	public WebElement getPO_Project()
	{
		return PO_Project;
	}
	
	@FindBy(id="frmViewPOIndent_ddlPOTypeList")//
	private WebElement PO_Type;
	public WebElement getPO_Type()
	{
		return PO_Type;
	}
	
	@FindBy(id="frmViewPOIndent_dtPODate_txtDatePicker")//frmViewPOIndent_dtPODate_txtDatePicker
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
	
	@FindBy(xpath="//*[@class='datepick-month']")      //xpath="//*[@id='btnCreate']") 
	private WebElement PO_Date1;
	public WebElement getPO_Date1()
	{
		return  PO_Date1;
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
	
	
	@FindBy(id="gdvSupplierList_ctl02_lnkSupplierName")//gdvSupplierList_ctl02_lnkSupplierName
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
	
	
	

	@FindBy(xpath="//*[@id=\"txtSupplierName\"]") // create Indent/PO
	private WebElement SupplierName;
	public WebElement getSupplierName()
	{
		return SupplierName;
    }
/*
	@FindBy(id="txtSupplierName")
	private WebElement SupplierName;
	public WebElement getSupplierName()
	{
		return SupplierName;
	}*/
	
	@FindBy(id="btnSearch")
	private WebElement SupplierSerch;
	public WebElement getSupplierSerch()
	{
		return SupplierSerch;
	}
	
	@FindBy(id="frmViewPOIndent_gvIndentMaterialDetails_ctl02_chkIndentForDeletion")//
	private WebElement chbox1;
	public WebElement getchbox1()
	{
		return chbox1;
	}
	
	@FindBy(id="frmViewPOIndent_gvIndentMaterialDetails_ctl03_chkIndentForDeletion")
	private WebElement chbox2;
	public WebElement getchbox2()
	{
		return chbox2;
	}
	
	@FindBy(id="btnUpdate")//ButtonUpdate
	private WebElement update;
	public WebElement getupdate()
	{
		return update;
	}
	
	@FindBy(id="frmViewPOIndent_gvIndentMaterialDetails_ctl02_txtOrderQty")//frmViewPOIndent_gvIndentMaterialDetails_ctl02_txtOrderQty
	private WebElement PO_orderQty1;
	public WebElement getPO_orderQty1()
	{
		return PO_orderQty1;
	}
	
	@FindBy(id="frmViewPOIndent_gvIndentMaterialDetails_ctl03_txtOrderQty")
	private WebElement PO_orderQty2;
	public WebElement getPO_orderQty2()
	{
		return PO_orderQty2;
	}
	
	@FindBy(id="frmViewPORateAndTaxes_gvMaterialDetailsEdit_ctl02_lnkAddRateAndTaxes")
	private WebElement AddRate_Tax;
	public WebElement getAddRate_Tax()
	{
		return AddRate_Tax;
	}
	
	@FindBy(id="txtUnitRate")//
	private WebElement RatePerKg;
	public WebElement getRatePerKg()
	{
		return RatePerKg;
	}
	
	@FindBy(id="txtDiscountPerValue")
	private WebElement Discount;
	public WebElement getDiscount()
	{
		return Discount;
	}
	
	@FindBy(id="txtDiscountedRateValue")
	private WebElement DiscountedRate;
	public WebElement getDiscountedRate()
	{
		return DiscountedRate;
	}
	
	@FindBy(id="txtDiscountedRateAmountValue")
	private WebElement DiscountAmount;
	public WebElement getDiscountAmount()
	{
		return DiscountAmount;
	}
	
	@FindBy(id="btnCalculate")
	private WebElement Calculate;
	public WebElement getCalculate()
	{
		return Calculate;
	}
	
	@FindBy(id="btnSave")
	private WebElement Save;
	public WebElement getSave()
	{
		return Save;
	}
	
	
	@FindBy(id="gvTaxCalculation_ctl03_ddlTaxItem")
	private WebElement Tax_EXCISE_DUTY;
	public WebElement getTax_EXCISE_DUTY()
	{
		return Tax_EXCISE_DUTY;
	}
	
	@FindBy(id="gvTaxCalculation_ctl04_ddlTaxItem")
	private WebElement Tax_PURCH_CESS;
	public WebElement getTax_PURCH_CESS()
	{
		return Tax_PURCH_CESS;
	}
	
	@FindBy(id="gvTaxCalculation_ctl05_ddlTaxItem")
	private WebElement Tax_PURCH_HCESS;
	public WebElement getTax_PURCH_HCESS()
	{
		return Tax_PURCH_HCESS;
	}
	
	@FindBy(id="gvTaxCalculation_ctl06_txtCharge")
	private WebElement Tax_HANDLING_CHARGES;
	public WebElement getTax_HANDLING_CHARGES()
	{
		return Tax_HANDLING_CHARGES;
	}
	
	@FindBy(id="gvTaxCalculation_ctl07_txtCharge")
	private WebElement Tax_FREIGHT;
	public WebElement getTax_FREIGHT()
	{
		return Tax_FREIGHT;
	}
	
	@FindBy(id="gvTaxCalculation_ctl08_txtCharge")
	private WebElement Tax_C_AND_F_CHARGES;
	public WebElement getTax_C_AND_F_CHARGES()
	{
		return Tax_C_AND_F_CHARGES;
	}
	
	@FindBy(id="gvTaxCalculation_ctl09_txtCharge")
	private WebElement Tax_EDI_Charges;
	public WebElement getTax_EDI_Charges()
	{
		return  Tax_EDI_Charges;
	}
	
	@FindBy(id="gvTaxCalculation_ctl10_txtCharge")
	private WebElement Tax_Fob_CHARGES	;
	public WebElement getTax_Fob_CHARGES()
	{
		return  Tax_Fob_CHARGES;
	}
	
	@FindBy(id="gvTaxCalculation_ctl11_txtCharge")
	private WebElement Tax_Custom_Examination_Charges	;
	public WebElement getTax_Custom_Examination_Charges()
	{
		return  Tax_Custom_Examination_Charges;
	}
	
	@FindBy(id="gvTaxCalculation_ctl12_txtCharge")
	private WebElement Tax_Domestic_charge	;
	public WebElement getTax_Domestic_charge()
	{
		return  Tax_Domestic_charge;
	}
	
	@FindBy(id="gvTaxCalculation_ctl13_ddlTaxItem")
	private WebElement Tax_CGST	;
	public WebElement getTax_CGST()
	{
		return  Tax_CGST;
	}
	
	
	@FindBy(id="gvTaxCalculation_ctl14_ddlTaxItem")
	private WebElement Tax_SGST	;
	public WebElement getTax_SGST()
	{
		return  Tax_SGST;
	}
	
	@FindBy(id="gvTaxCalculation_ctl15_ddlTaxItem")
	private WebElement Tax_IGST	;
	public WebElement getTax_IGST()
	{
		return  Tax_IGST;
	}
	
	@FindBy(id="gvTaxCalculation_ctl16_ddlTaxItem")
	private WebElement Tax_UTGST	;
	public WebElement getTax_UTGST()
	{
		return  Tax_UTGST;
	}
	
	@FindBy(id="gvTaxCalculation_ctl17_ddlTaxItem")
	private WebElement Tax_CGST_ON_Charge	;
	public WebElement getTax_CGST_ON_Charge()
	{
		return  Tax_CGST_ON_Charge;
	}
	
	@FindBy(id="gvTaxCalculation_ctl18_ddlTaxItem")
	private WebElement Tax_SGST_ON_Charge	;
	public WebElement getTax_SGST_ON_Charge()
	{
		return  Tax_SGST_ON_Charge;
	}
	
	@FindBy(id="gvTaxCalculation_ctl19_ddlTaxItem")
	private WebElement Tax_IGST_ON_Charge	;
	public WebElement getTax_IGST_ON_Charge()
	{
		return  Tax_IGST_ON_Charge;
	}
	
	@FindBy(id="gvTaxCalculation_ctl20_ddlTaxItem")
	private WebElement Tax_GST_Nil	;
	public WebElement getTax_GST_Nil()
	{
		return  Tax_GST_Nil;
	}
	
	@FindBy(id="gvTaxCalculation_ctl21_ddlTaxItem")
	private WebElement Tax_GST_Zero	;
	public WebElement getTax_GST_Zero()
	{
		return  Tax_GST_Zero;
	}
	
	@FindBy(id="gvTaxCalculation_ctl22_ddlTaxItem")
	private WebElement Tax_GST_EXEMPT_SUPPLY;
	public WebElement getTax_GST_EXEMPT_SUPPLY()
	{
		return  Tax_GST_EXEMPT_SUPPLY;
	}
	
	@FindBy(id="gvTaxCalculation_ctl24_ddlTaxItem")
	private WebElement Tax_CGST_Ded	;
	public WebElement getTax_CGST_Ded()
	{
		return  Tax_CGST_Ded;
	}
	
	@FindBy(id="gvTaxCalculation_ctl25_ddlTaxItem")
	private WebElement Tax_SGST_Ded	;
	public WebElement getTax_SGST_Ded()
	{
		return  Tax_SGST_Ded;
	}
	
	@FindBy(id="gvTaxCalculation_ctl26_ddlTaxItem")
	private WebElement Tax_IGST_Ded	;
	public WebElement getTax_IGST_Ded()
	{
		return  Tax_IGST_Ded;
	}
	
	@FindBy(id="gvTaxCalculation_ctl27_ddlTaxItem")
	private WebElement Tax_TDS	;
	public WebElement getTax_TDS()
	{
		return  Tax_TDS;
	}
	
	@FindBy(id="btnCancel")
	private WebElement Tax_Cancel	;
	public WebElement getTax_Cancel()
	{
		return  Tax_Cancel;
	}
	
	@FindBy(id="btnSaveAndNext")
	private WebElement Tax_Save_Next	;
	public WebElement getTax_Save_Next()
	{
		return  Tax_Save_Next;
	}
	
	@FindBy(id="btnSaveAndFill")
	private WebElement Tax_Fiil_Save	;
	public WebElement getTax_Fiil_Save()
	{
		return  Tax_Fiil_Save;
	}
	
	@FindBy(id="btnSaveAll")
	private WebElement Tax_Save_All_Quotation;
	public WebElement getTax_Save_All_Quotation()
	{
		return  Tax_Save_All_Quotation;
	}
	
	@FindBy(id="gvTaxCalculation_ctl01_ChkHeaderIsInclusive")
	private WebElement Tax_InclusiveAll_chkbox;
	public WebElement getTax_InclusiveAll_chkbox()
	{
		return  Tax_InclusiveAll_chkbox;
	}
	
	@FindBy(id="ButtonUpdate")//ButtonUpdate
	private WebElement update1;
	public WebElement getupdate1()
	{
		return update;
	}
	
	@FindBy(id="frmViewPOIndent_lnkChangeStatus")
	private WebElement PO_ChangeStatus;
	public WebElement getPO_ChangeStatus()
	{
		return  PO_ChangeStatus;
	}
	
	@FindBy(id="frmViewPOIndent_ddlUpdateStatusList")
	private WebElement PO_SelectStatus;
	public WebElement getPO_SelectStatus()
	{
		return  PO_SelectStatus;
	}
	
	@FindBy(id="frmViewPOIndent_lnkUpdateStatus")
	private WebElement PO_UpdateStatus;
	public WebElement getPO_UpdateStatus()
	{
		return  PO_UpdateStatus;
	}
	
	public boolean Add_Rate_Taxes(int i) throws Exception 
	{  
		String MainWindow=oBrowser.getWindowHandle();		
		Iterator<String> it2 = oBrowser.getWindowHandles().iterator();
     	String strchild = it2.next(); 	
		while(it2.hasNext())			
        {		
            String ChildWindow=it2.next();			
            
            if(!MainWindow.equalsIgnoreCase(ChildWindow))			
           
            { 
            	oBrowser.switchTo().window(ChildWindow);
	          
            	appInd.clickObject(PurchaseObj.getRatePerKg());
	            RatePerKg.clear();
	            Thread.sleep(200);
	            RatePerKg.sendKeys("12");
	           
	            appInd.clickObject(PurchaseObj.getDiscount());
	            Discount.clear();
	            Discount.sendKeys("2");
	     
	     appInd.clickObject(PurchaseObj.getTax_CGST());
	     Tax_CGST.sendKeys("CGST 2.50 Percent");
	     
	     appInd.clickObject(PurchaseObj.getTax_SGST());
	     Tax_SGST.sendKeys("SGST 2.50 Percent");
	     
	     appInd.clickObject(PurchaseObj.getCalculate());
	     appInd.clickObject(PurchaseObj.getSave());
	     
	    /* appInd.selectDropDown(PurchaseObj.getRatePerKg(),purmap.get("RatePerKg"+i));
	     appInd.selectDropDown(PurchaseObj.getDiscount(),purmap.get("Discount"+i));
	     appInd.selectDropDown(PurchaseObj.getTax_EXCISE_DUTY(),purmap.get("EXCISE_DUTY"+i));
	     appInd.selectDropDown(PurchaseObj.getTax_PURCH_CESS(),purmap.get("PURCH_CESS"+i));
	     appInd.selectDropDown(PurchaseObj.getTax_PURCH_HCESS(),purmap.get("PURCH_HCESS"+i));
	     appInd.selectDropDown(PurchaseObj.getTax_HANDLING_CHARGES(),purmap.get("HANDLING CHARGES"+i));
	     appInd.selectDropDown(PurchaseObj.getTax_FREIGHT(),purmap.get("FREIGHT"+i));
	     appInd.selectDropDown(PurchaseObj.getTax_C_AND_F_CHARGES(),purmap.get("C AND F CHARGES"+i));
	     appInd.selectDropDown(PurchaseObj.getTax_EDI_Charges(),purmap.get("EDI Charges	"+i));
	     appInd.selectDropDown(PurchaseObj.getTax_Fob_CHARGES(),purmap.get("Fob CHARGES"+i));
	     appInd.selectDropDown(PurchaseObj.getTax_Custom_Examination_Charges(),purmap.get("Custom Examination Charges"+i));
	     appInd.selectDropDown(PurchaseObj.getTax_Domestic_charge(),purmap.get("Domestic charge"+i));
	     appInd.selectDropDown(PurchaseObj.getTax_CGST(),purmap.get("CGST"+i));
	     appInd.selectDropDown(PurchaseObj.getTax_SGST(),purmap.get("SGST"+i));
	     appInd.selectDropDown(PurchaseObj.getTax_IGST(),purmap.get("IGST"+i));
	     appInd.selectDropDown(PurchaseObj.getTax_UTGST(),purmap.get("UTGST"+i));
	     appInd.selectDropDown(PurchaseObj.getTax_CGST_ON_Charge(),purmap.get("CGST on Charges"+i));
	     appInd.selectDropDown(PurchaseObj.getTax_SGST_ON_Charge(),purmap.get("SGST on Charges"+i));
	     appInd.selectDropDown(PurchaseObj.getTax_IGST_ON_Charge(),purmap.get("IGST on Charges"+i));
	     appInd.selectDropDown(PurchaseObj.getTax_GST_Nil(),purmap.get("GST_NIL"+i));
	     appInd.selectDropDown(PurchaseObj.getTax_GST_Zero(),purmap.get("GST_ZERO"+i));
	     appInd.selectDropDown(PurchaseObj.getTax_GST_EXEMPT_SUPPLY(),purmap.get("GST_EXEMPT_SUPPLY"+i));
	     appInd.selectDropDown(PurchaseObj.getTax_CGST_Ded(),purmap.get("CGST_Ded"+i));
	     appInd.selectDropDown(PurchaseObj.getTax_SGST_Ded(),purmap.get("SGST_Ded"+i));
	     appInd.selectDropDown(PurchaseObj.getTax_IGST_Ded(),purmap.get("IGST_Ded"+i));
	     appInd.selectDropDown(PurchaseObj.getTax_TDS(),purmap.get("TDS"+i));
	     appInd.clickObject(PurchaseObj.getCalculate());
	     appInd.clickObject(PurchaseObj.getSave());
		 
		*/
		
	       }
        }
		return true;
		}
	//---------------------Create Domestic Type PO----------------
	public void Create_Purchase_Order_DomesticType(int i) throws Throwable 
	{
		try
		{
			mainMenu.clickPurchase();
			purchaseSubMenu.clickInventory();
			Frames.leftFrame();
			Thread.sleep(100);
			appInd.clickObject(PurchaseObj.getPurchaseOrders());
			Frames.rightFrame();
			appInd.clickObject(PurchaseObj.getCreatePurchase_order());
			
			if(datatable.getCellData(strFile, "Create_PO", "Material", i).equalsIgnoreCase("yes"))
		    {
			appInd.clickObject(PurchaseObj.getPO_Category_Material());			
		    }
	    	else
		    {
			appInd.clickObject(PurchaseObj.getPO_CategoryAsset());		
		    }
			/*try {
			Thread.sleep(500);
			appInd.selectDropDown(PurchaseObj.getPO_Type(),purmap.get("PO Type"+i));
			}catch(NullPointerException e)
			{
				System.out.println(e);
			}*/
			appInd.clickObject(PurchaseObj.getPO_Type());
			PO_Type.sendKeys("Domestic");
		    appInd.clickObject(PurchaseObj.getPO_Project());
		    PO_Project.sendKeys("Enhancement Project, Bangalore");
			//appInd.selectDropDown(PurchaseObj.getPO_Project(), purmap.get("Project"+i));
			appInd.clickObject(PurchaseObj.getSelect_Supplier());	
		
			String MainWindow=oBrowser.getWindowHandle();		
			Iterator<String> it = oBrowser.getWindowHandles().iterator();
	     	String strchild = it.next(); 		
		        while(it.hasNext())			
		        {		
		            String ChildWindow=it.next();			
		            if(!MainWindow.equalsIgnoreCase(ChildWindow))			
		            { 
		            	oBrowser.switchTo().window(ChildWindow);	                                                               
     	                appInd.clickObject(PurchaseObj.getSupplierName());
    	                SupplierName.sendKeys("1 Deepak Test");// supplier     
     	                appInd.clickObject(PurchaseObj.getSupplierSerch());
		  	            appInd.clickObject(PurchaseObj.getAddSupplier());
		            }
		          }
		                Iterator<String> it1 = oBrowser.getWindowHandles().iterator();
		                String ParentWindow=it1.next();
		                oBrowser.switchTo().window(ParentWindow);
		                Frames.rightFrame();
			            Thread.sleep(200);
		                appInd.clickObject(PurchaseObj.getAddIndent());
			           
			            Iterator<String> it2 = oBrowser.getWindowHandles().iterator();
			            while(it2.hasNext())			
				        {		
				            String ChildWindow=it2.next();			
				            if(!MainWindow.equalsIgnoreCase(ChildWindow))			
				            { 
				            	oBrowser.switchTo().window(ChildWindow);
			                   // appInd.selectDropDown(PurchaseObj.getSubProject(),purmap.get("SubProject"+i));
				            	appInd.clickObject(PurchaseObj.getSubProject());
				            	SubProject.sendKeys("AutoTest");
			                    appInd.clickObject(PurchaseObj.getSearch());
			                    appInd.clickObject(PurchaseObj.getSelectIndentChkBox());
				                appInd.clickObject(PurchaseObj.getAceeptSelected());
				            }
				        }
			            Iterator<String> it3 = oBrowser.getWindowHandles().iterator();
		                String strParent=it3.next();
		                oBrowser.switchTo().window(strParent);
		                Frames.rightFrame();
		                Thread.sleep(200);
		                
		               // appInd.clickOnCalender(PurchaseObj.getPO_date(),PurchaseObj.getPO_Calender_Month(), purmap.get("month"+i),PurchaseObj.getPO_Calender_Year(), purmap.get("year"+i),purmap.get("date"+i));
		              /* appInd.clickObject(PurchaseObj.getPO_date());
		             
		               appInd.clickObject(PurchaseObj.getPO_Calender_Month());
		               PO_Calender_Month.sendKeys("February");
		            
		               appInd.clickObject(PurchaseObj.getPO_Calender_Year());
		               PO_Calender_Year.sendKeys("2020");
		               
		               appInd.clickObject(PurchaseObj.getPO_Date1());
		               PO_Date1.sendKeys("2");
		                */
		               
		                appInd.clickObject(PurchaseObj.getPO_orderQty1());
			            PO_orderQty1.clear();
			            PO_orderQty1.sendKeys("1");
			            Thread.sleep(200);
			            appInd.clickObject(PurchaseObj.getchbox1());
			            appInd.clickObject(PurchaseObj.getPO_Create());
			             		
			            
			            Iterator<String> it7 = oBrowser.getWindowHandles().iterator();
			            String strchild2 = it.next();
			            while(it2.hasNext())			
				        {		
				            String ChildWindow=it7.next();			
				            if(!MainWindow.equalsIgnoreCase(ChildWindow))				           
			                oBrowser.switchTo().window(strchild2);
				            appInd.clickObject(PurchaseObj.getupdate());    				        
			               
				        }
			         			           
			            Iterator<String> it5 = oBrowser.getWindowHandles().iterator();
			            String strchild3=it5.next();
			            while(it5.hasNext())			
				        {		
				            String ChildWindow=it5.next();			
				            if(!MainWindow.equalsIgnoreCase(ChildWindow))			
				            { 
				               oBrowser.switchTo().window(ChildWindow);
			                   oBrowser.switchTo().window(strchild3); 
			                   Frames.rightFrame();
			                   appInd.clickObject(PurchaseObj.getupdate1());  	      
				            }
				        }   
			            String strParent1=it5.next();
                        oBrowser.switchTo().window(strParent1);
			            Frames.rightFrame();
                        appInd.clickObject(PurchaseObj.getPO_ChangeStatus());
                        appInd.clickObject(PurchaseObj.getPO_SelectStatus());
                        PO_SelectStatus.sendKeys("Submitted");
                        appInd.clickObject(PurchaseObj.getPO_UpdateStatus());
                        
				            
		
		}                 
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}



	
		
	