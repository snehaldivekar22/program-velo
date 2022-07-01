package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Gettext_webelement {
// gettext method want to write in a printing statement because result display on console
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "E:\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://zoom.us/signin");
		Thread.sleep(400);
//	System.out.println(driver.findElement(By.xpath("//a[contains(text(),'Do N')]")).getText());
		String text=driver.findElement(By.xpath("//a[contains(text(),'Do N')]")).getText();
		Thread.sleep(500);
		System.out.println("it will return string  "+text);
		Thread.sleep(400);
		
	}

}

