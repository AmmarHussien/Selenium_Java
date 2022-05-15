package wait;

import base.baseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class WaitTests  extends baseTests {
    @Test
    public void testWaitUntilHidden(){
        var loadingPage =
                homePage.clickDynamicLoading()
                        .clickExample1();
        loadingPage.clickStart();
        assertEquals(loadingPage.getLoadedText(),
                "Hello World!",
                "Loaded Text Incorrect");
    }
}
