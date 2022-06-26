package PomPkg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchProduct {
          
	@FindBy(xpath="//input[@type='text']")
	private WebElement searchBox;
	
	@FindBy(xpath="//input[@type='submit']")
	private WebElement Submit_Search;
	
	public SearchProduct(WebDriver driver)
	{ 
		
		 PageFactory.initElements(driver, this);
	}
	
	public void EnterText_SearchBox(String searchBox)
	{ 
		this.searchBox.sendKeys(searchBox);
		Submit_Search.click();
	}
	
	
	
	
	
	
	
	
	
}
