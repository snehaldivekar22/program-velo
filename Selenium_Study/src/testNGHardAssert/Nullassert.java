package testNGHardAssert;

//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Nullassert {
	 @Test
	  public void NullAssert() 
	  {
//		  System.setProperty("webdriver.chrome.driver","E:\\chromedriver.exe");
//		  WebDriver driver=new ChromeDriver();
//		  driver.manage().window().maximize();
//	  driver.get("https://vctcpune.com/selenium/practice.html");
//		 WebElement txt = driver.findElement(By.id("autocomplete"));
//	 Assert.assertNull(txt,"object is not null test case is fail");
//	  Reporter.log("login field is null test case is pass",true);
	 String str=null;
		 Assert.assertNull(str,"string is not null tCis fail");
		 Reporter.log("string is null TC is pass",true);
	  }
}
