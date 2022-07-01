package webTable;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable {

	public static void main(String[] args)
	{
System.setProperty("webdriver.chrome.driver","E:\\chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://m.cricbuzz.com/cricket-series/4061/indian-premier-league-2022/points-table");
  List<WebElement> cell = driver.findElements(By.xpath("//table/thead/tr/th"));//if we want to print column or heading
  for( WebElement c:cell)                                                    // table//th also we can find with this xpath
  {
	  System.out.print(c.getText()+"|| ");
  }
  System.out.println("");
  List<WebElement> data = driver.findElements(By.xpath("//table//td"));//if we want to print all data from table
  for(WebElement d:data)
  {
	  System.out.println(d.getText()+" ||");
  }
 WebElement one = driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div/table/tbody[4]/tr/td[6]"));// one perticular value
 System.out.println(one.getText());
// List<WebElement> onerow = driver.findElements(By.xpath("/html/body/div[2]/div[2]/div/div/table/tbody[3]/tr"));//to print whole row no 4th
//List<WebElement> oneRow = driver.findElements(By.xpath("/html/body/div[2]/div[2]/div/div/table/thead/tr"));
 ////*[@id='rt-feature']//parent::div[1]
 List<WebElement> rows = driver.findElements(By.xpath("//*[@class='cb-column-highlighter']//parent::tr"));
 for(WebElement row:rows)
 {
	 System.out.print(row.getText()+" ");
 }
 System.out.println();
 }
}
