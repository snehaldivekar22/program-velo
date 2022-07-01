package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpathcontains {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","E:\\chromedriver.exe" );
		WebDriver driver=new ChromeDriver();
		driver.get("https://vctcpune.com/courses/");
		driver.manage().window().maximize();
		Thread.sleep(100);
		driver.get("https://trello.com/");
		driver.findElement(By.xpath("//button[contains(@data-analytics-button,'green')]")).click();

		
	}

}
