package sCRIPTINzERODA;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pinpage {
	@FindBy(id = "pin") private WebElement Pinno;
	@FindBy(xpath = "//button[@type='submit']")private WebElement continueButton;

	public Pinpage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	 public void SendPin(String Pin1)
	 {
		 Pinno.sendKeys(Pin1);
	 }
	public void ContinueButton()
	{
		continueButton.click();
	}

}
