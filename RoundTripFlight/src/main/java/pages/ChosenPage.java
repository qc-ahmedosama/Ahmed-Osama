package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ChosenPage {
	WebDriver driver;
		private final static By choice = By.xpath("//*[@id=\"details-modal\"]/div/div/div[1]/div[1]/button");
		private final static By time = By.xpath("//*[@id=\"details-modal\"]/div/div/div[1]/div[1]/div[2]/div/div/div[2]/div/div[2]/div[1]/span");
		
	public ChosenPage(WebDriver driver) {
		this.driver = driver;
		
	}
	
	public void Trip () {
		driver.findElement(choice).click();
	}
	
	public String GoTime () {
		return driver.findElement(time).getText();
		
	}

}

