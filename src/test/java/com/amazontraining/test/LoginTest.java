package com.amazontraining.test;

import com.amazontraining.driver.BaseTest;
import com.amazontraining.page.LoginPage;
import org.junit.Test;

public class LoginTest extends BaseTest {

    @Test
    public void loginTest(){

        LoginPage loginPage = new LoginPage();
        loginPage.login();
    }
}
