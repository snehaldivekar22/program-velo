package webelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsDisplayed {

	public static void main(String[] args) throws InterruptedException
	{
		
		System.setProperty("webdriver.chrome.driver", "E:\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://vctcpune.com/selenium/practice.html");
		Thread.sleep(900);
		WebElement ele = driver.findElement(By.id("displayed-text"));
		/*boolean r = ele.isDisplayed();
		System.out.println(r);
		ele.click();
		
	boolean r2=ele.isDisplayed();
	System.out.println(r2);*/
		driver.findElement(By.id("hide-textbox")).click();
	if(ele.isDisplayed())
	{
		System.out.println("Text box is display");
		ele.sendKeys("Snehal");
		
	}
	else
	{
		System.out.println("text box is not display");
		
		if(ele.isDisplayed())
		{
			System.out.println("textbox is displayed");	
		}
		else
		{
			System.out.println("please select textbox");
			driver.findElement(By.id("show-textbox")).click();
			ele.sendKeys("snehal");
		}
	}
	}

}
