package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Landingpage {

	public WebDriver driver;
	
	 private By signin=By.cssSelector("span[id='nav-link-accountList-nav-line-1']");
	 private By message=By.xpath("//span[@class='a-size-base a-color-base']");
	 
	public Landingpage(WebDriver driver) {
		this.driver=driver;
	}

	
	public WebElement getLogin()
	{
		 return driver.findElement(signin);
		
	
	}
	public WebElement getmessage()
	{
		 return driver.findElement(message);
		
	
	}

	}
	
	

