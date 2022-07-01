package sCRIPTINzERODA;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import kitPOM.LogOutPage;

public class TestClass1 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","E:\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://kite.zerodha.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
		//create file object and pass excel sheet path
		File myfile=new File("E:\\Myexcelfile.xlsx");
		Sheet mysheet = WorkbookFactory.create(myfile).getSheet("Sheet4");
		int totalRow = mysheet.getLastRowNum();
		
				for(int i=0;i<=totalRow;i++)
		{
			
		String uname = mysheet.getRow(i).getCell(0).getStringCellValue();
		String upass = mysheet.getRow(i).getCell(1).getStringCellValue();
		String upin = mysheet.getRow(i).getCell(2).getStringCellValue();
		
		//create object of login page
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(3000));
		ParameterisationwithKite login=new ParameterisationwithKite(driver);
		login.sendUsername(uname);
		login.sendPassword(upass);
		login.ClickOnLoginB();
		
		//pin pagde class object
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(3000));
		Pinpage pinp=new Pinpage(driver);
		pinp.SendPin(upin);
		pinp.ContinueButton();
		
		//create object of home page
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(3000));
		HomePage1 home=new HomePage1(driver);
		home.userIdValidate(uname);
		home.clickOnLogOut();
		Thread.sleep(2000);

		//create object of Logout page
		LogOutPage lp=new LogOutPage(driver);
		lp.clickOncreatePage();
		Thread.sleep(1000);
		}
				driver.close();
	
	}
}
