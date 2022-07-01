package synchronization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class Explicit {

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver","E:\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		//Thread.sleep(1000); //  this is the java wait and static wait or synchronization
		//in selenium will using selenium wait i.e explicitly which is load only for one web element
		driver.get("https://nxtgenaiacademy.com/alertandpopup/");
		
		// 1.create a object of webdriverwait  and pass the webDriver Object ,Duration and time to wait
		WebDriverWait w=new WebDriverWait(driver, Duration.ofMillis(60));
		
		//2. After that create object of webelement 
		WebElement AlertB = driver.findElement(By.xpath("//button[@name='alertbox']"));
		
		//3. Object of WebDriverWait and util method and pass the parameters.
		w.until(ExpectedConditions.visibilityOf(AlertB));
		AlertB.click();
		driver.switchTo().alert().accept();
		
		
		
		//again on second element i.e confirmalertbox will apply explicit wait
		WebDriverWait w1=new WebDriverWait(driver, Duration.ofMillis(60));
		WebElement  CB = driver.findElement(By.xpath("//button[@name='confirmalertbox']"));
		w1.until(ExpectedConditions.visibilityOf(CB));
		CB.click();
		driver.switchTo().alert().dismiss();
		
		
	}

}
