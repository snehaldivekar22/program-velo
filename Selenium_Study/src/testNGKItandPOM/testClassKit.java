package testNGKItandPOM;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
//import org.apache.poi.sl.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class testClassKit {
	WebDriver driver;
	KitHomePage home;
	KitLoginPage login;
	KitPinPage pin2;
	org.apache.poi.ss.usermodel.Sheet mySheet;
	
  @BeforeClass
  public void LaunchBrowser() throws EncryptedDocumentException, IOException
  {
	  File myfile=new File("E:\\Myexcelfile.xlsx");
	  mySheet= WorkbookFactory.create(myfile).getSheet("Sheet4");
	  System.setProperty("webdriver.chrome.driver","E:\\chromedriver.exe");
	  driver=new ChromeDriver();
	  
	  home=new KitHomePage(driver);
	  login=new KitLoginPage(driver);
	  pin2=new KitPinPage(driver);
	  
		
driver.manage().window().maximize();
driver.get("https://kite.zerodha.com/");
driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
  }
  @BeforeMethod
  public void LogintoKit()
  {
	  String UserName=mySheet.getRow(0).getCell(0).getStringCellValue();
	  String pwd=mySheet.getRow(0).getCell(1).getStringCellValue();
	  String pin1=mySheet.getRow(0).getCell(2).getStringCellValue();
	  login.SendUserID(UserName);
	  login.SendPassword(pwd);
	  login.ClickonLoginButton();
	  pin2.SendPin(pin1);
	  pin2.ContinueButton();
	  
  }
  @Test
  public void ValidatinguserID()
  {
	  String ExpectedUserId=mySheet.getRow(0).getCell(0).getStringCellValue();
	  String Actualid=home.userIdValidate();
	  Assert.assertEquals(Actualid,ExpectedUserId,"actual and expected is not matching test case is fail");
      Reporter.log("test case is pass",true);
  }
  @AfterMethod
  public void logOut() throws InterruptedException
  {
	  home.clickOnLogOut();
  }
  @AfterClass
  public void CloseBrowser()
  {
	  driver.close();
  }
}
