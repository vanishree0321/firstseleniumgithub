package task;

import org.testng.Reporter;
import org.testng.annotations.Test;

import mvngeneric.base_Test;

public class TC_3_Test extends base_Test
{
	@Test
	public void flipkart()
	{
		driver.get("https://www.flipkart.com");
		driver.manage().window().maximize();
		Reporter.log("flipkart page successfully displayed");
		driver.close();
	}

}
