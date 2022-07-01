package filereading;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileReadinginSelenium {

	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException {
File myfile=new File("E:\\Myexcelfile.xlsx");
Sheet mysheet = WorkbookFactory.create(myfile).getSheet("Sheet4");

String UN = mysheet.getRow(1).getCell(0).getStringCellValue();
String PWD = mysheet.getRow(1).getCell(1).getStringCellValue();
String pin1 = mysheet.getRow(1).getCell(2).getStringCellValue();

		System.setProperty("webdriver.chrome.driver", "E:\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://kite.zerodha.com/");
driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
driver.findElement(By.id("userid")).sendKeys(UN);
driver.findElement(By.id("password")).sendKeys(PWD);
driver.findElement(By.xpath("//button[@type='submit']")).click();
Thread.sleep(500);

driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
driver.findElement(By.id("pin")).sendKeys(pin1);
driver.findElement(By.xpath("//button[@type='submit']")).click();
Thread.sleep(1000);

driver.manage().timeouts().implicitlyWait(Duration.ofMillis(3000));
WebElement userid = driver.findElement(By.xpath("//span[@class='user-id']"));
String ActualResult = userid.getText();//display userid find and store in variable
String ExpectedID = "ELR321";//if we enter correct userid then test case is pass
if(ActualResult.equals(ExpectedID))//Actual which is display in webpage and expected is equals
{
	System.out.println("test case is pass");
}
else
{
	System.out.println("test case is fail");
}
userid.click();
driver.findElement(By.xpath("//a[@target='_self']")).click();
	}
}


