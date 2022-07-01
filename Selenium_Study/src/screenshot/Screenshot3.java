package screenshot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import net.bytebuddy.utility.RandomString;

public class Screenshot3 {

	public static void main(String[] args) throws InterruptedException, IOException 
	{
		System.setProperty("webdriver.chrome.driver", "E:\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		Thread.sleep(1000);
		driver.get("https://demoqa.com/nestedframes");
    File srs = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
    String png = RandomString.make(4);
    File desti=new File("E:\\Screenshot3\\myscreenshot"+png+".png");
    FileHandler.copy(srs, desti);
	}

	
}
