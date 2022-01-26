package com.amazontraining.page;

import com.amazontraining.methods.Methods;
import org.openqa.selenium.By;

public class ProductPage {
    Methods methods;

    public ProductPage(){
        methods = new Methods();
    }

    public void scrollAndSelect(){
        methods.click(By.id("twotabsearchtextbox"));
        methods.sendKeys(By.id("twotabsearchtextbox"), "laptop");
        methods.waitBySeconds(3);
        methods.click(By.id("nav-search-submit-button"));
        methods.waitBySeconds(3);
        //laptop aramasından sonra aşağı dogru scroll edilmesi için;
        methods.kaydır(By.xpath("//*[@id=\"search\"]/div[1]/div[1]/div/span[3]/div[2]/div[28]/span/div/span/span[1]"));
        methods.waitBySeconds(3);

    }
}
