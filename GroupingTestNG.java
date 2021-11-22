import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class GroupingTestNG {
	public WebDriver driver;
	public String Url="https://opensource-demo.orangehrmlive.com/";
@Test(groups= {"login"})

public void test1() {
	System.setProperty("webdriver.gecko.driver","C:\\driver\\geckodriver.exe");
	driver=new FirefoxDriver();
	System.out.println("this is test1");
	driver.get(Url);
	driver.findElement(By.id("txtUsername")).sendKeys("Admin");
	  driver.findElement(By.id("txtPassword")).sendKeys("admin123");
	  
	  System.out.println("login process");
	
}
@Test(groups= {"forget password"})

public void test2() {
	System.out.println("this is test2");
	WebElement mylink = driver.findElement(By.linkText("Forgot your password?"));
	  mylink.click();
	  System.out.println("this is forget link");
}

@Test(groups= {"Reset Password"})
public void Resetpass() {
	  
	  driver.findElement(By.id("securityAuthentication_userName")).sendKeys("Admin123");;
	  WebElement myPass = driver.findElement(By.id("btnSearchValues"));
	  myPass.click();
	  System.out.println("this is Reset Password");
  }
@Test(groups= {"forget password", "cancel"})
public void Cancel() throws InterruptedException {
	  
	  
	  WebElement Can = driver.findElement(By.id("btnCancel"));
	  Can.click();
	  System.out.println("this is to go back to log in page");
	  Thread.sleep(3000);
  }
@Test(groups= {"cancel", "login"})
public void log(){
	
	System.out.println("this is to go back to log in page and log in");
	
}


}
