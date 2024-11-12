package DemoWebShop;


import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TC01 extends Base {

	@Test (groups = "All")
public void HomePageComponents () {

//	Verifying whether navigated to the DemoWebShop URL or not
	String fetched_url = driver.getCurrentUrl();
	Assert.assertEquals(url, fetched_url);
	Reporter.log("Navigated To DemoWebShop Page",true);

//	Verifying whether user has successfully logged in or not
	String f_Email = driver.findElement(By.xpath("(//a[@class='account'])[1]")).getText();
	Assert.assertEquals(f_Email, EmailID);
	boolean Logout_b = driver.findElement(By.xpath("//div[@class='header-links']/child::ul/child::li[2]/child::a")).isDisplayed();
	Assert.assertTrue(Logout_b,"User is not logged in properly..");
	Reporter.log("User Logged In Successfully..!",true);

//	Verifying Book Module is Displayed and Enabled or not
	boolean Books_isD = driver.findElement(By.xpath("(//ul[@class='top-menu']/child::li/child::a)[1]")).isDisplayed();
	Assert.assertTrue(Books_isD, "Books WebElement is Not Displayed");
	boolean Books_isE = driver.findElement(By.xpath("(//ul[@class='top-menu']/child::li/child::a)[1]")).isEnabled();
	Assert.assertTrue(Books_isE, "Books WebElement is Not Enabled");
	Reporter.log("Books WebElement is Displayed and Enabled",true);

//	Verifying Computers Module is Displayed and Enabled or not
	boolean Computers_isD = driver.findElement(By.xpath("(//ul[@class='top-menu']/child::li/child::a)[2]")).isDisplayed();
	Assert.assertTrue(Computers_isD, "Computers WebElement is Not Displayed");
	boolean Computers_isE = driver.findElement(By.xpath("(//ul[@class='top-menu']/child::li/child::a)[2]")).isEnabled();
	Assert.assertTrue(Computers_isE, "Computers WebElement is Not Enabled");
	Reporter.log("Computers WebElement is Displayed and Enabled",true);

//	Verifying Electronics Module is Displayed and Enabled or not 
	boolean Electronics_isD = driver.findElement(By.xpath("(//ul[@class='top-menu']/child::li/child::a)[3]")).isDisplayed();
	Assert.assertTrue(Electronics_isD, "Electronics WebElement is Not Displayed");
	boolean Electronics_isE = driver.findElement(By.xpath("(//ul[@class='top-menu']/child::li/child::a)[3]")).isEnabled();
	Assert.assertTrue(Electronics_isE, "Electronics WebElement is Not Enabled");
	Reporter.log("Electronics WebElement is Displayed and Enabled",true);

//	Verifying Apparel & Shoes Module is Displayed and Enabled or not
	boolean AS_isD = driver.findElement(By.xpath("(//ul[@class='top-menu']/child::li/child::a)[4]")).isDisplayed();
	Assert.assertTrue(AS_isD, "ApparelAndShoes WebElement is Not Displayed");
	boolean AS_isE = driver.findElement(By.xpath("(//ul[@class='top-menu']/child::li/child::a)[4]")).isEnabled();
	Assert.assertTrue(AS_isE, "ApparelAndShoes WebElement is Not Enabled");
	Reporter.log("ApparelAndShoes WebElement is Displayed and Enabled",true);

//	Verifying Digital Downloads Module is Displayed and Enabled or not
	boolean DD_isD = driver.findElement(By.xpath("(//ul[@class='top-menu']/child::li/child::a)[5]")).isDisplayed();
	Assert.assertTrue(DD_isD, "DigitalDownloads WebElement is Not Displayed");
	boolean DD_isE = driver.findElement(By.xpath("(//ul[@class='top-menu']/child::li/child::a)[5]")).isEnabled();
	Assert.assertTrue(DD_isE, "DigitalDownloads WebElement is Not Enabled");
	Reporter.log("DigitalDownloads WebElement is Displayed and Enabled",true);

//	Verifying Jewelry Module is Displayed and Enabled or not
	boolean Jewelry_isD = driver.findElement(By.xpath("(//ul[@class='top-menu']/child::li/child::a)[6]")).isDisplayed();
	Assert.assertTrue(Jewelry_isD, "Jewelry WebElement is Not Displayed");
	boolean Jewelry_isE = driver.findElement(By.xpath("(//ul[@class='top-menu']/child::li/child::a)[6]")).isEnabled();
	Assert.assertTrue(Jewelry_isE, "Jewelry WebElement is Not Enabled");
	Reporter.log("Jewelry WebElement is Displayed and Enabled",true);

//	Verifying Gift Card Module is Displayed and Enabled or not
	boolean GC_isD = driver.findElement(By.xpath("(//ul[@class='top-menu']/child::li/child::a)[7]")).isDisplayed();
	Assert.assertTrue(GC_isD, "GiftCards WebElement is Not Displayed");
	boolean GC_isE = driver.findElement(By.xpath("(//ul[@class='top-menu']/child::li/child::a)[7]")).isEnabled();
	Assert.assertTrue(GC_isE, "GiftCards WebElement is Not Enabled");
	Reporter.log("GiftCards WebElement is Displayed and Enabled",true);

//	Verifying EMail-Header Link Module is Displayed and Enabled or not
	boolean Email_isD = driver.findElement(By.xpath("(//a[@class='account'])[1]")).isDisplayed();
	Assert.assertTrue(Email_isD,"User's Email - Header Link is Not Displayed");
	boolean Email_isE = driver.findElement(By.xpath("(//a[@class='account'])[1]")).isEnabled();
	Assert.assertTrue(Email_isE,"MailID header link is Not Enabled");
	Reporter.log("User's Email - Header Link is Displayed and Enabled",true);

//	Verifying Logout-Header Link Module is Displayed and Enabled or not 
	boolean Logout_isD = driver.findElement(By.xpath("(//a[@class=\"ico-logout\"])")).isDisplayed();
	Assert.assertTrue(Logout_isD,"Logout - Header Link is Not Displayed");
	boolean Logout_isE = driver.findElement(By.xpath("(//a[@class=\"ico-logout\"])")).isEnabled();
	Assert.assertTrue(Logout_isE,"Logout - Header Link is Not Enabled");
	Reporter.log("Logout - Header Link is Displayed and Enabled",true);

//	Verifying ShoppingCart-Header Link Module is Displayed and Enabled or not
	boolean SC_isD = driver.findElement(By.xpath("(//a[@class=\"ico-cart\"])[1]")).isDisplayed();
	Assert.assertTrue(SC_isD, "Shopping Cart - Header Link is Not Displayed");
	boolean SC_isE = driver.findElement(By.xpath("(//a[@class=\"ico-cart\"])[1]")).isEnabled();
	Assert.assertTrue(SC_isE, "Shopping Cart - Header Link is Not Enabled");
	Reporter.log("Shopping Cart - Header Link is Displayed and Enabled",true);

//	Verifying WishList-Header Link Module is Displayed and Enabled or not 
	boolean Wishlist_isD = driver.findElement(By.xpath("(//a[@class=\"ico-wishlist\"])[1]")).isDisplayed();
	Assert.assertTrue(Wishlist_isD, "Shopping Cart - Header Link is Not Displayed");
	boolean Wishlist_isE = driver.findElement(By.xpath("(//a[@class=\"ico-wishlist\"])[1]")).isEnabled();
	Assert.assertTrue(Wishlist_isE, "Shopping Cart - Header Link is Not Enabled");
	Reporter.log("WishList - Header Link is Displayed and Enabled",true);

	}
}