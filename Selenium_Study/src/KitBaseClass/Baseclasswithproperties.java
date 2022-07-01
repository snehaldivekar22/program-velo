package KitBaseClass;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import KitUtility.KitUtilityPropertyClass;

//import KitUtility.KitUtilityPropertyClass;

public class Baseclasswithproperties 
{
	protected static WebDriver driver; //inheritance will use to extends in testclass
	
	public void openBrowser() throws IOException
	{
		 System.setProperty("webdriver.chrome.driver","E:\\chromedriver.exe");
		  driver=new ChromeDriver();
		  driver.manage().window().maximize();
		//driver.get("https://kite.zerodha.com/");
		  //will take utility class reference and call data from properties class
		 driver.get(KitUtilityPropertyClass.readPropertiesFromClass("URL"));
		  driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
		}
	public void takescreenshot(String TCname) throws IOException
	{
	File sourse=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File destination=new File("E:\\Screenshot3"+TCname+".png");
		FileHandler.copy(sourse, destination);
		}
}
