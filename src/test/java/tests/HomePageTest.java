package tests;

import base.BaseTest;
import org.testng.annotations.Test;
import pages.HomePage;

public class HomePageTest extends BaseTest {


    @Test(priority = 6)
    public void HomePageTest()  {
        HomePage hpt = new HomePage(driver);
        hpt.tournamentPage();

    }


}
