package Util;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class MyReport {
	public static ExtentReports extent;
	public  ExtentTest test;
	private static ExtentSparkReporter spark;

	public MyReport() {
		spark = new ExtentSparkReporter(System.getProperty("user.dir") +"/target/testReport.html");
		extent = new ExtentReports();
		extent.attachReporter(spark);
	}

	public ExtentTest getTest(String testName) {
		test=extent.createTest(testName);
		return test;
	}

}
