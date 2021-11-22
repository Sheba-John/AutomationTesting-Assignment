package com.selenium1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class radioandcheckbox {

	public static void main(String[] args)throws InterruptedException {
		
		System.setProperty("webdriver.gecko.driver", "C:\\driver\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://surveyheart.com/form/60dc4e7187d5d852ceff8df1#welcome");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("start_survey_button")).click();
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//*[@id=\"60dc4e7187d5d852ceff8df4\"]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"60dc4e7187d5d852ceff8df5\"]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"60dc4e7187d5d852ceff8df6\"]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"60dc4e7187d5d852ceff8df7\"]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"60dc4e7187d5d852ceff8df7\"]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"60dc4e7187d5d852ceff8df8\"]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"60dc4e7187d5d852ceff8df3_a\"]/p[6]/div/label")).click();
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("#\\36 0dc4e7187d5d852ceff8dfa_a > p:nth-child(3) > div > label")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"60dc4e7187d5d852ceff8dfc\"]")).click();
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("#\\36 0dc4e7187d5d852ceff8dfd")).click();
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("#\\36 0dc4e7187d5d852ceff8dfe")).click();
		
		driver.manage().window();
		Thread.sleep(9000);
		driver.close();
		
	}

}
