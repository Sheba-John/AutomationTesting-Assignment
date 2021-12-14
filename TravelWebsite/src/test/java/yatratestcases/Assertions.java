package yatratestcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assertions {
	static WebDriver driver;
	static WebDriverWait wait; 
	
	@BeforeMethod
	public static void setup() {
		WebDriverManager.chromedriver().setup();
		
		driver = new ChromeDriver();
		System.out.println("Browser launched succesfully...");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		wait = new WebDriverWait(driver, 20);
		driver.get("https://www.yatra.com/");
	}

	
	
	
 @Test
 public void verifyTitle() {
	 String expectedtitle = "Flight, Cheap Air Tickets , Hotels, Holiday, Trains Package Booking - Yatra.com";
	 String actualtitle = driver.getTitle();
	 Assert.assertEquals(actualtitle, expectedtitle);
	
 }
}
