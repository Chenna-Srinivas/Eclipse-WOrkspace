package TestNG_Scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TC03_RegisteringAs_Admin extends Base{
	@Test (priority = 2)
	public void TC02 () throws InterruptedException {
	driver.findElement(By.xpath("//span[text()='Admin']")).click();
	driver.findElement(By.xpath("(//button[contains(@class,'medium oxd-button--second')])[2]")).click();
	
	Actions a = new Actions(driver);

	WebElement UserRole = driver.findElement(By.xpath("(//div[text()='-- Select --'])[1]"));
	a.moveToElement(UserRole).click().sendKeys(Keys.DOWN).click().build().perform();
//	.sendKeys(Keys.TAB).sendKeys(Keys.TAB).sendKeys(Keys.DOWN).click()
	Thread.sleep(1000);
	WebElement EmpName = driver.findElement(By.xpath("//input[@placeholder='Type for hints...']"));
	a.moveToElement(EmpName).click().sendKeys("Sumaiya Sangreskop").sendKeys(Keys.DOWN).click().perform();
	Thread.sleep(1000);
	WebElement Status = driver.findElement(By.xpath("//div[text()='-- Select --']"));
	a.moveToElement(Status).click().sendKeys(Keys.DOWN).click().perform();
	Thread.sleep(1000);
	WebElement UserName = driver.findElement(By.xpath("(//input[@class='oxd-input oxd-input--active'])[2]"));
	a.moveToElement(UserName).click().sendKeys("Sumi31").build().perform();
	
	WebElement password = driver.findElement(By.xpath("(//input[@class='oxd-input oxd-input--active'])[2]"));
	a.moveToElement(password).click().sendKeys("Sumi@123").sendKeys(Keys.TAB).sendKeys("Sumi@123").build().perform();
//	Save......
	Thread.sleep(6000);
	driver.findElement(By.xpath("(//button[@class='oxd-button oxd-button--medium oxd-button--secondary orangehrm-left-space'])")).submit();
	Reporter.log("Admin Account Created Successfully..",true);
	
	
}
	@Test (priority = 1)
	public void TC01 () throws InterruptedException {
	//First Register As A Employee..
		driver.findElement(By.xpath("//span[text()='PIM']")).click();
		driver.findElement(By.xpath("(//button[contains(@class,'medium oxd-button--second')])[2]")).click();
		
		driver.findElement(By.xpath("//input[@name='firstName']")).sendKeys("Sumaiya");
		driver.findElement(By.xpath("//input[@name='lastName']")).sendKeys("Sangreskop");
		driver.findElement(By.xpath("(//input[@class='oxd-input oxd-input--active'])[2]")).sendKeys("Sumi11");
		Thread.sleep(6000);
		driver.findElement(By.xpath("(//button[@class='oxd-button oxd-button--medium oxd-button--secondary orangehrm-left-space'])")).submit();
		Reporter.log("Employee Account Created Successfully",true);
	}

	@Test (priority = 3)
	public void TC03 () {
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Sumi31");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Sumi@123");
		driver.findElement(By.xpath("//button[@class='oxd-button oxd-button--medium oxd-button--main orangehrm-login-button']")).submit();
	}
}
