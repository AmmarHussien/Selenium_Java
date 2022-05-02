package dropdown;

import base.baseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class DropDownTests extends baseTests {

    @Test
    public void testSelectedOption(){
        var dropDownPage = homePage.clickDropDown();
        String option = "Option 1";
        dropDownPage.selectFromDropDown(option);
        var selectedOptions = dropDownPage.getSelectedOption();
        assertEquals(selectedOptions.size(),
                1,
                "Incorrect number of selections");
        assertTrue(selectedOptions.contains(option), "Option not selected");
    }
}
