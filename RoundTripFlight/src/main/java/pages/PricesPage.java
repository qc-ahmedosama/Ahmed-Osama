package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class PricesPage {
	
		WebDriver driver;
		private final static By onestop = By.xpath("/html/body/div[2]/div[2]/div/div[2]/div[2]/div[1]/dl[1]/div/dd/div/div/div[2]/label/span");
		private final static By twostops = By.xpath("/html/body/div[2]/div[2]/div/div[2]/div[2]/div[1]/dl[1]/div/dd/div/div/div[3]/label/span");
		private final static By choice = By.xpath("//*[@id=\"app-root\"]/div[2]/div[2]/div[1]/div[3]/div[1]/div[3]/a/div/div[3]/div/button");
	
	public PricesPage(WebDriver driver) {
		this.driver = driver;
		
	}
	
	public void cheapest () {
		//First time I was locating the cheapest flight using this direct instead of using the drop box below.
//		 driver.findElement(By.xpath("//*[@id=\"app-root\"]/div[2]/div[2]/div[1]/div[2]/button[2]")).click();
		WebElement testDropDown = driver.findElement(By.id("secondarySort"));  
		Select dropdown = new Select(testDropDown);
		dropdown.selectByIndex(1); 
	}
	
	public void shortest () {
		driver.findElement(onestop).click();
		driver.findElement(twostops).click();
		driver.findElement(choice).click();
	}
	
}
 

