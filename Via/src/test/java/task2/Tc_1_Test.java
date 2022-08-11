package task2;

import org.testng.Reporter;
import org.testng.annotations.Test;

import mvngeneric.base_Test;

public class Tc_1_Test extends base_Test
{
	@Test
	public void airtel()
	{
		driver.get("https://www.airtel.com");
		driver.manage().window().maximize();
		Reporter.log("airtel page successfully displayed");
		driver.close();
	}


}
