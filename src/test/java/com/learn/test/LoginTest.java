package com.learn.test;

import com.github.javafaker.Faker;
import com.learn.annotations.FrameworkAnnotation;
import com.learn.page.HomePage;
import com.learn.page.LoginPage;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class LoginTest extends  BaseTest{

    @FrameworkAnnotation(author = "Swathi")
    @Test(priority = 1,dataProvider = "getData")
    public void loginToApp(String username,String password,String expectedTitle,String expectedURL){
       LoginPage loginPage = new LoginPage();
       HomePage homePage=loginPage.
               loginApp(username,password);
       String actualTitle = homePage.getHomeTitle();
       String actualURL = homePage.getHomeLink();

       Assert.assertEquals(actualURL,expectedURL);
       Assert.assertEquals(actualTitle,expectedTitle);
       Faker faker = new Faker();
        System.out.println(faker.address().state());
    }

    @DataProvider
    public Object[][] getData(){
        return new Object[][]{{"Admin","admin123","OrangeHRM","https://opensource-demo.orangehrmlive.com/index.php/dashboard"}};
    }


}
