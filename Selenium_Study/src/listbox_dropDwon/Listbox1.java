package listbox_dropDwon;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Listbox1 {

	public static void main(String[] args) throws InterruptedException 
	{
System.setProperty("webdriver.chrome.driver","E:\\chromedriver.exe");		
WebDriver driver=new ChromeDriver();
Thread.sleep(5000);
driver.get("https://twitter.com/i/flow/signup");
Thread.sleep(5000);
driver.findElement(By.xpath("//span[text()='Sign up with phone or email']")).click();
WebElement result = driver.findElement(By.id("SELECTOR_1"));
Thread.sleep(2000);
Select s=new Select(result);
s.selectByVisibleText("January");
for(int j=11;j>=1;j--)
{
	Thread.sleep(2000);
	s.selectByIndex(j);
}
Thread.sleep(4000);
s.selectByIndex(4);
Thread.sleep(2000);

WebElement result2 = driver.findElement(By.id("SELECTOR_2"));
Select s2=new Select(result2);
s2.selectByValue("3");
for(int i=1;i<=10;i++)
{
	Thread.sleep(4000);
  s2.selectByIndex(i);
	}
boolean r5=s2.isMultiple();
System.out.println(r5);
	}

}
