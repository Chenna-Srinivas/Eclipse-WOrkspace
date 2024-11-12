package DemoWebShop;


import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TC02 extends Base {

	@Test (groups = "All")
public void ComputingAndInternet () throws InterruptedException {
	boolean Books_isE = driver.findElement(By.xpath("(//ul[@class='top-menu']/child::li/child::a)[1]")).isEnabled();
	Assert.assertTrue(Books_isE, "Books WebElement is Not Enabled");
		
	String Bookspage_URL = "https://demowebshop.tricentis.com/books";
//	Verifying navigate to books page or not ..
	driver.findElement(By.xpath("(//ul[@class='top-menu']/child::li/child::a)[1]")).click();
	String f_url = driver.getCurrentUrl();
	Assert.assertEquals(f_url, Bookspage_URL,"Not navigated to the books page");
//	Click on product 1
	//driver.findElement(By.xpath("(//a[text()='Computing and Internet'])[2]/parent::h2")).click();
	driver.findElement(By.xpath("(//h2[@class=\"product-title\"])/child::a[1]")).click();
	String pname = "Computing and Internet";
	String f_pname = driver.findElement(By.xpath("//h1[contains(text(),'Computing')]")).getText();
	Assert.assertEquals(pname, f_pname,"Different product is displayed..");
//	Verifying rating is displayed or not .
	boolean p_rating = driver.findElement(By.xpath("(//div[@class=\"rating\"])[1]")).isDisplayed();
	Assert.assertTrue(p_rating, "Rating of the product is not displayed");
//	Verifying price of the product is displayed or not
	boolean p_price = driver.findElement(By.xpath("(//span[contains(text(),'10.00')])[2]")).isDisplayed();
	Assert.assertTrue(p_price, "Price of the product is not displayed");
//	Verify add to cart button is displayed and enabled or not
	boolean ATC_isD = driver.findElement(By.xpath("//input[@class='button-1 add-to-cart-button']")).isDisplayed();
	Assert.assertTrue(ATC_isD, "Add To Cart button is not displayed");
	boolean ATC_isE = driver.findElement(By.xpath("//input[@class='button-1 add-to-cart-button']")).isEnabled();
	Assert.assertTrue(ATC_isE, "Add To Cart button is not Enabled");
// Get the shopping cart quantity to comapre after adding the product
	String Qty_before = driver.findElement(By.xpath("//span[@class=\"cart-qty\"]")).getText();
	System.out.println(Qty_before);
	//	Click on add to cart button
	driver.findElement(By.xpath("//input[@class='button-1 add-to-cart-button']")).click();
// 	Verify product is added or not 
	Thread.sleep(4000);
	String Qty_after = driver.findElement(By.xpath("//span[@class=\"cart-qty\"]")).getText();
	System.out.println(Qty_after);
	}

@Test (groups = "All")
	public void Fiction () {
	driver.findElement(By.xpath("(//ul[@class='top-menu']/child::li/child::a)[1]")).click();
	
	for (int i = 1; i <= 6;i++) {
	driver.findElement(By.xpath("(//h2[@class='product-title']/child::a[1])["+i+"]")).click();
//	Verifying rating is displayed or not ..
	boolean p_rating = driver.findElement(By.xpath("(//div[@class='rating'])[1]")).isDisplayed();
	Assert.assertTrue(p_rating, "Rating of the product is not displayed");

try {
//	Verifying price of the product is displayed or not
	boolean p_price = driver.findElement(By.xpath("//span[@itemprop='price']")).isDisplayed();
	Assert.assertTrue(p_price, "Price of the product is not displayed");
//	Verify add to cart button is displayed and enabled or not
	boolean ATC_isD = driver.findElement(By.xpath("//input[@class='button-1 add-to-cart-button']")).isDisplayed();
	if (ATC_isD == true) {
		boolean ATC_isE = driver.findElement(By.xpath("//input[@class='button-1 add-to-cart-button']")).isEnabled();
		if (ATC_isE == true) {
				driver.findElement(By.xpath("//input[@class='button-1 add-to-cart-button']")).click();
			}
	}
} catch (Exception e) {
	System.out.println("Product no: " +i+" cannot be purchased");
	
}
	
	driver.findElement(By.xpath("(//ul[@class='top-menu']/child::li/child::a)[1]")).click();
	}
}


}
