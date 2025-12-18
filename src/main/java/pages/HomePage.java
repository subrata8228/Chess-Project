package pages;

import base.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class HomePage extends BaseTest {

    private WebDriver driver;

    public HomePage(WebDriver driver) {
        this.driver = driver;

    }

    public void tournamentPage() {

        WebDriverWait wait= new WebDriverWait(driver,Duration.ofSeconds(10));
        WebElement tournament =wait.until(ExpectedConditions.elementToBeClickable(
                By.xpath("(//div[@class='h-48 overflow-hidden'])[1]")
        ));
        tournament.click();

        System.out.println("Tournament page clicked");

    }
}
