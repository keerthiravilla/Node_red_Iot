package com.SPMProject.backend.SeleniumTest;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By.ById;
import org.openqa.selenium.chrome.ChromeDriver;


import com.paulhammant.ngwebdriver.ByAngular;

import com.paulhammant.ngwebdriver.NgWebDriver;



import org.junit.jupiter.api.Assertions;



public class LoginPageSeleniumTest{
    @Test
    public void testLogin() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C:/Users/Gioele/Desktop/Progetto SPM/chromedriver_win32/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        JavascriptExecutor js = (JavascriptExecutor)driver;
        NgWebDriver ngDriver=new NgWebDriver(js);
        driver.get("http://localhost:4200/login");
        ngDriver.waitForAngularRequestsToFinish();
        driver.findElement(ById.id("inputemail")).sendKeys("user");
        driver.findElement(ById.id("inputPassword")).sendKeys("user");
        Thread.sleep(1000);
        driver.findElement(ByAngular.buttonText("Login")).click();
        Thread.sleep(2000);
        Assertions.assertEquals("http://localhost:4200/home", driver.getCurrentUrl());
        driver.close();

    }
}
