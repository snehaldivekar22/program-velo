package scrolling;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollingToView {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","E:\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://vctcpune.com/selenium/practice.html");
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
		driver.manage().window().maximize();
		WebElement w = driver.findElement(By.id("hide-textbox"));
		Thread.sleep(1000);
		// this option is used when the element is down and while performing action on that time it is upward
		JavascriptExecutor j = ((JavascriptExecutor)driver);
		Thread.sleep(5000);
	//	j.executeAsyncScript("arguments[0].scrollIntoView(true);",w);
		j.executeScript("arguments[0].scrollIntoView(true);", w);
		Thread.sleep(500);
		w.click();
	}

}
