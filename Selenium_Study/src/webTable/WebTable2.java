package webTable;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable2 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","E:\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
        driver.get("http://demo.guru99.com/test/web-table-element.php");
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(3000));
       List<WebElement> tableRow = driver.findElements(By.xpath("//table/thead/tr/th"));
        for(WebElement t:tableRow)
        {
        	System.out.print(t.getText());
        }
        System.out.println();
        List<WebElement> tablecell = driver.findElements(By.xpath("//*[@id=\"leftcontainer\"]/table/tbody"));
        for(WebElement t1:tablecell)
        {
        	System.out.print(t1.getText()+" ");
        }
        System.out.println();
//WebElement row1 = driver.findElement(By.xpath("//*[@id=\"leftcontainer\"]/table/tbody/tr[1]"));
       List<WebElement> row1 = driver.findElements(By.xpath("//*[@id=\"leftcontainer\"]/table/tbody/tr[1]"));
	for(WebElement r:row1)
	{
		System.out.print(r.getText()+" ");
	}
	System.out.println();
	WebElement onedata = driver.findElement(By.xpath("//*[@id=\"leftcontainer\"]/table/tbody/tr[3]/td[4]"));
	{
		System.out.println(onedata.getText());
	}
	}

}
