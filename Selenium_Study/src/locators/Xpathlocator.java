package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpathlocator {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "E:\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();//create object of chromedriver and reference of webdriver
		driver.manage().window().maximize();
		driver.get("https://vctcpune.com/selenium/practice.html");//to get link on browser
	driver.findElement(By.xpath("//input[@value='Radio2']")).click();
	//findelement method from webdriver	in that we took xpath locator from By class which is static method(locator type)
	//in xpath("//tagname[ @ attributename='attribute value']");
	
	driver.findElement(By.xpath("//input[@type='checkbox']")).click();

	}

}
