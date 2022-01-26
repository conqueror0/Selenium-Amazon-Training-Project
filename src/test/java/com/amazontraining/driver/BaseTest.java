package com.amazontraining.driver;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

public class BaseTest {
    //static olarak webdriver ımızı tanımladık
    public static WebDriver driver;

    //ilk olarak proje ayağa kalktığında burası çalısacak
    @Before
    public void setUp(){
        //resources klasorundeki chromdriverı okuttuk
        System.setProperty("webdriver.chrome.driver","src/test/resources/chromedriver.exe");
        //chrome a ceşitli ayarlarda bulunabilmek için chromeOptions tanımladık
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--disable-notifications");
        chromeOptions.addArguments("--disable-gpu");
        chromeOptions.addArguments("--no-sandbox");
        chromeOptions.addArguments("disable-infobars");
        chromeOptions.addArguments("disable-plugins");
        chromeOptions.addArguments("disable-popup-blocking");
        chromeOptions.addArguments("ignore-certificate-errors");
        chromeOptions.addArguments("disable-translate");
        chromeOptions.addArguments("disable-extensions");

        //desiredcapabilities ile tarayıcı özellikleri ayarlanabilir örneğin adı değiştirilebilir
        DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
        desiredCapabilities.setBrowserName("chrome");
        //bu kısımda chromeoptions ayarlarını tarayıcımıza merge ettik birleştirdik
        chromeOptions.merge(desiredCapabilities);

        driver = new ChromeDriver(chromeOptions);
        driver.manage().window().maximize();
        driver.get("https://www.amazon.com/");
    }

    @After
    public void tearDown(){
        if (driver != null){
            driver.close(); //tarayıcıdan cıkılır
            driver.quit();  //driverdan cıkılır
        }

    }
}
