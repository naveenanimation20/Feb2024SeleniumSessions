package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SendKeysConcept {

	static WebDriver driver;

	public static void main(String[] args) {

		driver = new ChromeDriver();// 123
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");

		//driver.findElement(By.id("input-email")).sendKeys("naveen@gmail.com");
		//driver.findElement(By.id("input-email")).sendKeys(null);
		
		
		String name = "naveen";
		String desg = "SDET";
		StringBuilder sb = new StringBuilder("Automation");
		StringBuffer sf = new StringBuffer("Selenium");


		driver.findElement(By.id("input-email")).sendKeys(name, " ", desg, "Google", sb, sf);
		
		//address field: aprt name, block, flat number, 
		
		
	}

}
