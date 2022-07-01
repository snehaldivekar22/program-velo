package testNGHardAssert;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class AssertTrue {
  @Test
  public void AsserClassTrue() 
  {
  System.setProperty("webdriver.chrome.driver","E:\\chromedriver.exe");
  WebDriver driver=new ChromeDriver();
  driver.manage().window().maximize();
  driver.get("https://vctcpune.com/selenium/practice.html");
  driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
  WebElement radio = driver.findElement(By.xpath("//input[@type='radio'][1]"));
 JavascriptExecutor j = ((JavascriptExecutor)driver);
 j.executeScript("arguments[0].scrollIntoView(true);",radio);
  radio.click();
  Assert.assertTrue(radio.isSelected(),"radio button is not selected test case is fail");
  Reporter.log("radio button is selected test case is pass", true);
  }
  @Test
  public void AssertClassFaluse()
  {
	  System.setProperty("webdriver.chrome.driver","E:\\chromedriver.exe");
	  WebDriver driver=new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get("https://vctcpune.com/selenium/practice.html");
	  driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
	  WebElement checkBox = driver.findElement(By.id("checkBoxOption1"));
	  Assert.assertFalse(checkBox.isSelected(),"checkboc is selected test case is pass");
	  Reporter.log("ChechBox is not selected test case is pass",true);
	  
  }
  @Test
  public void SeertclassEquals()
  {
	  System.setProperty("webdriver.chrome.driver","E:\\chromedriver.exe");
	  WebDriver driver=new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get("https://kite.zerodha.com/dashboard");
	  driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000)); 
	  WebElement userid = driver.findElement(By.xpath("//span[@class='user-id']"));
	 String ActualText = userid.getText();
	 String Expected="ELR321";
	 Assert.assertEquals(ActualText,Expected,"Result is not matching test case is fail");
	 Reporter.log("result is matching test case is pass",true);
  }
}
