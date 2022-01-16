package com.learn.page;

import com.learn.driver.DriverManager;
import com.learn.page.pagecomponent.TopMenuComponent;
import com.learn.utils.ElementUtil;

public class HomePage {
    //homepage has a topmenycomponent-composition concept
    private TopMenuComponent topMenuComponent;

    public HomePage(){
        topMenuComponent = new TopMenuComponent();
    }

    public String getHomeTitle(){
        return ElementUtil.getTitleValue();
    }

    public void clickDashboard(){
        topMenuComponent.clickDashBoard();
    }

    public String getHomeLink(){
        return ElementUtil.getLink();
    }
}
