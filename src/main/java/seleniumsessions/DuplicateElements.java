package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DuplicateElements {

	static WebDriver driver;

	public static void main(String[] args) {

		driver = new ChromeDriver();// 123
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");

		//driver.findElement(By.linkText("Forgotten Password")).click();
		
		By forgotpwdLink = By.linkText("Forgotten Password");
		By loginLink = By.linkText("Login");

		doClick(forgotpwdLink);
		doClick(loginLink);

	}
	
	public static void doClick(By locator) {
		getElement(locator).click();
	}

	//by locator ---> webelement
	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}

}



