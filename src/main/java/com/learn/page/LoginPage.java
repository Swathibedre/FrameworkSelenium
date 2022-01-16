package com.learn.page;

import com.learn.enumconstants.WaitType;
import com.learn.reports.ExtentLogger;
import org.openqa.selenium.By;
import static com.learn.utils.ElementUtil.*;

public class LoginPage {
    private static final By username = By.id("txtUsername");
    private static final By password = By.id("txtPassword");
    private static final By loginBtn = By.id("btnLogin");



        public LoginPage sendUname(String uname){
            sendValues(username,uname);
            ExtentLogger.pass(uname+" is entered username");
            return this;
        }
    public LoginPage sendPassword(String pass){
        sendValues(password,pass);
        ExtentLogger.pass(pass+" is entered password");
        return this;
    }

    public  HomePage clickLogin(){
        doClick(loginBtn, WaitType.CLICK);
        ExtentLogger.pass("Clicked");
        return new HomePage();
    }
        public HomePage loginApp(String uname, String pass) {
           return sendUname(uname).
                   sendPassword(pass).
                   clickLogin();
        }
}
