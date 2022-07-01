package testNGFailtest;


//import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;


public class fail2 {
	@Test 
	public void Mymethod1()
	{ //Assert.fail();
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
