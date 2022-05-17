package login;

import base.BaseTests;
import org.testng.annotations.Test;
import pages.LoginPage;

import static org.testng.Assert.assertTrue;

public class WrongUsername extends BaseTests {

    @Test
    public  void testWrongUsername(){
        LoginPage loginPage=  homePage.clickFormAuthentication();
        loginPage.setUserName("tomsmiths");
        loginPage.setPassword("SuperSecretPassword!");
        loginPage.clickLoginButton();
        assertTrue(loginPage.getAlertText()
                        .contains("Your username is invalid!"),
                "Alert text is incorrect");
    }
}
