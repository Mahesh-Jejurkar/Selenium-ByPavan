package testNG;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class MyListenerClass implements ITestListener {
	String extendReportPath = System.getProperty("user.dir") + "\\reports\\ExtentReport.html";

	public ExtentSparkReporter sparkReporter; // UI of report.
	public ExtentReports reports; // Populate common info on report.
	public ExtentTest test; // Create test case entry and update status of test methods in report.

	public void onStart(ITestContext context) {
		System.out.println("Execution Started..." + context.getName());

		sparkReporter = new ExtentSparkReporter(extendReportPath);
		sparkReporter.config().setDocumentTitle("Automation Report");
		sparkReporter.config().setReportName(context.getName());
		sparkReporter.config().setTheme(Theme.STANDARD);

		reports = new ExtentReports();
		reports.setSystemInfo("OS", "Windows11");
		reports.setSystemInfo("Computer", "Localhost");
		reports.setSystemInfo("Environment", "QA");
		reports.setSystemInfo("Browser", "Chrome");
		reports.setSystemInfo("Tester Name", "Mahesh");
		reports.attachReporter(sparkReporter);
	}

	public void onFinish(ITestContext context) {
		System.out.println("Execution Finished..." + context.getClass());
		reports.flush();
	}

	public void onTestStart(ITestResult result) {
		System.out.println("Test Started : " + result.getName());
	}

	public void onTestSuccess(ITestResult result) {
		System.out.println("Test Passed : " + result.getName());

		test = reports.createTest(result.getName());
		test.log(Status.PASS, "Test Passed : " + result.getName());
	}

	public void onTestFailure(ITestResult result) {
		System.out.println("Test Failed : " + result.getName());

		test = reports.createTest(result.getName());
		test.log(Status.FAIL, "Test Failed : " + result.getName());
		test.log(Status.FAIL, "Cause is : " + result.getThrowable());
	}

	public void onTestSkipped(ITestResult result) {
		System.out.println("Test Skipped : " + result.getName());

		test = reports.createTest(result.getName());
		test.log(Status.SKIP, "Test Skipped : " + result.getName());
	}

}
