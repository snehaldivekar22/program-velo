package maouseAction;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MoveToElement {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","E:\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/test/drag_drop.html");
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(8000));
		// move to element using mouse action.
		//at the 1st we have to prepare Actions class object
		Actions act=new Actions(driver);
		//then we have to find the path of that web element and store in a reference variable
		WebElement l = driver.findElement(By.xpath(" //a[text()=' LOAN '] "));
	act.moveToElement(l).perform();
	
	//Click using mouse action 1st way
	WebElement drop = driver.findElement(By.xpath(" (//a[@class='dropdown-toggle'])[1]"));
//	act.moveToElement(drop).perform();
//	act.click().perform();
	//another way to click
	act.moveToElement(drop).click().build().perform();
	// 2nd way
//	act.click(drop).perform();
	
	
	//right click or context click
	//act.moveToElement(drop).contextClick().build().perform();
	//2nd way to right click or context click
	act.contextClick(drop).perform();
	
	
	

	}

}
