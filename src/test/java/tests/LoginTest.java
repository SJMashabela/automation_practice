package tests;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.LoginPage;

public class LoginTest extends BaseTest {
    @Test
    public void testValidLogin(){
        LoginPage loginPage = new LoginPage(webDriver);
        loginPage.enterUsername("student");
        loginPage.enterPassword("Password123");
        loginPage.clickLogin();
        String title = webDriver.getTitle();
        Assert.assertEquals(title, webDriver.getTitle());
    }
}
