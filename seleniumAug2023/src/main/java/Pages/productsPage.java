package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class productsPage extends basePage {
	
	public productsPage(WebDriver driver) {
		super(driver);
	}

	// 1. page elements 2. page actions
	
	@FindBy(id="item_4_title_link")
	private WebElement backPack;
	
	@FindBy(xpath="//div[text()='29.99']")
	WebElement backPackPrice;
	
	@FindBy(id="add-to-cart-sauce-labs-backpack")
	private WebElement addtoCart;
	
	public void clickBackPage() {
		Click(backPack, 2);
	}
	
	public void clickAddToCart() {
		Click(addtoCart, 3);
	}

	public String getPrice() {
		return getVisibleText(backPackPrice);
	}
	
}
