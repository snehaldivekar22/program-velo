package iframe;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Two_iframe {

	public static void main(String[] args) throws InterruptedException 
	{
		//nested iframe
System.setProperty("webdriver.chrome.driver", "E:\\chromedriver.exe");
WebDriver driver=new ChromeDriver();
Thread.sleep(1000);
driver.get("https://demoqa.com/nestedframes");
Thread.sleep(500);
// to switch main web page to child web page by frame("String id or name")
driver.switchTo().frame("frame1");// again to switch child web frame to its nested web frame
WebElement frame2 = driver.findElement(By.xpath("//iframe[@srcdoc='<p>Child Iframe</p>']"));// for that we create webelement
driver.switchTo().frame(frame2);
Thread.sleep(1000);
String text=driver.findElement(By.xpath("//p[text()='Child Iframe']")).getText();
Thread.sleep(500);
System.out.println(text);
driver.switchTo().parentFrame();
String text1 = driver.findElement(By.xpath("//body[text()='Parent frame']")).getText();
System.out.println(text1);
driver.switchTo().defaultContent();
WebElement text3 = driver.findElement(By.xpath("//div[text()='Nested Frames']"));
String p = text3.getText();
System.out.println(p);
driver.findElement(By.className("header-wrapper")).click();
driver.navigate().refresh();
Thread.sleep(500);
driver.close();

	}

}
