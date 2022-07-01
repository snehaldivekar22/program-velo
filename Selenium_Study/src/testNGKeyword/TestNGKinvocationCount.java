package testNGKeyword;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestNGKinvocationCount {
  @Test(invocationCount=2)//this keyword is used,if i have 1 method and i have to execute this method twice or multiple time then i will use inocatincount
  public void Mytest1() 
  {
	 Reporter.log("my method1 is running twise" ,true); 
  }
}
