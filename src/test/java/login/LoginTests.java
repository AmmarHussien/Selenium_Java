package login;

import base.baseTests;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;
import pages.LoginPage;
import pages.SecureAreaPage;

import static org.testng.Assert.*;

public class LoginTests extends baseTests {

    @Test
    public  void testSuccessfulLogin(){
      LoginPage loginPage=  homePage.clickFormAuthentication();
      loginPage.setUserName("tomsmith");
      loginPage.setPassword("SuperSecretPassword!");
      SecureAreaPage secureAreaPage =  loginPage.clickLoginButton();
      assertTrue(secureAreaPage.getAlertText()
              .contains("You logged into a secure area!"),
              "Alert text is incorrect");
    }
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

    @Test
    public  void testWrongUsernamePassword(){
        LoginPage loginPage=  homePage.clickFormAuthentication();
        loginPage.setUserName("tomsmith");
        loginPage.setPassword("SuperSecretPassword!5");
        loginPage.clickLoginButton();
        assertTrue(loginPage.getAlertText()
                 .contains("Your password is invalid!"),
                "Alert text is incorrect");
    }
}
