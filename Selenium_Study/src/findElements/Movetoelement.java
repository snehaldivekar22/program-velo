package findElements;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Movetoelement {

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
		//then we have to find the path of that web element abd stire in a reference variable
		WebElement l = driver.findElement(By.xpath(" //a[text()=' LOAN '] "));
	act.moveToElement(l).perform();

	
	
	
		

	}

}
