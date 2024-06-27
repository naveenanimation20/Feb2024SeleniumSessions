package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetBackgroundColor {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.get("https://classic.crmpro.com/");

		WebElement loginBtn = driver.findElement(By.xpath("//input[@value='Login']"));
		String color = loginBtn.getCssValue("backgroundColor");
		System.out.println(color);
		
		
	}

}
