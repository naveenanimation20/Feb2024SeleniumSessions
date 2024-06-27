package seleniumsessions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

public class FluentWaitConcept {
	static WebDriver driver;

	public static void main(String[] args) {
		// Wait(I)-->FW(C)-->WebDriverWait

		driver = new ChromeDriver();
		driver.get("https://classic.crmpro.com/");
		By pricingLink = By.linkText("Pricing");

		//default polling time = 500 ms
		
		waitForElementVisibleWithFluentWait(pricingLink, 10, 2).click();
		
	}
	
	
	public static WebElement waitForElementVisibleWithFluentWait(By locator, int timeOut, int intervalTime) {
		
		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
				.withTimeout(Duration.ofSeconds(timeOut))
				.pollingEvery(Duration.ofSeconds(intervalTime))
				.ignoring(NoSuchElementException.class)
				.ignoring(StaleElementReferenceException.class)
				.withMessage("===element is not found===");


		return wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
		
	}
	
public static WebElement waitForElementPresenceWithFluentWait(By locator, int timeOut, int intervalTime) {
		
		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
				.withTimeout(Duration.ofSeconds(timeOut))
				.pollingEvery(Duration.ofSeconds(intervalTime))
				.ignoring(NoSuchElementException.class)
				.withMessage("===element is not found===");


		return wait.until(ExpectedConditions.presenceOfElementLocated(locator));
		
	}


	
	
	
	
	

}
