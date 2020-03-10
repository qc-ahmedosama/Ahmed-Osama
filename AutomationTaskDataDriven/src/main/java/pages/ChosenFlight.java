package pages;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ChosenFlight {
		WebDriver driver;
		private final static By ChosenT= By.xpath("//*[@id=\"details-modal\"]/div/div/div[1]/div[1]/button");
		private final static By GoTime = By.xpath("//*[@id=\"details-modal\"]/div/div/div[1]/div[1]/div[2]/div/div/div[2]/div/div[2]/div[1]/span");
		private final static By ArrTime = By.xpath("//*[@id=\"details-modal\"]/div/div/div[1]/div[1]/div[2]/div/div/div[2]/div/div[2]/div[2]/span");
	
	public ChosenFlight(WebDriver driver) {
		this.driver = driver;
	}
	
	public void ChosenTrip() {
		driver.findElement(ChosenT).click();
	}
	
	public String GetTime() {
		return driver.findElement(GoTime).getText() + driver.findElement(ArrTime).getText();
		 
	}

}


//System.out.println(driver.findElement(By.xpath("//*[@id=\"details-modal\"]/div/div/div[1]/div[1]/div[2]/div/div/div[2]/div/div[2]/div[1]/span")).getText());
//System.out.println(driver.findElement(By.xpath("//*[@id=\"details-modal\"]/div/div/div[1]/div[1]/div[2]/div/div/div[2]/div/div[2]/div[2]/span")).getText());

