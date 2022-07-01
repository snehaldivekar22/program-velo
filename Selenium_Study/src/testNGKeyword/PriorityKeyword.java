package testNGKeyword;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class PriorityKeyword {
  @Test(priority = -1)
  public void Mymethod1() //priority keyword is used because test class is executed test cases bydefault in alphabetical order
  {                       //if i want to give priority to test method then i will use priority keyword
	Reporter.log("i will set my priority ", true);  //if priority is -1 then it will execute 1st
	                      //if priority is -2 then it will execute before -1 then 0 th level method execute.  
  }                       //by default it will execute alphabetically
@Test (priority = -3)
public void Mymethod2()
{
	Reporter.log("i will set my priority ", true);
}
@Test (priority = 0)
public void Mymethod3()
{
	Reporter.log("i will set my priority ", true);//if the priority is duplicate then it will execute alphabetically order 
}
@Test (priority = 0)
public void Mymethod4()
{
	Reporter.log("i will set my priority ", true);
}
}
