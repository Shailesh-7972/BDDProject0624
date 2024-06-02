package DemoOrangeHRMPrograms;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SearchResult 

{
	
	static WebDriver driver;
	
	public static void ClaimSearch(WebDriver driver) 
	
	{
		
	 WebElement srch = driver.findElement(By.xpath("//input[@class='oxd-input oxd-input--active']"));
	 
	 srch.sendKeys("Claim");
	 
	 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	 
	 driver.findElement(By.xpath("//span[@class='oxd-text oxd-text--span oxd-main-menu-item--name']")).click();
	 
	 WebElement Refid = driver.findElement(By.xpath("//div[@class='oxd-autocomplete-wrapper']//following::div[@class='oxd-autocomplete-text-input oxd-autocomplete-text-input--active']//following::input[@placeholder='Type for hints...']"));
		
	 Refid.sendKeys("202307180000004");
	 
	 WebElement srchbuttton = driver.findElement(By.xpath("//button[@class='oxd-button oxd-button--medium oxd-button--secondary orangehrm-left-space']"));
	 srchbuttton.click();
	 
	 WebElement viewdetails= driver.findElement(By.xpath("//button[@class='oxd-button oxd-button--medium oxd-button--text oxd-table-cell-action-space']//parent::div[@class='oxd-table-cell-actions']"));
	 viewdetails.click();
	 
	 System.out.println("Assign Claim page has been opened");
	 
	/*WebElement ename = driver.findElement(By.cssSelector("div.oxd-layout > div.oxd-layout-container > div.oxd-layout-context > div.oxd-table-filter > div.oxd-table-filter-area > form > div:nth-child(1) > div > div:nth-child(1) > div > div:nth-child(2) > div > div"));
	
	ename.sendKeys("Odis Adalwin");*/
	 
	 
	}

}
