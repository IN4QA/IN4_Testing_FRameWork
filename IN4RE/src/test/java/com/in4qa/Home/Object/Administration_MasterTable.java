package com.in4qa.Home.Object;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.bcel.verifier.statics.StringRepresentation;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

import com.in4qa.Home.Tests.Administration_MasterTableTest;

import driver.DriverScript;
import methods.Frames;

public class Administration_MasterTable extends Administration_MasterTableTest{
	
	WebDriver iDriver;
	
	public Administration_MasterTable(WebDriver oDriver)
	{
		iDriver = oDriver;
		PageFactory.initElements(iDriver, this);
	}
	

	
	@FindBy(partialLinkText = "Master Tables")
	private WebElement masterTables;
	public WebElement getMasterTables()
	{
		return masterTables;
	}
	
	@FindBy(css="select[id ='ddlMasterTables']")
	private WebElement masterTablesdrop;
	public WebElement getMasterTableDropDown()
	{
		return masterTablesdrop;
	}
	
	@FindBy(css="select[id ='ddlStatus']")
	private WebElement statusDropDown;
	public WebElement getStatusDropDown()
	{
		return statusDropDown;
	}
	
	@FindBy(id="btnGo")
	private WebElement btnGo;
	public WebElement getGoButton()
	{
		return btnGo;
	}
	
	@FindBy(css="select[id='ddlPageSize']")
	private WebElement dlPageSize;
	public WebElement getDisplayItemPerPage()
	{
		return dlPageSize;
	}
	
	@FindBy(xpath="//table[@id='dgMasters']/tbody/tr")
	private List<WebElement> masterTable;
	public List<WebElement> getMasterTableElement()
	{
		return  masterTable;
	}
	
	@FindBy(id="lnkAddNew")
	private WebElement lnkAddNew;
	public WebElement getAddNewLink()
	{
		return lnkAddNew;
	}
	
	@FindBy(css="input[id*='LocationName']")
	private WebElement locationName;
	public WebElement getCityName()
	{
		return locationName;
	}
	
	@FindBy(css="select[id='StateID']")
	private WebElement state;
	public WebElement selectStateName()
	{
		return state;
	}
	
	@FindBy(css="select[id='RegionID']")
	private WebElement regionID;
	public WebElement selectRegionName()
	{
		return regionID;
	}
	
	@FindBy(id="btnSubmit")
	private WebElement btnSubmit;
	public WebElement getSubmitButton()
	{
		return btnSubmit;
	}
	
	@FindBy(id="btnClose")
	private WebElement btnClose;
	public WebElement getCloseButton()
	{
		return btnClose;
	}
	
	@FindBy(id="CountryName")
	private WebElement countryName;
	public WebElement getCountryName()
	{
		return countryName;
	}
	
	@FindBy(id="ISD_CODE")
	private WebElement ISD_CODE;
	public WebElement getIsdCode()
	{
		return ISD_CODE;
	}
	
	@FindBy(css="input[id='Name']")
	private WebElement name;
	public WebElement getname()
	{
		return name;
	}
	
	@FindBy(id="StateName")
	private WebElement stateName;
	public WebElement getStateName()
	{
		return stateName;
	}
	
	@FindBy(id="CountryID")
	private WebElement countryID;
	public WebElement selectCountryName()
	{
		return countryID;
	}
	
	@FindBy(id="LOCATION_ID")
	private WebElement locationCity;
	public WebElement selectCityName()
	{
		return locationCity;
	}
	
	@FindBy(id="CHECK_LIST_CATEGORY_ID")
	private WebElement checkListCategory;
	public WebElement selectCheckListCategory()
	{
		return checkListCategory;
	}
	
	@FindBy(css="input[id='RegionName']")
	private WebElement regionName;
	public WebElement getRegionName()
	{
		return regionName;
	}
	
	@FindBy(id="StateCode")
	private WebElement stateCode;
	public WebElement getStateCode()
	{
		return stateCode;
	}
	
	@FindBy(id="TINNumber")
	private WebElement tinnumber;
	public WebElement getTinNumber()
	{
		return tinnumber;
	}
	
	
	public void clickMasterTableLink()
	{
		try
		{
			Frames.leftFrame();
			appInd.clickObject(getMasterTables());
		} catch(Exception e)
		{
			appInd.captureScreenShot();
		}
		
	}
	
	public boolean isElementPresent(String strName)
	{
		int  flag=0, size =0; String strText=null;
		try
		{
			    Thread.sleep(700);
			   // w2.until(ExpectedConditions.jsReturnsValue("return document.readyState==\"complete\";")); 
				size = w2.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//table[@class='in4-table']/tbody/tr"))).size();	
			for(int i=2; i<=size; i++ )
			{
					//((JavascriptExecutor) oBrowser).executeScript("arguments[0].scrollIntoView();", oBrowser.findElement(By.xpath("//table[@id='dgMasters']/tbody/tr["+i+"]")));
					strText = w2.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//table[@id='dgMasters']/tbody/tr["+i+"]"))).getText();
				if(strText.contains(strName))
				{
					flag =1;
					break;
				}
			}
			if(flag==1)
			{
				return true;
			} else
			{
				return false;
			}
			
		} catch(Exception e)
		{
			System.out.println(e);
			appInd.captureScreenShot();
		return false;}
	}
	
	public boolean createCityMaster(String strCityName, String strStateName, String strRegion)
	{
	
		try
		{
			mainMenu.clickHomeMenu();
			homeSubMenu.clickAdministration();
			clickMasterTableLink();
			Frames.rightFrame();
			appInd.selectDropDown(master.getMasterTableDropDown(), "City Master");
			appInd.selectDropDown(master.getStatusDropDown(), "--All--");
			appInd.clickObject(master.getGoButton());
			appInd.selectDropDown(master.getDisplayItemPerPage(), "--All--");
			if(master.isElementPresent(strCityName))
			{
				return true;
			} else
			{
				appInd.clickObject(master.getAddNewLink());
				Frames.iFrame();
				appInd.setObject(master.getCityName(), strCityName);
				appInd.selectDropDown(master.selectStateName(), strStateName);
				appInd.selectDropDown(master.selectRegionName(), strRegion);
				appInd.clickObject(master.getSubmitButton());
				Frames.rightFrame();
				if((master.isElementPresent(strCityName)))
						{
					        return true;
						} else
						{
							return false;
						}			
			}
		

		} catch(Exception e)
		{
			return false;
		}	
	}
	
	public boolean createCountryMaster(String strCountryName, String strRegion, String strIsdCode)
	{
		try
		{
			mainMenu.clickHomeMenu();
			homeSubMenu.clickAdministration();
			clickMasterTableLink();
			Frames.rightFrame();
			appInd.selectDropDown(master.getMasterTableDropDown(), "Country Master");
			appInd.selectDropDown(master.getStatusDropDown(), "--All--");
			appInd.clickObject(master.getGoButton());
			appInd.selectDropDown(master.getDisplayItemPerPage(), "--All--");
			if(master.isElementPresent(strCountryName))
			{
				return true;
			} else
			{
				appInd.clickObject(master.getAddNewLink());
				Frames.iFrame();
				appInd.setObject(master.getCountryName() , strCountryName);
				appInd.selectDropDown(master.selectRegionName(), strRegion);
				appInd.setObject(master.getIsdCode(), strIsdCode);
				
				appInd.clickObject(master.getSubmitButton());
				Frames.rightFrame();
				if((master.isElementPresent(strCountryName)))
						{
					        return true;
						} else
						{
							return false;
						}			
			}
		

		} catch(Exception e)
		{
			System.out.println(e);
			return false;
		}	
	}
	
	public boolean createTitleMaster(String strTitleName)
	{
		try
		{
			mainMenu.clickHomeMenu();
			homeSubMenu.clickAdministration();
			master.clickMasterTableLink();
			Frames.rightFrame();
			appInd.selectDropDown(master.getMasterTableDropDown(), "Title Master");
			appInd.selectDropDown(master.getStatusDropDown(), "--All--");
			appInd.clickObject(master.getGoButton());
			appInd.selectDropDown(master.getDisplayItemPerPage(), "--All--");
			if(master.isElementPresent(strTitleName))
			{
				return true;
			} else
			{
				appInd.clickObject(master.getAddNewLink());
				Frames.iFrame();                                                                        
				appInd.setObject(master.getname() , strTitleName);
				appInd.clickObject(master.getSubmitButton());
				Frames.rightFrame();
				if((master.isElementPresent(strTitleName)))
						{
					        return true;
						} else
						{
							return false;
						}			
			}
		

		} catch(Exception e)
		{
			System.out.println(e);
			return false;
		}	
	}
	
	public boolean createStateMaster(String strStateName, String strStateCode, String strTinNumber, String strCountry, String strRegion)
	{
		try
		{
			mainMenu.clickHomeMenu();
			homeSubMenu.clickAdministration();
			clickMasterTableLink();
			Frames.rightFrame();
			appInd.selectDropDown(master.getMasterTableDropDown(), "State Master");
			appInd.selectDropDown(master.getStatusDropDown(), "--All--");
			appInd.clickObject(master.getGoButton());
			appInd.selectDropDown(master.getDisplayItemPerPage(), "--All--");
			if(master.isElementPresent(strStateName))
			{
				return true;
			} else
			{
				appInd.clickObject(master.getAddNewLink());
				Frames.iFrame();
				appInd.setObject(master.getStateName() , strStateName);
				appInd.setObject(master.getStateCode(), strStateCode);
				appInd.setObject(master.getTinNumber(), strTinNumber);
				appInd.selectDropDown(master.selectCountryName(), strCountry);
				appInd.selectDropDown(master.selectRegionName() , strRegion);
				appInd.clickObject(master.getSubmitButton());
				Frames.iFrame();
				if((master.isElementPresent(strStateName)))
						{
					        return true;
						} else
						{
							return false;
						}			
			}
		

		} catch(Exception e)
		{
			System.out.println(e);
			return false;
		}	
	}
	
	public boolean createLocalityMaster(String strLocalityName, String strCityName)
	{
		try
		{
			mainMenu.clickHomeMenu();
			homeSubMenu.clickAdministration();
			master.clickMasterTableLink();
			Frames.rightFrame();
			appInd.selectDropDown(master.getMasterTableDropDown(), "Locality Master");
			appInd.selectDropDown(master.getStatusDropDown(), "--All--");
			appInd.clickObject(master.getGoButton());
			appInd.selectDropDown(master.getDisplayItemPerPage(), "--All--");
			if(master.isElementPresent(strLocalityName))
			{
				return true;
			} else
			{
				appInd.clickObject(master.getAddNewLink());
				Frames.iFrame();
				appInd.setObject(master.getname() , strLocalityName);
				appInd.selectDropDown(master.selectCityName(), strCityName);
				appInd.clickObject(master.getSubmitButton());
				Frames.rightFrame();
				if((master.isElementPresent(strLocalityName)))
						{
					        return true;
						} else
						{
							return false;
						}			
			}
		

		} catch(Exception e)
		{
			return false;
		}	
	}
	public boolean createRegionsMaster(String strRegionName)
	{
		try
		{
			mainMenu.clickHomeMenu();
			homeSubMenu.clickAdministration();
			master.clickMasterTableLink();
			Frames.rightFrame();
			appInd.selectDropDown(master.getMasterTableDropDown(), "Regions");
			appInd.selectDropDown(master.getStatusDropDown(), "--All--");
			appInd.clickObject(master.getGoButton());
			appInd.selectDropDown(master.getDisplayItemPerPage(), "--All--");
			if(master.isElementPresent(strRegionName))
			{
				return true;
			} else
			{
				appInd.clickObject(master.getAddNewLink());
				Frames.iFrame();
				appInd.setObject(master.getRegionName() , strRegionName);
				appInd.clickObject(master.getSubmitButton());
				Frames.rightFrame();
				if((master.isElementPresent(strRegionName)))
						{
					        return true;
						} else
						{
							return false;
						}			
			}
		

		} catch(Exception e)
		{
			return false;
		}	
	}
	
	public boolean createSubLocationMaster(String strSubLocationName)
	{
		try
		{
			mainMenu.clickHomeMenu();
			homeSubMenu.clickAdministration();
			master.clickMasterTableLink();
			Frames.rightFrame();
			appInd.selectDropDown(master.getMasterTableDropDown(), "Sub Location");
			appInd.selectDropDown(master.getStatusDropDown(), "--All--");
			appInd.clickObject(master.getGoButton());
			appInd.selectDropDown(master.getDisplayItemPerPage(), "--All--");
			if(master.isElementPresent(strSubLocationName))
			{
				return true;
			} else
			{
				appInd.clickObject(master.getAddNewLink());
				Frames.iFrame();
				appInd.setObject(master.getname() , strSubLocationName);
				appInd.clickObject(master.getSubmitButton());
				Frames.rightFrame();
				if((master.isElementPresent(strSubLocationName)))
						{
					        return true;
						} else
						{
							return false;
						}			
			}
		

		} catch(Exception e)
		{
			return false;
		}	
	}
	
	public boolean createCheckListCategoryMaster(String strCheckListCategoryName)
	{
		try
		{
			mainMenu.clickHomeMenu();
			homeSubMenu.clickAdministration();
			master.clickMasterTableLink();
			Frames.rightFrame();
			appInd.selectDropDown(master.getMasterTableDropDown(), "Check List Category");
			appInd.selectDropDown(master.getStatusDropDown(), "--All--");
			appInd.clickObject(master.getGoButton());
			appInd.selectDropDown(master.getDisplayItemPerPage(), "--All--");
			if(master.isElementPresent(strCheckListCategoryName))
			{
				return true;
			} else
			{
				appInd.clickObject(master.getAddNewLink());
				Frames.iFrame();
				appInd.setObject(master.getname() , strCheckListCategoryName);
				appInd.clickObject(master.getSubmitButton());
				Frames.rightFrame();
				if((master.isElementPresent(strCheckListCategoryName)))
						{
					        return true;
						} else
						{
							return false;
						}			
			}
		

		} catch(Exception e)
		{
			return false;
		}	
	}
	
	public boolean createCheckListSubCategoryMaster(String strCheckListSubCategoryName, String catagory)
	{
		try
		{
			mainMenu.clickHomeMenu();
			homeSubMenu.clickAdministration();
			master.clickMasterTableLink();
			Frames.rightFrame();
			appInd.selectDropDown(master.getMasterTableDropDown(), "Check List SubCategory");
			appInd.selectDropDown(master.getStatusDropDown(), "--All--");
			appInd.clickObject(master.getGoButton());
			appInd.selectDropDown(master.getDisplayItemPerPage(), "--All--");
			if(master.isElementPresent(strCheckListSubCategoryName))
			{
				return true;
			} else
			{
				appInd.clickObject(master.getAddNewLink());
				Frames.iFrame();
				appInd.setObject(master.getname() , strCheckListSubCategoryName);
				appInd.selectDropDown(master.selectCheckListCategory(), catagory);
				appInd.clickObject(master.getSubmitButton());
				Frames.rightFrame();
				if((master.isElementPresent(strCheckListSubCategoryName)))
						{
					        return true;
						} else
						{
							return false;
						}			
			}
		

		} catch(Exception e)
		{
			return false;
		}	
	}
}
