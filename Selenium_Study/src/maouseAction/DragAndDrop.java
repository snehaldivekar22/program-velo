package maouseAction;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","E:\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/test/drag_drop.html");
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(8000));
		//1st we have to create object of action class
		Actions a=new Actions(driver);
		WebElement srs = driver.findElement(By.xpath("//a[text()=' BANK '] "));
        WebElement desti = driver.findElement(By.id("bank"));
       a.clickAndHold(srs).moveToElement(desti).release().build().perform();//suppose we performed multiple actions at a time then call build method
       // a.dragAndDrop(srs, desti).perform();// each and every action we have to call perform method.All methods are action class method
	}

}
