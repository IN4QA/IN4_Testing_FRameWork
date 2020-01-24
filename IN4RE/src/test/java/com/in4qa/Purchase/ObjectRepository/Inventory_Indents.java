package com.in4qa.Purchase.ObjectRepository;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeoutException;

import org.apache.xmlbeans.impl.xb.xsdschema.Public;
import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.FindBy;
	import org.openqa.selenium.support.PageFactory;
	import org.openqa.selenium.support.ui.ExpectedConditions;

import com.in4qa.Purchase.Tests.Inventory_Indents_tests;
import com.sun.jna.platform.win32.OaIdl.SYSKIND;

import methods.Frames;

	public class Inventory_Indents extends Inventory_Indents_tests
	{
		WebDriver iDriver;
		public Inventory_Indents(WebDriver oDriver)
		{
			iDriver = oDriver;
			PageFactory.initElements(iDriver, this);
		}
		
		@FindBy(partialLinkText = "Indents")
		private WebElement indents;
		public WebElement getIndentLink()
		{
			return indents;
	    }
		
		@FindBy(xpath="//*[@id='btnCreate']") // create Indent/PO
		private WebElement CreateIndents;
		public WebElement getCreateIndents()
		{
			return CreateIndents;
	    }
		
		
		@FindBy(xpath="//*[@id='rdbMainIndentType_0']")
		private WebElement Indents_WithWorkOrder;
		public WebElement getIndents_WithWorkOrder()
		{
			return Indents_WithWorkOrder;
	    }
		
		
		@FindBy(xpath="//*[@id='rdbMainIndentType_1']")
		private WebElement Indents_WithOutWorkOrder;
		public WebElement getIndents_WithOutWorkOrder()
		{
			return Indents_WithOutWorkOrder;
	    }
		
		@FindBy(xpath="//*[@id='rdbMainIndentType_1']")
		private WebElement Indents_MinoreMateriyalWithOutWorkOrder;
		public WebElement getIndents_MinoreMateriyalWithOutWorkOrder()
		{
			return Indents_MinoreMateriyalWithOutWorkOrder;
	    }
		
		@FindBy(xpath="//*[@id='rdMaterial']")
		private WebElement Indents_CategoryMateriyal;
		public WebElement getIndents_CategoryMateriyal()
		{
			return Indents_CategoryMateriyal;
	    }
		
		@FindBy(xpath="//*[@id='rdAsset']")
		private WebElement Indents_CategoryAsset;
		public WebElement getIndents_CategoryAsset()
		{
			return Indents_CategoryAsset;
	    }
		
		@FindBy(xpath="//*[@id='ddlIndentType']")
		private WebElement Indents_TypeOfIndent;
		public WebElement getIndents_TypeOfIndent()
		{
			return Indents_TypeOfIndent;
	    }
		
		@FindBy(xpath="//*[@id='ddlProject']")
		private WebElement Indents_Project;
		public WebElement getIndents_Project()
		{
			return Indents_Project;
	    }
		
		@FindBy(xpath="//*[@id='ddlSubProject']")
		private WebElement Indents_SubProject;
		public WebElement getIndents_SubProject()
		{
			return Indents_SubProject;
	    }
		
		@FindBy(xpath="//*[@name='txtWorkOrder']")
		private WebElement Indents_WorkOrder;
		public WebElement getIndents_WorkOrder()
		{
			return Indents_WorkOrder;
	    }
		
		@FindBy(xpath="//*[@name='dtIndentDate$txtDatePicker']")
		private WebElement Indents_IndentDate;
		public WebElement getIndents_IndentDate()
		{
			return Indents_IndentDate;
	    }
		
		@FindBy(xpath="//*[@id='chkDebitable']")
		private WebElement Indents_Debitable;
		public WebElement getIndents_Debitable()
		{
			return Indents_Debitable;
	    }
		
		@FindBy(xpath="//*[@id='btnCreate']")
		private WebElement Indents_Create;
		public WebElement getIndents_Create()
		{
			return Indents_Create;
	    }
		
		@FindBy(xpath="//*[@id='btnCancel']")
		private WebElement Indents_Cancel;
		public WebElement getIndents_Cancel()
		{
			return Indents_Cancel;
	    }
		
		@FindBy(partialLinkText ="Select")
		private WebElement indent_select;
		public WebElement getIndent_WorkOrder_Select()
		{
			return indent_select;
		}
		
		@FindBy(xpath ="//*[@id='txtWorlOrder']")
		private WebElement indent_workoreder;
		public WebElement getIndent_workorder()
		{
			return getIndent_workorder();
		}
		
		@FindBy(xpath ="//*[@id='txtWorkCategory']")
		private WebElement indent_workcategory;
		public WebElement getIndent_Workcategory()
		{
			return getIndent_Workcategory();
		}
		
		@FindBy(xpath ="//*[@id='txtContractor']")
		private WebElement indent_contractore;
		public WebElement getIndent_Contractore()
		{
			return getIndent_Contractore();
		}
		
		@FindBy(xpath ="//*[@id='txtWorkSubCategory']")
		private WebElement indent_subworkcategory;
		public WebElement getIndent_SubWorkCategory()
		{
			return getIndent_SubWorkCategory();
		}
		
		@FindBy(xpath ="//*[@id='btnSearch']")
		private WebElement indent_search;
		public WebElement getIndent_Search()
		{
			return getIndent_Search();
		}
		
		@FindBy(xpath ="//*[@id='btnShowAll']")
		private WebElement indent_showAll;
		public WebElement getIndent_ShowAll()
		{
			return getIndent_ShowAll();
		}
		

		@FindBy(xpath ="//*[@id='btnReset']")
		private WebElement indent_reset;
		public WebElement getIndent_Reset()
		{
			return getIndent_Reset();
		}
		
		@FindBy(xpath ="//*[@id='btnClose']")
		private WebElement indent_close;
		public WebElement getIndent_Close()
		{
			return getIndent_Close();
		}
		
		@FindBy(xpath="//a[text()='Accept Selected']")
		private WebElement acceptSelected;
		public WebElement getAcceptSelected()
		{
			return acceptSelected;
		}
		
		@FindBy(id="dvWorkOrderGrid_ctl01_nextButton")
		private WebElement nexButton;
		public WebElement getNexButton()
		{
			return nexButton;
		}
		
		@FindBy(id ="btnAdditionalInfo")
		private WebElement indentAdditionalInfo;
		public WebElement indentAdditionalInfo()
		{
			return indentAdditionalInfo;
		}
		
		@FindBy(id ="txtWorlOrder")
		private WebElement WoOrder;
		public WebElement WoOrder()
		{
			return WoOrder;
		}
		
		@FindBy(id ="btnClose")           // close Wo order
		private WebElement WOBtnClose;
		public WebElement WOBtnClose()
		{
			return WOBtnClose;
		}
		
		@FindBy(id ="btnSearch")  // search Wo Order
		private WebElement WOSearch;
		public WebElement WOSearch()
		{
			return WOSearch;
		}
		
		@FindBy(id ="dvWorkOrderGrid_ctl03_rdSelect")  // select radio button
		private WebElement SelectWO;
		public WebElement SelectWO()
		{
			return SelectWO;
		}
		

		@FindBy(partialLinkText ="Accept Selected") // Wo accept select link
		private WebElement WoAcceptSelected;
		public WebElement getWoAcceptSelected()
		{
			return WoAcceptSelected;
		}
		
		public void click_Indent() throws Exception
		{
			Frames.leftFrame();
			appInd.clickObject(indentsObj.getIndentLink());
		}
		@FindBy(xpath="//*[@id ='rdoIndentStatusList_0']")
		private WebElement search_Indent_UnfulfilledPOTO;
		public WebElement getSearch_Indent_UnfulfilledPOTO()
		{
			return search_Indent_UnfulfilledPOTO;
		}
		
		@FindBy(xpath="//*[@id ='rdoIndentStatusList_1']")
		private WebElement search_Indent_Unfulfilled_Issue;
		public WebElement getSearch_Indent_Unfulfilled_Issue()
		{
			return search_Indent_Unfulfilled_Issue;
		}
		
		@FindBy(xpath="//*[@id ='rdoIndentStatusList_2']")
		private WebElement search_Indent_FulfilledPOTO;
		public WebElement getSearch_Indent_FulfilledPOTO()
		{
			return search_Indent_Unfulfilled_Issue;
		}
		
		@FindBy(xpath="//*[@id ='rdoIndentStatusList_3']")
		private WebElement search_Indent_Fulfilled_Issue;
		public WebElement getSearch_Indent_Fulfilled_Issue()
		{
			return search_Indent_Fulfilled_Issue;
		}
		
		@FindBy(xpath="//*[@id ='rdoIndentStatusList_4']")
		private WebElement search_Indent_All;
		public WebElement getSearch_Indent_All()
		{
			return search_Indent_All;
		}
		
		@FindBy(xpath="//*[text()='Material']")
		private WebElement search_Indent_Category_Material;
		public WebElement getSearch_Indent_Category_Material()
		{
			return search_Indent_Category_Material;
		}
		
		@FindBy(xpath="//*[text()='Asset']")
		private WebElement search_Indent_Category_Asset;
		public WebElement getSearch_Indent_Category_Asset()
		{
			return search_Indent_Category_Asset;
		}
		
		@FindBy(xpath="//*[@id ='ddlProjectList']")
		private WebElement search_Indent_Project;
		public WebElement getSearch_Indent_Project()
		{
			return search_Indent_Project;
		}
		
		@FindBy(xpath="//*[@id ='ddlSubProjectList']")
		private WebElement search_Indent_SubProject;
		public WebElement getSearch_Indent_SubProject()
		{
			return search_Indent_SubProject;
		}
		
		@FindBy(xpath="//*[@id ='ddlContractorList']")
		private WebElement search_Indent_Contractor;
		public WebElement getSearch_Indent_Contractor()
		{
			return search_Indent_Contractor;
		}
		

		@FindBy(xpath="//*[text()='Select']")
		private WebElement search_Indent_WorkOrder_Select;
		public WebElement getSearch_Indent_Workorder_Select()
		{
			return search_Indent_WorkOrder_Select;
		}
		
		@FindBy(xpath="//*[text()='Clear']")
		private WebElement search_Indent_WorkOrder_Clear;
		public WebElement getSearch_Indent_Workorder_Clear()
		{
			return search_Indent_WorkOrder_Clear;
		}
		
		@FindBy(xpath="//*[@id ='ddlWorkCategoryList']")
		private WebElement search_Indent_WorkCategory;
		public WebElement getSearch_Indent_WorkCategory()
		{
			return search_Indent_WorkCategory;
		}
		
		@FindBy(xpath="//*[@id ='ddlWorkSubCategoryList']")
		private WebElement search_Indent_SubWorkCategory;
		public WebElement getSearch_Indent_SubWorkCategory()
		{
			return search_Indent_SubWorkCategory;
		}
		
		@FindBy(xpath="//*[@id ='ddlFilterMaterialTypeList']")
		private WebElement search_Indent_MaterialType;
		public WebElement getSearch_Indent_MaterialType()
		{
			return search_Indent_MaterialType;
		}
		
		@FindBy(xpath="//*[@id ='ddlFilterMaterialSubTypeList']")
		private WebElement search_Indent_Material_SubType;
		public WebElement getSearch_Indent_Material_SubType()
		{
			return search_Indent_Material_SubType;
		}
		
		@FindBy(xpath="//*[@id ='ddlFilterMaterialList']")
		private WebElement search_Indent_Material;
		public WebElement getSearch_Indent_Material()
		{
			return search_Indent_Material;
		}
		
		@FindBy(xpath="//*[@id ='lblStatus']")
		private WebElement search_Indent_Status;
		public WebElement getSearch_Indent_Status()
		{
			return search_Indent_Status;
		}
		
		@FindBy(xpath="//*[@id ='txtIndentNumber']")
		private WebElement search_IndentNo;
		public WebElement getSearch_IndentNo()
		{
			return search_IndentNo;
		}
		
		@FindBy(xpath="//*[@id ='ddlIndentTypeList']")
		private WebElement search_Indent_TypeOf_Indent;
		public WebElement getSearch_Indent_TypeOf_IndentNo()
		{
			return search_Indent_TypeOf_Indent;
		}
		
		@FindBy(id="dtIndentDate_txtDatePicker")   
		private WebElement indent_Calender;
		public WebElement getIndent_Calender()
		{
			return indent_Calender;
		}
		
		@FindBy(id="gvIndentItem_ctl02_dtItemDate_txtDatePicker")  
		private WebElement indent_Calender1;
		public WebElement getIndent_Calender1()
		{
			return indent_Calender1;
		}
		@FindBy(css="select[title='Change the month']")
		private WebElement indent_Calender_Month;
		public WebElement getIndent_Calender_Month()
		{
			return indent_Calender_Month;
		}
		@FindBy(css="select[title='Change the year']")
		private WebElement indent_Calender_Month_Year;
		public WebElement getIndent_Calender_Month_Year()
		{
			return indent_Calender_Month_Year;
		}
		
		@FindBy(id="btnMasterLevel") // add material button on mm in indent
		private WebElement MaterilMaster;
		public WebElement getMaterilMaster()
		{
			return MaterilMaster;
		}
		
		@FindBy(id="btnIndentAddItem") // add material button after click on mm button in indent
		private WebElement AddMateril;
		public WebElement getAddMateril()
		{
			return AddMateril;
		}
		
		@FindBy(id="ddlMaterialType") // select material type
		private WebElement MaterilType;
		public WebElement getMaterilType()
		{
			return MaterilType;
		}
		

		@FindBy(id="ddlMaterialSubtype") // select material sub type
		private WebElement MaterilSubType;
		public WebElement getMaterilSubType()
		{
			return MaterilSubType;
		}
		

		@FindBy(id="ddlMaterial") // select material sub type
		private WebElement MaterilName;
		public WebElement getMaterilName()
		{
			return MaterilName;
		}
		
		@FindBy(id="btnSearch") // 
		private WebElement Search;
		public WebElement getSearch()
		{
			return Search;
		}
		

		@FindBy(id="gvMaterialResult_ctl02_chkAll") // select All material in Search material Page.
		private WebElement ChkBoxAllMaterial;
		public WebElement getChkBoxAllMaterial()
		{
			return ChkBoxAllMaterial;
		}

		@FindBy(id="txtMaterialSearch") // search material 
		private WebElement SearchMaterial;
		public WebElement getSearchMaterial()
		{
			return SearchMaterial;
		}
		
		@FindBy(id="gvIndentItem_ctl02_ddlItemStore") // select store
		private WebElement Store;
		public WebElement getStore()
		{
			return Store;
		}
		
		@FindBy(id="chkIndentAllItems") // chk all material in Add indent material page.
		private WebElement chkIndentAllItems;
		public WebElement getchkIndentAllItems()
		{
			return chkIndentAllItems;
		}
		
		@FindBy(id="btnAutoFill") // Autofill date
		private WebElement AutoFilldate;
		public WebElement getAutoFilldate()
		{
			return AutoFilldate;
		}
		
		@FindBy(id="gvIndentItem_ctl02_txtItemQuantity") // 
		private WebElement MaterialQty;
		public WebElement getMaterialQty()
		{
			return MaterialQty;
		}
		
		@FindBy(id="BtnAddItem") // 
		private WebElement AddMaterialMM;
		public WebElement getAddMaterialMM()
		{
			return AddMaterialMM;
		}
		
		@FindBy(id="dtAutoFillDate_txtDatePicker") // 
		private WebElement CalenderMM;
		public WebElement getCalenderMM()
		{
			return CalenderMM;
		}
		
		
		
		@FindBy(css="select[title='Change the month']")
		private WebElement CalenderMM_Month;
		public WebElement getCalenderMM_Month()
		{
			return CalenderMM_Month;
		
		}
		
		@FindBy(xpath="/html/body/div/div/div[2]/div/div/select[2]")
		private WebElement CalenderMM_Year;
		public WebElement getCalenderMM_Year()
		{
			return CalenderMM_Year;
		}
		
		@FindBy(id="lnkChangeStatus") // 
		private WebElement ChangeStatus_Indent;
		public WebElement getChangeStatus_Indent()
		{
			return ChangeStatus_Indent;
		}
		
		@FindBy(id="ddlUpdateStatusList") // 
		private WebElement ChangeStatus_DropDown;
		public WebElement getChangeStatus_DropDown()
		{
			return ChangeStatus_DropDown;
		}
		
		
//******************Script 4r Select WO***********************************************
		public boolean selectWorkOrder(int k) throws Throwable
	
		{
			
			    int flag=0;
				try {
					appInd.clickObject(indentsObj.getIndent_WorkOrder_Select());
					
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		
				Iterator<String> it = oBrowser.getWindowHandles().iterator();
	        	String strParent = it.next();
	        	String strchild = it.next();
	        	oBrowser.switchTo().window(strchild);        
				Thread.sleep(1000);	
				appInd.clickObject(indentsObj.WoOrder);
				WoOrder.sendKeys("Wor-8998989898/425232/19-20/Dec/AP Contractors/2019-20/Dec/23");
				appInd.clickObject(indentsObj.WOSearch);
				appInd.clickObject(indentsObj.SelectWO);
				appInd.clickObject(indentsObj.WoAcceptSelected);
				//appInd.clickObject(indentsObj.WOBtnClose);
				oBrowser.switchTo().window(strParent);
				Frames.rightFrame();
				return true;
				
		}
		
//********************Select Material from Material Master**********************
		
		public boolean selectMaterialfromMaterialMaster(int l) throws Throwable
		
		{
			  
				appInd.clickObject(indentsObj.getMaterilMaster());
		        appInd.clickObject(indentsObj.getAddMateril());
		        Iterator<String> it = oBrowser.getWindowHandles().iterator();
	        	String strParent = it.next();
	        	String strchild = it.next();
	        	oBrowser.switchTo().window(strchild);
		        appInd.selectDropDown(indentsObj.getMaterilType(),purmap.get("Materil Type"+ l));
		        Thread.sleep(200);
		       /* appInd.selectDropDown(indentsObj.getMaterilSubType(),purmap.get("Material Sub Type"+ l));
		        Thread.sleep(200);
		        appInd.selectDropDown(indentsObj.getMaterilName(),purmap.get("Material "+ l));*/
		        appInd.clickObject(indentsObj.getSearch());
		        Search.sendKeys("SearchMaterial");
		        appInd.clickObject(indentsObj.getChkBoxAllMaterial());
 		        appInd.clickObject(indentsObj.getAcceptSelected());
 		        oBrowser.switchTo().window(strParent);
				Frames.rightFrame();
				appInd.selectDropDown(indentsObj.getStore(),purmap.get("Store"+l));
				Thread.sleep(200);
				appInd.clickObject(indentsObj.MaterialQty);
				MaterialQty.clear();
				MaterialQty.sendKeys("5");
				appInd.clickOnCalender(indentsObj.getIndent_Calender1(),indentsObj.getIndent_Calender_Month(), purmap.get("month"+l),indentsObj.getIndent_Calender_Month_Year(), purmap.get("year"+l),purmap.get("date"+l));
				appInd.clickObject(indentsObj.getAutoFilldate());
				appInd.clickObject(indentsObj.getchkIndentAllItems());
                return true;
              
		}
		
		public void create_Indent_WithWorkOrder(int i)
		{
			try
			{
				mainMenu.clickPurchase();
				purchaseSubMenu.clickInventory();
				indentsObj.click_Indent();
				Frames.rightFrame();
				appInd.clickObject(indentsObj.getCreateIndents());
				if(datatable.getCellData(strFile, "Create Indent", "Material", i).equalsIgnoreCase("yes"))
				{
					appInd.clickObject(indentsObj.getIndents_CategoryMateriyal());
					
				}else
				{
					appInd.clickObject(indentsObj.getIndents_CategoryAsset());
					
				}
				appInd.selectDropDown(indentsObj.getIndents_TypeOfIndent(), purmap.get("Type of Indent"+i));
				Thread.sleep(200);
				appInd.selectDropDown(indentsObj.getIndents_Project(),purmap.get("Project"+i));
				Thread.sleep(200);
		        appInd.selectDropDown(indentsObj.getIndents_SubProject(),purmap.get("SubProject"+i));
		        Thread.sleep(200);
		        try {
					if( indentsObj.selectWorkOrder(i))
					{
						Thread.sleep(500);
						appInd.clickOnCalender(indentsObj.getIndent_Calender(),indentsObj.getIndent_Calender_Month(), purmap.get("month"+i), indentsObj.getIndent_Calender_Month_Year(), purmap.get("year"+i),purmap.get("date"+i));
						appInd.clickObject(indentsObj.getIndents_Create());
						
					}
				} catch (Throwable e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}	
		        
		        
		        try {
		        	if(indentsObj.selectMaterialfromMaterialMaster(i))
		        	{
		        		appInd.clickObject(indentsObj.getAddMaterialMM());
		        	}
		        	
		        	
		        } catch (Throwable e) {
					
					e.printStackTrace();
				}	
		        
		        Iterator<String> it = oBrowser.getWindowHandles().iterator();
	        	String strParent = it.next();
	        	oBrowser.switchTo().window(strParent);
	        	Frames.rightFrame();
	        	appInd.clickObject(indentsObj.getChangeStatus_Indent());
	        	appInd.selectDropDown(indentsObj.getChangeStatus_DropDown(),purmap.get("Indent Status"+i));
	        	
             
			}catch(Exception e)
			{
			System.out.println(e);
			}
		}
		
		public void create_Indent_Without_Worklorder(int i)
		{
			try {
				mainMenu.clickPurchase();
				purchaseSubMenu.clickInventory();
				indentsObj.click_Indent();
				Frames.rightFrame();
				appInd.clickObject(indentsObj.getCreateIndents());
				if(datatable.getCellData(strFile, "Create Indent", "Material", i).equalsIgnoreCase("yes"))
				{
					appInd.clickObject(indentsObj.getIndents_CategoryMateriyal());
					
				}else
				{
					appInd.clickObject(indentsObj.getIndents_CategoryAsset());
				}
				appInd.selectDropDown(indentsObj.getIndents_TypeOfIndent(), purmap.get("Type of Indent"+i));
				appInd.selectDropDown(indentsObj.getIndents_Project(),purmap.get("Project"+i));
		        appInd.selectDropDown(indentsObj.getIndents_SubProject(),purmap.get("SubProject"+i));
		        appInd.clickOnCalender(indentsObj.getIndent_Calender(), indentsObj.getIndent_Calender_Month(), purmap.get("month"+i), indentsObj.getIndent_Calender_Month_Year(),purmap.get("year"+i), purmap.get("date"+i));
		    
	
		       
			} catch (Exception e) {
				
				
			}
			
			
		}
		
		
	}
	
		

		
		


