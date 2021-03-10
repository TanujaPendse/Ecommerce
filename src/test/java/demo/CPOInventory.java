package demo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import stepdefinitions.CPOPage;
import stepdefinitions.ReusableFunctions;

public class CPOInventory {

	
	
	WebDriver driver;
	ReusableFunctions reusable=new ReusableFunctions();
	CPOPage page= new CPOPage(driver);
	
	@Given("^user is already on home page$")
	public void user_is_already_on_home_page()
	{
		System.setProperty("webdriver.chrome.driver", "./src/test/java/Driver/chromedriver_87.exe");
		driver=new ChromeDriver();
		driver.navigate().to("https://www.mbusa.com/en/cpo");
		driver.manage().window().maximize();
	}
	
	@Then("^click on view cpo inventory$")
	public void click_on_view_cpo_inventory()
	{
	
		page.ClickOnCPOInventory(driver).click();
	}
	
	@When("^enter zipcode$")
	public void enter_zipcode()
	{
		WebDriverWait wait = new WebDriverWait(driver,120);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"inventory-container\"]/div/div/div/div/div/div/div[1]/div/div[1]/div")));
		driver.findElement(By.xpath("//*[@id=\"inventory-container\"]/div/div/div/div/div/div/div[1]/div/div[1]/div")).click();
		//wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/div[1]/main/div[2]/div/div/div/div/div/div/div[1]/div/div[1]/div/input")));
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/main/div[2]/div/div/div/div/div/div/div[1]/div/div[1]/div/input")).sendKeys("10014");
		//driver.findElement(By.xpath("//input[@id='_kk41whqsverpd']")).sendKeys("10014");
		
	}
	
	@Then("^click on view inventory$")
	public void click_on_view_inventory()
	{
		driver.findElement(By.xpath("//*[@id=\"inventory-container\"]/div/div/div/div/div/div/div[2]/button")).click();
		
		driver.navigate().back();
	}
	
	@When("enter city")
	public void enter_city() {
		
		driver.findElement(By.xpath("//*[@id=\"inventory-container\"]/div/div/div/div/div/div/div[1]/div/div[1]/div")).click();

		driver.findElement(By.xpath("/html/body/div[1]/div[1]/main/div[2]/div/div/div/div/div/div/div[1]/div/div[1]/div/input")).sendKeys("Chicago, IL");
		driver.manage().timeouts().implicitlyWait(30000, TimeUnit.MILLISECONDS);

	}

	@Then("go to view inventory")
	public void go_to_view_inventory() {
		
		driver.findElement(By.xpath("//*[@id=\"inventory-container\"]/div/div/div/div/div/div/div[2]/button")).click();
		//driver.navigate().back();
	    
	}
	@When("enter state")
	public void enter_state() {
		
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/main/div[2]/div/div/div[1]/div/div/div[2]/div[1]/div/div[2]/div[2]/div/div[1]/div/input")).clear();
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/main/div[2]/div/div/div[1]/div/div/div[2]/div[1]/div/div[2]/div[2]/div/div[1]/div/input")).sendKeys("New York, NY");
		
		
	}
	@Then("click on apply")
	public void click_on_apply() {
	    
		driver.findElement(By.xpath("//button[@class=\"location-distance-search__cta button button_primary button--wide\"]")).click();
	}
	
	@When("click on C Class Sedan")
	public void click_on_C_Class_Sedan()
	{
		driver.findElement(By.xpath("//button[@class='inventory-model-result__heading']")).click();
	}
	
	@Then("click on view vehicle details")
	public void click_on_view_vehicle_details()
	{
		driver.findElement(By.xpath("//button[@class='button button_call-out button--full-width']")).click();
	}
}
