package login;

import base.baseTests;
import org.testng.annotations.Test;
import pages.LoginPage;

import static org.testng.Assert.assertTrue;

public class testWrongPassword extends baseTests {

    @Test
    public  void testWrongPassword(){
        LoginPage loginPage=  homePage.clickFormAuthentication();
        loginPage.setUserName("tomsmith");
        loginPage.setPassword("SuperSecretPassword!5");
        loginPage.clickLoginButton();
        assertTrue(loginPage.getAlertText()
                        .contains("Your password is invalid!"),
                "Alert text is incorrect");
    }
}
