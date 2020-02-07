package com.in4qa.Engineering.Object;

import java.util.Iterator;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.in4qa.Engineering.Tests.Master_BOQ_Test;

import com.in4qa.Purchase.Tests.Inventory_Purchase_Order_Test;

import baseClasses.MainMenu;
import methods.Frames;


public class Master_BOQ extends Master_BOQ_Test
{


	WebDriver iDriver;
	public Master_BOQ(WebDriver oDriver)
	{
		iDriver = oDriver;
		PageFactory.initElements(iDriver, this);
	}
  
	
	
	
	public void click_BOQ() throws Exception
	{   Thread.sleep(100);
		Frames.leftFrame();
		appInd.clickObject(BOQObj.getBOQ());
	}
	
	
	
	//---------------------------OBjects---------------------------------------
	
	
	@FindBy(partialLinkText ="BOQ")
	private WebElement BOQ;
	public WebElement getBOQ()
	{
		return BOQ;
	}
	
	@FindBy(id ="cmdCreateBOQ")
	private WebElement Create_BOQ;
	public WebElement getCreate_BOQ()
	{
		return Create_BOQ;
	}
	
	
	@FindBy(id ="ddlProject")
	private WebElement Project;
	public WebElement getProject()
	{
		return Project;
	}
	
	@FindBy(id ="ddlSubProject")
	private WebElement SubProject;
	public WebElement getSubProject()
	{
		return SubProject;
	}
	
	
	@FindBy(id ="ddlWorkCategory")
	private WebElement WorkCategory;
	public WebElement getWorkCategory()
	{
		return WorkCategory;
	}
	
	@FindBy(id ="ddlWorkSubCategory")
	private WebElement SubCategory;
	public WebElement getSubCategory()
	{
		return SubCategory;
	}
	
	@FindBy(id ="txtBOQItemName")
	private WebElement BOQ_Name;
	public WebElement getBOQ_Name()
	{
		return BOQ_Name;
	}
	
	@FindBy(id ="txtBOQDescription")
	private WebElement BOQ_Description;
	public WebElement getBOQ_Description()
	{
		return BOQ_Description;
	}
	
	@FindBy(id ="txtBOQDescription")
	private WebElement BOQ_UOM;
	public WebElement getBOQ_UOM()
	{
		return BOQ_UOM;
	}
	
	@FindBy(id ="txtBOQQuantityCost")
	private WebElement BOQ_Quantity;
	public WebElement getBOQ_Quantity()
	{
		return BOQ_Quantity;
	}
	
	@FindBy(id ="txtBOQRateCost")
	private WebElement BOQ_Rate;
	public WebElement getBOQ_Rate()
	{
		return BOQ_Rate;
	}
	
	@FindBy(id ="imbMaterial")
	private WebElement click_Material;
	public WebElement getclick_Material()
	{
		return click_Material;
	}
	
	@FindBy(id ="lbnAddMaterialNew")
	private WebElement Add_Material;
	public WebElement getAdd_Material()
	{
		return Add_Material;
	}
	
	@FindBy(id ="ddlMaterialType")
	private WebElement MaterilType;
	public WebElement getMaterilType()
	{
		return MaterilType;
	}
	
	@FindBy(id ="btnSearch")
	private WebElement Search;
	public WebElement getSearch()
	{
		return Search;
	}
	
	@FindBy(id ="gvMaterialResult_ctl02_chkAll")
	private WebElement ChkBoxAllMaterial;
	public WebElement getChkBoxAllMaterial()
	{
		return ChkBoxAllMaterial;
	}
	
	
	@FindBy(id ="lnkAcceptedSelected")
	private WebElement AcceptSelected;
	public WebElement getAcceptSelected()
	{
		return AcceptSelected;
	}
	
	@FindBy(id ="btnCreate")
	private WebElement Create;
	public WebElement getCreate()
	{
		return Create;
	}
	
	@FindBy(partialLinkText ="Masters")
	private WebElement Masters;
	public  WebElement getMasters()
	{
		return Masters;
	}
	
	
	public void clickMaster() throws Exception         // click on master
	{
		Frames.SubMenuFrame();
		appInd.clickObject(BOQObj.getMasters());
	}
//---------------------------------Create BOQ-------------------------------------------------	


public void create_BOQ (int i)
{ 
	try 
	{
		mainMenu.clickEngineering();
		//enggSubMenu.clickMaster();
		Frames.SubMenuFrame();
		appInd.clickObject(BOQObj.getMasters());
		BOQObj.click_BOQ();
		Frames.rightFrame();
		appInd.clickObject(BOQObj.Create_BOQ);
		Frames.rightFrame();
		Thread.sleep(500);
		appInd.selectDropDown(BOQObj.getProject(),purmap.get("Project"+i));
		appInd.selectDropDown(BOQObj.getSubProject(),purmap.get("SubProject"+i));
		appInd.selectDropDown(BOQObj.getWorkCategory(),purmap.get("Category"+i));
		appInd.selectDropDown(BOQObj.getSubCategory(),purmap.get("SubCategory"+i));
		appInd.selectDropDown(BOQObj.getBOQ_Name(),purmap.get("BOQ Name"+i));
		appInd.selectDropDown(BOQObj.getBOQ_Description(),purmap.get("BOQ_Description")+i);
		appInd.selectDropDown(BOQObj.getBOQ_Quantity(),purmap.get("BOQ Quantity"+i));
		appInd.selectDropDown(BOQObj.getBOQ_Rate(),purmap.get("BOQ Rate"+i));
		
		appInd.clickObject(BOQObj.getclick_Material());
		appInd.clickObject(BOQObj.getAdd_Material());
		
		 Iterator<String> it = oBrowser.getWindowHandles().iterator();
	     String strchild = it.next();
	     oBrowser.switchTo().window(strchild);
	     
	     if(datatable.getCellData(strFile, "Create_BOQ", "Material", i).equalsIgnoreCase("yes"))
	        {
     	      appInd.selectDropDown(BOQObj.getMaterilType(),purmap.get("Materil Type"+ i));
     	    }
	        
	        else
	        {
	         appInd.selectDropDown(BOQObj.getMaterilType(),purmap.get(" Asset Type "+ i));
	        }		        
	        Thread.sleep(200);
	        appInd.clickObject(BOQObj.getSearch());
	        appInd.clickObject(BOQObj.getChkBoxAllMaterial());
	        appInd.clickObject(BOQObj.getAcceptSelected());
	        String strParent = it.next();
	        oBrowser.switchTo().window(strParent);
	        appInd.clickObject(BOQObj.getCreate());
	        
            
	
	}
	catch(Exception e)
{
System.out.println(e);		
}
}


















}
