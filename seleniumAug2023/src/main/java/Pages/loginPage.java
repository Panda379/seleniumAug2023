package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class loginPage extends basePage {

	public loginPage(WebDriver driver) {
		super(driver);
	}
	
	// 1. Page Elements 
	// 2. Page Actions
	// 3. private elements to the class or page to specific area
	// 3.b public methods or action avialable everywhere
	
	@FindBy(id="user-name")
	private WebElement Uname;
	
	@FindBy(name="password")
	private WebElement pwd;
	
	@FindBy(name="login-button")
	private WebElement loginBtn;
	
	public void enterUsername(String username) {
		enterText(username, Uname);
	}
	
	public void enterPassword(String password) {
		enterText(password, pwd);
	}
	
	public void clickLogin() {
		Click(loginBtn, 3);
	}
	
	
}
