package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Xpath {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "E:\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://kite.zerodha.com/");
//driver.findElement(By.xpath("//a[text()='Forgot user ID or password?']")).click();//xpath by locator
driver.findElement(By.xpath("//a[contains(text(),'Forgot ')]")).click();
//driver.quit();

	}

}
