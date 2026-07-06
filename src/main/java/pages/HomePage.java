package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends PageBase {
	
	public HomePage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(linkText = "Signup / Login")
	WebElement SLBTN; 
	
	@FindBy(xpath = "//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[2]/a")
	WebElement productsBTN;
	
	@FindBy(linkText = "Home")
	public WebElement homeBTN;
	
	public void openSU() {
		SLBTN.click();
	}
	
	public void openLI() {
		SLBTN.click();
	}
	
	public void openPP() {
		productsBTN.click();
	}

}
