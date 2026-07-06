package tests;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.LoginPage;

public class LIHS extends TestBase {
	
	HomePage homeObj;
    LoginPage loginObj;
    
    @BeforeClass
    public void setupPages() {
        homeObj = new HomePage(driver);
        loginObj = new LoginPage(driver); 
    }
	
  @Test
  public void TLI() throws InterruptedException {
	  
	  Assert.assertEquals("rgb(255, 165, 0)",homeObj.homeBTN.getCssValue("color"));
	  
	  homeObj.openLI();
	  Thread.sleep(3000);
	  
		Assert.assertEquals("Login to your account", loginObj.LIMSG.getText());
		
		loginObj.userCanLI("abdoabdotoki@gmail.com", "123456");
		Thread.sleep(3000);
		
		Assert.assertEquals("Logout", loginObj.LOBTN.getText());
		
		loginObj.userCanLO();
		Thread.sleep(3000);
	  
  }
  
}
