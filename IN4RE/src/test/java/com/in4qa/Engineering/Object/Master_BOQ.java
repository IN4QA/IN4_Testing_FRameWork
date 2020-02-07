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
	
	@FindBy(id ="txtBOQDescription")//txtBOQDescription
	private WebElement BOQ_Description;
	public WebElement getBOQ_Description()
	{
		return BOQ_Description;
	}
	
	@FindBy(id ="ddlUOM")//gvMaterials_ctl02_ddlUOM
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
	
	
	@FindBy(id ="ddlMaterialSubtype")
	private WebElement MaterilSUBType;
	public WebElement getMaterilSUBType()
	{
		return MaterilSUBType;
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
	
	

	@FindBy(id ="gvMaterials_ctl02_ddlUOM")//
	private WebElement BOQMaterialUOM;
	public WebElement getBOQMaterialUOM()
	{
		return BOQMaterialUOM;
	}
	
	

	@FindBy(id ="gvMaterials_ctl02_txtCostCoEff")
	private WebElement CoEfficientFactor;
	public WebElement getCoEfficientFactor()
	{
		return CoEfficientFactor;
	}
	
	@FindBy(id ="gvAssets_ctl02_txtCostCoEff")
	private WebElement Asset_CoEfficientFactor;
	public WebElement getAsset_CoEfficientFactor()
	{
		return Asset_CoEfficientFactor;
	}
	
	@FindBy(id ="gvMaterials_ctl02_txtCostEstQty")
	private WebElement EstimatedQty;
	public WebElement getEstimatedQty()
	{
		return EstimatedQty;
	}
	
	@FindBy(id ="gvAssets_ctl02_txtCostEstQty")
	private WebElement AssetEstimatedQty;
	public WebElement getAssetEstimatedQty()
	{
		return AssetEstimatedQty;
	}
	
	@FindBy(id ="gvMaterials_ctl01_chkHeader")
	private WebElement SelectALLChk;
	public WebElement getSelectALLChk()
	{
		return SelectALLChk;
	}
	

	@FindBy(id ="gvAssets_ctl01_chkHeader")
	private WebElement AssetSelectALLChk;
	public WebElement getAssetSelectALLChk()
	{
		return AssetSelectALLChk;
	}
	
	@FindBy(id ="lbnChangeStatus")//lbnChangeStatus
	private WebElement ChangeStatus;
	public WebElement getChangeStatus()
	{
		return ChangeStatus;
	}
	
	@FindBy(id ="ddlStatus")
	private WebElement SelectStatus;
	public WebElement getSelectStatus()
	{
		return SelectStatus;
	}
	
	
	@FindBy(id ="lbnUpdateStatus")
	private WebElement UpdateStatus;
	public WebElement getUpdateStatus()
	{
		return UpdateStatus;
	}
	

	@FindBy(id ="imbAssets")
	private WebElement click_Asset;
	public WebElement getclick_Asset()
	{
		return click_Asset;
	}
	
	@FindBy(id ="lbnAddAssetNew")
	private WebElement Add_Asset;
	public WebElement getAdd_Asset()
	{
		return Add_Asset;
	}
	
//--------------------------------------------------------------------------------------	
	public void clickMaster() throws Exception         // click on master
	{
		Frames.SubMenuFrame();
		appInd.clickObject(BOQObj.getMasters());
    }
	
//----------------------------------AddAsset----------------------------------------------------	
	
	
	public boolean AddAsset(int i) throws Throwable
	{
        try
          {
        	appInd.clickObject(BOQObj.getclick_Asset());
        	appInd.clickObject(BOQObj.getAdd_Asset());
        	String MainWindow=oBrowser.getWindowHandle();		
		    Iterator<String> it2 = oBrowser.getWindowHandles().iterator();
     	    String strchild = it2.next(); 	
		    while(it2.hasNext())			
            {		
              String ChildWindow=it2.next();			 
            if(!MainWindow.equalsIgnoreCase(ChildWindow))			
           
            { 
            	oBrowser.switchTo().window(ChildWindow);
	         
	            appInd.selectDropDown(BOQObj.getMaterilType(),purmap.get("Asset Type"+i));
	            appInd.selectDropDown(BOQObj.getMaterilSUBType(),purmap.get("Asset Sub Type"+i));
	            appInd.clickObject(BOQObj.getSearch());
	            appInd.clickObject(BOQObj.getChkBoxAllMaterial());
	            appInd.clickObject(BOQObj.getAcceptSelected());
            }
        } 
		    
        	
        }catch(Exception e)
        {
        	System .out.println(e);
        }
		
		
		return true;
	}
	
	
	
	public boolean AddMaterial(int i) throws Throwable
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
         
            appInd.selectDropDown(BOQObj.getMaterilType(),purmap.get("Material Type"+i));
            appInd.selectDropDown(BOQObj.getMaterilSUBType(),purmap.get("Material Sub Type"+i));
            appInd.clickObject(BOQObj.getSearch());
            appInd.clickObject(BOQObj.getChkBoxAllMaterial());
            appInd.clickObject(BOQObj.getAcceptSelected());
        }}
		
		return true;
	}
	
	
//---------------------------------Create BOQ-------------------------------------------------	


public void create_BOQ (int i) throws Throwable
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
		appInd.selectDropDown(BOQObj.getProject(),purmap.get("Project"+i));
		Thread.sleep(100);
		appInd.selectDropDown(BOQObj.getSubProject(),purmap.get("SubProject"+i));
		Thread.sleep(200);
		appInd.selectDropDown(BOQObj.getWorkCategory(),purmap.get("Category"+i));
		Thread.sleep(200);
		appInd.selectDropDown(BOQObj.getSubCategory(),purmap.get("SubCategory"+i));
	
		appInd.clickObject(BOQObj.getBOQ_Name());
		BOQ_Name.sendKeys("BOQ DEMO1");
		
		appInd.clickObject(BOQObj.getBOQ_Description());
		BOQ_Description.sendKeys("BOQ DEMO");
		
		appInd.selectDropDown(BOQObj.getBOQ_UOM(),purmap.get("UOM"+i));
		
		appInd.clickObject(BOQObj.getBOQ_Quantity());
	//	BOQ_Quantity.clear();
		BOQ_Quantity.sendKeys("100");// boq qty
		
		appInd.clickObject(BOQObj.getBOQ_Rate());
		Thread.sleep(100);
		getBOQ_Rate().clear();
		BOQ_Rate.sendKeys("2");  //BOQ Rate
		

		//appInd.clickObject(BOQObj.getclick_Material());
		
		if(datatable.getCellData(strFile, "Create BOQ", "Material", i).equalsIgnoreCase("yes"))
	    {
			appInd.clickObject(BOQObj.getclick_Material());			
		    appInd.clickObject(BOQObj.getAdd_Material());
		    if(BOQObj.AddMaterial(i))
		    {
         
		
	            Iterator<String> it3 = oBrowser.getWindowHandles().iterator();
	            String strParent = it3.next();
	            oBrowser.switchTo().window(strParent);
	            Frames.rightFrame();
	            
	            appInd.clickObject(BOQObj.getSelectALLChk());
	            appInd.selectDropDown(BOQObj.getBOQMaterialUOM(),purmap.get("Material UOM"+i));
	            appInd.clickObject(BOQObj.getCoEfficientFactor());
	            CoEfficientFactor.clear();
	            CoEfficientFactor.sendKeys("1");
	            
	            appInd.clickObject(BOQObj.getEstimatedQty());
	            EstimatedQty.clear();
	            EstimatedQty.sendKeys("100");
	            
		    }}     
	    
		else
	         {
		       if(BOQObj.AddAsset(i));	
		        {

		           Iterator<String> it3 = oBrowser.getWindowHandles().iterator();
	               String strParent = it3.next();
	               oBrowser.switchTo().window(strParent);
	               Frames.rightFrame();
	            
	               
	               appInd.clickObject(BOQObj.getAsset_CoEfficientFactor());
	               Asset_CoEfficientFactor.clear();
	               Asset_CoEfficientFactor.sendKeys("1");
	               Thread.sleep(1000);
	               appInd.clickObject(BOQObj.getAssetSelectALLChk());
	          
	              /* appInd.clickObject(BOQObj.getAssetEstimatedQty());     
	               AssetEstimatedQty.clear();
	               AssetEstimatedQty.sendKeys("100")*/;
	            
			  }
	      }
		 appInd.clickObject(BOQObj.getCreate());
		 appInd.clickObject(BOQObj.getChangeStatus());
         appInd.clickObject(BOQObj.getSelectStatus());
         SelectStatus.sendKeys("Submitted");
         Thread.sleep(500);
         appInd.clickObject(BOQObj.getUpdateStatus());
         
         appInd.clickObject(BOQObj.getChangeStatus());
         appInd.clickObject(BOQObj.getSelectStatus());
         SelectStatus.sendKeys("Approved");
         Thread.sleep(500);
         appInd.clickObject(BOQObj.getUpdateStatus());
     
	}
	catch(Exception e)
{
System.out.println(e);		
}

}}


