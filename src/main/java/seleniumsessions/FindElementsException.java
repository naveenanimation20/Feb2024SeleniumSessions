package seleniumsessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElementsException {

	static WebDriver driver;

	public static void main(String[] args)  {

		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");

		//driver.findElement(By.id("input-email111")).sendKeys("test@gmail.com");//NSE
		
		List<WebElement> rightLinksList = driver.findElements(By.xpath("//a[@class='list-group-item111']"));
		
		System.out.println(rightLinksList.size());//0
		
		
		
		
	}

}
