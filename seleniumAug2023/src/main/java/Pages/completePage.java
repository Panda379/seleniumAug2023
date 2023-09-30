package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class completePage extends basePage{
	
	public completePage(WebDriver driver) {
		super(driver);
	}
	
	
	@FindBy(className="complete-header")
	private WebElement header;
	
	@FindBy(id="back-to-products")
	private WebElement backtohome;
	
	public String getheader() {
		return header.getText();
	}
	
	public void clickbackhome() {
		backtohome.click();
	}

	
	
}
