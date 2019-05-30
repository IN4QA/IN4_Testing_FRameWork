package com.in4qa.HR.Object;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class Configure_Emp_List {
	
	WebDriver iDriver;
	public Configure_Emp_List(WebDriver oDriver)
	{
		iDriver=oDriver;
		PageFactory.initElements(iDriver, this);
	}
	
	

}
