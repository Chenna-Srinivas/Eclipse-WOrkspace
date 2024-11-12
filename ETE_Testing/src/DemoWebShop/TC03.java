package DemoWebShop;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TC03 extends Base {
@Test (groups = "Smoke")
public void TestCase01  () {	
	driver.findElement(By.xpath("(//ul[@class='top-menu']/child::li/child::a)[2]")).click();
		for (int i = 1; i <= 3; i++) {
			if (i==1) {
				driver.findElement(By.xpath("(//h2[@class='title'])["+i+"]")).click();
				List<WebElement> p_countDesktop = driver.findElements(By.xpath("//h2[@class='product-title']"));

				for (int j = 1 ; j <= p_countDesktop.size(); j++) {
					driver.findElement(By.xpath("(//h2[@class='product-title']/child::a)["+j+"]")).click();
//					Verifying rating is displayed or not ..					
					boolean p_rating = driver.findElement(By.xpath("(//div[@class='rating'])[1]")).isDisplayed();
					Assert.assertTrue(p_rating, "Rating of the product is not displayed");
					
//					Verifying price of the product is displayed or not
					boolean p_price = driver.findElement(By.xpath("//span[@itemprop='price']")).isDisplayed();
					Assert.assertTrue(p_price, "Price of the product is not displayed");

					try {
//					Verify if processor option is visible or not
						boolean processor_isD = driver.findElement(By.xpath("//label[contains(text(),'Processor')]")).isDisplayed();
						
						if (processor_isD) {
						Thread.sleep(1000);
							driver.findElement(By.xpath("((//ul[@class='option-list'])[1]/child::li/child::label)[1]")).click();
						}
						
//					Verify if Ram option is displayed or not 
						boolean Ram_isD = driver.findElement(By.xpath("//label[contains(text(),'RAM')]")).isDisplayed();
						if (Ram_isD) {
							Thread.sleep(1000);
							driver.findElement(By.xpath("((//ul[@class='option-list'])[2]/child::li/child::label)[1]")).click();
						}

//					Verify  if HDD option is displayed or not
						boolean HDD_isD = driver.findElement(By.xpath("//label[contains(text(),'HDD')]")).isDisplayed();
						if (HDD_isD) {
							driver.findElement(By.xpath("(//label[contains(text(),'HDD')]/parent::dt/following-sibling::dd[1]/child::ul/child::li/child::input)[1]")).click();
						}
						
//						Verify add to cart button is displayed and enabled or not
						boolean ATC_isD = driver.findElement(By.xpath("//input[@class='button-1 add-to-cart-button']")).isDisplayed();
						if (ATC_isD == true) {
							Thread.sleep(1000);
							boolean ATC_isE = driver.findElement(By.xpath("//input[@class='button-1 add-to-cart-button']")).isEnabled();
							if (ATC_isE == true) {	
								Thread.sleep(1000);
								driver.findElement(By.xpath("//input[@class='button-1 add-to-cart-button']")).click();
								}
						}
					} catch (Exception e) {
						System.out.println("Product no: " +j+" cannot be purchased");
					}
					driver.findElement(By.xpath("(//ul[@class='top-menu']/child::li/child::a)[2]")).click();
					driver.findElement(By.xpath("(//h2[@class='title'])["+i+"]")).click();
				}
			}
			driver.findElement(By.xpath("(//ul[@class='top-menu']/child::li/child::a)[2]")).click();
			if (i==2) {
				driver.findElement(By.xpath("(//h2[@class='title'])["+i+"]")).click();
				List<WebElement> p_countNotebooks = driver.findElements(By.xpath("//h2[@class='product-title']"));
				
			for (int j = 1; j <= p_countNotebooks.size() ; j++) {
				driver.findElement(By.xpath("(//h2[@class='product-title']/child::a)["+j+"]")).click();
//				Verifying rating is displayed or not ..					
				boolean p_rating = driver.findElement(By.xpath("(//div[@class='rating'])[1]")).isDisplayed();
				Assert.assertTrue(p_rating, "Rating of the product is not displayed");
	
//				Verifying price of the product is displayed or not
				boolean p_price = driver.findElement(By.xpath("//span[@itemprop='price']")).isDisplayed();
				Assert.assertTrue(p_price, "Price of the product is not displayed");			
			
			try {
//				Verify add to cart button is displayed and enabled or not
				boolean ATC_isD = driver.findElement(By.xpath("//input[@class='button-1 add-to-cart-button']")).isDisplayed();
				if (ATC_isD == true) {
					Thread.sleep(1000);
					boolean ATC_isE = driver.findElement(By.xpath("//input[@class='button-1 add-to-cart-button']")).isEnabled();
					if (ATC_isE == true) {	
						Thread.sleep(1000);
						driver.findElement(By.xpath("//input[@class='button-1 add-to-cart-button']")).click();
						}
				}
				
			} catch (Exception e) {
				System.out.println("Product no: " +j+" cannot be purchased");
			}
			driver.findElement(By.xpath("(//ul[@class='top-menu']/child::li/child::a)[2]")).click();
			driver.findElement(By.xpath("(//h2[@class='title'])["+i+"]")).click();
			}
			}
			driver.findElement(By.xpath("(//ul[@class='top-menu']/child::li/child::a)[2]")).click();
		if (i ==3) {
			driver.findElement(By.xpath("(//h2[@class='title'])["+i+"]")).click();
			List<WebElement> P_countAccessories = driver.findElements(By.xpath("//h2[@class='product-title']"));
			for (int j = 1; j <= P_countAccessories.size(); j++) {
				
				if(j!=1) {
				driver.findElement(By.xpath("(//h2[@class='product-title']/child::a)["+j+"]")).click();
//				Verifying rating is displayed or not ..					
				boolean p_rating = driver.findElement(By.xpath("(//div[@class='rating'])[1]")).isDisplayed();
				Assert.assertTrue(p_rating, "Rating of the product is not displayed");
	
//				Verifying price of the product is displayed or not
				boolean p_price = driver.findElement(By.xpath("//span[@itemprop='price']")).isDisplayed();
				Assert.assertTrue(p_price, "Price of the product is not displayed");			
	
				try {
//					Verify add to cart button is displayed and enabled or not
					boolean ATC_isD = driver.findElement(By.xpath("//input[@class='button-1 add-to-cart-button']")).isDisplayed();
					if (ATC_isD == true) {
						Thread.sleep(1000);
						boolean ATC_isE = driver.findElement(By.xpath("//input[@class='button-1 add-to-cart-button']")).isEnabled();
						if (ATC_isE == true) {	
							Thread.sleep(1000);
							driver.findElement(By.xpath("//input[@class='button-1 add-to-cart-button']")).click();
							}
					}
				} catch (Exception e) {
					System.out.println("Product no: " +j+" cannot be purchased");					
				}
				driver.findElement(By.xpath("(//ul[@class='top-menu']/child::li/child::a)[2]")).click();
				driver.findElement(By.xpath("(//h2[@class='title'])["+i+"]")).click();
			}//IF
						
			}
			
			driver.findElement(By.xpath("(//h2[@class='product-title']/child::a)[1]")).click();
		}
		}
}
}
