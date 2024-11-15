package TestNG_Scripts;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class Base {
		public static WebDriver driver;
	 @BeforeSuite
		public void CS () {
		 Reporter.log("Connecting to the Server",true);
	 }
	 
	 @BeforeTest
	 	public void CD () {
		 Reporter.log("Connecting to the DataBase",true);
	 }
	 
	 @BeforeClass()
	 public void OpenBrowser () {
	Reporter.log("Opening Browser",true);
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	}
	 
	@BeforeMethod 
	public void LoginFunctionality () throws InterruptedException {
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[@class='oxd-button oxd-button--medium oxd-button--main orangehrm-login-button']")).submit();
		}

	@AfterMethod
	public void LogoutFunctionality () {
		driver.findElement(By.xpath("//span[@class='oxd-userdropdown-tab']")).click();
		driver.findElement(By.xpath("//a[text()='Logout']")).click();
	}

	@AfterClass
	public void CloseBrowser () {
		driver.quit();
		}

	@AfterTest
	public void DDB () {
		Reporter.log("Disconnecting the DataBase....",true);
	}

	@AfterSuite
	public void DS () {
		Reporter.log("Disconnecting the Server....",true);
	}

}
