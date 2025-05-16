package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest {
    protected WebDriver webDriver;
    @BeforeMethod
    public void setup(){
        webDriver = new ChromeDriver();
        webDriver.manage().window().maximize();
        webDriver.get("https://practicetestautomation.com/practice-test-login/");
    }
    @AfterMethod
    public void tearDown(){
        if (webDriver != null){
//            webDriver.quit();
        }
    }
}
