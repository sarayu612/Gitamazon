package Testing.Automation;


	import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

	import pageObjects.CovidPage;
	import resources.Base;

	public class TestAmazonCovidTitle extends Base {
		public WebDriver driver;
		private static  Logger log = LogManager.getLogger(Base.class.getName());
		@BeforeTest(alwaysRun=true)
		public void initialize() throws IOException
		{
			driver=initializeDriver();
			 log.info("driver os initialized");
		}

		@Test
		public void validateAppTitle() throws IOException {

			

			driver.get(prop.getProperty("url"));
			 log.info("successfully navigated to url");
			CovidPage cp = new CovidPage(driver);
			cp.getresponse().click();
			Assert.assertEquals(cp.getcovidTitle().getText(), "Amazon’s COVID-19 vaccination and testing blog");
			 log.info("successfully validated the title");
			System.out.println("Test  amazon covid is completed");
		}
		@AfterTest
		public void teardown()
		{
			driver.close();
		}

	}


