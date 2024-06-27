package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.openqa.selenium.support.locators.RelativeLocator.with;

import java.util.List;


public class RelativeLocatorWithCheckbox {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
//		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
//	
//		WebElement pp = driver.findElement(By.cssSelector("a.agree"));
//		
//		
//		//driver.findElement(with(By.name("agree")).toRightOf(pp)).isDisplayed();
//		
//		driver.findElement(with(By.name("agree")).toRightOf(pp)).click();
//		
//		driver.findElement(with(By.xpath("//input[@value='Continue']")).toRightOf(pp)).click();

	
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		
		WebElement header = driver.findElement(By.xpath("//h2[text()='New Customer']"));
		WebElement continueBtn = driver.findElement(By.linkText("Continue"));
		
		List<WebElement> paraList = driver.findElements(with(By.tagName("p")).below(header).above(continueBtn));
	
		for(WebElement e : paraList) {
			System.out.println(e.getText());
		}
		
		
		
		
	}

}
