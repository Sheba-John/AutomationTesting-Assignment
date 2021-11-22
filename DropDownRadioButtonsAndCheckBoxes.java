package com.selenium1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;



public class DropDownRadioButtonsAndCheckBoxes {

	public static void main(String[] args)throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "C:\\driver\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.jeevansathi.com/register/customreg/15?source=d_b_genlp1&sh1=Meet%20over&sh2=10%20lakh%20profiles&campaignid=669875211&adgroupid=36667841991&matchtype=e&device=c&keyword=jeevansathi%20com%20registration&gclid=CjwKCAjwieuGBhAsEiwA1Ly_nc32-bGHwyEDeGFSl7OI5dLSjM-FhABVcw4gvrCJzMBmGDthfvFwhhoCqBEQAvD_BwE");
		driver.manage().window().maximize();
		driver.findElement(By.name("reg[email]")).sendKeys("john97@gmail.com");
		
		driver.findElement(By.name("reg[password]")).sendKeys("P@ssw0rd129");
		
		WebElement element = driver.findElement(By.xpath("//*[@id=\"reg_relationship\"]"));
		Select sel = new Select(element);
		sel.selectByVisibleText("Self");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"reg_gender_M\"]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"reg_gender_F\"]")).click();
		Thread.sleep(3000);
		WebElement elements = driver.findElement(By.xpath("//*[@id=\"reg_dtofbirth_day\"]"));
		Select sell = new Select(elements);
		sell.selectByVisibleText("1");
		
		WebElement elemnts = driver.findElement(By.xpath("//*[@id=\"reg_dtofbirth_month\"]"));
		Select sele = new Select(elemnts);
		sele.selectByVisibleText("Jan");
		
		WebElement elmnts = driver.findElement(By.xpath("//*[@id=\"reg_dtofbirth_year\"]"));
		Select sle = new Select(elmnts);
		sle.selectByVisibleText("1998");
		
		WebElement elemts = driver.findElement(By.xpath("//*[@id=\"reg_height\"]"));
		Select slec = new Select(elemts);
		slec.selectByVisibleText("4' 4\" (1.34 mts)");
		
		WebElement elemt = driver.findElement(By.xpath("//*[@id=\"reg_mstatus\"]"));
		Select slect = new Select(elemt);
		slect.selectByVisibleText("Never Married");
		
		WebElement elemnt = driver.findElement(By.xpath("//*[@id=\"reg_mtongue\"]"));
		Select selct = new Select(elemnt);
		selct.selectByVisibleText("Hindi/ Delhi");
		
		
		
		driver.findElement(By.xpath("//*[@id=\"reg_religion_chzn\"]/a/div/b")).click();
		
		 driver.findElement(By.xpath("//*[@id=\"reg_religion_chzn\"]/div/div/input")).click();
			
		 driver.findElement(By.id("reg_religion_chzn_o_4")).click();
		 
		 driver.findElement(By.xpath("//*[@id=\"reg_caste_chzn\"]/a/div/b")).click();
		 driver.findElement(By.xpath("//*[@id=\"reg_caste_chzn\"]/div/div/input")).click();
		 driver.findElement(By.id("reg_caste_chzn_o_4")).click();
		 
		
		Thread.sleep(3000);
		driver.findElement(By.name("outside_inda")).click();
		Thread.sleep(3000);
		driver.findElement(By.name("outside_inda")).click();
		
		driver.findElement(By.xpath("//*[@id=\"reg_city_res_chzn\"]/a/div/b")).click();
		driver.findElement(By.xpath("//*[@id=\"reg_city_res_chzn\"]/div/div/input")).click();
		driver.findElement(By.id("reg")).click();
		driver.findElement(By.id("reg_phone_mob_mobile")).sendKeys("9623669664");
		
		Thread.sleep(6000);
		driver.findElement(By.name("termsandconditions")).click();
		Thread.sleep(3000);
		driver.findElement(By.name("termsandconditions")).click();
		
		driver.manage().window();
		Thread.sleep(9000);
		driver.close();
	}

}
