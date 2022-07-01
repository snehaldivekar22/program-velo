package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Isenable2 {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "E:\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.discoveryplus.in/");
		Thread.sleep(4500);
	driver.findElement(By.xpath("(//h6[text()='Sign In'])[2]")).click();
		Thread.sleep(12000);
		WebElement Getotp = driver.findElement(By.xpath("//button[@type='submit']"));
		Thread.sleep(5000);
		boolean r = Getotp.isEnabled();
		System.out.println(r);
		
		driver.findElement(By.id("mobileNumber")).sendKeys("9730010573");
		WebElement Getotp2 = driver.findElement(By.xpath("//button[@type='submit']"));
		boolean r2 = Getotp2.isEnabled();
		System.out.println(r2);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(3000);

	}

}
