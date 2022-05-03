package alerts;

import base.baseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class ConfirmAlertsTest extends baseTests {
    @Test
    public void testAcceptAlert(){
       var alertsPage =  homePage.clickJavaScriptAlerts();
       alertsPage.triggerAlert();
       alertsPage.alert_ClickToAccept();
       assertEquals(alertsPage.getResult(),
               "You successfully clicked an alert",
               "Results text incorrect");
    }
}
