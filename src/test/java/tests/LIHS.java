package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.LoginPage;

public class LIHS extends TestBase {
	
	HomePage homeObj = new HomePage(driver);
	LoginPage loginObj = new LoginPage(driver);
	
  @Test
  public void TLI() throws InterruptedException {
	  
	  Assert.assertEquals("rgba(255, 165, 0, 1)",homeObj.homeBTN.getCssValue("color"));
	  
	  homeObj.openLI();
	  Thread.sleep(3000);
	  
		Assert.assertEquals("Login to your account", loginObj.LIMSG.getText());
		
		loginObj.userCanLI("abdelrahmanosama7651111@gmail.com", "12345678");
		Thread.sleep(3000);
		
		Assert.assertEquals("Logout", loginObj.LOBTN.getText());
		
		loginObj.userCanLO();
		Thread.sleep(3000);
	  
  }
  
}
