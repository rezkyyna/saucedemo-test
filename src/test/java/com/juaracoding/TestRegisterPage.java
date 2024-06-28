package com.juaracoding;

import com.juaracoding.drivers.DriverSingleton;
import com.juaracoding.pages.RegisterPage;
import com.juaracoding.utils.Constants;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;

public class TestRegisterPage {
    private static WebDriver driver;
    static ExtentTest extentTest;
    private static RegisterPage registerPage = new RegisterPage();

    public TestRegisterPage() {

        driver = Hooks.driver;
        extentTest = Hooks.extentTest;
    }

    @Given("User enter URL Event")
    public void user_enter_url_event() {
        driver.get(Constants.URL);
        extentTest.log(LogStatus.PASS, "User enter URL Event");
    }
    @When("User Login")
    public void user_login() {
        driver.get(Constants.URL);
        DriverSingleton.delay(1);
        registerPage.registerForm();
//        throw new io.cucumber.java.PendingException();
    }

    @And("user get txt")
    public void user_get_txt(){
        registerPage.getTxtLogin();
    }
   // @Then("user get text login")
    //public void user_get_text_login(){
      //  driver.get(Constants.URL);
        //registerPage.getTxtLogin();
   // }

    @When("user click add cart")
    public void user_click_add_cart(){
        registerPage.addCart();
    }

    @Then("user get txt cart")
    public void user_get_txt_cart(){
        registerPage.getTxtCart();
        DriverSingleton.delay(2);
    }

    @Then("user logout")
    public void user_logout(){
        registerPage.logout();
    }
    @Then("user get txt logout")
    public void user_get_text_logout(){
        registerPage.getTxtLogout();
    }
}