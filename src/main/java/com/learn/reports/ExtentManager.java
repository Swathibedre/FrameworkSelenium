package com.learn.reports;

import com.aventstack.extentreports.ExtentTest;

public final class ExtentManager {

    private ExtentManager() {
    }

    private static final ThreadLocal<ExtentTest> threadLocalDriver = new ThreadLocal<>();

     static void setTest(ExtentTest test) {
        threadLocalDriver.set(test);
    }

     static ExtentTest getTest() {
        return threadLocalDriver.get();

    }
}
