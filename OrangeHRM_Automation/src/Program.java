import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import TestNG_Scripts.Base;

public class Program  {

	@Test
	public void testCase() {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[@class='oxd-button oxd-button--medium oxd-button--main orangehrm-login-button']")).submit();
		driver.findElement(By.xpath("//span[text()='Admin']")).click();
		driver.findElement(By.xpath("(//div[@class='oxd-select-text--after'])[1]")).click();
		driver.findElement(By.xpath("//span[text()='ESS']")).click();
		
		//driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/admin/viewSystemUsers");
	}
}
