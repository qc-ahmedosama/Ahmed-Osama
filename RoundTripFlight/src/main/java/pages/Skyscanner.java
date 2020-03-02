package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Skyscanner {

	WebDriver driver;
	String url = "https://www.skyscanner.net/";
	private final static By city = By.xpath("//input[@class='BpkInput_bpk-input__3-aQd SingleDestControls_fsc-large-above-tablet__1WC8y SingleDestControls_fsc-docked-middle-above-tablet___J8b1 SingleDestControls_fsc-docked-last-on-tablet__uU4v_ LocationSelector_fsc-location-input__2eRlW']");
	private final static By search = By.xpath("//button[@type='submit']");
	
	
	public Skyscanner(WebDriver driver){
		this.driver = driver;
	}
	
	//methods
	 public void getUrl() {
		 driver.get(url);
	 }
	
	public void Submit(String CityKey ) {
		 driver.findElement(city).sendKeys(CityKey);
		 driver.findElement(search).click();
	 }
	
}


