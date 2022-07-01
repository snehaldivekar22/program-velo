package testNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestClass1 {
  @Test
  public void testmethod1() 
  {

	  System.setProperty("webdriver.chrome.driver", "E:\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://kite.zerodha.com/");
		Reporter.log("method is running",true);
  
  }
  @Test
  public void testmethod2() 
  {

	  System.setProperty("webdriver.chrome.driver", "E:\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://google.com/");
		Reporter.log("method is running");
  
  }
  @Test
  public void testmethod3() 
  {

	  System.setProperty("webdriver.chrome.driver", "E:\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://facebook.com/");
		System.out.println("method is running");
  
  }
  
}
