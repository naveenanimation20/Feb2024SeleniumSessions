package seleniumsessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSearch {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		driver = new ChromeDriver();
			
		
		//driver.get("https://www.google.com/");
		
//		By searchField = By.name("q");
//		By suggestions = By.xpath("//ul[@class='G43f7e']//div[@class='wM6W7d']/span");
//		
//		//doSearch(searchField, "Cypress testing", suggestions, "jobs");
//		doSearch(searchField, "Selenium", suggestions, "framework");


		driver.get("https://www.flipkart.com/");
		
		By searchField = By.name("q");
		By suggestions = By.xpath("//ul[@class='_1sFryS _2x2Mmc _3ofZy1']//div[@class='YGcVZO _2VHNef']");
		
		doSearch(searchField, "macbook", suggestions, "pro m3");
		
	}

	public static void doSearch(By searchField, String searchKey, By suggestions, String value) throws InterruptedException {
		driver.findElement(searchField).sendKeys(searchKey);

		Thread.sleep(3000);

		List<WebElement> suggList = driver.findElements(suggestions);

		System.out.println(suggList.size());

		for (WebElement e : suggList) {
			String text = e.getText();
			System.out.println(text);
			if (text.contains(value)) {
				e.click();
				break;
			}
		}
	}

}
