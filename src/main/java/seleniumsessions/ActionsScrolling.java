package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsScrolling {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		driver = new ChromeDriver();
		
		driver.get("https://www.amazon.in/");
		
		Actions act = new Actions(driver);
		
		//partial scrolling
//		act.sendKeys(Keys.PAGE_DOWN).perform();
//		Thread.sleep(2000);
//		
//		act.sendKeys(Keys.PAGE_UP).perform();

		
		//CMD/CONTROL + Arrow Key up/down
//		act.sendKeys(Keys.COMMAND).sendKeys(Keys.END).perform();
//		Thread.sleep(2000);
//		act.sendKeys(Keys.COMMAND).sendKeys(Keys.HOME).perform();
//		Thread.sleep(2000);
//		act.sendKeys(Keys.COMMAND).sendKeys(Keys.END).perform();

		
		//scroll to element:
		act.scrollToElement(driver.findElement(By.linkText("Help"))).click(driver.findElement(By.linkText("Help"))).build().perform();
			
		
		
	}

}
