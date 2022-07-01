package mockStudy;

import java.io.File;
import java.io.IOException;
//import java.time.Duration;
//import java.util.Iterator;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;

import net.bytebuddy.utility.RandomString;

public class Mock {

	public static void main(String[] args) throws InterruptedException, IOException 
	{
//		// initialize the browser
	System.setProperty("webdriver.chrome.driver","E:\\chromedriver.exe");
//		//Create objective of Webdriver
//		WebDriver driver=new ChromeDriver();
//		//driver.get("https://twitter.com/i/flow/signup");
//		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
//		driver.navigate().to("https://vctcpune.com/selenium/practice.html");//its open on existing tab/browser
////		driver.navigate().forward();
////		driver.navigate().back();
////		driver.navigate().refresh();
//		driver.manage().window().maximize();
////		driver.manage().window().minimize();
////		System.out.println(driver.getTitle());
////		driver.navigate().forward();
////		System.out.println(driver.getCurrentUrl());
////		driver.close();
////		driver.quit();
//		//driver.findElement(By.id("autocomplete")).click();//id locator
//		//driver.findElement(By.className("inputs ui-autocomplete-input")).click();
//		//driver.findElement(By.name("dropdown-class-example")).click();//locator by name
//		//driver.findElement(By.tagName("input")).click();//tagname locator
//		//driver.findElement(By.linkText("About Us")).click();//locator type is linked text
//		Thread.sleep(3000);
//		//driver.findElement(By.partialLinkText("About Us")).click();//locator type is partial link tyext
//		//driver.findElement(By.cssSelector("#dropdown-class-example")).click();//css sector locator type
//		// x path 1. x path by attribute  2. x by text 3.x path by contains (text,attribute) ,index ,absolute and relative
//		
//		// x path by attribute
//		//driver.findElement(By.xpath("//input [@value='Radio2']")).click();//x path by attribute
//		
//	//	driver.findElement(By.xpath("//a[text()='Open Tab']")).click();// x path by text
//		//driver.findElement(By.xpath("//input[contains(@name,'enter-name')]")).sendKeys("Maroti");//x path by attribute with contains 
//		//driver.findElement(By.cssSelector("#serviceid1 > div > div > div:nth-child(1) > label:nth-child(6)")).click();
//		
////list box 
//		//.we have to find list box after create reference variable of list box
//		WebElement ele = driver.findElement(By.id("dropdown-class-example"));
//		
//		//create object of select class and pass reference variable as a argument 
//		Select s=new Select(ele);
//		
//		//used select class method to select listbox option
//		//s.selectByValue("option2");//select by value
//		//s.selectByVisibleText("Option1");// select by visible text
//		s.selectByIndex(3);
//		System.out.println(s.isMultiple());
//		driver.close();
//		
		WebDriver driver1=new ChromeDriver();
		 driver1.get("https://demoqa.com/select-menu");
		 driver1.manage().window().maximize();
		WebElement dropdown = driver1.findElement(By.id("cars"));
		Select s2=new Select(dropdown);
		s2.selectByIndex(1);
		s2.selectByVisibleText("Volvo");
		// if we want to deselect one option
		//s2.deselectByIndex(1);
		//s2.deselectAll();
		System.out.println(s2.isMultiple());
		//System.out.println(s2.getAllSelectedOptions().g);
		for(int i=0;i<=s2.getAllSelectedOptions().size()-1;i++)
		{
			System.out.println(i);
			System.out.println(s2.getAllSelectedOptions().get(i).getText());
			
		}
		System.out.println(s2.getFirstSelectedOption().getText());
		
		
		// take a screenshot
		
		//1st we have to typecase Takesscreenshot interface with driver
		Thread.sleep(4000);
		File source = ((TakesScreenshot)driver1).getScreenshotAs(OutputType.FILE);// screenshot ready
		String text = RandomString.make(3);
		File desti=new File("E:\\Screenshot3.myscreenshot"+text+".png");
		FileHandler.copy(source, desti);
		
		
		
		
		
		
	
		
		
	}

}
