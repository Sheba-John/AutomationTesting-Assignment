package com.selenium.MavenProject;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class KeyBoardEvents {
	public static void KeyboardAction(WebDriver driver) throws InterruptedException {
		driver.get("https://www.instagram.com/sem/campaign/emailsignup/?");
		
		  		Actions act=new Actions(driver);
		  		driver.findElement(By.name("fullName")).sendKeys("Sheba");
		  		act.sendKeys(Keys.ENTER).perform();
    	
        
		Thread.sleep(3000);
	driver.close();
	}


}
