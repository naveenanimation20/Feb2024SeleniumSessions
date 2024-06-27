package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetAttributeValue {

	static WebDriver driver;

	public static void main(String[] args) {

		driver = new ChromeDriver();//123
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		
		By forgotPwd = By.linkText("Forgotten Password");
		By emailId = By.id("input-email");
		
//		String hrefVal = driver.findElement(forgotPwd).getAttribute("href");
//		System.out.println(hrefVal);
//		
//		String placeholderVal = driver.findElement(emailId).getAttribute("placeholder");
//		System.out.println(placeholderVal);
//		
//		driver.findElement(emailId).sendKeys("test@gmail.com");
//		String emailVal = driver.findElement(emailId).getAttribute("value");
//		System.out.println(emailVal);
//		String emailVal = driver.findElement(emailId).getText();
//		System.out.println(emailVal);
		
		String p = doGetAttribute(emailId, "placeholder");
		System.out.println(p);
		
		driver.findElement(emailId).sendKeys("test@gmail.com");
		String val = doGetAttribute(emailId, "value");
		System.out.println(val);
	}
	
	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}
	
	public static String doGetAttribute(By locator, String attrName) {
		return getElement(locator).getAttribute(attrName);
	}
	

}
