package upload;

import base.baseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class FileUploadTest extends baseTests {
    @Test
    public void testFileUpload(){
        var uploadPage = homePage.clickFileUpload();
        uploadPage.uploadFile("D:\\Testing\\first_java\\resources\\chromedriver.exe");
        assertEquals(uploadPage.getNameOfFile(),
                "chromedriver.exe",
                "Uploaded incorrect");

    }
}

