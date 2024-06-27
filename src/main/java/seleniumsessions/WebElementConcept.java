package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementConcept {
	
	static WebDriver driver;

	public static void main(String[] args) {

		driver = new ChromeDriver();//123
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		

		// create a webelement(FE) + perform an action (click, sendKeys, getText, isDisplayed...etc..)

		//id
		
		// 1.
//		driver.findElement(By.id("input-email")).sendKeys("naveen@gmail.com");
//		driver.findElement(By.id("input-password")).sendKeys("test@123");

		// 2.
//		WebElement emailId = driver.findElement(By.id("input-email"));
//		WebElement password = driver.findElement(By.id("input-password"));
//		
//		emailId.sendKeys("naveen@gmail.com");
//		password.sendKeys("test@123");

		// 3. By locator: OR
//		By emailId = By.id("input-email");
//		By password = By.id("input-password");
//		
//		WebElement emailId_ele = driver.findElement(emailId);
//		WebElement pwd_ele = driver.findElement(password);
//		
//		emailId_ele.sendKeys("naveen@gmail.com");
//		pwd_ele.sendKeys("test@123");

		// 4. By locator + Generic function for webelements
//		By emailId = By.id("input-email");
//		By password = By.id("input-password");
//		
//		getElement(emailId).sendKeys("naveen@gmail.com");
//		getElement(password).sendKeys("test@123");
		
		//5. By locator + Generic function for webelements and sendKeys
//		By emailId = By.id("input-email");
//		By password = By.id("input-password");
//		
//		doSendKeys(emailId, "naveen@gmail.com");
//		doSendKeys(password, "test@123");
		
		//6. By locator + Generic functions for webelements and sendKeys: ElementUtil
		By emailId = By.id("input-email");
		By password = By.id("input-password");
		
		ElementUtil eleUtil = new ElementUtil(driver);
		eleUtil.doSendKeys(emailId, "naveen@gmail.com");
		eleUtil.doSendKeys(password, "test@123");
		
		//7. By locator + BrowserUtil + ElementUtil
		
	}
	
	public static void doSendKeys(By locator, String value) {
		getElement(locator).sendKeys(value);
	}
	

	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}

}
