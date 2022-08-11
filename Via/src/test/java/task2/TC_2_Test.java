package task2;

import org.testng.Reporter;
import org.testng.annotations.Test;

import mvngeneric.base_Test;

public class TC_2_Test extends base_Test
{
	@Test
	public void wooden()
	{
		driver.get("https://www.woodenstreet.com");
		driver.manage().window().maximize();
		Reporter.log("woodenstreet page successfully displayed");
		driver.close();
	}


}



