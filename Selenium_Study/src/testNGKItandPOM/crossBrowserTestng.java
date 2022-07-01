package testNGKItandPOM;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
//import org.apache.poi.sl.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class crossBrowserTestng {
	KitLoginPage login1;
	KitPinPage pin3;
	KitHomePage home1;
	WebDriver driver;
	Sheet mysheet;
	@Parameters("browser")
	@BeforeClass
	

	public void kitLaunch(String browser) throws EncryptedDocumentException, IOException
	{
		ChromeOptions options=new ChromeOptions();
		
		options.addArguments("--disable-notifications");
		if (browser.equals("chrome"))
		{
			 System.setProperty("webdriver.chrome.driver","E:\\chromedriver.exe");
			  driver=new ChromeDriver();
			  driver.manage().window().maximize();
		}
		else if(browser.equals("firefox"))
		{
			 System.setProperty("webdriver.gecko.driver","E:\\geckodriver.exe");
			  driver=new FirefoxDriver();
			  driver.manage().window().maximize();
		}
		
		login1=new KitLoginPage(driver);
		pin3=new KitPinPage(driver);
		home1=new KitHomePage(driver);
		
		File myfile=new File("E:\\Myexcelfile.xlsx");
		 mysheet = WorkbookFactory.create(myfile).getSheet("Sheet4");
		 
	driver.get("https://kite.zerodha.com/");
	driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
	}
	
	@BeforeMethod
	public void loginToKit() throws EncryptedDocumentException, IOException
	{
	
		String UserName=mysheet.getRow(0).getCell(0).getStringCellValue();
		  String pwd=mysheet.getRow(0).getCell(1).getStringCellValue();
		  String pin1=mysheet.getRow(0).getCell(2).getStringCellValue();
		  login1.SendUserID(UserName);
		  login1.SendPassword(pwd);
		  login1.ClickonLoginButton();
		  pin3.SendPin(pin1);
		  pin3.ContinueButton();
		}
	
  @Test
  public void validatUserID()
  {   String Expectedid=mysheet.getRow(0).getCell(0).getStringCellValue();
	  String Actualid= home1.userIdValidate();
	  Assert.assertEquals(Actualid,Expectedid,"Test case is fail userid is not matching");
 Reporter.log("test case is pass",true);
  }
	@AfterMethod
	public void kitLogout() throws InterruptedException
	{
		home1.clickOnLogOut();
	}
	@AfterClass
	public void kitClose()
	{
		driver.close();
	}
}
