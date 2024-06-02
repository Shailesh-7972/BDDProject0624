package stepDefinition;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;

import io.cucumber.java.en.*;
import io.github.bonigarcia.wdm.WebDriverManager;

public class stepsTest {
	
	public WebDriver driver;
	
	@Given("Open Guru99 login page with UserID Password and Buttons")
	public void open_guru99_login_page_with_user_id_password_and_buttons() {
		
		WebDriverManager.chromedriver().setup();

		 driver = new ChromeDriver();

		driver.get("https://www.demo.guru99.com/v4/");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		System.out.println( "Guru99 web application has opened");
	    
	}

	@When("Enter UserID {string} and Password {string}")
	public void enter_user_id_and_password(String userid, String password) throws Throwable {
			
      driver.findElement(By.xpath("//input[@name='uid']")).sendKeys(userid);
			
      driver.findElement(By.xpath("//input[@name='password']")).sendKeys(password);
	   
	}

	@Then("Click on the Login button")
	public void click_on_the_login_button() {
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.findElement(By.xpath("//input[@name='btnLogin']")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		//driver.close();
	}
	
	@Then("Click on the New Account option")
	public void click_on_the_new_account_option() {
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.findElement(By.xpath("//a[text()='New Account']")).click(); 
	}

	@Then("Enter Account details")
	public void enter_account_details() {
		
	 driver.findElement(By.name("cusid")).sendKeys("1234567");
	 driver.findElement(By.xpath("//input[@name='inideposit']")).sendKeys("5000"); 
	    
	}

	@Then("Submit details")
	public void submit_details() {
	    
	//driver.findElement(By.xpath("//input[@value='submit']")).click(); 
	driver.findElement(By.xpath("//input[@value='reset']")).click(); 
	
	}
	
	/*@Given("User is already on flipcart app")
	public void user_is_already_on_flipcart_app() {
		
		WebDriverManager.chromedriver().setup();

		 driver = new ChromeDriver();

		driver.get("https://www.flipkart.com/");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		System.out.println( "Flipcart web application has opened");
	    
	}
		

	@When("user search washing machine")
	public void user_search_washing_machine() {
		
		WebElement srch = driver.findElement(By.xpath("//input[@title='Search for Products, Brands and More']"));
		
		srch.sendKeys("IFB Washing Machine");
	    
	}

	@Then("user clicks on search button")
	public void user_clicks_on_search_button() {
		
		WebElement butn = driver.findElement(By.xpath("//button[@class='_2iLD__']"));

		butn.click();
		driver.close();
		System.out.println("Close Chrome browser");
	    
	}*/
	
}