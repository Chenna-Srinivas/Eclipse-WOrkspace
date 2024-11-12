package Demo;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC00 {
public static void main(String[] args) {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	
//	S:- Logging Into The OrangeHRM.....	
	driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Srinivas011");
	driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Srinivas@123");
	driver.findElement(By.xpath("//button[@class='oxd-button oxd-button--medium oxd-button--main orangehrm-login-button']")).submit();
	
}

}
