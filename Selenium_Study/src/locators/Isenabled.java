package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Isenabled {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "E:\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://zoom.us/join");
		Thread.sleep(500);
		//driver.findElement(By.xpath("//a[text()='Join']")).click();
		Thread.sleep(500);
		//driver.findElement(By.xpath("a[@id='btnSubmit']")).click();
	//	Thread.sleep(500);
	WebElement MeetID=driver.findElement(By.xpath("//a[@id='btnSubmit']"));	
	Thread.sleep(700);
	boolean result=MeetID.isEnabled();
	System.out.println(result);
	driver.findElement(By.xpath("//input[@id='join-confno']")).sendKeys("123456789");
	Thread.sleep(500);
	//driver.findElement(By.xpath("a[text()='Join']")).click();
	Thread.sleep(800);
	boolean result2=MeetID.isEnabled();
	System.out.println(result2);
	Thread.sleep(800);
	driver.findElement(By.xpath("//a[@id='btnSubmit']")).click();
	//driver.findElement(By.xpath("//input[@id='join-confno']")).click();
	
	
	
	

	}
	

}
