package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GettextScript {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "E:\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://zoom.us/signin");
		Thread.sleep(500);
	WebElement	text=driver.findElement(By.xpath("//a[contains(text(),'Do N')]"));
	System.out.println(text.getText());
	Thread.sleep(600);
	String ActualText=text.getText();
	String Expectedtext="Do Not Sell My Personal Information";
	Thread.sleep(500);
	//System.out.println(ActualText.equals(Expectedtext));
	
	  if (ActualText.equals(Expectedtext))
	 {
		System.out.println("text is matching Test script is passed");
	}
	else
	{
		System.out.println("Text is not matching so test script is fail");
	}
	
	
	
		
	}

}
