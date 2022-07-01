package testNGgroup;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class GroupTestng1 
{
	@Test (groups = "sanity")
	public void Mymethod1()
	{
		Reporter.log("i will set my priority ", true);
	}
	@Test (groups="regression")
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
