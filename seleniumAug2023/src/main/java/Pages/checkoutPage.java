package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class checkoutPage extends basePage{
	
	public checkoutPage(WebDriver driver) {
		super(driver);
		
	}
	
	@FindBy(id="checkout")
	private WebElement checkout;
	
	public void clickCheckout() {
		checkout.click();
	}

}
