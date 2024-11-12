package TestNG_Scripts;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TC02 extends Base {
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
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//span[text()='Admin']")).click();
		driver.findElement(By.xpath("(//button[contains(@class,'medium oxd-button--second')])[2]")).click();
		Actions a = new Actions(driver);
		WebElement UserRole = driver.findElement(By.xpath("(//div[text()='-- Select --'])[1]"));
		a.moveToElement(UserRole).click().sendKeys(Keys.DOWN).pause(Duration.ofSeconds(2)).sendKeys(Keys.ENTER).build().perform();
		Thread.sleep(2000);
		WebElement EmpName = driver.findElement(By.xpath("//input[@placeholder='Type for hints...']"));
		a.moveToElement(EmpName).click().sendKeys("Sumaiya").pause(Duration.ofSeconds(3)).sendKeys(Keys.DOWN).pause(Duration.ofSeconds(3)).sendKeys(Keys.ENTER).build().perform();
		Thread.sleep(2000);		
		WebElement Status = driver.findElement(By.xpath("//div[text()='-- Select --']"));
		a.moveToElement(Status).click().sendKeys(Keys.DOWN).pause(Duration.ofSeconds(3)).sendKeys(Keys.ENTER).perform();
		Thread.sleep(2000);
		WebElement UserName = driver.findElement(By.xpath("(//input[@class='oxd-input oxd-input--active'])[2]"));
		a.moveToElement(UserName).click().sendKeys("Sumii").build().perform();
		Thread.sleep(2000);
		WebElement password = driver.findElement(By.xpath("(//input[@class='oxd-input oxd-input--active'])[2]"));
		a.moveToElement(password).click().sendKeys("Sumi@123").sendKeys(Keys.TAB).sendKeys("Sumi@123").build().perform();
		Thread.sleep(2000);
		
		//		Save......
		Thread.sleep(6000);
		driver.findElement(By.xpath("(//button[@class='oxd-button oxd-button--medium oxd-button--secondary orangehrm-left-space'])")).submit();
		Thread.sleep(6000);
		Reporter.log("Admin Account Created Successfully..",true);
		Thread.sleep(6000);
		driver.findElement(By.xpath("//span[@class='oxd-userdropdown-tab']")).click();
	//	driver.findElement(By.xpath("//a[text()='Logout']")).click();
		Reporter.log("Logged Out Successfully..",true);
		Thread.sleep(6000);
		
		
	}
}
