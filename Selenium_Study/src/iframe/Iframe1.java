package iframe;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Iframe1 {
     // iframe
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "E:\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		Thread.sleep(1000);
//to open new url		
			driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_myfirst");
		    Thread.sleep(500);
//switch to main webpage to ifame using iframe name
driver.switchTo().frame("iframeResult");
// to perform action on iframe web element
driver.findElement(By.xpath("//button[@type='button']")).click();
// agian switch to main webpage to perform action on main webpage element
driver.switchTo().defaultContent();
driver.findElement(By.xpath("(//a[@title='Change Theme'])[1]")).click();// perform action on main webpage element
	}

}
