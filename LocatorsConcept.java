package com.selenium1;

import org.openqa.selenium.By;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LocatorsConcept {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "C:\\driver\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://login.yahoo.com/");
//1. id:
		driver.findElement(By.id("login-username")).sendKeys("shebajohn07@yahoo.com");
		
		//2. name:	
		driver.findElement(By.name("signin")).click();
		
		//3. link: only for links: all links are represented with "a" tag means angular tag
		driver.findElement(By.linkText("Forgot username?")).click();
		
		//4. Partial link: only for links:
		driver.findElement(By.partialLinkText("Forgot")).click();
		
		//5. class name: drawback-its not unique, eg next button and back button that has same blue background so same class name will be used,
		// its not different so selenium will be confused
		driver.findElement(By.className("phone-no ")).sendKeys("shebajohn07@yahoo.com");
		driver.findElement(By.className("pure-button puree-button-primary challenge-button")).click();
		

		
		
	}

}
