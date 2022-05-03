package alerts;

import base.baseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class DismissAlertTest extends baseTests {
    @Test
    public void testDismissAlert(){
        var alertsPage =  homePage.clickJavaScriptAlerts();
        alertsPage.triggerConfirm();
        String text = alertsPage.alert_getString();
        alertsPage.alert_ClickToDismiss();
        assertEquals(text,
                "I am a JS Confirm",
                "Alert Text incorrect");
    }
}
