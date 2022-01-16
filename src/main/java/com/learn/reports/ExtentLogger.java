package com.learn.reports;

import com.aventstack.extentreports.MediaEntityBuilder;
import com.learn.utils.ScreenshotUtil;

public final class ExtentLogger {
    private ExtentLogger(){}

    public static void pass(String message){
        ExtentManager.getTest().pass(message,
                MediaEntityBuilder.createScreenCaptureFromBase64String(ScreenshotUtil.screenShot()).build());
    }

    public static void fail(String message){
        ExtentManager.getTest().fail(message);
    }

    public static void failWithScreenshot(String message){
        ExtentManager.getTest().fail(message,
                MediaEntityBuilder.createScreenCaptureFromBase64String(ScreenshotUtil.screenShot()).build());
    }



    public static void info(String message){
        ExtentManager.getTest().info(message);
    }
}
