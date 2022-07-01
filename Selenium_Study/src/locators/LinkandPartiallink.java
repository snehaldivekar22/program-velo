package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkandPartiallink {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "E:\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		//driver.get("https://vctcpune.com/");
		Thread.sleep(800);
		// using linkText locator 
		// WebElement link = driver.findElement(By.linkText("About us"));
	      //link.click();		
	
	      // using partialLinkText locator
	     // WebElement link2 = driver.findElement(By.partialLinkText("Start Selenium "));
	      
	      //link2.click();
	      Thread.sleep(500);
	      //using className locator
	     driver.get("https://vctcpune.com/selenium/practice.html");
	     Thread.sleep(500);
	     //  driver.findElement(By.className("nav-link")).click();
	       
	       //cssSelector
	       driver.findElement(By.cssSelector("#topheader > section > div > div > a:nth-child(2)")).click();
	}
	

}
