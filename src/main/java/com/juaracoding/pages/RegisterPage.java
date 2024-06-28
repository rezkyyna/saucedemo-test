package com.juaracoding.pages;

import com.juaracoding.drivers.DriverSingleton;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegisterPage {
    private WebDriver driver;

    public RegisterPage(){
        this.driver = DriverSingleton.getDriver();
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//input[@id='login-button']")
    private WebElement loginButton;

    @FindBy(xpath = "//input[@id='user-name']")
    private WebElement username;

    @FindBy(xpath= "//input[@id='password']")
    private WebElement password;

    @FindBy(xpath = "//span[@class='title']")
    private  WebElement txtlogin;

    @FindBy(xpath = "//button[@id='add-to-cart-sauce-labs-backpack']")
    private WebElement addCartOne;

    @FindBy(xpath = "//button[@id='add-to-cart-sauce-labs-bike-light']")
    private WebElement addCartTwo;

    @FindBy(xpath = "//button[@id='add-to-cart-sauce-labs-bolt-t-shirt']")
    private WebElement addCartThree;

    @FindBy(xpath = "//button[@id='react-burger-menu-btn']")
    private WebElement menutiga;

    @FindBy(xpath = "//a[@id='logout_sidebar_link']")
    private WebElement menuLogout;

    @FindBy(xpath = "//a[@class='shopping_cart_link']")
    private WebElement cart;

    @FindBy(xpath = "//div[normalize-space()='Sauce Labs Backpack']")
    private WebElement getTxtCart;

    @FindBy(xpath = "//div[@class='login_logo']")
    private WebElement getTxtLogout;

    public void registerForm(){
        username.sendKeys("standard_user");
        password.sendKeys("secret_sauce");
        loginButton.click();
        DriverSingleton.delay(3);
    }


    public void addCart(){
        addCartOne.click();
        addCartTwo.click();
        addCartThree.click();
        cart.click();
    }

    public void logout(){
        menutiga.click();
        menuLogout.click();
    }

    //validasi
    public String getTxtLogin(){
        return txtlogin.getText();
    }
public String getTxtCart(){
        return getTxtCart.getText();
}
    public String getTxtLogout(){
        return getTxtLogout.getText();
    }

}