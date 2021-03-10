package stepdefinitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class BuildYourDealTest {

	WebDriver driver;
	ReusableFunctions reusable = new ReusableFunctions();
	BuildYourDealPage page = new BuildYourDealPage(driver);

	@Given("User is on Build Your Deal Page {string}")
	public void user_is_on_build_your_deal_page(String Url) {
		System.setProperty("webdriver.chrome.driver", "./src/test/java/Driver/chromedriver_87.exe");
		driver = new ChromeDriver();
		
	   // driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);

		driver.navigate().to(Url);
		driver.manage().window().maximize();
	}

	@When("user clicks on Lets get Started")
	public void user_clicks_on_lets_get_started() {
		page.ClickOnLetsGetStarted(driver).click();
	}

	@Then("personal information form appears")
	public void personal_information_form_appears() {

	}



	@When("user enters {string} {string} and {string}")
	public void user_enters_and(String Firstname, String Lastname, String Email) {

		page.EnterFirstname(driver).sendKeys(Firstname);
		page.EnterLastname(driver).sendKeys(Lastname);
		page.EnterEmail(driver).sendKeys(Email);

		page.ClickOnTermsChkbox(driver).click();

		// reusable.waitfor(driver, 120);

		reusable.checkPageIsReady(driver);

		if (page.ClickOnContinueBtn(driver).isEnabled()) {
			page.ClickOnContinueBtn(driver).click();
			System.out.println("Moving on to second page");
		}

		page.ClickOnContinueBtn(driver).click();

		page.EnterZipCode(driver).sendKeys("10014");

		driver.findElement(By.xpath("//*[@id=\"vehicle-shopping-container\"]/div/div[1]/div/div/div/div/div[3]/div/div/div[1]/div[2]/div[2]/div/div[1]/p")).click();
		// page.EnterPhoneNum(driver).sendKeys("(989) 655-9895");

		reusable.checkPageIsReady(driver);
		page.EnterPhoneNum(driver).sendKeys("(989) 655-9895");

		reusable.waitfor(driver, 120);
		WebDriverWait wait = new WebDriverWait(driver, 120);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"vehicle-shopping-container\"]/div/div[1]/div/div/div/div/div[3]/div/div/div[1]/div[2]/div[2]/div/ul/li[1]/div/div/button")));
		driver.findElement(By.xpath("//*[@id=\"vehicle-shopping-container\"]/div/div[1]/div/div/div/div/div[3]/div/div/div[1]/div[2]/div[2]/div/ul/li[1]/div/div/button")).click();
		// page.ClickOnContinue1Btn(driver).click();
		// sSystem.out.println("Moving on to second page"); }
		reusable.checkPageIsReady(driver);
		// page.ClickOnContinue1Btn(driver).click();

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"vehicle-shopping-container\"]/div/div[1]/div/div/div/div/div[3]/div/div/div[1]/div[2]/div[2]/div/div/div/form/div/div/div/div[1]/div/div/fieldset/div/div[1]/label/div")));
		driver.findElement(By.xpath("//*[@id=\"vehicle-shopping-container\"]/div/div[1]/div/div/div/div/div[3]/div/div/div[1]/div[2]/div[2]/div/div/div/form/div/div/div/div[1]/div/div/fieldset/div/div[1]/label/div")).click();

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"vehicle-shopping-container\"]/div/div[1]/div/div/div/div/div[3]/div/div/div[1]/div[2]/div[2]/div/div/div/form/div/div/div/div[2]/div/div/fieldset/div/div[3]/label/div")));
		driver.findElement(By.xpath("//*[@id=\"vehicle-shopping-container\"]/div/div[1]/div/div/div/div/div[3]/div/div/div[1]/div[2]/div[2]/div/div/div/form/div/div/div/div[2]/div/div/fieldset/div/div[3]/label/div")).click();
		// page.ClickOnCashBtn(driver).click();

	}

	@Then("user clicks on continue button")
	public void user_clicks_on_continue_button() {

		page.ClickOnContinue2Btn(driver).click();
		page.ClickOnContinue3Btn(driver).click();
	}

	@Then("user enters trade in estimate details")
	public void user_enters_trade_in_estimate_details() {

		// reusable.scroll(driver,
		// driver.findElement(By.xpath("//*[@id=\"vehicle-shopping-container\"]/div/div[1]/div/div/div/div/div[3]/div/div/div[2]/div[2]/div[2]/div/div[2]/div/div/div[1]/div/div[3]/div[1]/h2")));
		// String vin= page.GetVin(driver).getText();

		reusable.scrolltobottom(driver);
		
		page.EnterVin(driver).sendKeys("55SWF4KB5HU201502");
		
		WebDriverWait wait =new WebDriverWait(driver, 120);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='vehicle-shopping-container']/div/div[1]/div/div/div/div/div[3]/div/div/div[2]/div[2]/div[2]/div/div[2]/div/div/div[1]/div/div[3]/div[1]/h2")));
		driver.findElement(By.xpath("//*[@id='vehicle-shopping-container']/div/div[1]/div/div/div/div/div[3]/div/div/div[2]/div[2]/div[2]/div/div[2]/div/div/div[1]/div/div[3]/div[1]/h2")).click();
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"vehicle-shopping-container\"]/div/div[1]/div/div/div/div/div[3]/div/div/div[2]/div[2]/div[2]/div/div[2]/div/div/div[1]/div/div[3]/div[2]/form/div/div[2]/div[2]/button")));
		driver.findElement(By.xpath("//*[@id=\"vehicle-shopping-container\"]/div/div[1]/div/div/div/div/div[3]/div/div/div[2]/div[2]/div[2]/div/div[2]/div/div/div[1]/div/div[3]/div[2]/form/div/div[2]/div[2]/button")).click();

		// page.ClickOnFindMyVehicle(driver).click();

		reusable.checkPageIsReady(driver);
		//reusable.waitfor(driver, 120);

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"tie-mileage\"]")));
		driver.findElement(By.xpath("//*[@id=\"tie-mileage\"]")).sendKeys("30000");

		reusable.waitfor(driver, 120);
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"vehicle-shopping-container\"]/div/div[1]/div/div/div/div/div[3]/div/div/div[2]/div[2]/div[2]/div/div[2]/div/div[2]/div[1]/div/div/form/div/div[1]/div/div[2]/div/div/div")));
		driver.findElement(By.xpath("//*[@id=\"vehicle-shopping-container\"]/div/div[1]/div/div/div/div/div[3]/div/div/div[2]/div[2]/div[2]/div/div[2]/div/div[2]/div[1]/div/div/form/div/div[1]/div/div[2]/div/div/div")).click();

		page.EnterTrim(driver).click();

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"vehicle-shopping-container\"]/div/div[1]/div/div/div/div/div[3]/div/div/div[2]/div[2]/div[2]/div/div[2]/div/div[2]/div[1]/div/div/form/div/div[1]/div/div[3]/div/div/div")));
		driver.findElement(By.xpath("//*[@id=\"vehicle-shopping-container\"]/div/div[1]/div/div/div/div/div[3]/div/div/div[2]/div[2]/div[2]/div/div[2]/div/div[2]/div[1]/div/div/form/div/div[1]/div/div[3]/div/div/div")).click();
		page.EnterColor(driver).click();

		page.EnterTradeInCondn(driver).click();

		page.ClickOnContinue4Btn(driver).click();

	}
	@Then("view warranty and maintenance products")
    public void view_warranty_and_maintenance_products()
	{
        reusable.checkPageIsReady(driver);
        reusable.waitfor(driver, 120);
        
        WebDriverWait wait = new WebDriverWait(driver, 120);
        
        reusable.scrolltobottom(driver);
        
        
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"vehicle-shopping-container\"]/div/div[1]/div/div/div/div/div[3]/div/div/div[3]/div[2]/div[2]/div/ul/li[1]/button")));
        driver.findElement(By.xpath("//*[@id=\"vehicle-shopping-container\"]/div/div[1]/div/div/div/div/div[3]/div/div/div[3]/div[2]/div[2]/div/ul/li[1]/button")).click();
      //page.ClickOnContinue5Btn(driver).click();
        }

 

     @Then("user submits the application")
    public void user_submits_the_application() {
    	 reusable.checkPageIsReady(driver);
         reusable.waitfor(driver, 120);
         
         WebDriverWait wait = new WebDriverWait(driver, 120);
         
         reusable.scrolltobottom(driver);
         
         
         wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"vehicle-shopping-container\"]/div/div[1]/div/div/div/div/div[3]/div/div/div[4]/div[2]/div[2]/div/ul/li[1]/div/div/button")));
         driver.findElement(By.xpath("//*[@id=\"vehicle-shopping-container\"]/div/div[1]/div/div/div/div/div[3]/div/div/div[4]/div[2]/div[2]/div/ul/li[1]/div/div/button")).click();
       

      //page.ClickOnSubmitBtn(driver).click();
      driver.close();
 

     }
}


