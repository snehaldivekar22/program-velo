package findElements;

import java.time.Duration;
import java.util.List;
import java.util.ListIterator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElements2 {

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver","E:\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://vctcpune.com/selenium/practice.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(8000));
	 List<WebElement> btn = driver.findElements(By.tagName("a"));
	System.out.println(btn.size());
	
ListIterator<WebElement>b= btn.listIterator();
	while(b.hasNext())
	{
         System.out.println(b.next().getText());

	}
	}

}
