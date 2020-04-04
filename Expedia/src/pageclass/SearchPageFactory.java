package pageclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchPageFactory 
{
	WebDriver driver;
	
	@FindBy(id="primary-header-hotel")
	WebElement hotel;
	
	@FindBy(id="primary-header-flight")
	WebElement flight;
	
	@FindBy(id="primary-header-package")
	WebElement totalpackage;
	
	@FindBy(id="primary-header-car")
	WebElement carhire;
	
	@FindBy(id="primary-header-activity")
	WebElement HolidayActivity;
	
	@FindBy(id="primary-header-lastminute")
	WebElement lastmin;
	
	@FindBy(id="primary-header-deals")
	WebElement deals;
	
	@FindBy(id="primary-header-rewards")
	WebElement rewards;
	
	@FindBy(id="primary-header-app")
	WebElement mobiles;
	
	@FindBy(id="primary-header-travelblog")
	WebElement travelblogs;
	
	public SearchPageFactory(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

}
