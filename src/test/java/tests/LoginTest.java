package tests;

import base.BaseTest;
import org.testng.annotations.Test;
import pages.LoginPage;
import utils.ConfigReader;;

public class LoginTest extends BaseTest {

    @Test (priority = 1)
    public void enterNumber(){
        LoginPage loginPage = new LoginPage(driver);
        loginPage.enterNumber(ConfigReader.get("phone"));

    }
    @Test (priority = 2)
    public void clickOnButton(){
        LoginPage loginPage = new LoginPage(driver);
        loginPage.clickOnSendOtp();
    }
   @Test (priority = 3)
   public void checkOtp(){
        LoginPage loginPage = new LoginPage(driver);
        loginPage.readOtp();
   }
    @Test (priority = 4)
    public void etrOtp(){
        LoginPage loginPage = new LoginPage(driver);
        loginPage.enterOtp();
   }
   @Test (priority = 5)
   public void clickonLogin(){
        LoginPage loginPage = new LoginPage(driver);
        loginPage.clickOnLoginButton();
   }


}
