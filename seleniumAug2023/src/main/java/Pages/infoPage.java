package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class infoPage extends basePage{
	
	public infoPage(WebDriver driver) {
		super(driver);

	}

	@FindBy(id="first-name")
	private WebElement fName;
	
	@FindBy(name="lastName")
	private WebElement lName;
	
	@FindBy(id="postal-code")
	private WebElement pinCode;
	
	@FindBy(id="continue")
	private WebElement cont;
	
	
	public void enterDetails(String firstName, String lastName, String postalCd) {
		fName.sendKeys(firstName);
		lName.sendKeys(lastName);
		pinCode.sendKeys(postalCd);
		cont.click();
		
	}
	
}
