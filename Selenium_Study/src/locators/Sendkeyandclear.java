package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sendkeyandclear {

	

	public static void main(String[] args) throws InterruptedException 
	{
System.setProperty("webdriver.chrome.driver","E:\\chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.get("https://zoom.us/signin");// get method used for to open URL
Thread.sleep(1000);// selenium speed is to high and our brower speed is low so we took thred.sleep(); for loading browser
   WebElement   UN= driver.findElement(By.id("email"));//we used locator id 'attribute value',and create reference variable
  UN .sendKeys("snehal@236");// with using reference variable call sendkey method
 WebElement PWD=driver.findElement(By.name("password"));// we create reference variable for PWD
 Thread.sleep(200);// to load the browser
 PWD.sendKeys("13255ajhsck");// enter value in text field
 driver.findElement(By.xpath("//button[text()='Sign In']")).click();// click on sign in button
 UN.clear();
 PWD.clear();
 driver.navigate().refresh();
  

	}

}
