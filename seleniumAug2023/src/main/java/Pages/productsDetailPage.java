package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class productsDetailPage extends basePage {
	
	public productsDetailPage(WebDriver driver) {
		super(driver);
		
	}

	@FindBy(name="add-to-cart-sauce-labs-backpack")
	private WebElement addToCart;
	
	public void clickaddToCart() {
		Click(addToCart, 3);
	}
	
	@FindBy(className="shopping_cart_badge")
	private WebElement cart;
	
	public void clickcart() {
		cart.click();
	}
	
	
}
