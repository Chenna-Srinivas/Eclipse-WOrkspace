package DemoWebShop;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

import com.google.common.io.Files;

public class ListnerImplementationClass extends Base implements ITestListener {


	@Override
	public void onTestStart(ITestResult result) {
	Reporter.log("Test Execution Started", true);
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		Reporter.log("Test Execution Successfully Executed..",true);
	}
static int i ;
	@Override
	public void onTestFailure(ITestResult result) {
		String title = driver.getTitle();
	Reporter.log("Test Execution Failed...",true);
	TakesScreenshot ts = (TakesScreenshot) driver;
	File source = ts.getScreenshotAs(OutputType.FILE);
	File dest = new File ("C:\\Users\\chenn\\eclipse-workspace\\EndToEnd_Testing\\FailedTCScreenshot\\"+title+"FailedTCScreenshot"+i+".png");
	try {
		Files.copy(source, dest);
	} catch (IOException e) {
		Reporter.log("IO Exception Handled",true);
	}

	i++;
	}
}
