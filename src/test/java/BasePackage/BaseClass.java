package BasePackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;

import PomPkg.AllCategories;
import PomPkg.LogoScreenshot;
import PomPkg.SearchProduct;



public class BaseClass {
  
	public WebDriver driver; 
	public SearchProduct search;
	public AllCategories category;
	public LogoScreenshot logo;
	
	public void LaunchBrowser()
	{ 
	System.setProperty("webdriver.chrome.driver", "E:\\Eclipse\\sampleProject\\src\\main\\resources\\chromedriver.exe");
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	}
	
	public void OpenBrowser()
	{
		LaunchBrowser();
		driver.get("https://www.ebay.com/");
		
	}
	
	@BeforeClass()
	public void Open_EbayBrowser()
	{
		OpenBrowser();
		search = new SearchProduct(driver);
		category = new AllCategories(driver);
		logo = new LogoScreenshot(driver);
	}
}
