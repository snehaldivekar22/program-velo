package testNGKeyword;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class TimeOutsKeyword {
  
  @Test (timeOut=100)//if this method will not execute in given time slot then it will fail
  public void Mymethod1() //throws InterruptedException
  {
	 //Thread.sleep(120);
  	Reporter.log("i will set my priority ", true);//if one method is time consuming if will give timeout then this will not execute in given time then it will fail and next methods will pass by default
  }
  @Test (timeOut=10)//can't be pass decimal 
  public void Mymethod2()
  {
  	Reporter.log("i will set my priority ", true);
  }
}
