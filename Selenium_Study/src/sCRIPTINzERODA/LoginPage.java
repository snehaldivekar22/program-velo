package sCRIPTINzERODA;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginPage {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://kite.zerodha.com/");
driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
driver.findElement(By.id("userid")).sendKeys("ELR321");
driver.findElement(By.id("password")).sendKeys("Dhana1111");
driver.findElement(By.xpath("//button[@type='submit']")).click();

driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
driver.findElement(By.id("pin")).sendKeys("982278");
driver.findElement(By.xpath("//button[@type='submit']")).click();

driver.manage().timeouts().implicitlyWait(Duration.ofMillis(3000));
WebElement userid = driver.findElement(By.xpath("//span[@class='user-id']"));
String ActualResult = userid.getText();//display userid find and store in variable
String ExpectedID = "ELR321";//if we enter correct userid then test case is pass
if(ActualResult.equals(ExpectedID))//Actual which is display in webpage and expected is equals
{
	System.out.println("test case is pass");
}
else
{
	System.out.println("test case is fail");
}
userid.click();
driver.findElement(By.xpath("//a[@target='_self']")).click();
	}

}
