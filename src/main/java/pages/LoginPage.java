package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends PageBase {

	public LoginPage(WebDriver driver) {
		super(driver);
	}

	@FindBy(name="email")
	WebElement emailinput;
	
	@FindBy(name="password")
	WebElement passwordinput;
	
	@FindBy(xpath="//*[@id=\"form\"]/div/div/div[1]/div/form/button")
	WebElement LIBTN;
	
	@FindBy(xpath="//*[@id=\"form\"]/div/div/div[1]/div/h2")
	public WebElement LIMSG;
	
	@FindBy(linkText="Logout")
	public WebElement LOBTN;
	
	public void userCanLI(String email, String password) {
		emailinput.sendKeys(email);
		passwordinput.sendKeys(password);
		LIBTN.click();
	}
	
	public void userCanLO() {
		LOBTN.click();
	}
	
}
