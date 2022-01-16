package com.learn.utils;

import com.learn.driver.DriverManager;
import com.learn.enumconstants.WaitType;
import com.learn.reports.ExtentLogger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ElementUtil {

    public static void sendValues(By locator, String value){
        DriverManager.getDriver().findElement(locator).sendKeys(value);
       // ExtentLogger.pass(value+" is entered ");
    }
    public  static void doClick(By locator, WaitType waitType) {
        if (waitType == WaitType.CLICK){
            waitElementClick(locator).click();

    }else if(waitType == WaitType.PRESENT)
        waitElementPresent(locator).click();
      //  DriverManager.getDriver().findElement(locator).click();
    }

    public static String getTitleValue(){
      return DriverManager.getDriver().getTitle();
    }

    public static WebElement waitElementClick(By locator){
        WebDriverWait wait = new WebDriverWait(DriverManager.getDriver(),20);
        return wait.until(ExpectedConditions.elementToBeClickable(locator));
    }


    public static WebElement waitElementPresent(By locator){
        WebDriverWait wait = new WebDriverWait(DriverManager.getDriver(),20);
        return wait.until(ExpectedConditions.presenceOfElementLocated(locator));
    }

    public static String getLink(){
        return DriverManager.getDriver().getCurrentUrl();
    }

}
