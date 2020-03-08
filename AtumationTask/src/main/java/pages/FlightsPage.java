package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class FlightsPage {
	
		WebDriver driver;
		private final static By SelectCheaper= By.xpath("//select[@id=\"secondarySort\"]");
		private final static By OneStop =By.xpath("//*[@id=\"stops_content\"]/div/div/div[2]/label");
		private final static By TwoStops = By.xpath("//*[@id=\"stops_content\"]/div/div/div[3]/label");
		private final static By ChooseF = By.xpath("//*[@id=\"app-root\"]/div[2]/div[2]/div[1]/div[3]/div[1]/div[3]/a/div/div[3]/div/div/div/span");
	
	public FlightsPage(WebDriver driver) {
		this.driver = driver;
	}
	public void Cheaper() {
		WebElement cheapDrop =driver.findElement(SelectCheaper);
		Select cheapDownList = new Select(cheapDrop);
		cheapDownList.selectByIndex(1);
	}
	public void shortest() {
		driver.findElement(OneStop).click();
		driver.findElement(TwoStops).click();
	}
	public void ChoseFlight() {
		driver.findElement(ChooseF).click();
	}
}


