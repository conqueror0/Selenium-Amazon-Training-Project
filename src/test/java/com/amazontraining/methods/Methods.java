package com.amazontraining.methods;

import com.amazontraining.driver.BaseTest;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;

import java.time.Duration;

public class Methods {
    //webdriver üretiriz
    WebDriver driver;

    //Fluentwait tipinde wait nesnesi olusturulur
    FluentWait<WebDriver> wait;

    //javascript calıstırmak için
    JavascriptExecutor jsdriver;

    public Methods(){
        //drivera BaseTestten gelen driver atılır
        driver = BaseTest.driver;
        wait = new FluentWait<WebDriver>(driver);
        wait.withTimeout(Duration.ofSeconds(30)) //kaç saniye arasın
                .pollingEvery(Duration.ofMillis(300)) //kaç saniyede yenilensin
                .ignoring(NoSuchElementException.class);

        jsdriver = (JavascriptExecutor) driver;
    }

    // webelement bulma methodumuz
    public WebElement findElement(By by){
        return wait.until(ExpectedConditions.presenceOfElementLocated(by));
        //return (WebElement) ExpectedConditions.presenceOfElementLocated(by);
    }

    //click metodumuz
    public void click(By by){
        findElement(by).click();
    }

    //saniye cinsinden bekletme metodumuz
    public void waitBySeconds(long saniye){
        try{

            Thread.sleep(saniye*1000);

        }catch (Exception e){
            e.printStackTrace();
        }
    }

    //element kontrol metodu
    public boolean elementKontrolu(By by){
        try{
            wait.until(ExpectedConditions.visibilityOfElementLocated(by));
            return true;
        }catch (Exception e)
        {
            return false;
        }
    }

    //veri giris yazma metodu
    public void sendKeys(By by,String text){
        findElement(by).sendKeys(text);
    }

    //----------------scroll method-----------------------
    public void kaydır(By by){
        Actions actions = new Actions(driver);
        actions.moveToElement(findElement(by)).build().perform(); //bulduracagımız elemente kadar kaydırır
    }

    /*
    //javascript ile kaydırma
    public void kaydır(By by){
        jsdriver.executeScript("argument[0].scrollIntoView()", findElement(by));
    }
    */

}
