package study.testng.listener;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class TestNGListener implements ITestListener{
	
	@Override
	public void onStart(ITestContext context) {
		System.out.println("Execution is started : onStart() => "+context.getName());
	}
	
	@Override
	public void onFinish(ITestContext context) {
		System.out.println("Execution is completed : onFinish() => "+context.getName());
	}
	
	@Override
	public void onTestStart(ITestResult result) {
		System.out.println("Test started : onTestStart() => "+result.getName());
	}
	
	@Override
	public void onTestSuccess(ITestResult result) {
		System.out.println("Test passed : onTestSuccess() => "+result.getName());
	}
	
	@Override
	public void onTestSkipped(ITestResult result) {
		System.out.println("Test skipped : onTestSkipped() => "+result.getName());
	}
	

	@Override
	public void onTestFailure(ITestResult result) {
		System.out.println("Test failed : onTestFailure() => "+result.getName());
	}

	@Override
	public void onTestFailedWithTimeout(ITestResult result) {

	}
	
	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {

	}
	
}
