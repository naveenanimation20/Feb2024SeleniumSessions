package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.openqa.selenium.support.locators.RelativeLocator.with;


public class RelativeLocatorsConcept {

	public static void main(String[] args) throws InterruptedException {
//sel 4.x
//					above
//					|
//					|
//		//left<---webelement ---> right
//					|
//					|
//			near	below
		
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.aqi.in/dashboard/canada");
	Thread.sleep(3000);
	WebElement ele = driver.findElement(By.linkText("Red Deer, Canada"));	
	
	String leftRank = driver.findElement(with(By.tagName("p")).toLeftOf(ele)).getText();
	System.out.println(leftRank);
		
	String aqiScore = driver.findElement(with(By.tagName("p")).toRightOf(ele)).getText();
	System.out.println(aqiScore);
	
	String belowCity = driver.findElement(with(By.tagName("p")).below(ele)).getText();
	System.out.println(belowCity);
	
	String aboveCity = driver.findElement(with(By.tagName("p")).above(ele)).getText();
	System.out.println(aboveCity);
	
	String nearCity = driver.findElement(with(By.tagName("p")).near(ele)).getText();
	System.out.println(nearCity);
	
	}

}
