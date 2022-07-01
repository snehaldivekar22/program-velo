package kitPOM;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestClassLogin {

	
	public static void main(String[] args) throws InterruptedException 
	{
	System.setProperty("webdriver.chrome.driver","E:\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://kite.zerodha.com");
	driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
	KiteLoginPage login=new KiteLoginPage(driver);
	login.sendUserId();
	login.sendPasswd();
	Thread.sleep(1000);
	login.Loginbuttonclick();
	
	driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
	PinPage pin1=new PinPage(driver);
	pin1.SendPin();
	pin1.ContinueButton();
	
	driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
	KitHomePage home=new KitHomePage(driver);
	home.userIdValidate();
	home.clickOnLogOut();
	
	
	}

}
