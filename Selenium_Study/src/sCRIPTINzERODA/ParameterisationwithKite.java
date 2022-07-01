package sCRIPTINzERODA;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ParameterisationwithKite {
	//variable/data members
	@FindBy(xpath = "//input[@type='text']")private WebElement UID;
	@FindBy(xpath = "//input[@type='password']")private WebElement PWD;
	@FindBy(xpath = "//button[@type='submit']")private WebElement ContinueButton;
	
	//constructor
	public ParameterisationwithKite(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
//method
	public void sendUsername(String userName)
	{
		UID.sendKeys(userName);
	}
	public void sendPassword(String Password)
	{
		PWD.sendKeys(Password);
	}
	public void ClickOnLoginB()
	{
		ContinueButton.click();
	}
}
