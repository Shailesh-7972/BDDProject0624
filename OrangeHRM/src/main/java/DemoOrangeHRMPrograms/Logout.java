package DemoOrangeHRMPrograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Logout 

{
	
	public static void Logoutwebapp (WebDriver driver) 
	
	{
		
	WebElement profile = driver.findElement(By.xpath("//i[@class='oxd-icon bi-caret-down-fill oxd-userdropdown-icon']"));

	profile.click();
	
	WebElement Logoutbutn = driver.findElement(By.xpath("//a[@class='oxd-userdropdown-link' and text()='Logout']"));
	
	Logoutbutn.click();
		
	}

	
}
