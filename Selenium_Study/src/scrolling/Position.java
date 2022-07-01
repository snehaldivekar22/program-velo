package scrolling;

import java.time.Duration;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Position {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","E:\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://nxtgenaiacademy.com/alertandpopup/");
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
		// to change the position of window 
		System.out.println(driver.manage().window().getPosition());
		Point p=new Point(200, 20);//pixel point 
		driver.manage().window().setPosition(p);
		// to change the size of window
		Dimension d=new Dimension(900,400);// 900 is for horizontal (X),400 is for vertical(height);
		driver.manage().window().setSize(d);
		Thread.sleep(3000);
		//scrolling page
		JavascriptExecutor j = ((JavascriptExecutor)driver);
		j.executeAsyncScript("window.scrollBy(20,4000)");
	}

}
