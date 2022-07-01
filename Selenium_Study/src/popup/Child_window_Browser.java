package popup;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Child_window_Browser {

	public static void main(String[] args) throws InterruptedException 
	{
	System.setProperty("webdriver.chrome.driver", "E:\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://skpatro.github.io/demo/links/");
	Thread.sleep(600);
	
	//1. to get address/ID of main page we need to use following method
       String main = driver.getWindowHandle();
       driver.manage().window().maximize();
       System.out.println("main window id is "+main);
       driver.findElement(By.name("NewWindow")).click();
       
    //2. to get address/Id of all Windows including main window we need to follow this stage.
       Set<String> Ids = driver.getWindowHandles();
       
    //3. For using get method we need to convert set of string in to arrayList
       ArrayList<String> array=new ArrayList<>(Ids);
       System.out.println(array.get(0));
       System.out.println(array.get(1));
       
    //4.to switch focus on child window we need to pass child Id in switch ,window method
       driver.switchTo().window(array.get(1));
       Thread.sleep(800);
       String text = driver.findElement(By.xpath("//h1[text()='About me']")).getText();
       System.out.println(text);
       
       driver.manage().window().maximize();
      driver.close();//to close current window only /close child window only main window remain open
       
       

	}

}
