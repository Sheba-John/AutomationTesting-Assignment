package com.selenium1;

import org.openqa.selenium.By;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Facebook {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "C:\\driver\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://en-gb.facebook.com/");
		driver.findElement(By.linkText("Forgotten password?")).click();
		driver.manage().window();
		Thread.sleep(3000);
		driver.close();
		
		

	}

}
