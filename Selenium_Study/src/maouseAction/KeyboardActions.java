package maouseAction;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyboardActions {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","E:\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://vctcpune.com/selenium/practice.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(3000));
		WebElement text = driver.findElement(By.id("autocomplete"));
		//text.sendKeys("Snehal");
		Actions a=new Actions(driver);
		Thread.sleep(5000);
		//a.moveToElement(text).sendKeys(text,"pune").build().perform();
		a.keyDown(text,Keys.SHIFT).sendKeys("p").keyUp(Keys.SHIFT).sendKeys("une").build().perform();

	}

}
