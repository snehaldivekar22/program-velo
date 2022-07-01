package kitPomClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KitPinPage {
	@FindBy(id = "pin") private WebElement Pinno;
	@FindBy(xpath = "//button[@type='submit']")private WebElement continueButton;

	public KitPinPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	 public void SendPin(String pin1)
	 {
		 Pinno.sendKeys(pin1);
	 }
	public void ContinueButton()
	{
		continueButton.click();
	}

	}


