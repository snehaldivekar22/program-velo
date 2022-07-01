package testNG;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestClass2 {
	@BeforeTest
	public void testclass()
	{
		Reporter.log("before test is running", true);
	}
	@BeforeClass
	public void classmethod()
	{
		Reporter.log("before test is running", true);
	}
	@BeforeMethod
	public void method1()
	{
		//login with user id and password
		Reporter.log("before test is running", true);
	}
  @Test
  public void testcase()
  {
	  //actual testing
	  Reporter.log(" test is running", true);
  }
  @AfterMethod
  public void aftermethod1()
  {//logout
	  Reporter.log("after method is running", true);
  }
  @AfterClass
  public void afterclassMethod()
  {
	  Reporter.log("after class method is running", true);
  }
}
