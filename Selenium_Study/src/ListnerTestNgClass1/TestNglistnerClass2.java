package ListnerTestNgClass1;

import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners(ListnerClass.Listner1.class)
public class TestNglistnerClass2 
{
  @Test
  public void method2()
  {
	  Reporter.log("test case is pass", true);
  }
}
