package flightbooking;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TripTest {
	static WebDriver driver;
	static WebDriverWait wait;
	
	@BeforeMethod
	public static void setup() {
//		WebDriverManager.chromedriver().setup();
		System.setProperty("webdriver.gecko.driver","C:\\driver\\geckodriver.exe");
		driver = new FirefoxDriver();
		System.out.println("Browser launched succesfully...");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		wait = new WebDriverWait(driver, 20);
		driver.get("https://www.makemytrip.com/");
	}
	@Test
	public static void verifyflightdetail() throws InterruptedException {
		String expectedURL = "https://www.makemytrip.com/";
		
		 Thread.sleep(1000);
	        WebElement elementPopup =driver.findElement(By.xpath("//*[@id=\"SW\"]/div[1]/div[1]/ul/li[3]"));
	        elementPopup.click();
	       	WebElement element = driver.findElement(By.xpath("//li[@data-cy ='roundTrip']//span"));
			element.click();
			Thread.sleep(2000);
			WebElement element1 = driver.findElement(By.xpath("//li[@data-cy ='oneWayTrip']//span"));
			element1.click();
			Thread.sleep(2000);
			
			
			
			driver.findElement(By.xpath("//span[contains(text(),'DEPARTURE')]")).click();
			  Thread.sleep(5000);
			  
			  String flag = "False";
			 

			  while(flag=="False") {
			   
			   if(driver.findElements(By.xpath("//div[@class='DayPicker-Day'][contains(@aria-label,'Aug 10 2022')]")).size()>0) {
			    
			   driver.findElement(By.xpath("//div[@class='DayPicker-Day'][contains(@aria-label,'Aug 10 2022')]")).click(); 
			   flag="True";
			   Thread.sleep(5000);
			   }
			   
			   else {
			    Thread.sleep(5000);
			    driver.findElement(By.xpath("//span[@class='DayPicker-NavButton DayPicker-NavButton--next']")).click();
			   }
			  }
			  
			  driver.findElement(By.cssSelector("#root > div > div.minContainer > div > div > div.fsw > p > a")).click();
			  
			  System.out.println("Test case is passed");
			  
			  String actualURL = driver.getCurrentUrl();
				
				
			 
				
				JavascriptExecutor js = (JavascriptExecutor) driver;
				js.executeScript("window.scrollBy(0,3500)");
				js.executeScript("console.log(document.title);");
				
				 driver.findElement(By.cssSelector("#flight_list_item_37_RKEY\\:a39b96dc-0c10-4240-a3b2-51a5cd0c79bb\\:64_0 > div:nth-child(1) > div:nth-child(2) > div:nth-child(4) > div:nth-child(1) > button:nth-child(2) > span:nth-child(1)")).click();
				
				
				
				//Assertion
				Assert.assertEquals(actualURL, expectedURL);
				
	}
		
	@AfterMethod
	public static void closeBrower() {
		driver.close();
		System.out.println("Browser closed succesfully...");
	}
	
	@AfterSuite
	public void cleanUp()
	{
		  System.out.println("we are closing completely...");
	}
	}



