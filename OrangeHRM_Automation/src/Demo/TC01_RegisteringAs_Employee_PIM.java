package Demo;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class TC01_RegisteringAs_Employee_PIM {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	
	driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
	driver.findElement(By.xpath("//input[@name='password']")).sendKeys("admin123");
	driver.findElement(By.xpath("//button[@class='oxd-button oxd-button--medium oxd-button--main orangehrm-login-button']")).submit();
	
	driver.findElement(By.xpath("//span[text()='PIM']")).click();
	driver.findElement(By.xpath("(//button[contains(@class,'medium oxd-button--second')])[2]")).click();
	
	// Entering Employee Details
	driver.findElement(By.xpath("//input[@name='firstName']")).sendKeys("Srinivas");
	driver.findElement(By.xpath("//input[@name='lastName']")).sendKeys("Chenna");
	driver.findElement(By.xpath("//span[@class='oxd-switch-input oxd-switch-input--active --label-right']")).click();

	// Creating Login Details
	driver.findElement(By.xpath("(//input[@class='oxd-input oxd-input--active'])[3]")).sendKeys("Srinivas011");
	driver.findElement(By.xpath("(//span[@class='oxd-radio-input oxd-radio-input--active --label-right oxd-radio-input'])[1]")).click();
	driver.findElement(By.xpath("(//input[@class='oxd-input oxd-input--active'])[4]")).sendKeys("Srinivas@123");
	driver.findElement(By.xpath("(//input[@class='oxd-input oxd-input--active'])[5]")).sendKeys("Srinivas@123");
	// Clearing the text field in Emp Id
	WebElement EmpID = driver.findElement(By.xpath("(//input[@class='oxd-input oxd-input--active'])[2]"));
	Actions a = new Actions(driver);
	a.moveToElement(EmpID).doubleClick(EmpID).perform();
	Thread.sleep(2000);
	driver.findElement(By.xpath("(//input[@class='oxd-input oxd-input--active'])[2]")).clear();
	Thread.sleep(2000);
	driver.findElement(By.xpath("(//input[@class='oxd-input oxd-input--active'])[2]")).sendKeys("1144NS");

	// Save
	driver.findElement(By.xpath("(//button[@class='oxd-button oxd-button--medium oxd-button--secondary orangehrm-left-space'])")).submit();
	
	WebElement DOB = driver.findElement(By.xpath("//label[text()='Nationality']"));
	JavascriptExecutor js = (JavascriptExecutor) driver;
	
	driver.findElement(By.xpath("(//input[@placeholder='yyyy-dd-mm'])[2]")).sendKeys("2000-12-20");
	Thread.sleep(2000);
	driver.findElement(By.xpath("(//span[contains(@class,'oxd-radio-input oxd-radio')])[1]")).click();
	Thread.sleep(2000);
	js.executeScript("arguments[0].scrollIntoView(true);",DOB);
	Thread.sleep(2000);


	WebElement SaveButton = driver.findElement(By.xpath("(//button[@class='oxd-button oxd-button--medium oxd-button--secondary orangehrm-left-space'])[1]"));
	
	a.moveToElement(SaveButton).click(SaveButton).perform();
	//a.keyDown(Keys.ENTER);
	
	//Write Automation Scripts for JOB and Report To modules-- ( Select Drop Down )
	
	// Verifying weather the employee data is created or not 
	
	driver.findElement(By.xpath("//a[text()='Employee List']")).click();
	driver.findElement(By.xpath("(//input[@placeholder='Type for hints...'])[1]")).sendKeys("Srinivas Chenna");
//	driver.findElement(By.xpath("(//input[@class='oxd-input oxd-input--active'])[2]")).sendKeys("1144NS");
	driver.findElement(By.xpath("//button[@class='oxd-button oxd-button--medium oxd-button--secondary orangehrm-left-space']")).click();

	try {
		boolean found = driver.findElement(By.xpath("//span[text()='(1) Record Found']")).isDisplayed();
	
	if (found) {
		System.out.println("Employee Account is Created Successfully....");
	}
	
	} catch (Exception e) {
System.out.println("Employee Account is Not Created....");
	}

	// Login Through Employee UserName and Password....
	driver.findElement(By.xpath("//span[@class='oxd-userdropdown-tab']")).click();
	driver.findElement(By.xpath("//a[text()='Logout']")).click();
	
	Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Srinivas011");
	driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Srinivas@123");
	driver.findElement(By.xpath("//button[@class='oxd-button oxd-button--medium oxd-button--main orangehrm-login-button']")).submit();
	System.out.println("Username Login Details are created and Logged In Successfully..");
}
}
