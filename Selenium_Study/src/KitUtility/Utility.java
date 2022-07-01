package KitUtility;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;

import net.bytebuddy.utility.RandomString;

public class Utility //all methods in utility class should be static
{
	public static String readExcelFile(int row,int cell) throws EncryptedDocumentException, IOException
	{
		 File myfile=new File("E:\\Myexcelfile.xlsx");
		  Sheet mySheet = WorkbookFactory.create(myfile).getSheet("Sheet4");
		  String myvalue = mySheet.getRow(row).getCell(cell).getStringCellValue();//overloading
		  return myvalue;
		  
	}
public static void takescreenshot(WebDriver driver) throws IOException
{
File sourse=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	
	String r=RandomString.make(4);
	File destination=new File("E:\\Screenshot3\\myscreenshot1"+r+".png");
	FileHandler.copy(sourse, destination);
	}
public static void waits(WebDriver driver,int timeout)
{
	driver.manage().timeouts().implicitlyWait(Duration.ofMillis(timeout));
}
public static void scroll(WebDriver driver,WebElement element)
{
JavascriptExecutor j = ((JavascriptExecutor)driver);	
j.executeScript("arguments[0].scrollIntoView(true);",element);
}
}//refer BaseClasswithproperties