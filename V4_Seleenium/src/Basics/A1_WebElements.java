package Basics;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class A1_WebElements {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		// WebElements 11 Non Static Abstract Methods (Direct)
		//  1  --   get()
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
//		driver.get("https://omayo.blogspot.com/");
		
		// 2  --  getCurrentUrl()
		String CurrentUrl = driver.getCurrentUrl();
		System.out.println(CurrentUrl);
		
		// 3  --  getTitle()
		String Title = driver.getTitle();
		System.out.println(Title);
		
		// 4 -- getWindowHandle();
		String WindowHandle = driver.getWindowHandle();
		System.out.println(WindowHandle);
		
		// 5  --  getWindowHandles
				// List as return type!!!!!
		
		// 6  --  getPageSource
		String PageSource = driver.getPageSource();
		System.out.println(PageSource);
		
		// 7  --  manage()
		driver.manage().window().minimize();
		Thread.sleep(2000);
		driver.manage().window().maximize();
		Thread.sleep(1000);
		
		// 8  -- navigate()
		driver.navigate().to("https://omayo.blogspot.com/");
		Thread.sleep(1000);
		driver.navigate().refresh();
		Thread.sleep(1000);
		driver.navigate().back();
		Thread.sleep(1000);
		driver.navigate().forward();	
		
		// 9  --  switchTo()
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://www.youtube.com/");	
		
		// 10  --  close()
		//driver.close();
		
		// 11  --  quit()
		//driver.quit();
	}
}
