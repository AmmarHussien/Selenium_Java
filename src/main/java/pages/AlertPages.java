package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AlertPages {
    private WebDriver driver;
    private By triggerAlertButton = By.xpath(".//button[text()='Click for JS Alert']");
    private By triggerConfirmButton = By.xpath(".//button[text()='Click for JS Confirm']");
    private By triggerPromptButton = By.xpath(".//button[text()='Click for JS Prompt']");
    private By results = By.id("result");
    public AlertPages(WebDriver driver){
        this.driver = driver;
    }
    public void triggerAlert(){
        driver.findElement(triggerAlertButton).click();
    }
    public void triggerConfirm(){
        driver.findElement(triggerConfirmButton).click();
    }
    public void triggerPrompt(){
        driver.findElement(triggerPromptButton).click();
    }
    public void alert_ClickToAccept(){
        driver.switchTo().alert().accept();
    }
    public void alert_ClickToDismiss(){
        driver.switchTo().alert().dismiss();
    }
    public String alert_getString(){
        return driver.switchTo().alert().getText();
    }
    public void alert_setInput(String text){
        driver.switchTo().alert().sendKeys(text);
    }

    public String getResult(){
        return driver.findElement(results).getText();
    }
}
