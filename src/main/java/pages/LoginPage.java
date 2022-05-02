package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

    private WebDriver driver;

    private By userNameField = By.id("username");
    private By passwordField = By.id("password");
    private By loginButton = By.cssSelector("#login button");
    private By statuesAlert = By.id("flash");

    public LoginPage(WebDriver driver){
        this.driver = driver;
    }

    public void setUserName( String userName) {
        driver.findElement(userNameField).sendKeys(userName);
    }

    public void setPassword( String password) {
       driver.findElement(passwordField).sendKeys(password);
    }

    public SecureAreaPage clickLoginButton() {
        driver.findElement(loginButton).click();
        return new SecureAreaPage(driver);
    }

    public String getAlertText(){
        return driver.findElement(statuesAlert).getText();
    }
}
