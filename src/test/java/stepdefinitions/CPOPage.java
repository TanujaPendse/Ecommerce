package stepdefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CPOPage {
	WebDriver driver;
	// section 1
	By cpo_button = By.xpath("//a[@class='button button_primary']");

	By zipcode_textfield = By.xpath("//*[@id=\"inventory-container\"]/div/div/div/div/div/div/div[1]/div/div[1]/div");

	By zipcode_city_state = By.xpath("/html/body/div[1]/div[1]/main/div[2]/div/div/div/div/div/div/div[1]/div/div[1]/div/input");

	By view_inventory_button = By.xpath("//*[@id=\"inventory-container\"]/div/div/div/div/div/div/div[2]/button");

	By click_on_distance = By.xpath("//*[@class='select-control__value']");

	By select_10miles = By.xpath("//li[contains(text(),'10 miles')]");

	By select_25miles = By.xpath("//li[contains(text(),'25 miles')]");

	By apply_button = By.xpath("//button[contains(text(),'Apply')]");
	
	By c_class=By.xpath("//div[contains(text(),'C-Class Sedan')]");
	
	By view_vehicle_details=By.xpath("/html/body/div[1]/div[1]/main/div[2]/div/div/div[3]/div/div/div/div[2]/div[1]/div/div/div[1]/div[1]/div/div/div[2]/div[1]/button");

	public CPOPage(WebDriver driver) {
		this.driver = driver;
	}

	// Section 1
	public WebElement ClickOnCPOInventory(WebDriver driver) {
		return driver.findElement(cpo_button);
	}

	public WebElement ClickOnTextField(WebDriver driver) {
		return driver.findElement(zipcode_textfield);
	}

	public WebElement EnterZipcodeCityState(WebDriver driver) {
		return driver.findElement(zipcode_city_state);

	}

	public WebElement ClickOnViewInventory(WebDriver driver) {
		return driver.findElement(view_inventory_button);

	}

	public WebElement ClickOnSelectDistance(WebDriver driver) {
		return driver.findElement(click_on_distance);

	}

	public WebElement SelectDistance10miles(WebDriver driver) {
		return driver.findElement(select_10miles);

	}

	public WebElement SelectDistance25miles(WebDriver driver) {
		return driver.findElement(select_25miles);

	}

	public WebElement ClickOnApply(WebDriver driver) {
		return driver.findElement(apply_button);

	}
	
	public WebElement Click_C_Class(WebDriver driver)
	{
		return driver.findElement(c_class);
	}

	public WebElement ClickViewVehicle(WebDriver driver)
	{
		return driver.findElement(view_vehicle_details);
	}
}