package com.learn.test;

import com.learn.annotations.FrameworkAnnotation;
import com.learn.page.LoginPage;
import com.learn.testData.TestData;
import com.learn.utils.DataSupplierUtils;
import org.testng.annotations.Test;

public class HomeTest extends  BaseTest{

    @FrameworkAnnotation(author = "Swathi")
    @Test(priority = 2,dataProvider = "getLoginData",dataProviderClass = DataSupplierUtils.class)
    public void dashboardClick(TestData  testData){
        LoginPage loginPage = new LoginPage();
        loginPage.loginApp(testData.getUsername(),testData.getPassword()).clickDashboard();
    }
}
