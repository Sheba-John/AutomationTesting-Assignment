package com.selenium1;

import org.openqa.selenium.By;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MyTest1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.id("email")).sendKeys("9762669664");
		driver.findElement(By.id("pass")).sendKeys("Roooyag");
		driver.findElement(By.id("u_0_d_pd")).click();
		
		driver.manage().window();
		Thread.sleep(3000);
		driver.close();
		
		
	}

}
