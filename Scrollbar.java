package com.selenium.MavenProject;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class Scrollbar {
	public static void handleScroll(WebDriver driver) {
		
		driver.get("https://www.yatra.com/");
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,2500)");
		
		js.executeScript("console.log(document.title);");
		
	}

}
