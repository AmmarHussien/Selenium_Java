package login;

import base.baseTests;
import org.testng.annotations.Test;
import pages.LoginPage;
import pages.SecureAreaPage;

import static org.testng.Assert.*;

public class SuccessfulLogin extends baseTests {

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
}
