package com.amazontraining.page;

import com.amazontraining.methods.Methods;
import org.junit.Assert;
import org.openqa.selenium.By;

public class HomePage {

    Methods methods;

    public HomePage(){
        methods=new Methods();
    }

    public void anaSayfa() {
        methods.waitBySeconds(5);

        //Assert.assertTrue(methods.elementKontrolu(By.xpath("//*[@id=\"C9W5Ub4GVcU5B5kJJ708Hg\"]/span")));
        //Assert.assertTrue(methods.elementKontrolu(By.id("1PYkutK7OhM32_kTykYPTw")));

        methods.click(By.xpath("//*[@id=\"nav-link-accountList\"]"));
        methods.waitBySeconds(5);
        }

    }

