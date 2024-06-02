package DemoOrangeHRMPrograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;

public class AmznCartItem {
	
	static WebDriver driver;
	
	public static void  amazonItem(WebDriver driver) {
		
				
	    WebElement srcheditem = driver.findElement(By.xpath("//input[@name='field-keywords']"));
	    srcheditem.sendKeys("Trimmer for men");
	    
	    WebElement srchbutton = driver.findElement(By.xpath("//input[@id='nav-search-submit-button']"));
	    srchbutton.click();

	}
	
}
