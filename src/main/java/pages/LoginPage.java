package pages;

import base.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;

public class LoginPage extends BaseTest {


    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    public void enterNumber(String phone) {
        WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(10));

        WebElement login =wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='login_mobile']")));
        login.clear();
        login.sendKeys(phone);
    }

    public void clickOnSendOtp(){
        WebElement sendOtp =driver.findElement(By.xpath("//span[text()='Send OTP']"));
        sendOtp.click();
    }

    public String readOtp() {

        WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement getotp= wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@role='status']")));
        String s=getotp.getText();// OTP sent to your mobile for login. 898774
        String res= s.substring(35,41);
        return res;
    }

    public void enterOtp(){

        WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement enterOtp =driver.findElement(By.xpath("//input[@id='login_otp']"));
        enterOtp.sendKeys(readOtp());
    }

    public void clickOnLoginButton(){
        WebDriverWait wait= new WebDriverWait(driver,Duration.ofSeconds(10));
        WebElement loginButton= wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@type='submit']")));
        loginButton.click();
    }
}
