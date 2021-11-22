package com.selenium.MavenProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {
	public static void handleDragAndDrop(WebDriver driver) throws InterruptedException {
		driver.get("https://jqueryui.com/droppable/");
		
		  		
    	WebElement From=driver.findElement(By.id("draggable"));
		
    		
        WebElement To=driver.findElement(By.id("droppable"));
    	
        
        Actions action = new Actions(driver);
        action.dragAndDrop(From, To).build().perform();
        
		Thread.sleep(1000);
	driver.close();
	}

}
