package ListnerTestNgClass1;

//import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(ListnerClass.Listner1.class)//we have to declaire @listeners anotation and pass (packagename,classname.class)
public class TestNGListnerClass1 
{
//	@Test
//	public void listnermethod2()
//	{   Assert.fail();
//		Reporter.log("test case is fail",true);
//	}
  @Test//(dependsOnMethods = {"listnermethod2"})//intentionally we fail the method
  public void listnerClassMethod() 
  {
	  Reporter.log("hii gm ", true);
  }
}
