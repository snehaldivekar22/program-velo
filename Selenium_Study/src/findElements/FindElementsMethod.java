package findElements;

import java.time.Duration;
import java.util.Iterator;
import java.util.List;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElementsMethod {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","E:\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://nxtgenaiacademy.com/alertandpopup/");
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(9000));
		driver.manage().window().maximize();
		List<WebElement> f= driver.findElements(By.tagName("button"));
		System.out.println("size of button is"+f.size());
		
		 Iterator<WebElement> l= f.iterator();
		while(l.hasNext())
		{
			System.out.println(l.next().getText());
		}
		
		

	}

}
