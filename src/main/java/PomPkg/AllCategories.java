package PomPkg;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class AllCategories {
                
	@FindBy(xpath="//select[@aria-label='Select a category for search']")
	private WebElement AllCategoryPrint;
	
	public AllCategories(WebDriver driver)
	{ 
		
		PageFactory.initElements(driver, this);
	}
	
	public void PrintAllCategory()
	{ 
		
		Select s = new Select(AllCategoryPrint);
		List<WebElement> list = s.getOptions();
		for(WebElement m:list)
		{ 
			System.out.println(m.getText());
		}
		
	}        
	
	
	
	
	
	
	
	
	
	
}
