package com.learn.listener;

import com.learn.annotations.FrameworkAnnotation;
import com.learn.reports.ExtentLogger;
import com.learn.reports.ExtentReport;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import java.util.Arrays;

public class TestListener implements ITestListener {

    public void onTestStart(ITestResult result) {

        ExtentReport.setTestCase(result.getName());
        ExtentReport.setAuthorName(result.getMethod().getConstructorOrMethod().getMethod().getAnnotation(FrameworkAnnotation.class).author());
        ExtentLogger.info(result.getMethod().getDescription());
    }

    public void onTestSuccess(ITestResult result) {
        ExtentLogger.pass(result.getName());
    }

    public void onTestFailure(ITestResult result) {
        ExtentLogger.failWithScreenshot(result.getName());
        ExtentLogger.fail(result.getThrowable().getMessage());
        ExtentLogger.fail(Arrays.toString(result.getThrowable().getStackTrace()));
    }

    public void onTestSkipped(ITestResult result) {
    }

//    default void onTestFailedButWithinSuccessPercentage(ITestResult result) {
//    }
//
//    default void onTestFailedWithTimeout(ITestResult result) {
//        this.onTestFailure(result);
//    }

    public void onStart(ITestContext context) {
        ExtentReport.setExtentReporter();
    }

    public void onFinish(ITestContext context) {
            ExtentReport.flushReport();
    }

}
