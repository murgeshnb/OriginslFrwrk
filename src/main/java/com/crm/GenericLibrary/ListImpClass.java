package com.crm.GenericLibrary;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ListImpClass implements ITestListener
{ 
	
	ExtentTest test;
	   ExtentReports report;
	
	public void onTestFailure(ITestResult result) 
	{
		
		String mtdname = result.getMethod().getMethodName();
		
		EventFiringWebDriver efire=new EventFiringWebDriver(Baseclass.sdriver);
		File src = efire.getScreenshotAs(OutputType.FILE);
		
		String sysdate = new Date().toString().replace(" ", "_");
		
		File dstn=new File("./screenshot/"+mtdname+" "+sysdate+".png");
		
		try {
			FileUtils.copyFile(src, dstn);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
			 test.log(Status.FAIL, result.getMethod().getMethodName()+" is failed");
			  test.log(Status.FAIL, result.getThrowable());
			  test.addScreenCaptureFromPath(dstn.getAbsolutePath());
		}
		
	}

	public void onFinish(ITestContext context) {
		//@AfterSuite
		  report.flush();

		
	}

	public void onStart(ITestContext context) {
		//@BeforeSuite
		  ExtentSparkReporter spark=new ExtentSparkReporter("./extentreport.html");
		  spark.config().setTheme(Theme.DARK);
		  spark.config().setDocumentTitle("Vtiger automation");
		  spark.config().setReportName("Execution report");
		  
		    report = new ExtentReports();
		  report.attachReporter(spark);
		  report.setSystemInfo("OS", "Window");
		  report.setSystemInfo("Platform", "Windows 10");
		  report.setSystemInfo("Reporter", "Murgesh N B");
		
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult arg0) {
		// TODO Auto-generated method stub
		
	}

	public void onTestSkipped(ITestResult result) {
		test.log(Status.SKIP, result.getMethod().getMethodName()+" is skipped");
		  test.log(Status.SKIP,result.getThrowable());
		
	}

	public void onTestStart(ITestResult result) {
		//@test
		 test = report.createTest(result.getMethod().getMethodName());
		
	}

	public void onTestSuccess(ITestResult result) {
		test.log(Status.PASS, result.getMethod().getMethodName()+" is passed");
		
	}

}
