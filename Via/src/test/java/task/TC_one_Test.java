package task;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

import mvngeneric.base_Test;

public class TC_one_Test extends base_Test
{
	@Test
	public void via()
	{
//		WebDriver driver=new ChromeDriver();
		driver.get("https://www.via.in");
		driver.manage().window().maximize();
		Reporter.log("via page successfully displayed");
		driver.close();
	}

	

}
