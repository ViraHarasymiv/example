package com.ita.edu.rozetka.pages.login_component;

import com.ita.edu.rozetka.locators.HeaderLocators;
import com.ita.edu.rozetka.locators.LoginLocators;
import com.ita.edu.rozetka.pages.BasePO;
import com.ita.edu.rozetka.pages.HomePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginModal extends BasePO {

    private WebElement emailInput;
    private  WebElement passwordInput;
    private WebElement enterButton;
    private WebElement iconIAmNotRobot;

    public LoginModal(WebDriver driver) {
        super(driver);
    }

    public WebElement getEmailInput() {
        if(emailInput == null){
            emailInput = this.driver.findElement(LoginLocators.EMAIL_FIELD.getPath());
        }
        return emailInput;
    }

    public WebElement getPasswordInput() {
        if(passwordInput == null){
            passwordInput = this.driver.findElement(LoginLocators.PASSWORD_FIELD.getPath());
        }
        return passwordInput;
    }

    public WebElement getEnterButton() {
        if(enterButton == null){
            enterButton = this.driver.findElement(LoginLocators.ENTER_BUTTON.getPath());
        }
        return enterButton;
    }

    public WebElement getIconIAmNotRobot() {
        if(iconIAmNotRobot == null){
            iconIAmNotRobot = this.driver.findElement(LoginLocators.ENTER_BUTTON.getPath());
        }
        return iconIAmNotRobot;
    }
    public HomePage successLogin(String email,String password){
        getEmailInput().sendKeys(email);
        getPasswordInput().sendKeys(password);
        getEnterButton().click();
        sleep(5);
        return  new HomePage(driver);

    }

}
