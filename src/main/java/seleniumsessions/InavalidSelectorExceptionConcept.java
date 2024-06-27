package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.InvalidSelectorException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class InavalidSelectorExceptionConcept {

	static WebDriver driver;

	public static void main(String[] args)  {

		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");

		//driver.findElement(By.id("input-email111")).sendKeys("test@gmail.com");//NSE
		
		//driver.findElement(By.xpath("//input//[@@@@id==='testing'@]")).click();
//		org.openqa.selenium.JavascriptException: javascript error
		
		//driver.findElement(By.cssSelector("input//[@id==='testing']")).click();
//		org.openqa.selenium.JavascriptException: javascript error
		
		
		//driver.findElement(By.xpath("//input[@id='naveen']")).click();
		//NoSuchElementException: no such element: Unable to locate element
		
		//driver.findElement(By.xpath("input[@#id='testing']")).click();
		//SyntaxError: Failed to execute 'evaluate' on 'Document':
		//The string 'input[@#id='testing']' is not a valid XPath expression
		
		driver.findElement(By.className("form-control input-lg")).sendKeys("testing");
		//InvalidSelectorException: Compound class names not permitted
	}

}
