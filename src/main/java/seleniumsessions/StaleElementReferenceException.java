package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class StaleElementReferenceException {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		driver = new ChromeDriver();//browser
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");//page DOM v1
		
		By email_ele = By.id("input-email");
		
		getElement(email_ele).sendKeys("naveen@gmail.com");
		driver.navigate().refresh();
		getElement(email_ele).sendKeys("suma@gmail.com");
		
		
//		WebElement emailId = driver.findElement(By.id("input-email"));//v1
//		
//		emailId.sendKeys("naveen@gmail.com");//v1
//		Thread.sleep(2000);
//		
//		driver.navigate().refresh();
//		
//		//DOM v2
//		
//		Thread.sleep(2000);
//		
//		//v2
//		emailId = driver.findElement(By.id("input-email"));
//		
//		//v2
//		emailId.sendKeys("suma@gmail.com");

		
		
		
	}
	
	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}
	
	
	

}
