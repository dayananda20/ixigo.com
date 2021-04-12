package pom;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

public class SelectDetails {
	
	
	By SELECT_ROUND=By.xpath("//span[contains(text(),'Round Trip')]");
	By from=By.xpath("//div[@class='form-cntr flight']//div[contains(text(),'From')]/following-sibling::input");
	By from_city=By.xpath("//div[contains(text(),'BLR - Bengaluru, India')]");
	By to=By.xpath("//div[@class='form-cntr flight']//div[contains(text(),'To')]/following-sibling::input");
	By to_city=By.xpath("//div[contains(text(),'DEL - New Delhi, India')]");
	By click_ddate=By.xpath("//div[@class='form-cntr flight']//div[contains(text(),'Departure')]/following-sibling::input");
	By select_ddate=By.xpath("/html/body/div[2]/div[2]/div[1]/table/tbody/tr[5]/td[6]/div[1]");//select 30th date
	By click_rdate=By.xpath("//div[@class='form-cntr flight']//div[contains(text(),'Return')]/following-sibling::input");
	By select_rdate=By.xpath("/html/body/div[3]/div[2]/div[2]/table/tbody/tr[2]/td[5]/div[1]");//Selects may 10th
	By CLICK_PASSENGER=By.xpath("//div[@class='form-cntr flight']//div[contains(text(),'Travellers')]/following-sibling::input");
	By passenger=By.xpath("//div[@class='u-box-result']//span[@class='counter-item u-text-center u-ib current' and contains(text(),'2')]");
	By click_search=By.xpath("//button[@class='c-btn u-link enabled' and contains(text(),'Search')]");
	//By verify_search=By.xpath("//span[contains(text(),'Bengaluru')]");
	
	By validate_search_ele=By.xpath("//div[contains(text(),'Airlines')]");
	
	
	WebDriver driver;
	
	public SelectDetails(WebDriver driver){

        this.driver = driver;

    }
	public void round() {
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.findElement(SELECT_ROUND).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
	}
	public void enter_From() throws Exception {
		
		driver.findElement(from).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(from_city).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
public void enter_To() throws Exception {
		
		driver.findElement(to).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.findElement(to_city).click();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
	}
public void date_From() throws Exception {
	driver.findElement(click_ddate).click();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.findElement(select_ddate).click();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
	
}

public void date_To() throws Exception {
	
	driver.findElement(click_rdate).click();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
	driver.findElement(select_rdate).click();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
	
}
public void select_passenger() throws Exception {
	
	driver.findElement(CLICK_PASSENGER).click();
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	
	
	driver.findElement(passenger).click();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
}

public void search() throws Exception {
	
	driver.findElement(click_search).click();
	
	
}


}
