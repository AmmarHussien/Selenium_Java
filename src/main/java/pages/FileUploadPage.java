package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FileUploadPage {
    private WebDriver driver;
    private By inputFileId = By.id("file-upload");
    private By uploadButton = By.id("file-submit");
    private By uploadedFile = By.id("uploaded-files");
    public FileUploadPage(WebDriver driver){
        this.driver = driver;
    }
    public void clickUploadButton(){
        driver.findElement(uploadButton).click();
    }
    /**
     * Provides path of file to the form then clicks upload button
     * @param absolutePathOfFile The complete path of the file to upload
     */
    public void uploadFile (String absolutePathOfFile){
        driver.findElement(inputFileId).sendKeys(absolutePathOfFile);
        clickUploadButton();
    }
    public String getNameOfFile(){
        return driver.findElement(uploadedFile).getText();
    }
}
