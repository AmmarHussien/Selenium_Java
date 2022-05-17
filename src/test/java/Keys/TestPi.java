package Keys;

import base.BaseTests;
import org.testng.annotations.Test;

public class TestPi extends BaseTests {
    @Test
    public void testPi(){
        var KeyPage = homePage.clickKeyPresses();
        KeyPage.enterPi();
    }
}
