package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CovidPage {
	public WebDriver driver;
	
	private By responselink=By.xpath("//a[@class='nav_a nav-swm-text nav-progressive-attribute nav-progressive-content']");
	private By covidtitle=By.xpath("//h1[@class='ArticlePage-headline']");
	
	public CovidPage(WebDriver driver) {
		this.driver=driver;
	}

	
	
	


	public WebElement getresponse()
	{
		 return driver.findElement(responselink);
		
	
	}
	public WebElement getcovidTitle()
	{
		 return driver.findElement(covidtitle);
		
	
	}
}
