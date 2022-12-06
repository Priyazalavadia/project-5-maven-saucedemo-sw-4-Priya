package com.saucedemo.testsuite;

import com.saucedemo.pages.LoginPage;
import com.saucedemo.test.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginPageTest extends BaseTest {

    LoginPage loginPage = new LoginPage();

    @Test
    public void userShouldLoginSuccessfullyWithValidCredentials(){
        //login with valid username
        loginPage.setEmailField("standard_user");

        //valid password
        loginPage.enterPassword("secret_sauce");

        //click on loginbutton
        loginPage.loginButton();

        //verify Products are displayed
        String expectedText = "PRODUCTS";
        String actualText = loginPage.verifyMessage();
        Assert.assertEquals(actualText,expectedText,"Login page not displayed");
    }

    @Test
    public void verifyThatSixProductsAreDisplayedOnPage(){
        //Login with valid username
        loginPage.setEmailField("standard_user");

        loginPage.enterPassword("secret_sauce");

        //click on login button
        loginPage.loginButton();

        //verify six products are displayed
        loginPage.inventoryDisplay();
    }



}
