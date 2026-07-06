package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.HomePage;
import pages.RegisterPage;

public class RHS extends TestBase {
	
	HomePage homeObj = new HomePage(driver);
	RegisterPage registerObj = new RegisterPage(driver);
	
  @Test
  public void TR() throws InterruptedException {
	  
	  Assert.assertEquals("rgba(255, 165, 0, 1)",homeObj.homeBTN.getCssValue("color"));
	  
	  homeObj.openSU();
	  Thread.sleep(3000);
	  
	  Assert.assertEquals("New User Signup!", registerObj.NUMSG.getText());
	  registerObj.userCanRegister("Abdelrahman Osama","abdelrahmanosama76899@gmail.com");
	  Thread.sleep(3000);
	  
	  Assert.assertTrue(registerObj.EAMSG.getText().equalsIgnoreCase("Enter Account Information"));
	  
	  registerObj.enterACCInfo("123456789",25,"November","2003","Abdelrahman","Osama","Itworx","Fostat","Elsayeda zeinab","India","aaaaaa","bbbbb","17652","01013468789");
	  Thread.sleep(3000);
  	  Assert.assertEquals("ACCOUNT CREATED!", registerObj.successMSG.getText());
  	  
  	  registerObj.continueACC();
	  Thread.sleep(3000);
	  
	  Assert.assertTrue(registerObj.LedILink.getText().contains("Logged in as"));
  	  registerObj.deleteACC();
  	  
  	  Assert.assertEquals("ACCOUNT DELETED!", registerObj.deleteSucess.getText());
  	  Thread.sleep(3000);
  	  
  	  registerObj.continueACC();
  	  Thread.sleep(3000);
  	  Assert.assertEquals("rgba(255, 165, 0, 1)", homeObj.homeBTN.getCssValue("color"));
  	  
  }
  
  
}
