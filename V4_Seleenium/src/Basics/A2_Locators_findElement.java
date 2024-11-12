package Basics;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class A2_Locators_findElement {
	
	/* findElement(by)
	Used to find the web element in the webpage,
	Return type of findElement is WebElement 
	It always give you the first matching of the web element
	It accepts 'by' type of argument
	 */
	
public static void main(String[] args) {
	/*Selenium Provides 8 types of locators
		Used to identify the location of elements in webpage	
	*/
	// Id, Name, Class Name, Link Text, Partial Link Text -- Direct locators 
	// Css Selector, X - Path   --  Expressions
	// All these methods are present in By class and they are static methods which accepts string type of arguments
	
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	driver.get("https://omayo.blogspot.com/");
//	id()
	driver.findElement(By.id("pah"));
	
// 	name()
	// 2nd Priority
	//driver.findElement(By.name(""));
	
// linkText()
	// Text present between Anchor Tags
	driver.findElement(By.linkText("Selenium143"));

// partialLinkText()
	// 3rd Priority
	driver.findElement(By.partialLinkText("Open a popup"));
	
// className()
	// Used to identify the element by class attribute, last recommended because dynamic in nature
	driver.findElement(By.className("title"));
	
// cssSelector
	//When there is no id, name, linkText, className   -- We use cssSelector
		//		TagName[AttributeName = ' AttributeValue ']
	String cssSelector = driver.findElement(By.cssSelector("button[id = 'but2']")).getText();
	System.out.println(cssSelector);

// Xpath
	driver.findElement(By.xpath("(//input[@type='text'])[5]")).sendKeys("Working..");
	
}
}
