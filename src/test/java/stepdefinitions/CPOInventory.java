package stepdefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CPOInventory {

	WebDriver driver;
	ReusableFunctions reusable = new ReusableFunctions();
	CPOPage page = new CPOPage(driver);
	

		@Given("user navigates to {string}")
		public void user_navigates_to(String url) {
			System.setProperty("webdriver.chrome.driver", "./src/test/java/Driver/chromedriver_87.exe");
			driver = new ChromeDriver();
			driver.navigate().to(url);
			driver.manage().window().maximize();
					}

	@Then("click on view cpo inventory")
	public void click_on_view_cpo_inventory() {

		page.ClickOnCPOInventory(driver).click();
		
	}


	@When("enter {string}")
	public void enter_zipcode(String zipcode) {
		
		/*
		 * WebDriverWait wait = new WebDriverWait(driver, 120);
		 * wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(
		 * "//*[@id='inventory-container']/div/div/div/div/div/div/div[1]/div/div[1]/div"
		 * ))); driver.findElement(By.xpath(
		 * "//*[@id='inventory-container']/div/div/div/div/div/div/div[1]/div/div[1]/div"
		 * )).click(); //reusable.waitforele(driver, 120,
		 * page.ClickOnTextField(driver)); //page.ClickOnTextField(driver).click(); //
		 * wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(
		 * "/html/body/div[1]/div[1]/main/div[2]/div/div/div/div/div/div/div[1]/div/div[1]/div/input"
		 * ))); page.EnterZipcodeCityState(driver).sendKeys(zipcode);
		 */
		
		reusable.checkPageIsReady(driver);
		page.ClickOnTextField(driver).click();
		page.EnterZipcodeCityState(driver).sendKeys(zipcode);
		


		

	}

	@Then("^click on view inventory$")
	public void click_on_view_inventory() {
		page.ClickOnViewInventory(driver).click();
	}

	@When("^selecting distance from dropdown to select 10 miles$")
	public void selecting_distance_from_dropdown_to_select_10_miles() {

		page.ClickOnSelectDistance(driver).click();
		/*
		 * WebElement distance_dropdown=driver.findElement(By.xpath(
		 * "//*[@class='select-control__value']")); Select s =new
		 * Select(distance_dropdown); s.selectByIndex(4);
		 */
		page.SelectDistance10miles(driver).click();

	}

	@Then("^click on apply to result$")
	public void click_on_apply_to_result() {

		page.ClickOnApply(driver).click();

		
		reusable.waitfor(driver, 60);

	}

	@When("selecting distance from dropdown to select 25 miles")
	public void selecting_distance_from_dropdown_to_select_25_miles() {
		page.ClickOnSelectDistance(driver).click();
		/*
		 * WebElement distance_dropdown=driver.findElement(By.xpath(
		 * "//*[@class='select-control__value']")); Select s =new
		 * Select(distance_dropdown); s.selectByIndex(4);
		 */
		page.SelectDistance25miles(driver).click();

	}

	@Then("click on apply to search")
	public void click_on_apply_to_search() {

		page.ClickOnApply(driver).click();

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,500)");
	//	js.executeScript("window.scrollBy(0,-1400)");

	}

	@When("click on C Class Sedan")
    public void click_on_C_Class_Sedan()
    {
		reusable.checkPageIsReady(driver);
		
		page.Click_C_Class(driver).click();
	
    }
  
    @Then("click on view vehicle details")
    public void click_on_view_vehicle_details()
    {
    	reusable.checkPageIsReady(driver);
		
		page.ClickViewVehicle(driver).click();
    
        
    }
     
    @Then("click on specification")
    public void click_on_specification()
    {
    	 
        JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,500)");
		reusable.waitfor(driver, 60);
    }
   
    @Then("click on features")
    public void click_on_features()
    {
    	 
        JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,1000)");
		reusable.waitfor(driver, 60);
    }
   
    @Then("click on dealerlocation")
    public void click_on_dealerlocation()
    {
    	 
        JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,1500)");
		reusable.waitfor(driver, 60);
		js.executeScript("window.scrollBy(0,-1500)");
		
    }
    
    @When("click on build your deal")
    public void click_on_build_your_deal()
    
    {
    	JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,300)");
		
		WebDriverWait wait = new WebDriverWait(driver, 120);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"inventory-container\"]/div/div/div/section[1]/div/div/div[2]/div/div[3]/div/div/button")));
    	driver.findElement(By.xpath("//*[@id=\"inventory-container\"]/div/div/div/section[1]/div/div/div[2]/div/div[3]/div/div/button")).click();
		driver.close();
    }
    
  
}
