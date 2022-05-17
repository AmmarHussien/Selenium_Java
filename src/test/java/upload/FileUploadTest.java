package upload;

import base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class FileUploadTest extends BaseTests {
    @Test
    public void testFileUpload(){
        var uploadPage = homePage.clickFileUpload();
        uploadPage.uploadFile("D:\\Testing\\first_java\\resources\\chromedriver.exe");
        assertEquals(uploadPage.getNameOfFile(),
                "chromedriver.exe",
                "Uploaded incorrect");

    }
}

