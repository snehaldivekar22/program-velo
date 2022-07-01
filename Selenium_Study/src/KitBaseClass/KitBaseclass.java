package KitBaseClass;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class KitBaseclass 
{
	protected WebDriver driver; //inheritance will use to extends in testclass
	
public void openBrowser()
{
	 System.setProperty("webdriver.chrome.driver","E:\\chromedriver.exe");
	  driver=new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get("https://kite.zerodha.com/");
	  driver.manage().timeouts().implicitlyWait(Duration.ofMillis(4000));
	}
}
