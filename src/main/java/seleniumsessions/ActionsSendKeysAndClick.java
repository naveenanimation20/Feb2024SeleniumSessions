package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class ActionsSendKeysAndClick {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		driver = new ChromeDriver();		
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		
		By firstName = By.id("input-firstname");
		
		Actions act = new Actions(driver);
				
		act.sendKeys(driver.findElement(firstName), "Automation").perform();
		

		act.click(driver.findElement(By.linkText("Forgotten Password"))).perform();
		
		
	}
	
	public static void doActionsSendKeys(By locator, String value) {
		Actions act = new Actions(driver);
		act.sendKeys(driver.findElement(locator), value).perform();
	}
	
	public static void doActionsClick(By locator, String value) {
		Actions act = new Actions(driver);
		act.click(driver.findElement(locator)).perform();
	}
	
	
	

}
