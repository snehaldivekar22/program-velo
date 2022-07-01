package testNGKeyword;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class EnabledKeyword 
{
  @Test (enabled = false)//if we set the enabled false this this method will disabled /ignored
  public void Mymethod1()
  {
  	Reporter.log("i want to disabled this method ", true);
  }
  @Test 
  public void Mymethod2()
  {
  	Reporter.log("i dont want to give keyword ", true);
  }
  @Test (enabled = true)//by default the value is true it will execute because it is enabled=true
  public void Mymethod3()
  {
  	Reporter.log("i want to enabled this method ", true);
  }
}
