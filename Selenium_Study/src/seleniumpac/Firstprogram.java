package seleniumpac;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Firstprogram {

	public static void main(String[] args) throws InterruptedException 
	{
System.setProperty("webdriver.chrome.driver","E:\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		//to enter url in browser to open an application
		driver.get("https://www.flipkart.com/");
		//Maximize current window
				driver.manage().window().maximize();
				driver.manage().window().maximize();
				
		//to close the browser
			//driver.close();
				
				//Delay execution for 5 seconds to view the maximize operation
				//Thread.sleep(5000);
				
				//Close the browser
				//driver.quit();
				
		// navigate is used to open an application like get method.
				driver.navigate().to("https://web.whatsapp.com/");
				
		//navigate is used to back the application
				driver.navigate().back();
				
		//navigate is used to forward the application
				driver.navigate().forward();
				
		//navigate is used to refresh the application
				driver.navigate().refresh();
				
		//get title webdriver method.it is used to get title of web page
				driver.get("https://web.whatsapp.com/");
				
				
				String title=driver.getTitle();
				System.out.println(title);
				//System.out.println(driver.getTitle()); we can call directly from printing statement
				
String url=driver.getCurrentUrl();
System.out.println("current url is shown in console "+url);

				driver.close();
	}

}
