package yatratestcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Cleartrip {
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
		driver.get("https://www.cleartrip.com");
	}
	@Test(priority=1)
	public static void verifyflightdetail() throws InterruptedException {
		driver.findElement(By.xpath("/html/body/div[1]/div/div/div[1]/div/div[1]/div[2]/ul/li[1]/a")).click();
		
		Thread.sleep(2000);
		 driver.findElement(By.xpath("/html/body/div[1]/div/div/div[1]/div/div[2]/div/div[2]/label[1]/div[1]/span")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[1]/div/div/div[1]/div/div[2]/div/div[2]/label[2]/div[1]/span")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[1]/div/div/div[1]/div/div[2]/div/div[2]/label[3]/div[1]/span")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[1]/div/div/div[1]/div/div[2]/div/div[2]/label[2]/div[1]/span")).click();
		Thread.sleep(2000);
		
		

		driver.findElement(By.xpath("/html/body/div[1]/div/div/div[1]/div/div[2]/div/div[3]/div[1]/div[1]/div/div/div[1]/input")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[1]/div/div/div[1]/div/div[2]/div/div[3]/div[1]/div[1]/div/div/div[2]/ul/li[1]/p")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[1]/div/div/div[1]/div/div[2]/div/div[3]/div[1]/div[1]/div/div/div[1]/input")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[1]/div/div/div[1]/div/div[2]/div/div[3]/div[1]/div[1]/div/div/div[2]/ul/li[2]")).click();
		Thread.sleep(2000);
	driver.findElement(By.xpath("/html/body/div[1]/div/div/div[1]/div/div[2]/div/div[3]/div[1]/div[5]/div/div/div[1]/input")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("/html/body/div[1]/div/div/div[1]/div/div[2]/div/div[3]/div[1]/div[5]/div/div/div[2]/ul/li[3]/p")).click();
	Thread.sleep(2000);
	

	driver.findElement(By.xpath("/html/body/div[1]/div/div/div[1]/div/div[2]/div/div[3]/div[3]/div/div/div/div/button[1]")).click();
	  Thread.sleep(2000);
	  String flag = "False";
	  while(flag=="False") {
		   
		   if(driver.findElements(By.xpath("//div[@class='DayPicker-Day'][contains(@aria-label,'Fri Dec 17 2021')]")).size()>0) {
		    
		   WebElement date=driver.findElement(By.xpath("//div[@class='DayPicker-Day'][contains(@aria-label,'Fri Dec 17 2021')]"));
		   date.click();
		   date.sendKeys(Keys.ENTER);
				   flag="True";
		   Thread.sleep(2000);
		   }
		   
		   else {
		    Thread.sleep(2000);
		    driver.findElement(By.xpath("/html/body/div[1]/div/div/div[1]/div/div[2]/div/div[3]/div[3]/div/div/div/div/div[2]/ul/div[2]/div/div[1]/div[2]/svg/g/path[3]")).click();
		   }
		  }
	  
	  driver.findElement(By.xpath("/html/body/div[1]/div/div/div[1]/div/div[2]/div/div[3]/div[3]/div/div/div/div/button[2]")).click();
	Thread.sleep(2000);
	String flag2 = "False";
	while(flag2=="False") {
		   
		   if(driver.findElements(By.xpath("//div[@class='DayPicker-Day'][contains(@aria-label,'Wed Jan 05 2022')]")).size()>0) {
		    
		   WebElement dat=driver.findElement(By.xpath("//div[@class='DayPicker-Day'][contains(@aria-label,'Wed Jan 05 2022')]"));
		   dat.click();
		   dat.sendKeys(Keys.ENTER);
				   flag="True";
		   Thread.sleep(2000);
		   }
		   
		   else {
		    Thread.sleep(2000);
		    driver.findElement(By.xpath("/html/body/div[1]/div/div/div[1]/div/div[2]/div/div[3]/div[3]/div/div/div/div/div[2]/ul/div[2]/div/div[1]/div[2]/svg/g/path[3]")).click();
		   }
		  }
	
	
		}
	@Test(priority=3)
	public static void Passenger() throws InterruptedException {
	Select adults = new Select(driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[1]/div/div[2]/div/div[4]/div/div[1]/select")));
	adults.selectByVisibleText("3");
	
	
	
			
}
	
}
