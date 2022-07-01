package kitPomClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KitLoginPage {
	@FindBy(id = "userid") private WebElement UI1;
	@FindBy(id = "password") private WebElement PWD1;
	@FindBy(xpath  = "//button[@class='button-orange wide']") private WebElement LoginB;
//	@FindBy(xpath = "//span[@class='su-message']") private WebElement UserIdErrorMsg;
	//@FindBy(xpath = "//span[contains(text(),'Password should be minimum')]") private WebElement PWDErrorMsg;
	
	public KitLoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	public void SendUserID(String UserName)
	{
		UI1.sendKeys(UserName);
		
		
	}
	public void SendPassword(String pwd)
	{
		PWD1.sendKeys(pwd);
	}
public void ClickonLoginButton()
{
	LoginB.click();
}
//public void getErrorMSgofUI()
//{
//	  UserIdErrorMsg.getText();
//}
//public String getErrorMsgOfPWD()
//{
//	String errormsg = PWDErrorMsg.getText();
//	return errormsg;
//}
}
