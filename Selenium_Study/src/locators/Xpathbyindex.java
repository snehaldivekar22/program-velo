package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpathbyindex {

	public static void main(String[] args) throws InterruptedException 
	{
	System.setProperty("webdriver.chrome.driver", "E:\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	Thread.sleep(100);
	driver.get("https://trello.com/");
	driver.findElement(By.xpath("(//input[@type='email'])[2]")).sendKeys("shakjsak@gmail.com");
	driver.findElement(By.xpath("(//button[@type='submit'])[2]")).click();
	//text with index locator used.when we have more values i.e (1 of 3) then will use index locator 
	driver.findElement(By.xpath("//input[@type='email'])[2]")).sendKeys("gdjdwsl");
	Thread.sleep(70000);
	driver.quit();

	}

}
