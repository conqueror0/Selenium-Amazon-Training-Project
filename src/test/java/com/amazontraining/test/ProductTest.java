package com.amazontraining.test;

import com.amazontraining.driver.BaseTest;
import com.amazontraining.page.ProductPage;
import org.junit.Test;

public class ProductTest extends BaseTest {
    @Test
    public void productTest(){
        ProductPage productPage = new ProductPage();
        productPage.scrollAndSelect();
    }

}
