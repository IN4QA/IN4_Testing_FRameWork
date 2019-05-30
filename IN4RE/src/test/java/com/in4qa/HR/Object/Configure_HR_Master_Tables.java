package com.in4qa.HR.Object;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

import com.in4qa.HR.Tests.Configure_HR_Master_Tables_Tests;

import methods.Frames;



public class Configure_HR_Master_Tables extends Configure_HR_Master_Tables_Tests {
	
	WebDriver iDriver;
	public Configure_HR_Master_Tables(WebDriver oDriver)
	{
		iDriver=oDriver;
		PageFactory.initElements(oBrowser, this);
	}
	
	@FindBy(partialLinkText="Master Tables")
	private WebElement masterTable;
	public WebElement getMasterTablesLink()
	{
		return masterTable;
	}
	
	public void clickMasterTablesLink() throws Exception
	{
		Frames.leftFrame();
		appInd.clickObject(hr_master_table.getMasterTablesLink()) ;
	}
	
	@FindBy(id="ddlMasterTables")
	private WebElement masterTabledropdown;
	public WebElement getMasterTablesDropDown()
	{
		return masterTabledropdown;
	}
	
	@FindBy(css="select[id='ddlStatus']")
	private WebElement statusDropDown;
	public WebElement getStatusDropDown()
	{
		return statusDropDown;
	}
	
	@FindBy(css="select[id='ddlPageSize']")
	private WebElement displayPerPage;
	public WebElement getDisplayItemPerPage()
	{
		return displayPerPage;
	}
	
	@FindBy(partialLinkText="Add New")
	private WebElement addNew;
	public WebElement getAddNew()
	{
		return addNew;
	}
	
	@FindBy(id="btnGo")
	private WebElement goButton;
	public WebElement getGoButton()
	{
		return goButton;
	}
	
	@FindBy(id="GroupName")
	private WebElement groupName;
	public WebElement getGroupName()
	{
		return groupName;
	}
	
	@FindBy(id="btnSubmit")
	private WebElement submitButton;
	public WebElement getSubmitButton()
	{
		return submitButton;
	}
	
	@FindBy(id="GroupID")
	private WebElement groupID;
	public WebElement getGroupNameDropDown()
	{
		return groupID;
	}
	
	@FindBy(id="RoleName")
	private WebElement roleName;
	public WebElement getRoleName()
	{
		return roleName;
	}
	
	@FindBy(id="GradeName")
	private WebElement gradeName;
	public WebElement getGradeName()
	{
		return gradeName;
	}
	
	@FindBy(id="DegreeName")
	private WebElement degreeName;
	public WebElement getDegreeName()
	{
		return degreeName;
	}
	
	@FindBy(id="DegreeID")
	private WebElement degreeDropDown;
	public WebElement getDegreeDropDown()
	{
		return degreeDropDown;
	}
	
	@FindBy(id="BranchName")
	private WebElement branchName;
	public WebElement getBranchName()
	{
		return branchName;
	}
	
	@FindBy(id="CategoryName")
	private WebElement categoryName;
	public WebElement getCategoryName()
	{
		return categoryName;
	}
	
	@FindBy(id="CategoryDisplayName")
	private WebElement categoryDisplayName;
	public WebElement getCategoryDisplayName()
	{
		return categoryDisplayName;
	}
	
	@FindBy(id="CategoryDescription")
	private WebElement categoryDescription;
	public WebElement getCategoryDescription()
	{
		return categoryDescription;
	}
	
	@FindBy(id="CategoryID")
	private WebElement categoryID;
	public WebElement getCategoryNameDropDown()
	{
		return categoryID;
	}
	
	@FindBy(id="SkillName")
	private WebElement skillName;
	public WebElement getSkillName()
	{
		return skillName;
	}
	
	@FindBy(id="SkillDisplayName")
	private WebElement skillDisplayName;
	public WebElement getSkillDisplayName()
	{
		return skillDisplayName;
	}
	
	@FindBy(id="SkillDescription")
	private WebElement skillDescription;
	public WebElement getSkillDescription()
	{
		return skillDescription;
	}
	
	@FindBy(id="RatingCode")
	private WebElement ratingCode;
	public WebElement getRatingCode()
	{
		return ratingCode;
	}
	
	@FindBy(id="CodeDescription")
	private WebElement codeDescription;
	public WebElement getCodeDescription()
	{
		return codeDescription;
	}
	
	@FindBy(id="RelationshipName")
	private WebElement relationshipName;
	public WebElement getRelationshipName()
	{
		return relationshipName;
	}
	
	@FindBy(id="CompanyName")
	private WebElement companyName;
	public WebElement getInsuranceCompanyName()
	{
		return companyName;
	}
	@FindBy(id="InsuranceCompanyId")
	private WebElement insuranceCompanydropdown;
	public WebElement getInsuranceCompanyDropDown()
	{
		return insuranceCompanydropdown;
	}
	
	@FindBy(id="PolicyName")
	private WebElement policyName;
	public WebElement getInsurancePolicyName()
	{
		return policyName;
	}
	
	@FindBy(id="BUName")
	private WebElement businessUnitName;
	public WebElement getBusinessUnitName()
	{
		return businessUnitName;
	}
	
	@FindBy(id="BUDesciption")
	private WebElement businessUnitDesciption;
	public WebElement getBusinessUnitDesciption()
	{
		return businessUnitDesciption;
	}
	
	@FindBy(id="ReasonCode")
	private WebElement reasonCode;
	public WebElement getExitReason()
	{
		return reasonCode;
	}
	
	@FindBy(id="CodeDescription")
	private WebElement reasonDescription;
	public WebElement getReasonDescription()
	{
		return reasonDescription;
	}
	
	@FindBy(id="AirlinesName")
	private WebElement airlinesName;
	public WebElement getAirlinesName()
	{
		return airlinesName;
	}
	
	@FindBy(id="RankId")
	private WebElement rankId;
	public WebElement getCorporateRankDropDown()
	{
		return rankId;
	}
	
	@FindBy(id="GradeId")
	private WebElement gradeId;
	public WebElement getCorporateGradeDropDown()
	{
		return gradeId;
	}
	
	@FindBy(id="CorporateTitleName")
	private WebElement corporateTitleName;
	public WebElement getCorporateTitleName()
	{
		return corporateTitleName;
	}
	
	@FindBy(id="InstituteName")
	private WebElement instituteName;
	public WebElement getInstituteName()
	{
		return instituteName;
	}
	
	@FindBy(id="CarTypeName")
	private WebElement carTypeName;
	public WebElement getCarTypeName()
	{
		return carTypeName;
	}
	
	@FindBy(id="CarTypeDesc")
	private WebElement carTypeDesc;
	public WebElement getCarTypeDesc()
	{
		return carTypeDesc;
	}
	public boolean isMasterNotPresent(String strName) throws Exception
	{
		int  flag=0, size =0; String strText=null;

			    Thread.sleep(500);
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
				return false;
			} else
			{
				return true;
			}
	}
	
	public boolean create_hr_group_master(int i)
	{
		try
		{
			mainMenu.clickHR();
			hrSubMenu.clickConfigureHR();
			hr_master_table.clickMasterTablesLink();
			Frames.rightFrame();
			appInd.selectDropDown(hr_master_table.getMasterTablesDropDown(), "Groups");
			appInd.selectDropDown(hr_master_table.getStatusDropDown(), "Active");
			appInd.clickObject(hr_master_table.getGoButton());
			appInd.selectDropDown(hr_master_table.getDisplayItemPerPage(), "--All--");
			if(hr_master_table.isMasterNotPresent(hrmap.get("GroupName"+i)))
			{
				appInd.clickObject(hr_master_table.getAddNew());
				Frames.iFrame();
				appInd.setObject(hr_master_table.getGroupName(), hrmap.get("GroupName"+i));
				appInd.clickObject(hr_master_table.getSubmitButton());	
			}
			if(hr_master_table.isMasterNotPresent(hrmap.get("GroupName"+i)))
			{
				return false;
			} else
			{
				return true;
			}	
		}catch(Exception e)
		{
			appInd.captureScreenShot();
			return false;
		}
	}
	
	public boolean create_hr_role_master(int i)
	{
		try
		{
			mainMenu.clickHR();
			hrSubMenu.clickConfigureHR();
			hr_master_table.clickMasterTablesLink();
			Frames.rightFrame();
			appInd.selectDropDown(hr_master_table.getMasterTablesDropDown(), "Roles");
			appInd.selectDropDown(hr_master_table.getStatusDropDown(), "Active");
			appInd.clickObject(hr_master_table.getGoButton());
			appInd.selectDropDown(hr_master_table.getDisplayItemPerPage(), "--All--");
			if(hr_master_table.isMasterNotPresent(hrmap.get("Roles"+i)))
			{
				appInd.clickObject(hr_master_table.getAddNew());
				Frames.iFrame();
				appInd.selectDropDown(hr_master_table.getGroupNameDropDown() , hrmap.get("GroupName"+i));
				appInd.setObject(hr_master_table.getRoleName(), hrmap.get("Roles"+i));
				appInd.clickObject(hr_master_table.getSubmitButton());	
			}
			if(hr_master_table.isMasterNotPresent(hrmap.get("Roles"+i)))
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
	
	public boolean create_hr_Pay_Scale_Grades_master(int i)
	{
		try
		{
			mainMenu.clickHR();
			hrSubMenu.clickConfigureHR();
			hr_master_table.clickMasterTablesLink();
			Frames.rightFrame();
			appInd.selectDropDown(hr_master_table.getMasterTablesDropDown(), "Pay Scale Grades");
			appInd.selectDropDown(hr_master_table.getStatusDropDown(), "Active");
			appInd.clickObject(hr_master_table.getGoButton());
			appInd.selectDropDown(hr_master_table.getDisplayItemPerPage(), "--All--");
			if(hr_master_table.isMasterNotPresent(hrmap.get("GradeName"+i)))
			{
				appInd.clickObject(hr_master_table.getAddNew());
				Frames.iFrame();
				appInd.setObject(hr_master_table.getDegreeName(), hrmap.get("GradeName"+i) );
				appInd.clickObject(hr_master_table.getSubmitButton());	
			}
			if(hr_master_table.isMasterNotPresent(hrmap.get("GradeName"+i)))
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
	
	public boolean create_hr_Degree_master(int i)
	{
		try
		{
			mainMenu.clickHR();
			hrSubMenu.clickConfigureHR();
			hr_master_table.clickMasterTablesLink();
			Frames.rightFrame();
			appInd.selectDropDown(hr_master_table.getMasterTablesDropDown(), "Degree");
			appInd.selectDropDown(hr_master_table.getStatusDropDown(), "Active");
			appInd.clickObject(hr_master_table.getGoButton());
			appInd.selectDropDown(hr_master_table.getDisplayItemPerPage(), "--All--");
			if(hr_master_table.isMasterNotPresent(hrmap.get("DegreeName"+i)))
			{
				appInd.clickObject(hr_master_table.getAddNew());
				Frames.iFrame();
				appInd.setObject(hr_master_table.getGradeName(), hrmap.get("DegreeName"+i));
				appInd.clickObject(hr_master_table.getSubmitButton());	
			}
			if(hr_master_table.isMasterNotPresent(hrmap.get("DegreeName"+i)))
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
	
	public boolean create_Discipline_master(int i)
	{
		try
		{
			mainMenu.clickHR();
			hrSubMenu.clickConfigureHR();
			hr_master_table.clickMasterTablesLink();
			Frames.rightFrame();
			appInd.selectDropDown(hr_master_table.getMasterTablesDropDown(), "Discipline");
			appInd.selectDropDown(hr_master_table.getStatusDropDown(), "Active");
			appInd.clickObject(hr_master_table.getGoButton());
			appInd.selectDropDown(hr_master_table.getDisplayItemPerPage(), "--All--");
			if(hr_master_table.isMasterNotPresent(hrmap.get("Discipline"+i)))
			{
				appInd.clickObject(hr_master_table.getAddNew());
				Frames.iFrame();
				appInd.selectDropDown(hr_master_table.getDegreeDropDown(), hrmap.get("DegreeName"+i));
				appInd.setObject(hr_master_table.getBranchName() , hrmap.get("Discipline"+i) );
				appInd.clickObject(hr_master_table.getSubmitButton());	
			}
			if(hr_master_table.isMasterNotPresent(hrmap.get("Discipline"+i)))
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
	
	public boolean create_Skill_Set_Categories_master(int i)
	{
		try
		{
			mainMenu.clickHR();
			hrSubMenu.clickConfigureHR();
			hr_master_table.clickMasterTablesLink();
			Frames.rightFrame();
			appInd.selectDropDown(hr_master_table.getMasterTablesDropDown(), "Skill Set Categories");
			appInd.selectDropDown(hr_master_table.getStatusDropDown(), "Active");
			appInd.clickObject(hr_master_table.getGoButton());
			appInd.selectDropDown(hr_master_table.getDisplayItemPerPage(), "--All--");
			if(hr_master_table.isMasterNotPresent(hrmap.get("Category Name"+i)))
			{
				appInd.clickObject(hr_master_table.getAddNew());
				Frames.iFrame();
				appInd.setObject(hr_master_table.getCategoryName(), hrmap.get("Category Name"+i));
				appInd.setObject(hr_master_table.getCategoryDisplayName(), hrmap.get("Category Display Name"+i));
				appInd.setObject(hr_master_table.getCategoryDescription(), hrmap.get("Category Description"+i));
				appInd.clickObject(hr_master_table.getSubmitButton());	
			}
			if(hr_master_table.isMasterNotPresent(hrmap.get("Category Name"+i)))
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
	
	public boolean create_Skill_Set_master(int i)
	{
		try
		{
			mainMenu.clickHR();
			hrSubMenu.clickConfigureHR();
			hr_master_table.clickMasterTablesLink();
			Frames.rightFrame();
			appInd.selectDropDown(hr_master_table.getMasterTablesDropDown(), "Skill Sets");
			appInd.selectDropDown(hr_master_table.getStatusDropDown(), "Active");
			appInd.clickObject(hr_master_table.getGoButton());
			appInd.selectDropDown(hr_master_table.getDisplayItemPerPage(), "--All--");
			if(hr_master_table.isMasterNotPresent( hrmap.get("Skill Name"+i)))
			{
				appInd.clickObject(hr_master_table.getAddNew());
				Frames.iFrame();
				appInd.selectDropDown(hr_master_table.getCategoryNameDropDown(), hrmap.get("Category Name"+i));
				appInd.setObject(hr_master_table.getSkillName(), hrmap.get("Skill Name"+i));
				appInd.setObject(hr_master_table.getSkillDisplayName(), hrmap.get("Skill Display Name"+i));
				appInd.setObject(hr_master_table.getSkillDescription(), hrmap.get("Skill Description"+i));
				appInd.clickObject(hr_master_table.getSubmitButton());		
			}
			if(hr_master_table.isMasterNotPresent( hrmap.get("Skill Name"+i)))
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
	
	public boolean create_Review_Rating_master(int i)
	{
		try
		{
			mainMenu.clickHR();
			hrSubMenu.clickConfigureHR();
			hr_master_table.clickMasterTablesLink();
			Frames.rightFrame();
			appInd.selectDropDown(hr_master_table.getMasterTablesDropDown(), "Review Rating");
			appInd.selectDropDown(hr_master_table.getStatusDropDown(), "Active");
			appInd.clickObject(hr_master_table.getGoButton());
			appInd.selectDropDown(hr_master_table.getDisplayItemPerPage(), "--All--");
			if(hr_master_table.isMasterNotPresent(hrmap.get("Rating Code"+i)))
			{
				appInd.clickObject(hr_master_table.getAddNew());
				Frames.iFrame();
				appInd.setObject(hr_master_table.getRatingCode(), hrmap.get("Rating Code"+i));
				appInd.setObject(hr_master_table.getCodeDescription(), hrmap.get("CodeDescription"+i));
				appInd.clickObject(hr_master_table.getSubmitButton());	
			}
			if(hr_master_table.isMasterNotPresent(hrmap.get("Rating Code"+i)))
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
	
	public boolean create_Relationships_master(int i)
	{
		try
		{
			mainMenu.clickHR();
			hrSubMenu.clickConfigureHR();
			hr_master_table.clickMasterTablesLink();
			Frames.rightFrame();
			appInd.selectDropDown(hr_master_table.getMasterTablesDropDown(), "Relationships Master");
			appInd.selectDropDown(hr_master_table.getStatusDropDown(), "Active");
			appInd.clickObject(hr_master_table.getGoButton());
			appInd.selectDropDown(hr_master_table.getDisplayItemPerPage(), "--All--");
			if(hr_master_table.isMasterNotPresent(hrmap.get("Rating Code"+i)))
			{
				appInd.clickObject(hr_master_table.getAddNew());
				Frames.iFrame();
				appInd.setObject(hr_master_table.getRelationshipName(), hrmap.get("Relationship Name"+i));
				appInd.clickObject(hr_master_table.getSubmitButton());	
			}
			if(hr_master_table.isMasterNotPresent(hrmap.get("Rating Code"+i)))
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
	
	
	public boolean create_Insurance_Company_master(int i)
	{
		try
		{
			mainMenu.clickHR();
			hrSubMenu.clickConfigureHR();
			hr_master_table.clickMasterTablesLink();
			Frames.rightFrame();
			appInd.selectDropDown(hr_master_table.getMasterTablesDropDown(), "Insurance Company");
			appInd.selectDropDown(hr_master_table.getStatusDropDown(), "Active");
			appInd.clickObject(hr_master_table.getGoButton());
			appInd.selectDropDown(hr_master_table.getDisplayItemPerPage(), "--All--");
			if(hr_master_table.isMasterNotPresent(hrmap.get("Insurance Company"+i)))
			{
				appInd.clickObject(hr_master_table.getAddNew());
				Frames.iFrame();
				appInd.setObject(hr_master_table.getInsuranceCompanyName(), hrmap.get("Insurance Company"+i));
				appInd.clickObject(hr_master_table.getSubmitButton());	
			}
			if(hr_master_table.isMasterNotPresent(hrmap.get("Insurance Company"+i)))
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
	
	public boolean create_Insurance_Policy_Detail_master(int i)
	{
		try
		{
			mainMenu.clickHR();
			hrSubMenu.clickConfigureHR();
			hr_master_table.clickMasterTablesLink();
			Frames.rightFrame();
			appInd.selectDropDown(hr_master_table.getMasterTablesDropDown(), "Insurance Policy Detail");
			appInd.selectDropDown(hr_master_table.getStatusDropDown(), "Active");
			appInd.clickObject(hr_master_table.getGoButton());
			appInd.selectDropDown(hr_master_table.getDisplayItemPerPage(), "--All--");
			if(hr_master_table.isMasterNotPresent(hrmap.get("Insurance Policy Detail"+i)))
			{
				appInd.clickObject(hr_master_table.getAddNew());
				Frames.iFrame();
			    appInd.selectDropDown(hr_master_table.getInsuranceCompanyDropDown(), hrmap.get("Insurance Company"+i));
			    appInd.setObject(hr_master_table.getInsurancePolicyName(), hrmap.get("Insurance Policy Detail"+i));
				appInd.clickObject(hr_master_table.getSubmitButton());	
			}
			if(hr_master_table.isMasterNotPresent(hrmap.get("Insurance Policy Detail"+i)))
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
	
	public boolean create_Business_Unit_Master(int i)
	{
		try
		{
			mainMenu.clickHR();
			hrSubMenu.clickConfigureHR();
			hr_master_table.clickMasterTablesLink();
			Frames.rightFrame();
			appInd.selectDropDown(hr_master_table.getMasterTablesDropDown(), "Business Unit Master");
			appInd.selectDropDown(hr_master_table.getStatusDropDown(), "Active");
			appInd.clickObject(hr_master_table.getGoButton());
			appInd.selectDropDown(hr_master_table.getDisplayItemPerPage(), "--All--");
			if(hr_master_table.isMasterNotPresent(hrmap.get("Business Unit Master"+i)))
			{
				appInd.clickObject(hr_master_table.getAddNew());
				Frames.iFrame();
			   appInd.setObject(hr_master_table.getBusinessUnitName(), hrmap.get("Business Unit Name"+i));
			   appInd.setObject(hr_master_table.getBusinessUnitDesciption(), hrmap.get("Business Unit Description"+i));
			   appInd.clickObject(hr_master_table.getSubmitButton());	
			}
			if(hr_master_table.isMasterNotPresent(hrmap.get("Business Unit Master"+i)))
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
	
	public boolean create_Exit_Reason_Master(int i)
	{
		try
		{
			mainMenu.clickHR();
			hrSubMenu.clickConfigureHR();
			hr_master_table.clickMasterTablesLink();
			Frames.rightFrame();
			appInd.selectDropDown(hr_master_table.getMasterTablesDropDown(), "Exit Reason");
			appInd.selectDropDown(hr_master_table.getStatusDropDown(), "Active");
			appInd.clickObject(hr_master_table.getGoButton());
			appInd.selectDropDown(hr_master_table.getDisplayItemPerPage(), "--All--");
			if(hr_master_table.isMasterNotPresent(hrmap.get("Exit Reason"+i)))
			{
				appInd.clickObject(hr_master_table.getAddNew());
				Frames.iFrame();
				appInd.setObject(hr_master_table.getExitReason() , hrmap.get("Exit Reason"+i));
			    appInd.setObject(hr_master_table.getReasonDescription(), hrmap.get("Exit Reason Description"+i));
			    appInd.clickObject(hr_master_table.getSubmitButton());	
			}
			if(hr_master_table.isMasterNotPresent(hrmap.get("Exit Reason"+i)))
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
	
	public boolean create_Air_Lines_Master(int i)
	{
		try
		{
			mainMenu.clickHR();
			hrSubMenu.clickConfigureHR();
			hr_master_table.clickMasterTablesLink();
			Frames.rightFrame();
			appInd.selectDropDown(hr_master_table.getMasterTablesDropDown(), "Air Lines");
			appInd.selectDropDown(hr_master_table.getStatusDropDown(), "Active");
			appInd.clickObject(hr_master_table.getGoButton());
			appInd.selectDropDown(hr_master_table.getDisplayItemPerPage(), "--All--");
			if(hr_master_table.isMasterNotPresent(hrmap.get("Airlines Name"+i)))
			{
				appInd.clickObject(hr_master_table.getAddNew());
				Frames.iFrame();
				appInd.setObject(hr_master_table.getAirlinesName(), hrmap.get("Airlines Name"+i));
			    appInd.clickObject(hr_master_table.getSubmitButton());	
			}
			if(hr_master_table.isMasterNotPresent(hrmap.get("Airlines Name"+i)))
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
	
	public boolean create_Corporate_Titles_Master(int i)
	{
		try
		{
			mainMenu.clickHR();
			hrSubMenu.clickConfigureHR();
			hr_master_table.clickMasterTablesLink();
			Frames.rightFrame();
			appInd.selectDropDown(hr_master_table.getMasterTablesDropDown(), "Corporate Titles");
			appInd.selectDropDown(hr_master_table.getStatusDropDown(), "Active");
			appInd.clickObject(hr_master_table.getGoButton());
			appInd.selectDropDown(hr_master_table.getDisplayItemPerPage(), "--All--");
			if(hr_master_table.isMasterNotPresent(hrmap.get("Corporate Titles"+i)))
			{
				appInd.clickObject(hr_master_table.getAddNew());
				Frames.iFrame();
				appInd.selectDropDown(hr_master_table.getCorporateRankDropDown(), hrmap.get("Corporate Rank"+i));
				appInd.selectDropDown(hr_master_table.getCorporateGradeDropDown(), hrmap.get("Corporate Grade"+i));
				appInd.setObject(hr_master_table.getCorporateTitleName(), hrmap.get("CorporateTitleName"+i));
			    appInd.clickObject(hr_master_table.getSubmitButton());	
			    
			}
			if(hr_master_table.isMasterNotPresent(hrmap.get("Corporate Titles"+i)))
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
	
	public boolean create_Institute_Name_Master(int i)
	{
		try
		{
			mainMenu.clickHR();
			hrSubMenu.clickConfigureHR();
			hr_master_table.clickMasterTablesLink();
			Frames.rightFrame();
			appInd.selectDropDown(hr_master_table.getMasterTablesDropDown(), "Institute Name");
			appInd.selectDropDown(hr_master_table.getStatusDropDown(), "Active");
			appInd.clickObject(hr_master_table.getGoButton());
			appInd.selectDropDown(hr_master_table.getDisplayItemPerPage(), "--All--");
			if(hr_master_table.isMasterNotPresent(hrmap.get("InstituteName"+i)))
			{
				appInd.clickObject(hr_master_table.getAddNew());
				Frames.iFrame();
				appInd.setObject(hr_master_table.getInstituteName(), hrmap.get("InstituteName"+i));
			    appInd.clickObject(hr_master_table.getSubmitButton());	
			    
			}
			if(hr_master_table.isMasterNotPresent(hrmap.get("InstituteName"+i)))
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
	
	public boolean create_Car_Types_Master(int i)
	{
		try
		{
			mainMenu.clickHR();
			hrSubMenu.clickConfigureHR();
			hr_master_table.clickMasterTablesLink();
			Frames.rightFrame();
			appInd.selectDropDown(hr_master_table.getMasterTablesDropDown(), "Car Types");
			appInd.selectDropDown(hr_master_table.getStatusDropDown(), "Active");
			appInd.clickObject(hr_master_table.getGoButton());
			appInd.selectDropDown(hr_master_table.getDisplayItemPerPage(), "--All--");
			if(hr_master_table.isMasterNotPresent(hrmap.get("Corporate Titles"+i)))
			{
				appInd.clickObject(hr_master_table.getAddNew());
				Frames.iFrame();
				appInd.setObject(hr_master_table.getCarTypeName(), hrmap.get("Car Type Name"+i));
				appInd.setObject(hr_master_table.getCarTypeDesc(), hrmap.get("Car Type Description"+i));
			    appInd.clickObject(hr_master_table.getSubmitButton());	   
			}
			if(hr_master_table.isMasterNotPresent(hrmap.get("Corporate Titles"+i)))
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
