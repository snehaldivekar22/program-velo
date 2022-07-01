package sCRIPTINzERODA;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage1 {
	@FindBy(xpath = "//span[@class='user-id']")private WebElement userId;
	@FindBy(xpath = "//a[@target='_self']")private WebElement LogOut;
	
	public HomePage1(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	public void userIdValidate(String ExpectedID)
	{
		String actualUserId = userId.getText();
		String expectedUserId = ExpectedID;
		if(actualUserId.equals(expectedUserId))
		{
			System.out.println("test case is pass");
		}
		else
		{
			System.out.println("test case is not match test case is fail");
		}
	}
	
	public void clickOnLogOut() throws InterruptedException
	{
		userId.click();
		Thread.sleep(200);
		LogOut.click();
	}



}
