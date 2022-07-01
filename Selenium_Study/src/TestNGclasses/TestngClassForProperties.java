package TestNGclasses;

import java.io.IOException;

//import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import KitBaseClass.Baseclasswithproperties;
import KitUtility.KitUtilityPropertyClass;
import kitPomClass.KitHomePage1;
import kitPomClass.KitLoginPage;
import kitPomClass.KitPinPage;
@Listeners(ListnerClass.Listner1.class)
public class TestngClassForProperties extends Baseclasswithproperties
{ 
	KitLoginPage login;
	KitPinPage pin1;
	KitHomePage1 home1;
	
	@BeforeClass
	public void launchBrowser() throws IOException
	{
		openBrowser();
		login=new KitLoginPage(driver);
		pin1=new KitPinPage(driver);
		home1=new KitHomePage1(driver);
	}
	@BeforeMethod
	public void loginkit() throws IOException
	{
		login.SendUserID(KitUtilityPropertyClass.readPropertiesFromClass("UI"));
		login.SendPassword(KitUtilityPropertyClass.readPropertiesFromClass("PWD"));
		login.ClickonLoginButton();
		KitUtilityPropertyClass.waits(driver, 2000);
		pin1.SendPin(KitUtilityPropertyClass.readPropertiesFromClass("pin"));
		pin1.ContinueButton();
		KitUtilityPropertyClass.waits(driver, 2000);
		//KitUtilityPropertyClass.takescreenshot(driver);
	}
  @Test
  public void validateID() throws IOException
  {
	  SoftAssert soft=new SoftAssert();
	String ActualIDU = home1.userIdValidate();
	  String Expected = KitUtilityPropertyClass.readPropertiesFromClass("UI");
	  soft.assertEquals(ActualIDU, Expected,"Test case is fail string is not matching");
	  Reporter.log("test case is pass string is matching",true);
	  //KitUtilityPropertyClass.takescreenshot(driver);
	  soft.assertAll();
  }
  @BeforeMethod
  public void logoutFromKit() throws InterruptedException
  {
	  home1.clickOnLogOut();
  }
}
