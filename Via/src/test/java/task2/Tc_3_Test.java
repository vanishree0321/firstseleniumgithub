package task2;

import org.testng.Reporter;
import org.testng.annotations.Test;

import mvngeneric.base_Test;

public class Tc_3_Test extends base_Test
{
	@Test
	public void ajio()
	{
		driver.get("https://www.ajio.com");
		driver.manage().window().maximize();
		Reporter.log("ajio page successfully displayed");
		driver.close();
	}


}



