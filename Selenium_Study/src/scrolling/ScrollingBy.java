package scrolling;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollingBy {

	public static void main(String[] args) throws InterruptedException 
	{
		//scrollBy method is used to scroll webpage up and down
		System.setProperty("webdriver.chrome.driver","E:\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://nxtgenaiacademy.com/alertandpopup/");
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
		//JavascriptExecutor is independent interface thats way we have to type cast that interface with webdriver object
		JavascriptExecutor j = ((JavascriptExecutor)driver);
		j.executeScript("window.scrollBy(20,4965)");
		//j.executeAsyncScript("window.scrollBy(20,4000)");//for down
		Thread.sleep(2000);
		//j.executeAsyncScript("window.scrollBy(40,-4000)");//for upwards
		Thread.sleep(1000);
		j.executeScript("window.scrollBy(4000,60)");//for right side
		Thread.sleep(1000);
		j.executeScript("window.scrollBy(-4000,50)");//for left side
		
	}

}
