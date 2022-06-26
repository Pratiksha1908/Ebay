package PomPkg;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogoScreenshot {
	 File destination;
   @FindBy(xpath="//a[@href='https://www.ebay.com/']")
	private WebElement logo; 
   
 public LogoScreenshot(WebDriver driver)
   { 
	   PageFactory.initElements(driver, this);
   }
   public void logo(String str) throws Exception
   {
   File source = logo.getScreenshotAs(OutputType.FILE);
   destination = new File("D:\\Ebaylogo\\"+str+".jpg");
   FileHandler.copy(source, destination);
}
}