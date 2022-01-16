package com.learn.test;

import com.github.javafaker.Faker;
import com.learn.annotations.FrameworkAnnotation;
import com.learn.page.HomePage;
import com.learn.page.LoginPage;
import com.learn.testData.TestData;
import com.learn.utils.DataSupplierUtils;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class LaunchTest extends  BaseTest{

    @FrameworkAnnotation(author = "Swathi")
    @Test(priority = 1,dataProvider = "getLoginData",dataProviderClass = DataSupplierUtils.class)
    public void loginToAppTest(TestData testData){
        LoginPage loginPage = new LoginPage();
        HomePage homePage=loginPage.
                loginApp(testData.getUsername(), testData.getPassword());
        String actualTitle = homePage.getHomeTitle();
        String actualURL = homePage.getHomeLink();
        System.out.println("testData.getTestNo() = " + testData.getTestNo());

        Assert.assertEquals(actualURL,testData.getExpectedURL());
        Assert.assertEquals(actualTitle,testData.getExpectedTitle());
//        Faker faker = new Faker();
//        System.out.println(faker.address().state());
    }


}
