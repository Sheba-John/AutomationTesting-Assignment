package com.selenium1;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class gmaillogin {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "C:\\driver\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://accounts.google.com/");
		driver.findElement(By.id("identifierId")).sendKeys("shebajohn97@gmail.com");
		driver.findElement(By.cssSelector("#identifierNext > div > button")).click();
		driver.findElement(By.cssSelector("#password > div.aCsJod.oJeWuf > div > div.Xb9hP > input")).sendKeys("Jesuslove");
		driver.findElement(By.cssSelector("#passwordNext > div > button")).click();
		
		
		
		
		driver.manage().window();
		Thread.sleep(9000);
		driver.close();
		
		
		

	}

}
