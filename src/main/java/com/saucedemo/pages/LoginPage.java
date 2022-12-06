package com.saucedemo.pages;

import com.saucedemo.utility.Utility;
import org.openqa.selenium.By;
import org.testng.annotations.Test;
import sun.security.util.Password;

public class LoginPage extends Utility {

    By emailField = By.id("user-name");

    public void setEmailField(String email) {
        sendTextToElement(emailField, email);
    }
        By passwordField = By.name("password");

        public void enterPassword(String Password){
            sendTextToElement(passwordField,Password);
        }

        By clickOnLoginButton = By.id("login-button");

        public void loginButton() {
            clickOnElement(clickOnLoginButton);
        }

        By verifyTitleText = By.xpath("//span[@class='title']");

        public String verifyMessage() {
            return getTextFromElement(verifyTitleText);

        }
        By inventoryDisplayed = By.id ("inventory_container");

        public void inventoryDisplay(){
            if(driver.findElement(inventoryDisplayed).isDisplayed()) {
                System.out.println("true");
            }else{
                System.out.println("product not displayed");
            }





    }
}
