package com.selenium1;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MultiselectDeselect {

	public static void main(String[] args)throws InterruptedException {
		
		System.setProperty("webdriver.gecko.driver", "C:\\driver\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.zomato.com/pune/order-food-online");
		driver.manage().window().maximize();
		
		driver.findElement(By.partialLinkText("Kathaa")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/main/div/section[3]/div[1]/section/button/span/span")).click();
		
		driver.findElement(By.xpath("/html/body/div[30]/div/div[3]/section[2]/section/div[4]/div/span")).click();
		
		driver.findElement(By.className("rbbb40-0 hOEAIM")).click();


}
	
}