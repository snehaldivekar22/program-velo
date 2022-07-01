package testNGHardAssert;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class AssertNOtNullClass {
  @Test
  public void NotNull() 
  {
	  System.setProperty("webdriver.chrome.driver","E:\\chromedriver.exe");
	  WebDriver driver=new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get("https://kite.zerodha.com/");
	  WebElement login = driver.findElement(By.id("userid"));
	  login.sendKeys("ELR321");
	  Assert.assertNotNull(login,"login field is null test case is fail");
	  Reporter.log("login fiels is not null test case is pass",true);
  }
  @Test
  public void NullAssert() 
  {
	  System.setProperty("webdriver.chrome.driver","E:\\chromedriver.exe");
	  WebDriver driver=new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get("https://kite.zerodha.com/");
	  WebElement login2 = driver.findElement(By.id("userid"));
	 Assert.assertNull(login2.isEnabled(),"object is not null test case is fail");
	  Reporter.log("login field is null test case is pass",true);
  }
}
