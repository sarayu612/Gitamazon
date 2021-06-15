package Testing.Automation;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pageObjects.Landingpage;
import resources.Base;

public class Amazonmessagevalidation extends Base {
	public WebDriver driver;
	private static  Logger log = LogManager.getLogger(Base.class.getName());
	@BeforeTest(alwaysRun=true)
	public void initialize() throws IOException
	{
		driver=initializeDriver();
		 log.info("driver is initialized");
	}

	@Test
	public void validatemessageTitle() throws IOException {

		

		driver.get(prop.getProperty("url"));
		 log.info("successfully navigated to url");
		Landingpage ln=new Landingpage(driver);
		Assert.assertEquals(ln.getmessage().getText(), "You are on amazon123.com. You can also shop on Amazon India for millions of products with fast local delivery.");
		 log.info("successfully validated the msg title");
		System.out.println("Test completed");
	}
	@AfterTest
	public void teardown()
	{
		driver.close();
	}

}


