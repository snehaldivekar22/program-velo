package scrolling;

import java.time.Duration;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SizeofWindow {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","E:\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://nxtgenaiacademy.com/alertandpopup/");
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
		//to get size 
		System.out.println(driver.manage().window().getSize());
		// to set size
		Dimension d=new Dimension(900,400);// 900 is for horizotal (X),400 is for vertical(height);
		driver.manage().window().setSize(d);

	}

}
