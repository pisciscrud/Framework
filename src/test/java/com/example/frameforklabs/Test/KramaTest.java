package com.example.frameforklabs.Test;

import com.example.frameforklabs.Model.ComicsKramaPage;
import org.junit.Assert;
import org.junit.Test;
import org.junit.jupiter.api.AfterEach;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.logevents.SelenideLogger;

import io.qameta.allure.selenide.AllureSelenide;
import org.junit.Test;


import static com.codeborne.selenide.Selenide.open;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
public class KramaTest {
    private WebDriver driver;
    @Test
    public void ResultOfEmtySearch() {
        driver = new ChromeDriver();
        ComicsKramaPage komicsKramaPage = new ComicsKramaPage(driver);
        komicsKramaPage.open();
        int  res= komicsKramaPage.ResultOfEmtySearch().ResultOfSearch();
        Assert.assertEquals( res,0);
    }
    @Test
    public void openHistory() {
        driver = new ChromeDriver();
        ComicsKramaPage komicsKramaPage = new ComicsKramaPage(driver);
        komicsKramaPage.open();
        int res= komicsKramaPage.openHistory();
        Assert.assertEquals( res,1);
    }



    @Test
    public void ResultOfSearch2() {
        driver = new ChromeDriver();
        ComicsKramaPage komicsKramaPage = new ComicsKramaPage(driver);
        komicsKramaPage.open();
        int  res= komicsKramaPage.NotEmptySerach().ResultOfSearch();
        Assert.assertEquals( res,1);
    }


    @Test
    public void ResultOfEmtyBucket() {
        driver = new ChromeDriver();
        ComicsKramaPage komicsKramaPage = new ComicsKramaPage(driver);
        komicsKramaPage.open();
        int  res= komicsKramaPage.BusketEmpty().ResultBucketEmpty();
        Assert.assertEquals( res,0);
    }
    @Test
    public void ResultOfNotEmtyBucket() {
        driver = new ChromeDriver();
        ComicsKramaPage komicsKramaPage = new ComicsKramaPage(driver);
        komicsKramaPage.open();
        int  res= komicsKramaPage.BusketNotEmpty().ResultBucketEmpty();
        Assert.assertEquals( res,1);
    }

    @Test
    public void openDelivery() {
        driver = new ChromeDriver();
        ComicsKramaPage komicsKramaPage = new ComicsKramaPage(driver);
        komicsKramaPage.open();
        int res= komicsKramaPage.openDelivery();
        Assert.assertEquals( res,1);
    }

    @Test
    public void openPaymethod() {
        driver = new ChromeDriver();
        ComicsKramaPage komicsKramaPage = new ComicsKramaPage(driver);
        komicsKramaPage.open();
        int res= komicsKramaPage.openPayMethod();
        Assert.assertEquals( res,1);
    }


    @AfterEach
    public void tearDown() throws Exception {
        driver.quit();
    }
}
