package pages;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
    private WebDriver webDriver;
    private By usernameTextBox = By.id("username");
    private By passwordTextBox = By.id("password");
    private By loginBtn = By.xpath("//*[@id=\"submit\"]");

    public LoginPage(WebDriver webDriver){
        this.webDriver = webDriver;

    }
    public void enterUsername(String username){
        webDriver.findElement(usernameTextBox).sendKeys(username);
    }
    public void enterPassword(String password){
        webDriver.findElement(passwordTextBox).sendKeys(password);
    }
    public void clickLogin(){
        webDriver.findElement(loginBtn).click();
    }
}
