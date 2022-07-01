package kitPOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KiteLoginPage 
{
//Kite variable
	@FindBy(id = "userid") private WebElement UI;
	@FindBy(id = "password") private WebElement PWD;
	@FindBy(xpath  = "//button[@class='button-orange wide']") private WebElement LoginB;
	@FindBy(xpath = "//span[@class='su-message']") private WebElement UserIdErrorMsg;
	@FindBy(xpath = "//span[@class='su-message']") private WebElement PWDErrorMsg;
	
//constructor	
	public KiteLoginPage(WebDriver driver) 
	{
		PageFactory.initElements(driver,this);
	}
//create method
	public void sendUserId()
	{
		UI.sendKeys("ELR321");
	}
	public void sendPasswd()
	{
		PWD.sendKeys("Dhana1111");
		
	}
	public void Loginbuttonclick()
	{
		LoginB.click();
	}
  public void getErrorMSgofUI()
  {
	  UserIdErrorMsg.getText();
  }
public void getErrorMsgOfPWD()
{
	PWDErrorMsg.getText();
}
}
