package generalallprogram;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SearchBarOnflipcart {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","E:\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(3000));
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
driver.findElement(By.name("q")).sendKeys("Laptop");
List<WebElement> li = driver.findElements(By.xpath("//ul[@class='col-12-12 _1MRYA1']//li"));
Thread.sleep(2000);
for(WebElement re:li)
{
	System.out.println(re.getText());
}


	}

}
