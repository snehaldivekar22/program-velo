package kitPOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogOutPage 
{
//variable
	@FindBy(xpath = "//a[@class='remove text-xxsmall']") private WebElement createPage;
	//constructor
	public LogOutPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this); 
	}
	//methods
	public void clickOncreatePage()
	{
		createPage.click();
	}
}
