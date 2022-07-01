package screenshot;


import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import net.bytebuddy.utility.RandomString;

public class Screenshort_randomfilename {

	public static void main(String[] args) throws InterruptedException, IOException
	{
		System.setProperty("webdriver.chrome.driver", "E:\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://vctcpune.com/selenium/practice.html");
		Thread.sleep(300);
	File sourse=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	
	String r=RandomString.make(4);
	File destination=new File("E:\\Screenshot3\\myscreenshot1"+r+".png");
	

	FileHandler.copy(sourse, destination);
		

	}

}
