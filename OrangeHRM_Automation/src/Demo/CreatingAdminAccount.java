package Demo;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class CreatingAdminAccount {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	
	driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
	driver.findElement(By.xpath("//input[@name='password']")).sendKeys("admin123");
	driver.findElement(By.xpath("//button[@class='oxd-button oxd-button--medium oxd-button--main orangehrm-login-button']")).submit();
	
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

	//perform click action on save button..

}
}
