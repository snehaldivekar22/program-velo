package generalallprogram;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SearchBarListFinding {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","E:\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(3000));
driver.findElement(By.name("q")).sendKeys("honda");
List<WebElement> search = driver.findElements(By.xpath("(//ul[@class='G43f7e'])[1]//li"));
for(WebElement se:search)
{
	System.out.println(se.getText());
	String Actual = se.getText();
	String Expected = "honda shine";
	if(Actual.equals(Expected))
	{
		se.click();
		break;
	}
}
	driver.manage().timeouts().implicitlyWait(Duration.ofMillis(4000));
	driver.findElement(By.linkText("Images")).click();



	
	}


	

}
