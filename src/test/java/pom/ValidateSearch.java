package pom;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ValidateSearch {
	
	WebDriver driver;
	
	By CLICK_NONSTOP=By.xpath("//div[contains(text(),'Non stop')]");
	By dept_time=By.xpath("//div[@class='time-group']");
	By select_price=By.xpath("//div[@class='price-group']");
 	
	


	
	public ValidateSearch(WebDriver driver){

        this.driver = driver;

    }
	public void validate_search_page() {
		
		String validate_text=driver.getTitle();
		
		String actual_text="Airlines";
		
		if(validate_text.equals(actual_text))
		{
			System.out.println("Search Successful");
		}
		else
		{
			System.out.println("Search Unsuccessful");
		}
		
	}

	
	public void validate_search_result() throws Exception {
		

       
        
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        
        Thread.sleep(10000);
        
        driver.findElement(CLICK_NONSTOP).click();
        
        System.out.println("selecting non stop option");
      // driver.findElement(CLICK_NONSTOP).click();
        
        Thread.sleep(10000);
		
        
        	List <WebElement> elements=driver.findElements(dept_time);
        	List<WebElement> prices=driver.findElements(select_price);
        	
        	//System.out.println(elements.size());
        	System.out.println();
        	for(int i=0; i<elements.size();i++)
        	{

    	           
    	    
    			//selecting flights fare more than 5000 thousand
    			if(Integer.parseInt(prices.get(i).getText())>5000 )
    			{
    			
    				System.out.println("price---->"+prices.get(i).getText());  	
    				 System.out.println("flight details--->"+elements.get(i).getText());  
    				
    			}
       
		}
	}
}
