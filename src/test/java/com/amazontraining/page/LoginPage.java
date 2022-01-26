package com.amazontraining.page;

import com.amazontraining.driver.BaseTest;
import com.amazontraining.methods.Methods;
import org.openqa.selenium.By;

public class LoginPage {

    Methods methods;

    public LoginPage(){
        methods = new Methods();
    }

    public void login(){
        methods.click(By.xpath("//*[@id=\"nav-link-accountList\"]"));
        methods.waitBySeconds(3);
        methods.click(By.xpath("//*[@id=\"ap_email\"]"));
        methods.waitBySeconds(3);
        methods.sendKeys(By.id("ap_email"),"xyz");
        methods.waitBySeconds(3);
        methods.click(By.id("continue"));
        methods.waitBySeconds(3);
        methods.click(By.id("ap_password"));
        methods.sendKeys(By.id("ap_password"),"xyz");
        methods.waitBySeconds(3);
        methods.click(By.id("signInSubmit"));
        methods.waitBySeconds(5);
    }
}
