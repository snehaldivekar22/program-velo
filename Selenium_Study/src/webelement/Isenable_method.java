package webelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Isenable_method {

	public static void main(String[] args) throws InterruptedException
	{
		
	System.setProperty("webdriver.chrome.driver", "E:\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
    driver.get("https://www.zee5.com/myaccount/");
    Thread.sleep(6000);

    driver.findElement(By.xpath("//a[text()='Login']")).click();
Thread.sleep(10000);

      WebElement login = driver.findElement(By.xpath("(//button[@type='button'])[6]"));
Thread.sleep(5000);
      boolean OTP = login.isEnabled();
      System.out.println(OTP);

Thread.sleep(10000);
	
driver.findElement(By.xpath("//input[@name='userName']")).sendKeys("8459073514");
	Thread.sleep(35000);
	//WebElement login2 = driver.findElement(By.xpath("(//button[@type='button'])[6]"));

	boolean OTP2 = login.isEnabled();
	Thread.sleep(78000);
	System.out.println("Otp status is"+OTP2);
	
	Thread.sleep(35000);
	
	
	}

}
