package pageclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SubNavBar {
 WebDriver driver;
 
 @FindBy(id="tab-flight-tab-hp")
 WebElement flightTab;
 
 @FindBy(xpath="//*[@id='tab-hotel-tab-hp']/span[1]")
 WebElement hotels;
 
 @FindBy(xpath="//*[@id='tab-package-tab-hp']/span[1]")
 WebElement FlightAndHotel;
 
 @FindBy(xpath="//*[@id='tab-car-tab-hp']")
 WebElement carhire1;

 @FindBy(xpath="//*[@id='tab-activity-tab-hp']/span[1]")
 WebElement holidays;
 
 @FindBy(id="flight-type-roundtrip-label-hp-flight")
 WebElement returns;
 
 @FindBy(id="flight-type-one-way-label-hp-flight")
 WebElement oneway;
 
 @FindBy(id="flight-type-multi-dest-label-hp-flight")
 WebElement multiway;
 
 @FindBy(xpath="//input[@id='flight-origin-hp-flight']")
 WebElement flayingfrom;
 
 @FindBy(xpath="//input[@id='flight-destination-hp-flight']")
 WebElement goingto;
 
 @FindBy(xpath="//input[@id='flight-departing-hp-flight']")
 WebElement departuredate;
 
 @FindBy(xpath="//input[@id='flight-returning-hp-flight']")
 WebElement returingdate;
 
 @FindBy(xpath="//div[@id='traveler-selector-hp-flight']//button[contains(@class,'trigger-utility menu-trigger btn-utility btn-secondary dropdown-toggle theme-standard pin-left menu-arrow gcw-component gcw-traveler-amount-select gcw-component-initialized')]")
 WebElement travellres;
 
 @FindBy(xpath="//input[@id='flight-departing-single-hp-flight']")
 WebElement departuredate1;
 
 @FindBy(xpath="//input[@id='flight-2-origin-hp-flight']")
 WebElement flayingfrom1;
 
 @FindBy(xpath="//input[@id='flight-2-destination-hp-flight")
 WebElement goingto1;
 
 @FindBy(xpath="//input[@id='flight-2-departing-hp-flight']")
 WebElement departuredate2;
 
 @FindBy(xpath="//form[@id='gcw-flights-form-hp-flight']//button[contains(@class,'btn-primary btn-action gcw-submit')]")
 WebElement searchbutton;
 
 public SubNavBar(WebDriver driver)
 {
	 this.driver=driver;
	 PageFactory.initElements(driver, this);
 }
 
 public void ClickFlighttab()
 {
	 flightTab.click();
 }
 
 public void Fillorigin(String origin)
 {
	 flayingfrom.sendKeys(origin);
 }
 
 public void Filldestination(String destination)
 {
	 goingto.sendKeys(destination);
 }
 public void Filldeparturedate(String deptdate)
 {
	 departuredate.sendKeys(deptdate);
 }
 public void Fillreturndate(String returndate)
 {
	 returingdate.sendKeys(returndate);
 }
 public void FillTravellers(String traveller)
 {
	 travellres.sendKeys(traveller);
 }
 public void ClearReturndate()
 {
	 //returingdate.click();
	 returingdate.clear();
 }
 public void ClickSearchButton()
 {
	 searchbutton.click();
 }
}
