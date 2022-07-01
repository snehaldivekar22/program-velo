package ListnerClass;

import java.io.IOException;

import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

import KitBaseClass.Baseclasswithproperties;

public class Listner1 implements ITestListener//we have to implements ITestListner(interface)
{                                       //this interface has multiple abstract methods
	Baseclasswithproperties b=new Baseclasswithproperties();
	@Override //all this methods are overridden because be have to implements ItestListner interface
public void onTestFailure(ITestResult result) //all this methods are inbuilt in itestlistener interface
	{
	try {
		String TCname = result.getName();
		b.takescreenshot(TCname);
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
	@Override
	public void onTestSuccess(ITestResult result) 
	{
		Reporter.log("test case is pass", true);//while test is pass then this will also execute and mentioned in report
		ITestListener.super.onTestSuccess(result);
		Reporter.log("pass test case name is"+result.getName(),true);
	}
	@Override
	public void onTestSkipped(ITestResult result)
	{
		Reporter.log("test case is skipp", true);
		ITestListener.super.onTestSkipped(result);
	}
}
