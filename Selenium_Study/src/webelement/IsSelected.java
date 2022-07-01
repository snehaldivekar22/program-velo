package webelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsSelected {

	public static void main(String[] args) throws InterruptedException 
	{

System.setProperty("webdriver.chrome.driver", "E:\\chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.get("https://vctcpune.com/selenium/practice.html");
Thread.sleep(900);
WebElement Radio1 = driver.findElement(By.xpath("//input[@value='Radio1']"));
boolean result=Radio1.isSelected();//isselected is used for radio button and checkbox
System.out.println(result);

//Radio1.click();
//boolean result2=Radio1.isSelected();
//System.out.println(result2);
//or
if(Radio1.isSelected())

{
	System.out.println("Radio button is allready selected");
	
}
else
{
System.out.println("Radio button is not selected please select it");
Radio1.click();
if(Radio1.isSelected())
{
System.out.println("radio button is selected");

}
else
{
System.out.println("fail to select");	
}
}
	
	
	}

}
