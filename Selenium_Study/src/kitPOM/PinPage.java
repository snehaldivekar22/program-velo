package kitPOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PinPage 
{
@FindBy(id = "pin") private WebElement Pinno;
@FindBy(xpath = "//button[@type='submit']")private WebElement continueButton;

public PinPage(WebDriver driver)
{
	PageFactory.initElements(driver,this);
}
 public void SendPin()
 {
	 Pinno.sendKeys("982278");
 }
public void ContinueButton()
{
	continueButton.click();
}

}
