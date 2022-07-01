package generalallprogram;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://vctcpune.com/selenium/practice.html");
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
		  List<WebElement> totalnoofColumn = driver.findElements(By.xpath("//table/tbody/tr/th"));
		System.out.println(totalnoofColumn.size());
		List<WebElement> totalnoofRows = driver.findElements(By.xpath("//table/tbody/tr"));
System.out.println(totalnoofRows.size());	
for(int i=1;i<=totalnoofRows.size()-1;i++)
{
	for(int j=1;j<=totalnoofColumn.size();j++)
	{
		if(i==1)
		{ 
			String result = driver.findElement(By.xpath("//table/tbody/tr["+i+"]/th["+j+"]")).getText();
			System.out.print(""+result+"");
		}
		else
		{
			String result = driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td["+j+"]")).getText();
		System.out.print(result);
		}
		System.out.println();
	}
	}
}
	}


