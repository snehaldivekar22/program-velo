package testNGKItandPOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KitLoginPage {
	//variable declare scope is private //encapsulation
	@FindBy(id = "userid") private WebElement UI;
	@FindBy(id = "password") private WebElement PWD;
	@FindBy(xpath  = "//button[@class='button-orange wide']") private WebElement LoginB;
	
	public KitLoginPage(WebDriver driver)//parameterized constructor initialize with global variable 
	{
		PageFactory.initElements(driver,this);
	}
	//perform action on webelement that much methods we have to declare
	public void SendUserID(String UserName)
	{
		UI.sendKeys(UserName);
		
		
	}
	public void SendPassword(String pwd)
	{
		PWD.sendKeys(pwd);
	}
public void ClickonLoginButton()
{
	LoginB.click();
}
}
