package kitPomClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KitHomePage1 {
	@FindBy(xpath = "//span[@class='user-id']")private WebElement userId;
	@FindBy(xpath = "//a[@target='_self']")private WebElement LogOut;
	
	
	
	public KitHomePage1(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	

	public String userIdValidate()
	{
		String actualid = userId.getText();
		return actualid;
	}
	
	public void clickOnLogOut() throws InterruptedException
	{
		userId.click();
		Thread.sleep(200);
		LogOut.click();
	}


}
