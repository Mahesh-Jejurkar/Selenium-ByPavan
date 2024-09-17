package testNG_byPavan;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestNGListener;
import org.testng.ITestResult;

public class MyListenerClass implements ITestListener{
	@Override
	public void onTestStart(ITestResult result) {
		System.out.println("Test Started : "+result.getMethod().getMethodName());
	}
	
	@Override
	public void onTestSuccess(ITestResult result) {
		System.out.println("Test Passed : "+result.getMethod().getMethodName());
	}
	
	@Override
	public void onTestFailure(ITestResult result) {
		System.out.println("Test Failed : "+result.getMethod().getMethodName());
	}
	
	@Override
	public void onTestSkipped(ITestResult result) {
		System.out.println("Test Skipped : "+result.getMethod().getMethodName());
	}
	
	@Override
	public void onStart(ITestContext context) {
		System.out.println("Execution Started..."+context.getName());
	}
	
	@Override
	public void onFinish(ITestContext context) {
		System.out.println("Execution Finished..."+context.getClass());
	}
}
