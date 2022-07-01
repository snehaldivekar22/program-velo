package testNGKeyword;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class dependaOnKeyword {
	 @Test (timeOut=100)
	  public void login() throws InterruptedException
	  {
	  	Reporter.log("i will set my priority ", true);
	  	Thread.sleep(10);
	  }
	 @Test (priority=4,invocationCount=3)//we can add multiple keyword together
	  public void verifyPin()
	  {
	  	Reporter.log("i will set my priority ", true);
	  }
	 @Test (dependsOnMethods= {"login"},priority=4)//first dependsonMethod will execute
	  public void logout()
	  {
	  	Reporter.log("i will set my priority ", true);
	  }
}
