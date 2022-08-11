package task;

import org.testng.Reporter;
import org.testng.annotations.Test;

import mvngeneric.base_Test;

public class TC_two_Test extends base_Test
{
	@Test
	public void jio()
	{
		driver.get("https://www.jio.com");
		driver.manage().window().maximize();
		Reporter.log("jio page successfully displayed");
		driver.close();
	}

	

}



