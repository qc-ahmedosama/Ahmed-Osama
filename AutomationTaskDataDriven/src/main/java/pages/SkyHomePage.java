package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class SkyHomePage {
		WebDriver driver;
		
//		private final static By  City= By.xpath("//input[@class='BpkInput_bpk-input__3-aQd SingleDestControls_fsc-large-above-tablet__1WC8y SingleDestControls_fsc-docked-middle-above-tablet___J8b1 SingleDestControls_fsc-docked-last-on-tablet__uU4v_ LocationSelector_fsc-location-input__2eRlW']");
		private final static By Date = By.xpath("//*[@id=\"depart-fsc-datepicker-button\"]");
		private final static By SelectMonth = By.xpath("//select[@class=\"BpkSelect_bpk-select__1L6LK\"]");
		private final static By SelectDay = By.xpath("//button[@aria-label=\"Wednesday, 10 June 2020\"]");
		private final static By DateBack = By.xpath("//button[@id=\"return-fsc-datepicker-button\"]");
		private final static By SelectDayBack = By.xpath("//button[@aria-label=\"Thursday, 18 June 2020\"]");
		private final static By Search = By.xpath("//button[@aria-label=\"Search flights\"]"); 
		FileDataReader readData = new FileDataReader();
		
	public SkyHomePage(WebDriver driver) {
			this.driver = driver;
		}
		
	public void GetURL() {
			driver.get(readData.read("DataDrivenDemoTestData.xlsx", 2, 3));
		}
	
	public void SelectCity(String CityKey) {
			driver.findElement(By.xpath(readData.read("DataDrivenDemoTestData.xlsx", 2, 1))).sendKeys(CityKey);

		}
	
	public void SelectDate() {
			driver.findElement(Date).click();
			WebElement testDropDown = driver.findElement(SelectMonth);  
			Select dropdown = new Select(testDropDown);
			dropdown.selectByIndex(3);
			driver.findElement(SelectDay).click();
			driver.findElement(DateBack).click();
			driver.findElement(SelectDayBack).click();
		}
	
	public void Search() {
			driver.findElement(Search).click();
		}
}


	
	