package TestCases;

import java.io.IOException;
import java.time.Duration;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import Pages.cartPage;
import Pages.completePage;
import Pages.infoPage;
import Pages.loginPage;
import Pages.overviewPage;
import Pages.productsDetailPage;
import Pages.productsPage;
import utils.ReadData;

public class Tests extends baseTest{
	
	
	@Test
	public void shopping() throws IOException {
	
	    SoftAssert sa = new SoftAssert();
		sa.assertEquals(true, false);
		loginPage lp = new loginPage(driver);  //className obj = new className();
	    productsPage pp = new productsPage(driver);
	    productsDetailPage pdp = new productsDetailPage(driver);
	    overviewPage op = new overviewPage(driver);
	    cartPage cp = new cartPage(driver);
	    completePage compPage = new completePage(driver);
	    infoPage ip = new infoPage(driver);
	    lp.enterUsername(new ReadData().getUsername());
	    lp.enterPassword(new ReadData().getPassword());
	    //lp.enterUsername("standard_user");
	    //lp.enterPassword("secret_sauce");
	    lp.clickLogin();
	    pp.clickBackPage();
	    String price = pp.getPrice();
	    System.out.println(price);
	    pdp.clickaddToCart();
	    pdp.clickcart();
	    cp.clickcheckout();
	    ReadData rd = new ReadData();
	   System.out.println(rd.getFirstname() + rd.getLastname()); 
	    ip.enterDetails(new ReadData().getFirstname(), new ReadData().getLastname(), new ReadData().getPincode());
	    //ip.enterDetails("Shiv", "kumar", "3234");
	    op.clickFinish();
	    String s = compPage.getheader();
	    System.out.println(s);
	    Assert.assertEquals(s, "Thank you for your order!");
	    Assert.assertEquals(true, true);
	    
	 
	
	}

}
