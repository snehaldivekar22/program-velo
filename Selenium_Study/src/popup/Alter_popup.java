package popup;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alter_popup {

	public static void main(String[] args) throws InterruptedException
	{
	System.setProperty("webdriver.chrome.driver","E:\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	Thread.sleep(1000);
	driver.get("https://nxtgenaiacademy.com/alertandpopup/");
	driver.findElement(By.xpath("//button[@name='alertbox']")).click();
	Thread.sleep(500);
	//this is the one way to get text and click for ok button
//	String text = driver.switchTo().alert().getText();
//	System.out.println(text);
//	driver.switchTo().alert().accept();
	//another way 
	Alert alt = driver.switchTo().alert();
	System.out.println(alt.getText());
	alt.accept();
	driver.findElement(By.xpath("//button[@name='confirmalertbox']")).click();
	driver.switchTo().alert().dismiss();
	Thread.sleep(800);
	driver.findElement(By.xpath("//button[@name='promptalertbox1234']")).click();
	Alert alt2 = driver.switchTo().alert();
	Thread.sleep(800);
	alt2.sendKeys("yes");
	alt2.accept();

	}

}
