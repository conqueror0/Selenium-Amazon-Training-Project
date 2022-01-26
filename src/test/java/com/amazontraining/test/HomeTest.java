package com.amazontraining.test;

import com.amazontraining.driver.BaseTest;
import com.amazontraining.page.HomePage;
import org.junit.Test;

public class HomeTest extends BaseTest {

    @Test
    public void homeTest(){
        HomePage homePage = new HomePage();

        homePage.anaSayfa();
    }
}
