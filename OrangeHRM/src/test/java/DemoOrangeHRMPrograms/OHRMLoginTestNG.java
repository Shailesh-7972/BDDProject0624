package DemoOrangeHRMPrograms;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class OHRMLoginTestNG {
	
	WebDriver driver;

	@BeforeSuite 
	
	public void Browseropen () throws InterruptedException 
	{
	
	WebDriverManager.firefoxdriver().setup();

	driver = new FirefoxDriver();

	//driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/dashboard/index");
	driver.get("https://www.amazon.in/");

	driver.manage().window().maximize();
	
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

	System.out.println("Orange HRM web application has opened");

    }
	
	
@Test
	
	public void cartItem() 
	{
		
		AmznCartItem.amazonItem(driver);
	}

	
/*@Test(priority=0)
	
	public void LoginOut()
	{
	
	  OrangeHRMLogin.Login(driver);
	
	  Logout.Logoutwebapp(driver);
		
	  System.out.println("OrangeHRM app has Log in and Log out");
		
	}

	
	@Test(priority=1)
	
	public void Search()
	{
	
		OrangeHRMLogin.Login(driver);
		
		OrangeHRMLogin.Dashboard(driver);
		
		System.out.println("Assign leave page has opened");
		
		SearchResult.ClaimSearch(driver);
		
		System.out.println("Claim page has opened");
		
		Logout.Logoutwebapp(driver);
		
	}*/
	

	@AfterSuite
	
	public void Closebrowser() 
	
	{
	
		//driver.close();
		
		System.out.println("Chrome Browser has been closed");
		
	}
	
}
	