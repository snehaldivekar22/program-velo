package popup;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hidden_popup {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "E:\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		Thread.sleep(600);
		//to find element on hidden divesion popup we have to directly ispect to that popup box /massage
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		Thread.sleep(500);
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		driver.findElement(By.name("q")).sendKeys("mesho app");
		driver.findElement(By.xpath("//button[@type='submit']")).click();

	}

}
