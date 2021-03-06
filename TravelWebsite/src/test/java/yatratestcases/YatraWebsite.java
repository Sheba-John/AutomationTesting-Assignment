package yatratestcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class YatraWebsite {
	static WebDriver driver;
	static WebDriverWait wait;
	
	@BeforeMethod
	public static void setup() {
		WebDriverManager.chromedriver().setup();
		//System.setProperty("webdriver.gecko.driver","C:\\driver\\geckodriver.exe");
		driver = new ChromeDriver();
		System.out.println("Browser launched succesfully...");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		wait = new WebDriverWait(driver, 20);
		driver.get("https://www.yatra.com/");
	}



	
	
	@Test(priority=1,description="This is flight search test")
	public static void verifyflightdetail() throws InterruptedException {
		String expectedURL = "https://flight.yatra.com/air-search-ui";
		
		
		Actions action=new Actions(driver);
		Thread.sleep(1000);

		driver.findElement(By.xpath("//*[@id=\"BE_flight_origin_city\"]")).click();
	     action.sendKeys(Keys.ARROW_DOWN).perform();
	     action.sendKeys(Keys.ARROW_DOWN).perform();
	     action.sendKeys(Keys.ARROW_DOWN).perform();
	     Thread.sleep(2000);
		action.sendKeys(Keys.ENTER).perform();
		Thread.sleep(3000);
		
		
		Actions act=new Actions(driver);
		Thread.sleep(1000);

		driver.findElement(By.id("BE_flight_arrival_city")).click();
	     // act.sendKeys("Banglore(BLR)");
	     act.sendKeys(Keys.ARROW_DOWN).perform();
	     Thread.sleep(1000);
	     act.sendKeys(Keys.ARROW_DOWN).perform();
	     Thread.sleep(2000);
		action.sendKeys(Keys.ENTER).perform();
		Thread.sleep(3000);
		



	driver.findElement(By.name("flight_origin_date")).click();
	Thread.sleep(1000);
//	driver.findElement(By.id("01/12/2021")).click();
//	Thread.sleep(1000);
	String flag = "False";
	 

	  while(flag=="False") {
	   
	   if(driver.findElements(By.xpath("//*[@id=\"11/12/2021\"]")).size()>0) {
	    
	   driver.findElement(By.xpath("//*[@id=\"11/12/2021\"]")).click(); 
	   flag="True";
	   Thread.sleep(5000);
	   }
	   
	   else {
	    Thread.sleep(5000);
	    driver.findElement(By.xpath("/html/body/div[2]/div/section/div[1]/div/div[1]/section/div/div/div/div[3]/div/i")).click();
	   }
	  }
	
	
	
	
	
	

		
		driver.findElement(By.xpath("//*[@id=\"BE_flight_paxInfoBox\"]/i")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"BE_flight_passengerBox\"]/div[1]/div[1]/div/div/span[2]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"BE_flight_paxInfoBox\"]/i")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"BE_flight_form_wrapper\"]/div[3]/div[1]/div[1]/a/i")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("BE_flight_flsearch_btn")).click();
		Thread.sleep(2000);
		//Extract pageURL
	
		String actualURL = driver.getCurrentUrl();
		
		//Assertion
		Assert.assertEquals(actualURL, expectedURL);
	}
	
	@Test 
	public void verify() {
		
		
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



