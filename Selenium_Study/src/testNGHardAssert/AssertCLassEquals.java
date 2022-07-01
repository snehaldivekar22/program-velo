package testNGHardAssert;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class AssertCLassEquals {
	 @Test
	  public void SeertclassEquals()
	  {
		  System.setProperty("webdriver.chrome.driver","E:\\chromedriver.exe");
		  WebDriver driver=new ChromeDriver();
		  driver.manage().window().maximize();
		  driver.get("https://kite.zerodha.com/");
		  driver.findElement(By.id("userid")).sendKeys("ELR321");
		  driver.findElement(By.id("password")).sendKeys("Dhana1111");
		  driver.findElement(By.xpath("//button[@type='submit']")).click();

		  driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
		  driver.findElement(By.id("pin")).sendKeys("982278");
		  driver.findElement(By.xpath("//button[@type='submit']")).click();
		  driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000)); 
		  WebElement userid = driver.findElement(By.xpath("//span[@class='user-id']"));
		 String ActualText = userid.getText();
		 String Expected="ELR321";
		 Assert.assertEquals(ActualText,Expected,"Result is not matching test case is fail");
		 Reporter.log("result is matching test case is pass",true);
	  }
	 @Test
	 public void Notequals()
	 {
	 System.setProperty("webdriver.chrome.driver","E:\\chromedriver.exe");
	  WebDriver driver=new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get("https://kite.zerodha.com/");
	  driver.findElement(By.id("userid")).sendKeys("ELR321");
	  driver.findElement(By.id("password")).sendKeys("Dhana1111");
	  driver.findElement(By.xpath("//button[@type='submit']")).click();

	  driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
	  driver.findElement(By.id("pin")).sendKeys("982278");
	  driver.findElement(By.xpath("//button[@type='submit']")).click();
	 
	  driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000)); 
	  WebElement userid = driver.findElement(By.xpath("//span[@class='user-id']"));
	 String ActualText = userid.getText();
	 String Expected="ELR32";
	 Assert.assertNotEquals(ActualText, Expected,"result is matching test case is fail");
	 Reporter.log("result is not matching test case is pass",true);
	 }
}
