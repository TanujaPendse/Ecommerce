package stepdefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BuildYourDealPage {
	WebDriver driver;
	// section 1
	By lets_get_started = By.xpath("//*[@id=\"vehicle-shopping-container\"]/div/div[1]/div/div/div/div/div[1]/div/div/ul/li[1]/button");
	
	By firstname=By.xpath("//input[@id='vs-first-name']");
	
	By lastname=By.xpath("//input[@id='vs-last-name']");
	
	By email=By.xpath("//input[@id='vs-email']");
	
	By terms_chkbox=By.xpath("//*[@id=\"vehicle-shopping-container\"]/div/div[1]/div/div/div/div/div[3]/div/div/div[1]/div[2]/div[2]/div/div[2]/div/form/div/div/div/div[4]/div/div/div/label");
	
	By continue_btn=By.xpath("//*[@id=\"vehicle-shopping-container\"]/div/div[1]/div/div/div/div/div[3]/div/div/div[1]/div[2]/div[2]/div/ul/li[1]/button");
	
	By zipcode=By.xpath("//input[@id='vs-zip-code']");
	
	By continue_btn1=By.xpath("//*[@id=\"vehicle-shopping-container\"]/div/div[1]/div/div/div/div/div[3]/div/div/div[1]/div[2]/div[2]/div/ul/li[1]/div/div/button");
	
	By phn_num=By.xpath("//*[@id=\"vs-phone\"]");
	
	By yes_btn=By.xpath("/html/body/div[1]/div[1]/main/div[2]/div/div[1]/div/div/div/div/div[3]/div/div/div[1]/div[2]/div[2]/div/div/div/form/div/div/div/div[1]/div/div/fieldset/div/div[1]/label/div");
	
	By cash_btn=By.xpath("//*[@id=\"vehicle-shopping-container\"]/div/div[1]/div/div/div/div/div[3]/div/div/div[1]/div[2]/div[2]/div/div/div/form/div/div/div/div[2]/div/div/fieldset/div/div[3]/label/div");
	
	By continue_btn2=By.xpath("//*[@id=\"vehicle-shopping-container\"]/div/div[1]/div/div/div/div/div[3]/div/div/div[1]/div[2]/div[2]/div/ul/li[1]/button");
	
	By continue_btn3=By.xpath("//*[@id=\"vehicle-shopping-container\"]/div/div[1]/div/div/div/div/div[3]/div/div/div[1]/div[2]/div[2]/div/ul/li[1]/button");
	
	By getvin= By.xpath("//*[@id=\"vehicle-shopping-container\"]/div/div[1]/div/div/div/div/div[2]/div/div[1]/div[1]/div[1]/div[2]/div[1]/p[2]");
	
	By entervin=By.xpath("//input[@id='tie-vin']");
	
	By findmyvehicle=By.xpath("//button[@type='submit']");
	
	By mileage=By.xpath("/html/body/div[1]/div[1]/main/div[2]/div/div[1]/div/div/div/div/div[3]/div/div/div[2]/div[2]/div[2]/div/div[2]/div/div[2]/div[1]/div/div/form/div/div[1]/div/div[1]/div/input");
	
	By trim=By.xpath("//li[contains(text(),'C 300 4MATIC')]");
	
	By color=By.xpath("//li[contains(text(),'Black')]");
	
	By tradeincondn=By.xpath("//*[@id=\"vehicle-shopping-container\"]/div/div[1]/div/div/div/div/div[3]/div/div/div[2]/div[2]/div[2]/div/div[2]/div/div[2]/div[1]/div/div/form/div/div[2]/div/div/div/div/fieldset/div/div[2]/label/div");
	
	By continue_btn4=By.xpath("//*[@id=\"vehicle-shopping-container\"]/div/div[1]/div/div/div/div/div[3]/div/div/div[2]/div[2]/div[2]/div/ul/li[1]/button");
	
	By continue_btn5=By.xpath("//*[@id=\"vehicle-shopping-container\"]/div/div[1]/div/div/div/div/div[3]/div/div/div[3]/div[2]/div[2]/div/ul/li[1]/button");
	
	By submitbtn=By.xpath("//*[@id=\"vehicle-shopping-container\"]/div/div[1]/div/div/div/div/div[3]/div/div/div[4]/div[2]/div[2]/div/ul/li[1]/div/div/button");
	
	public BuildYourDealPage(WebDriver driver) {
		this.driver = driver;
	}

	// Section 1
	public WebElement ClickOnLetsGetStarted(WebDriver driver)
	{
		return driver.findElement(lets_get_started);
	}
	
	public WebElement EnterFirstname(WebDriver driver) 
	{
		return driver.findElement(firstname);
	}
	
	
	public WebElement EnterLastname(WebDriver driver) 
	{
		return driver.findElement(lastname);
	}
	
	public WebElement EnterEmail(WebDriver driver) 
	{
		return driver.findElement(email);
	}
	
	public WebElement ClickOnTermsChkbox(WebDriver driver)
	{
		return driver.findElement(terms_chkbox);
	}
	
	public WebElement ClickOnContinueBtn(WebDriver driver)
	{
		return driver.findElement(continue_btn);
	}
	
	public WebElement EnterZipCode(WebDriver driver) 
	{
		return driver.findElement(zipcode);
	}
	
	public WebElement ClickOnContinue1Btn(WebDriver driver)
	{
		return driver.findElement(continue_btn1);
	}
	
	public WebElement EnterPhoneNum(WebDriver driver)
	{
		return driver.findElement(phn_num);
	}
	public WebElement ClickOnYesBtn(WebDriver driver)
	{
		return driver.findElement(yes_btn);
	}

	public WebElement ClickOnCashBtn(WebDriver driver)
	{
		return driver.findElement(cash_btn);
	}
	
	public WebElement ClickOnContinue2Btn(WebDriver driver)
	{
		return driver.findElement(continue_btn2);
	}
	
	public WebElement ClickOnContinue3Btn(WebDriver driver)
	{
		return driver.findElement(continue_btn3);
	}

	public WebElement GetVin(WebDriver driver)
	{
		return driver.findElement(getvin);
	}
	
	public WebElement EnterVin(WebDriver driver)
	{
		return driver.findElement(entervin);
	}
	
	public WebElement ClickOnFindMyVehicle(WebDriver driver)
	{
		return driver.findElement(findmyvehicle);
	}
	
	public WebElement EnterMileage(WebDriver driver)
	{
		return driver.findElement(mileage);
	}
	
	public WebElement EnterTrim(WebDriver driver)
	{
		return driver.findElement(trim);
	}
	
	public WebElement EnterColor(WebDriver driver)
	{
		return driver.findElement(color);
	}

	public WebElement EnterTradeInCondn(WebDriver driver)
	{
		return driver.findElement(tradeincondn);
	}
	
	public WebElement ClickOnContinue4Btn(WebDriver driver)
	{
		return driver.findElement(continue_btn4);
	}
	
	public WebElement ClickOnContinue5Btn(WebDriver driver)
	{
		return driver.findElement(continue_btn5);
	}
	
	public WebElement ClickOnSubmitBtn(WebDriver driver)
	{
		return driver.findElement(submitbtn);
	}
	
}
