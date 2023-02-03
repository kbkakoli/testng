package listeners;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class iteatlisteners implements ITestListener {

	public void onTestStart(ITestResult result) {
		String name=result.getName();
		System.out.println("name"+   "started");  
	}

	public void onTestSuccess(ITestResult result) {
		String name=result.getName();
		System.out.println("name"+   "succeed");
	}

	public void onTestFailure(ITestResult result) {
		String name=result.getName();
		System.out.println("name"+   "failed");	
	}

	public void onTestSkipped(ITestResult result) {
		String name=result.getName();
		System.out.println("name"+   "skipped");	
	}

	public void onTestFailedWithTimeout(ITestResult result) {
		String name=result.getName();
		System.out.println("name"+   "Failed With Timeout");
	}

	public void onStart(ITestContext context) {
		System.out.println("Test has started");
	}

	public void onFinish(ITestContext context) {
		System.out.println("Test is finished");	
	}

}
