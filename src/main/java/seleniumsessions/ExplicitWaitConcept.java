package seleniumsessions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWaitConcept {
	
	static WebDriver driver;

	public static void main(String[] args) {

		
		//Wait(I) - until();
			//implemented by FluentWait(C) -- methods(){} + until(){}
							//extended by WebDriverWait(C) --> Inherited methods + individual methods
		
		//Don't mix imp wait and exp wait
		
		//e1 : 20     +    10 ---> 30 secs
		//e1:  5      +     2 ----> 7 secs
		//e1:  18     +     1   --->19 secs
		//e1:  0      +     9 ----> 9 secs
		//e1: 21(NSE) +     10(NSE) --> 31 secs
		//e1:   0    +      0   ---> 0 secs
		//e1: 20      +     0  ---> 20 secs
		
		
		
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		
		//driver.fe();//20--2 secs: 
		
		
		By emailId = By.id("input-email");
		By password = By.id("input-password");
		By loginBtn = By.xpath("//input[@value='Login']");
		
//		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));//sel 4.x
//		WebElement email_ele = wait.until(ExpectedConditions.presenceOfElementLocated(emailId));
//		email_ele.sendKeys("test@gmail.com");
//		
//		
//		getElement(password).sendKeys("test@123");
//		getElement(loginBtn).click();
		
		//waitForElementPresence(emailId, 10).sendKeys("test@gmail.com");
//		getElement(password).sendKeys("test@123");
//		waitForElementPresence(loginBtn, 5).click();
		
		//waitForElementVisible(emailId, 10).sendKeys("test@gmail.com");
		
		ElementUtil elUtil = new ElementUtil(driver);
		elUtil.doSendKeys(emailId, "sum@gmail.com", 10);
		elUtil.doSendKeys(password, "suma@123");
		elUtil.doClick(loginBtn, 5);
		
		
		
	}
	
	/**
	 * An expectation for checking that an element is present on the DOM of a page.
	 * This does not necessarily mean that the element is visible.
	 * @param locator
	 * @param timeOut
	 * @return
	 */
	public static WebElement waitForElementPresence(By locator, int timeOut) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeOut));
		return wait.until(ExpectedConditions.presenceOfElementLocated(locator));

	}
	
	/**
	 * An expectation for checking that an element is present on the DOM of a page and visible.
	 * Visibility means that the element is not only displayed but also has a height and width that is greater than 0.
	 * @param locator
	 * @param timeOut
	 * @return
	 */
	public static WebElement waitForElementVisible(By locator, int timeOut) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeOut));
		return wait.until(ExpectedConditions.visibilityOfElementLocated(locator));

	}
	
	
	
	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}
	
	//Sunday - 7 AM IST
	
	

}
