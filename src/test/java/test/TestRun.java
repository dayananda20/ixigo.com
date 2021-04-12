package test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pom.SelectDetails;
import pom.ValidateSearch;

public class TestRun {
	
WebDriver driver;
	
	@BeforeTest

    public void setup(){

		System.setProperty("webdriver.chrome.driver", "D:\\selenium\\Browserdriver\\chromedriver.exe");
        
		driver=new ChromeDriver();

        
        
		  driver.manage().window().maximize();
		  
		  driver.manage().deleteAllCookies();

        driver.get("https://www.ixigo.com/");
        
     //   driver.get("https://www.ixigo.com/search/result/flight?from=BLR&to=DEL&date=30042021&returnDate=10062021&adults=2&children=0&infants=0&class=e&source=Modify%20Search%20Form");
        
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        
       
    }
	
	@Test(priority=0)
	public void verifyPageTitle() {
		
		
		String Actual = driver.getTitle();
		System.out.println("Title of the page----->>"+Actual);
        String Expected = "ixigo - Flights, IRCTC Train Booking, Bus Booking, Air Tickets & Hotels";

        if (Actual.equals(Expected)) {
                   System.out.println("Title Verified Successfully ");
        } else {
                   System.out.println("Title Not Verified");
        }
		
	}
	
	@Test(priority=1)
	public void enter_search_details() throws Exception {
		
		SelectDetails sd=new SelectDetails(driver);
		ValidateSearch vs=new ValidateSearch(driver);
		
		sd.round();
		
	
		sd.enter_From();
		
		
		sd.enter_To();
		
	
		sd.date_From();
		
	
		sd.date_To();
		
	
		sd.select_passenger();
		
		
		sd.search();
		
	
		}
		
	@Test(priority=2)
	public void validating_search() throws Exception {
		
		ValidateSearch valid=new ValidateSearch(driver);
		
		
		valid.validate_search_page();
		
		valid.validate_search_result();
	}
	@AfterTest()
	
	public void quit()
	{
		driver.close();
	}
	
	
	
}
