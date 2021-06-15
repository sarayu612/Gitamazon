package Testing.Automation;


import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pageObjects.Landingpage;
import pageObjects.Loginpage;
import resources.Base;

public class HomePage extends Base{
	public WebDriver driver;
	private static  Logger log = LogManager.getLogger(Base.class.getName());
	@BeforeTest
	public void initialize() throws IOException
	{
		driver=initializeDriver();
		log.info("driver is initialized");
	}
	
	@Test(dataProvider="getdata")
	public void AmazonHomePage(String username,String name) throws IOException
	{
		
		 driver.get(prop.getProperty("url"));
		 log.info("successfully navigated to url");
		 Landingpage ln=new Landingpage(driver);
		 ln.getLogin().click();
		 log.info("clicked on login");
		 Loginpage lp=new Loginpage(driver);
		 lp.getEmail().sendKeys(username);
		 lp.getContinue().click();
		 System.out.println(name);
	
	}
	@AfterTest
	public void teardown()
	{
		driver.close();
	}
	@DataProvider
	public Object[][] getdata()
	{
	Object[][] data=new Object[3][2];	
	data[0][0]="sarayu612@gmail.com";
	
	data[0][1]="jashu";

	data[1][0]="chinreddy1292@gmail.com";
	
	data[1][1]="jaanu";
    data[2][0]="jaganhdfc@gmail.com";
	
	data[2][1]="jagan";
	return data;
	}
		 
		
		 
	}


