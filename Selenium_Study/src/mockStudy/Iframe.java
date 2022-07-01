package mockStudy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Iframe {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","E:\\chromedriver.exe");		
		WebDriver driver=new ChromeDriver();
		Thread.sleep(5000);
		driver.get("https://vctcpune.com/selenium/practice.html");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.switchTo().frame("courses-iframe");
		driver.findElement(By.xpath("(//a[text()='About us'])[1]")).click();
		String text = driver.findElement(By.xpath("(//a[text()='Velocity Foundation'])[1]")).getText();
System.out.println(text);
driver.switchTo().defaultContent();
	}

}
