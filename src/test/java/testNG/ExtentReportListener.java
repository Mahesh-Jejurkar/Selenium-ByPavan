package testNG;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtentReportListener implements ITestListener {
	public ExtentSparkReporter sparkReporter; // UI of the report
	public ExtentReports reports; // Populate common info on the report
	public ExtentTest test; // Creating test case entries in th report and update status of the test
							// methods.

	@Override
	public void onStart(ITestContext context) {
		sparkReporter = new ExtentSparkReporter(System.getProperty("user.dir") + "\\reports\\extent-report.html");
		sparkReporter.config().setDocumentTitle("Automation Test");
		sparkReporter.config().setReportName("Functional Test Report");
		sparkReporter.config().setTheme(Theme.STANDARD);

		reports = new ExtentReports();
		reports.attachReporter(sparkReporter);
		reports.setSystemInfo("Computer Name", "localhost");
		reports.setSystemInfo("Environment", "QA");
		reports.setSystemInfo("Tester Name", "Mahesh");
		reports.setSystemInfo("OS", "Windows11");
		reports.setSystemInfo("Browser Name", "Chrome");
	}

	@Override
	public void onFinish(ITestContext context) {
		reports.flush();
	}

	@Override
	public void onTestStart(ITestResult result) {

	}

	@Override
	public void onTestSuccess(ITestResult result) {
		test = reports.createTest(result.getName());
		test.log(Status.PASS, "Test case is PASSED : " + result.getName());
	}

	@Override
	public void onTestFailure(ITestResult result) {
		test = reports.createTest(result.getName());
		test.log(Status.FAIL, "Test case is FAILED : " + result.getName());
		test.log(Status.FAIL, "FAILED cause is : " + result.getThrowable());
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		test = reports.createTest(result.getName());
		test.log(Status.SKIP, "Test case is SKKIPED : " + result.getName());
	}

}
