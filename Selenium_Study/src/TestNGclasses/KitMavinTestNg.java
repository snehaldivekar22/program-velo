package TestNGclasses;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
//import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import KitBaseClass.KitBaseclass;
import KitUtility.Utility;
import testNGKItandPOM.KitHomePage;
import testNGKItandPOM.KitLoginPage;
import testNGKItandPOM.KitPinPage;

public class KitMavinTestNg extends KitBaseclass//inherited base class
{
	KitLoginPage login1;
	KitPinPage pin3;
	KitHomePage home1;
	

	@BeforeClass
	public void launchBrowser1()
	{
		openBrowser();//method call direct no need to create object because we extends base class
		login1=new KitLoginPage(driver);
		pin3=new KitPinPage(driver);
		home1=new KitHomePage(driver);
	}
	@BeforeMethod
	public void logintoKit() throws EncryptedDocumentException, IOException
	{
		login1.SendUserID(Utility.readExcelFile(0, 0));//overloading
		login1.SendPassword(Utility.readExcelFile(0, 1));
		login1.ClickonLoginButton();
		Utility.waits(driver,100);
		pin3.SendPin(Utility.readExcelFile(0, 2));
		pin3.ContinueButton();
	}
  @Test
  public void validateUN() throws EncryptedDocumentException, IOException 
  {
	  String ActualID = home1.userIdValidate();
	 String Expected = Utility.readExcelFile(0, 0);
	 Assert.assertEquals(ActualID, Expected,"Test case is fail result is not match");
	 Reporter.log("test case is pass",true);
	 Utility.takescreenshot(driver);
	 
  }
  @AfterMethod
  public void logOutKit() throws InterruptedException
  {
	 home1.clickOnLogOut(); 
  }
  @AfterClass
  public void CloseBrowser()
  {
	  driver.close();
  }
}
