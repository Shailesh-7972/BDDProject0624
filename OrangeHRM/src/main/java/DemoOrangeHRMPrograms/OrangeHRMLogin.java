package DemoOrangeHRMPrograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class OrangeHRMLogin 
{

static WebDriver driver;	

		public static void Login(WebDriver driver) 
		
		{
			
		WebElement name = driver.findElement(By.xpath("//input[@name='username']"));
		name.sendKeys("Admin");

		WebElement pwd = driver.findElement(By.name("password"));
		pwd.sendKeys("admin123");

		WebElement butn = driver.findElement(By.xpath("//button[@class='oxd-button oxd-button--medium oxd-button--main orangehrm-login-button']//parent::div[@class='oxd-form-actions orangehrm-login-action']"));
		butn.click();

		}
		
		
		public static void Dashboard(WebDriver driver) 
		
		{
			
		WebElement leave = driver.findElement(By.xpath("//button[@class='oxd-icon-button orangehrm-quick-launch-icon' and @title='Assign Leave']"));
	
		leave.click();
			
		}

}
