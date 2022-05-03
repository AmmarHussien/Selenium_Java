package login;

import base.baseTests;
import org.testng.annotations.Test;
import pages.LoginPage;

import static org.testng.Assert.assertTrue;

public class WrongUsername extends baseTests {

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
