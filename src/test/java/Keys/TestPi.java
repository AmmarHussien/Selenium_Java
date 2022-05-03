package Keys;

import base.baseTests;
import org.testng.annotations.Test;

public class TestPi extends baseTests {
    @Test
    public void testPi(){
        var KeyPage = homePage.clickKeyPresses();
        KeyPage.enterPi();
    }
}
