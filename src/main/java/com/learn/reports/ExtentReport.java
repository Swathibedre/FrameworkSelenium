package com.learn.reports;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentReporter;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public final class ExtentReport {
    private ExtentReport(){}

    public static ExtentReports extentReports;
    public static ExtentTest extentTest;

    public static void setExtentReporter(){
        extentReports = new ExtentReports();
        ExtentSparkReporter sparkReporter = new ExtentSparkReporter(System.getProperty("user.dir")+"/index.html");
        extentReports.attachReporter(sparkReporter);
        }

    public static void setTestCase(String testCase){
        extentTest = extentReports.createTest(testCase);
        ExtentManager.setTest(extentTest);
    }

    public static void flushReport(){
        extentReports.flush();
    }
    public static void setAuthorName(String authorName){
        ExtentManager.getTest().assignAuthor(authorName);
    }
}
