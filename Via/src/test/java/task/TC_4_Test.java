package task;

import org.testng.Reporter;
import org.testng.annotations.Test;

import mvngeneric.base_Test;

public class TC_4_Test extends base_Test
	{
		@Test
		public void amazon()
		{
			driver.get("https://www.amazon.com");
			driver.manage().window().maximize();
			Reporter.log("amazon page successfully displayed");
			driver.close();
		}

	}



