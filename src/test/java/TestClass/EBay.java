package TestClass;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import BasePackage.BaseClass;
import PomPkg.SearchProduct;

public class EBay extends BaseClass {

	
	
	@Test()
	public void Search()
	{ 
		search.EnterText_SearchBox("tshirt");
	}
	
	@Test 
	public void Allcategory()
	{
		
		category.PrintAllCategory();
	} 
	
	@Test
	public void screenshot() throws Exception
	{ 
		logo.logo("ebay");
		
	}
	@AfterClass()
	public void CloseBrowser()
	{ 
		driver.close();
	}
}
