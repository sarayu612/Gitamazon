package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Loginpage {

	public WebDriver driver;
	
	private By Email=By.id("ap_email");
	
	private By Continue=By.id("continue");
	
	
	public Loginpage(WebDriver driver) {
		this.driver=driver;
	}

	
	public WebElement getEmail()
	{
		return driver.findElement(Email);
		
	}

		
	
	public WebElement getContinue()
	{
		return driver.findElement(Continue);
		
	}
	
	
}
