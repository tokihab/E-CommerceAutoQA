package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class RegisterPage extends PageBase {
	
	public RegisterPage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(name = "name")
	WebElement nameInput;
	
	@FindBy(name = "email")
	List<WebElement> emailInput;
	
	@FindBy(xpath = "//*[@id=\"form\"]/div/div/div[3]/div/form/button")
	WebElement SUBTN;
	
	@FindBy(id="id_gender1")
	WebElement MaleRBTN;
	
	@FindBy(id="password")
	WebElement PWInput;
	
	@FindBy(id="days")
	WebElement daysList;
	
	@FindBy(id="months")
	WebElement monthsList;
	
	@FindBy(id="years")
	WebElement yearsList;
	
	@FindBy(id="newsletter")
	WebElement NLCB;
	
	@FindBy(id="optin")
	WebElement SOCB;
	
	@FindBy(id="first_name")
	WebElement FNInput;
	
	@FindBy(id="last_name")
	WebElement LNInput;
	
	@FindBy(id="company")
	WebElement companyInput;
	
	@FindBy(id="address1")
	WebElement address1Input;
	
	@FindBy(id="address2")
	WebElement address2Input;
	
	@FindBy(id="country")
	WebElement countryList;
	
	@FindBy(id="state")
	WebElement stateInput;
	
	@FindBy(id="city")
	WebElement cityInput;
	
	@FindBy(id="zipcode")
	WebElement ZIPInput;
	
	@FindBy(id="mobile_number")
	WebElement mobileInput;
	
	@FindBy(css="#form > div > div > div > div.login-form > form > button")
	WebElement CABTN;
	
	@FindBy(css="#form > div > div > div:nth-child(3) > div > h2")
	public WebElement NUMSG;
	
	@FindBy(xpath="//*[@id=\"form\"]/div/div/div/div[1]/h2/b")
	public WebElement EAMSG;
	
	@FindBy(css="#form > div > div > div > h2 > b")
	public WebElement successMSG;
	
	@FindBy(linkText = "Continue")
	WebElement continueBTN;
	
	@FindBy(tagName = "li")
	List<WebElement> NVBLinks;
	
	@FindBy(partialLinkText = "Logged in")
	public WebElement LedILink;
	
	@FindBy(xpath="//*[@id=\"form\"]/div/div/div/h2/b")
	public WebElement deleteSucess;
	
	@FindBy(css="#form > div > div > div:nth-child(3) > div > form > p")
	public WebElement failedMSG;
	
	public void userCanRegister(String name , String email) {
		nameInput.sendKeys(name);
		emailInput.get(1).sendKeys(email);
		SUBTN.click();
		
	}
	
	public void enterACCInfo(String password,int day,String month,
			String year,String firstName,String lastName,
			String company,String address1,String address2,
			String country,String state,String city,String zipCode,
			String mobileNumber) throws InterruptedException {
		
		MaleRBTN.click();
		PWInput.sendKeys(password);
		
		JavascriptExecutor scrolldown = (JavascriptExecutor) driver;
	  	scrolldown.executeScript("document.evaluate('//*[@id=\"password\"]', document, null, XPathResult.FIRST_ORDERED_NODE_TYPE, null).singleNodeValue.scrollIntoView();\n"
	  			+ "");
		
		Select makeDaysList = new Select(daysList);
		Select makeMonthsList = new Select(monthsList);
		Select makeYearsList = new Select(yearsList);
		Select makeCountryList = new Select(countryList);
		
		makeDaysList.selectByVisibleText(String.valueOf(day));
		makeMonthsList.selectByVisibleText(String.valueOf(month));
		makeYearsList.selectByVisibleText(String.valueOf(year));
		makeCountryList.selectByVisibleText(country);
		
		NLCB.click();
		SOCB.click();
		
		FNInput.sendKeys(firstName);
		LNInput.sendKeys(lastName);
		companyInput.sendKeys(company);
		
		address1Input.sendKeys(address1);
		
		address1Input.sendKeys(address1);
	  	scrolldown.executeScript("document.evaluate('//*[@id=\"address1\"]', document, null, XPathResult.FIRST_ORDERED_NODE_TYPE, null).singleNodeValue.scrollIntoView();\n"
	  			+ "");
		
		address2Input.sendKeys(address2);
		
		stateInput.sendKeys(state);
		cityInput.sendKeys(city);
		ZIPInput.sendKeys(zipCode);
		
		mobileInput.sendKeys(mobileNumber);
		
		
		
		CABTN.click();
		
	}
	
	public void continueACC(){
		continueBTN.click();
	}
	
	public void deleteACC() {
		NVBLinks.get(4).click();
	}
	
}
