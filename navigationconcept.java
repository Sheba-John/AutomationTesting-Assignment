package com.selenium1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.firefox.FirefoxDriver;


public class navigationconcept {

	public static void main(String[] args)throws InterruptedException {
		
		System.setProperty("webdriver.gecko.driver", "C:\\driver\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
		
		driver.navigate().to("https://www.aptechlearning.com/it/placement-placement-assistance.aspx");
		Thread.sleep(6000);
		driver.navigate().back();  //click back button
		Thread.sleep(3000);
		driver.navigate().forward();  //click forward button
		Thread.sleep(3000);
		driver.navigate().back();  //click back button
		Thread.sleep(3000);
		driver.navigate().to("https://www.udemy.com/topic/artificial-intelligence/");
		Thread.sleep(6000);
		driver.navigate().back();  //click back button
		Thread.sleep(3000);
		driver.navigate().to("https://www.shiksha.com/it-software/ai-robotics/colleges/colleges-mumbai-all");
		Thread.sleep(6000);
		driver.navigate().back();  //click back button
		driver.manage().window();
		Thread.sleep(9000);
		driver.close();
		
	}

}
