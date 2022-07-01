package screenshot;


import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;


public class Screenshot1 {

	

	public static void main(String[] args) throws InterruptedException, IOException 
	{
		System.setProperty("webdriver.chrome.driver", "E:\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		Thread.sleep(400);
		driver.get("https://vctcpune.com/selenium/practice.html");
		Thread.sleep(500);
		//TakesScreenshot interface import ,upcasting with webdriver ,.getscreenshot method use,angain importoutput.file
	File	screenshot=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	//create destination of were we want to store screenshot
	File  screenshot_desti=new File("E:\\Screenshot3\\myscreenshot.png");
	//copy that screenshort in screenshort_destination
	FileHandler.copy(screenshot, screenshot_desti);
		
	}
	}


