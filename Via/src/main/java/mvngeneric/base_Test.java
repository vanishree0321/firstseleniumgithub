package mvngeneric;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

public class base_Test 
{
	public static WebDriver driver;

	@BeforeClass(alwaysRun=true)
	public void launchbrowser()
	{
//		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		driver=new ChromeDriver();
		System.out.println("launched succesfully");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		System.out.println("Browser window is maximized successfully");
	}
	@AfterMethod(alwaysRun=true)
	public void browser_tear_down()
	{
		driver.quit();
		
	}
	
}
