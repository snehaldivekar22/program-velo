package synchronization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Implicit_wait {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "E:\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://skpatro.github.io/demo/links/");
		
		//implicit wait in selenium ,to load webpage.all elements in web page
		driver.manage().timeouts().implicitlyWait( Duration.ofMillis(30));
		
		driver.findElement(By.name("NewWindow")).click();
driver.manage().window().maximize();

	}

}
