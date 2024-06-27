package seleniumsessions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitForTitleAndURL {
	
	static WebDriver driver;

	public static void main(String[] args) {

		driver = new ChromeDriver();
		driver.get("https://classic.crmpro.com/");
		
		ElementUtil elUtil = new ElementUtil(driver);
		elUtil.isPageLoaded(2);
		
		
		

		By pricingLink = By.linkText("Pricing");

		ElementUtil elutil = new ElementUtil(driver);
		elutil.clickWhenReady(pricingLink, 10);

//		String title = waitForTitleContains("PRICING11", 5);
//		System.out.println(title);
//		System.out.println(title.contains("PRICING11"));
		
		
		String actURL = waitForURLContains("pricing.html", 5);
		System.out.println(actURL);
	}
	
	public static String waitForURLContains(String urlFraction, int timeOut) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeOut));

		try {
			if (wait.until(ExpectedConditions.urlContains(urlFraction))) {
				return driver.getCurrentUrl();
			}
		} catch (TimeoutException e) {
			System.out.println("URL not found");
		}
		return driver.getCurrentUrl();
	}
	
	public static String waitForURLToBe(String urlValue, int timeOut) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeOut));

		try {
			if (wait.until(ExpectedConditions.urlToBe(urlValue))) {
				return driver.getCurrentUrl();
			}
		} catch (TimeoutException e) {
			System.out.println("URL not found");
		}
		return driver.getCurrentUrl();
	}
	
	
	
	
	
	public static String waitForTitleContains(String titleFraction, int timeOut) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeOut));

		try {
			if (wait.until(ExpectedConditions.titleContains(titleFraction))) {
				return driver.getTitle();
			}
		} catch (TimeoutException e) {
			System.out.println("title not found");
		}
		return driver.getTitle();
	}
	
	public static String waitForTitleToBe(String titleVal, int timeOut) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeOut));

		try {
			if (wait.until(ExpectedConditions.titleIs(titleVal))) {
				return driver.getTitle();
			}
		} catch (TimeoutException e) {
			System.out.println("title not found");
		}
		return driver.getTitle();
	}
	
	
	

}
