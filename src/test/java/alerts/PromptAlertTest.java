package alerts;

import base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class PromptAlertTest extends BaseTests {
    @Test
    public void PromptAlertTest(){
        var alertsPage = homePage.clickJavaScriptAlerts();
        alertsPage.triggerPrompt();
        String text = "Ammar Hussein";
        alertsPage.alert_setInput(text);
        alertsPage.alert_ClickToAccept();
        assertEquals(alertsPage.getResult(),
                "You entered: "+text,
                "Input incorrect");
    }
}
