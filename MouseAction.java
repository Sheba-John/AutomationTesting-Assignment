package com.selenium.MavenProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class MouseAction {
	public static void handleMouseMovement(WebDriver driver) throws InterruptedException {
		driver.get("https://www.travolook.in/?");
		WebElement element = driver.findElement(By.linkText("Flights"));
        Actions action = new Actions(driver);
        action.moveToElement(element).perform();
		Thread.sleep(3000);
	driver.close();
	}

}
