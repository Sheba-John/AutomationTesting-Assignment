package com.selenium1;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GmailSignin {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "C:\\driver\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://accounts.google.com");
		driver.findElement(By.id("identifierId")).sendKeys("shebajohn07@gmail.com");
		driver.findElement(By.id("identifierNext")).click();
		driver.findElement(By.id("password")).sendKeys("sheba1234");
		driver.findElement(By.id("passwordNext")).click();
		driver.manage().window();
		Thread.sleep(9000);
		driver.close();
		
		

	}

}
