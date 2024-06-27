package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DisableElementConcept {

	static WebDriver driver;

	public static void main(String[] args)  {

		driver = new ChromeDriver();
		driver.get("https://seleniumpractise.blogspot.com/2016/09/how-to-work-with-disable-textbox-or.html");
		
//		By submitButton = By.id("submitButton");
//		
//		driver.findElement(submitButton).click();

//		driver.findElement(By.id("pass")).click();//nothing will happen with no exception
//		
//		driver.findElement(By.id("pass")).sendKeys("Naveen");//ElementNotInteractableException: element not interactable
		
		driver.findElement(By.id("passnew")).sendKeys("testing");
		//ElementNotInteractableException: element not interactable in case of sendKeys on disabled element
		
	}

}
