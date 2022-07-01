package testNGSoftAssert;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Softassert1 {
	SoftAssert soft=new SoftAssert();
  @Test
  public void softAsser() 
  {     
	  String s="Snehal";
       String p="Snehal";
       String a="snehal";
	  soft.assertEquals(s, p,"test case is fail string is not matchoing");
	  
	  soft.assertNotEquals(s, a,"string is matching test case is fail");
	  soft.assertAll();
  }
  @Test
  public void softAssert1()
  {
	  boolean a=true;
	  boolean b=false;
	  soft.assertTrue(a,"test case is fail");
	  soft.assertFalse(b,"value is false test case is fail");
	  soft.assertAll();
  }
  
}
