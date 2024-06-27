package seleniumsessions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitForFrame {

	static WebDriver driver;

	public static void main(String[] args) {

		driver = new ChromeDriver();// browser
		driver.get("https://www.formsite.com/templates/registration-form-templates/vehicle-registration-form/");// page

		driver.findElement(By.cssSelector("img[title='Vehicle-Registration-Forms-and-Examples']")).click();

		By frameLocator = By.xpath("//iframe[contains(@id,'frame-one')]");

		waitForFrameByLocator(frameLocator, 10);

		driver.findElement(By.id("RESULT_TextField-8")).sendKeys("Naveen");

		driver.switchTo().defaultContent();// back to main page

		String header = driver.findElement(By.cssSelector(".details__form-preview-title")).getText();
		System.out.println(header);
	}

	/**
	 * An expectation for checking whether the given frame is available to switch
	 * to. If the frame is available it switches the given driver to the specified
	 * frame.
	 * 
	 * @param frameLocator
	 * @param timeOut
	 */
	public static void waitForFrameByLocator(By frameLocator, int timeOut) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeOut));
		wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(frameLocator));

	}

	public static void waitForFrameByIndex(int frameIndex, int timeOut) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeOut));
		wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(frameIndex));

	}

	/**
	 * 
	 * @param frameIDOrName
	 * @param timeOut
	 */
	public static void waitForFrameByIndex(String frameIDOrName, int timeOut) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeOut));
		wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(frameIDOrName));

	}

	/**
	 * 
	 * @param frameElement
	 * @param timeOut
	 */
	public static void waitForFrameByIndex(WebElement frameElement, int timeOut) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeOut));
		wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(frameElement));

	}

}
