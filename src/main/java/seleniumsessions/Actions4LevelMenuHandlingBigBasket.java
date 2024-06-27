package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Actions4LevelMenuHandlingBigBasket {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		driver = new ChromeDriver();
		driver.get("https://www.bigbasket.com/");

		By level1 = By.xpath("(//button[contains(@id,'headlessui-menu-button')]//span[text()='Shop by'])[2]");
		By level2 = By.xpath("(//a[text()='Beauty & Hygiene'])[1]");
		By level3 = By.xpath("//a[text()='Makeup']");
		By level4 = By.xpath("//a[text()='Face']");

		//level4MenuSubMenuHandlingUsingClick(level1, level2, level3, level4);
		
		//level4MenuSubMenuHandlingUsingClick("Shop by", "Beauty & Hygiene", "Makeup", "Face");
		//level4MenuSubMenuHandlingUsingClick(level1, "Baby Care", "Baby Food & Formula", "Organic Baby Food");

		
		level4MenuSubMenuHandlingUsingClick(level1, level2, level3, level4);
	}

	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}
	
	
	public static void level4MenuSubMenuHandlingUsingClick(By level1, String level2, String level3, String level4)
			throws InterruptedException {
		
		//By level1 = By.xpath("(//button[contains(@id,'headlessui-menu-button')]//span[text()='Shop by'])[2]");

		
		getElement(level1).click();
		Thread.sleep(1000);

		Actions act = new Actions(driver);
		act.moveToElement(getElement(By.linkText(level2))).perform();
		Thread.sleep(1000);
		act.moveToElement(getElement(By.linkText(level3))).perform();
		Thread.sleep(1000);
		getElement(By.linkText(level4)).click();
	}
	
	

	public static void level4MenuSubMenuHandlingUsingClick(By level1, By level2, By level3, By level4)
			throws InterruptedException {

		getElement(level1).click();
		Thread.sleep(1000);

		Actions act = new Actions(driver);
		act.moveToElement(getElement(level2)).perform();
		Thread.sleep(1000);
		act.moveToElement(getElement(level3)).perform();
		Thread.sleep(1000);
		getElement(level4).click();

	}

	public static void level4MenuSubMenuHandlingUsingMouseHover(By level1, By level2, By level3, By level4)
			throws InterruptedException {

		Actions act = new Actions(driver);

		act.moveToElement(getElement(level1)).perform();
		Thread.sleep(1000);

		act.moveToElement(getElement(level2)).perform();
		Thread.sleep(1000);
		act.moveToElement(getElement(level3)).perform();
		Thread.sleep(1000);
		getElement(level4).click();

	}

}
