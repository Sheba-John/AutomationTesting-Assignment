package com.selenium.MavenProject;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MainClass {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		//AllLinks.displayAllLinks(driver);
		//Scrollbar.handleScroll(driver);
		//DragAndDrop.handleDragAndDrop(driver);
		//KeyBoardEvents.KeyboardAction(driver);
		MouseAction.handleMouseMovement(driver);
	}

}
