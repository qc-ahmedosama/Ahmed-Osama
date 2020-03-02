package RoundTripFlight;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import pages.ChosenPage;
import pages.PricesPage;
import pages.Skyscanner;

import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.GeckoDriverInfo;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterClass;

public class RoundTest {
	
	WebDriver driver;
	Skyscanner Sky;
	PricesPage Prices;
	ChosenPage Chosen;
	String Time = "10:00";
	
  @Test
  public void f() {
	  Sky.getUrl();
	  Sky.Submit("Amsterdam (AMS)");
	  Prices.cheapest();
	  Prices.shortest();
	  Chosen.Trip();
	  
	  //This assertion on the the Go time that appeared on the Chosen ticket page.
	  assertEquals(Chosen.GoTime(),Time);
	  
  }
  @BeforeClass
  public void beforeClass() {
	  
	  //Test With Chrome , But it failed because of (I'm not a robot) message.
//	  WebDriverManager.chromedriver().setup();
//	  driver = new ChromeDriver();
	  
	  //FireFox without maven , can't find the right driver.
//	  System.setProperty("webdriver.gecko.driver","/src/main/resources/geckodriver.exe");
//	  WebDriver driver = new FirefoxDriver(); 
	  
	  //Test with FireFox.
	  WebDriverManager.firefoxdriver().setup();
	  driver = new FirefoxDriver();
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	  Sky = new Skyscanner(driver);
	  Prices = new PricesPage(driver);
	  Chosen = new ChosenPage(driver);
	  
  }
  
  @AfterClass
  public void afterClass() {
	  
	  driver.quit();
  }

}
