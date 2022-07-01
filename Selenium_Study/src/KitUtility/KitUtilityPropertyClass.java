package KitUtility;

//import java.io.File;
import java.io.FileInputStream;
//import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

//import org.openqa.selenium.OutputType;
//import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.io.FileHandler;

//import net.bytebuddy.utility.RandomString;

public class KitUtilityPropertyClass 
{
//	public static void takescreenshot(WebDriver driver) throws IOException
//	{
//	File sourse=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
//		
//		String r=RandomString.make(4);
//		File destination=new File("E:\\Screenshot3\\mypropertiesscreenshot"+r+".png");
//		FileHandler.copy(sourse, destination);
//		}
	public static String readPropertiesFromClass(String key) throws IOException
	{
		Properties pro=new Properties();//create object of properties class
		FileInputStream input=new FileInputStream("C:\\Users\\sneha\\eclipse-workspace\\Selenium_Study\\mytestdata.properties");
	    pro.load(input); //load all data from given location
	    String value = pro.getProperty(key);//will give input as username,password as a key
	    return value;//it will return string
	    }
	public static void waits(WebDriver driver,int time)//will pass time as in integer type
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(time));
	}
}
