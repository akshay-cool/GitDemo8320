package com.reports.ExtentReports;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;


public class ExtentReportDemo {
	
	ExtentReports extent;
@BeforeTest
public void config() {
	//ExtentReports ,ExtentSparkReporter
	String path=System.getProperty("user.dir")+"\\reports\\index.html";
	ExtentSparkReporter reporter=new ExtentSparkReporter(path);
	reporter.config().setReportName("Web Automation results");
	reporter.config().setDocumentTitle("Test results");
	
	extent=new ExtentReports();
	extent.attachReporter(reporter);
	extent.setSystemInfo("Tester","Akshy kulkarni");
	
}
@Test
public void initialDemo() {
	extent.createTest("Initial Demo");
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\akshay.kulkarni\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
	WebDriver driver =new  ChromeDriver();
	driver.get("https://rahulshettyacademy.com/");
	extent.flush();
	}
	

}
