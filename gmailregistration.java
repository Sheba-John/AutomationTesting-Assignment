package com.selenium1;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class gmailregistration {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://accounts.google.com/signup/v2/webcreateaccount?hl=en&flowName=GlifWebSignIn&flowEntry=SignUp");
		driver.findElement(By.cssSelector("#firstName")).sendKeys("sheba");
		driver.findElement(By.cssSelector("#lastName")).sendKeys("John");
		driver.findElement(By.cssSelector("#username")).sendKeys("johnsheba004");
		driver.findElement(By.cssSelector("#passwd > div.aCsJod.oJeWuf > div > div.Xb9hP > input")).sendKeys("sheba1432#");
		driver.findElement(By.cssSelector("#confirm-passwd > div.aCsJod.oJeWuf > div > div.Xb9hP > input")).sendKeys("sheba1432#");
		driver.findElement(By.cssSelector("#accountDetailsNext > div > button")).click();
		
		driver.findElement(By.cssSelector("#phoneNumberId")).sendKeys("+919623548943");
		
		driver.findElement(By.cssSelector("#month")).sendKeys("May");
		driver.findElement(By.cssSelector("#day")).sendKeys("21");
		driver.findElement(By.cssSelector("#year")).sendKeys("1998");
		driver.findElement(By.cssSelector("#gender")).sendKeys("Female");
		
		driver.findElement(By.cssSelector("#view_container > div > div > div.pwWryf.bxPAYd > div > div.zQJV3 > div > div.qhFLie > div > div > button")).click();
		
		driver.manage().window();
		Thread.sleep(9000);
		driver.close();
		
		

	}

}
