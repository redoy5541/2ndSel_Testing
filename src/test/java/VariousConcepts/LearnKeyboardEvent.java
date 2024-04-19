package VariousConcepts;

import java.util.concurrent.TimeUnit;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class LearnKeyboardEvent {

	WebDriver driver;
	 
	 

	 By USER_NAME_FIELD = By.xpath("//*[@id=\"user_name\"]");
	 By PASSWORD_FIELD = By.xpath("//*[@id=\"password\"]");
	 By SIGN_IN_BUTTON_FIELD = By.xpath("//*[@id=\"login_submit\"]");


 @Before
public void init() {
	 
	
	 System.setProperty("webdriver.chrome.driver","/Users/mehediredoy/newworkspace/Selenium_Testing/drivers/chromedriver");
	 driver = new ChromeDriver();
	 driver.manage().deleteAllCookies();
	 driver.get("https://www.codefios.com/ebilling/login");
	 driver.manage().window().maximize();
	 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	 
	 
}


  @Test
  public void LoginTest() {
	 
	 
	 
	
	 
	 driver.findElement(USER_NAME_FIELD).sendKeys("demo@codefios.com");
	 driver.findElement(PASSWORD_FIELD).sendKeys("abc123");
	 //driver.findElement(SIGN_IN_BUTTON_FIELD).click();
	 
	 Actions action = new Actions(driver);
	 action.sendKeys(Keys.RETURN).build().perform();
	 
	 
	 
	 
	 
}

}



















