package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDropConcept {
	
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		driver = new ChromeDriver();
		
		//drag and element and drop at some other element
		driver.get("https://jqueryui.com/resources/demos/droppable/default.html");

		WebElement sourceEle = driver.findElement(By.id("draggable"));
		WebElement targetEle = driver.findElement(By.id("droppable"));
		
		Actions act = new Actions(driver);
		
//		act
//			.clickAndHold(sourceEle)
//					.moveToElement(targetEle)
//								.release().perform();
		
		act.dragAndDrop(sourceEle, targetEle).perform();
		
		//.perform()--->build.perform -- yes
		//.build() -- no
		//.build().perform()--->yes
		
	}
	
	public static void doDragAndDrop(By sourcelocator, By targetLocator) {
		WebElement sourceEle = driver.findElement(By.id("draggable"));
		WebElement targetEle = driver.findElement(By.id("droppable"));
		Actions act = new Actions(driver);
		act.dragAndDrop(sourceEle, targetEle).perform();
	}
	

}
