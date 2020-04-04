package pageclass;

import org.testng.annotations.Test;

import org.testng.annotations.BeforeTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import pageclass.SearchPageFactory;
import pageclass.SubNavBar;



public class TestCases {
	private WebDriver driver;
	private  String baseurl;
	SearchPageFactory searchpage;
	SubNavBar subpage;
	
  @Test
  public void f() throws InterruptedException 
  {
	  subpage.ClickFlighttab();
	  subpage.Fillorigin("pune");
	  subpage.Filldestination("Mumbai");
	  subpage.Filldeparturedate("3/24/2020");
	  Thread.sleep(1000);
	  subpage.ClearReturndate();
	  subpage.Fillreturndate("3/25/2020");
	  
	  subpage.FillTravellers("1");
	  
	  subpage.ClickSearchButton();
	  
	  
  }
  @BeforeTest 
  public void beforeTest() throws InterruptedException 
  {
	  System.setProperty("webdriver.chrome.driver", "Resource/chromedriver.exe");
	  driver=new ChromeDriver();
	  baseurl="https://www.expedia.com/";
	  //System.out.println("Chrome is open");
	  searchpage=new SearchPageFactory(driver);
	  subpage=new SubNavBar(driver);
	  driver.manage().window().maximize();
	  Thread.sleep(5000);
	  driver.get(baseurl);
  }

  @AfterTest
  public void afterTest() 
  {
	  
  }

}
