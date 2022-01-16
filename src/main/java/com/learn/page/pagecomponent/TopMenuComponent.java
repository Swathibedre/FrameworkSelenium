package com.learn.page.pagecomponent;

import com.learn.driver.DriverManager;
import com.learn.enumconstants.WaitType;
import com.learn.utils.ElementUtil;
import org.openqa.selenium.By;

public class TopMenuComponent {

    private static final By dashBoard = By.id("menu_dashboard_index");

    public void clickDashBoard(){
        ElementUtil.doClick(dashBoard, WaitType.CLICK);
        //faker-done-random data generation
        //static import-done
        //dynamic locator
        //wait strategy
    }

}
