package com.Shopping.Utilities;

import java.io.IOException;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import com.Shopping.TestCase.BaseClass;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;



public class ExtentReportWithListeners extends BaseClass implements ITestListener
{
	ExtentSparkReporter createreport;
	ExtentReports addtest;
	ExtentTest addlog;
	public void report()
	{
		createreport=new ExtentSparkReporter("shopping.html");
		addtest=new ExtentReports();
		addtest.attachReporter(createreport);
		addtest.setSystemInfo("OperatingSystem", "Mac");
		addtest.setSystemInfo("Browesr", r.getBrowser());
		addtest.setSystemInfo("BrowesrVersion", "181.91.22.01");
		addtest.setSystemInfo("User Name", "RAMPAL ");
		//Set Configuration
		createreport.config().setReportName("practicDemo");
		createreport.config().setDocumentTitle("My Report");
		createreport.config().setTheme(Theme.STANDARD);
	}
	public void onStart(ITestContext Result)
	{
		report();
	}
	//PASS
	public void onTestSuccess(ITestResult Result)
	{
		addlog=addtest.createTest(Result.getName());
		addlog.log(Status.PASS, MarkupHelper.createLabel("My Testcase Pass", ExtentColor.GREEN));
	}
	//FAIL
	public void onTestFailure(ITestResult Result)
	{
		try {
			screenshot();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String Location="/Users/dhanishkumar/eclipse-workspace/practic/Screenshots/p.png";
		addlog=addtest.createTest(Result.getName());
		addlog.log(Status.FAIL,MarkupHelper.createLabel("My Testcase fail", ExtentColor.RED));
		addlog.fail("TestCase_Fail:"+addlog.addScreenCaptureFromPath(Location));
	}
	//SKIP
	public void onTestSkipped(ITestResult Result)
	{
		addlog=addtest.createTest(Result.getName());
		addlog.log(Status.SKIP,MarkupHelper.createLabel("My Testcase skiped", ExtentColor.YELLOW));
	}
	//UPDATE
	public void onFinish(ITestContext Result)
	{
		addtest.flush();
	}
	
	
	
	
	
	
	
	
	
	
}
