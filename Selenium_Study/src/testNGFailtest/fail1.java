package testNGFailtest;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class fail1 {
	@Test (timeOut=100)
	public void Mymethod1() //throws InterruptedException
	{  // Thread.sleep(120);  
		Reporter.log("i will set my priority ", true);
	}
	@Test 
	public void Mymethod2()
	{
		Reporter.log("i will set my priority ", true);
	}
	@Test 
	public void Mymethod3()
	{
		Reporter.log("i will set my priority ", true);
	}
}
