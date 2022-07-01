package maouseAction;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClick {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","E:\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(8000));
		//1st we have to create object of action class
		Actions a=new Actions(driver);
		
		//then we have to find element to perform mouse action
		WebElement d = driver.findElement(By.xpath("//button[text()='Double-Click Me To See Alert']"));
//perform doubleclick action
		//a.doubleClick(d).perform();
		// 2nd way to perform double click
		a.moveToElement(d).doubleClick().build().perform();
		driver.switchTo().alert().accept();
	}

}
