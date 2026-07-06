package tests;

import org.testng.annotations.BeforeTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.testng.annotations.AfterTest;

public class TestBase {
  public static WebDriver driver; 
  String baseUrl = "https://automationexercise.com/";

  @BeforeTest
  public void openBrowser() {

    FirefoxOptions options = new FirefoxOptions();
    driver = new FirefoxDriver(options);
    
    driver.manage().window().maximize();
    driver.navigate().to(baseUrl);
  }
  
  @AfterTest
  public void closeBrowser() {
    if (driver != null) {
      driver.quit();
    }
  }
}