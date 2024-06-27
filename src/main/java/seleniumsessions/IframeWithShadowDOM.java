package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IframeWithShadowDOM {

	public static void main(String[] args) throws InterruptedException {

		//Browser -- page -- shadowdom(open)--iframe--element
	
		
//		WebDriver driver = new ChromeDriver();
//		driver.get("https://selectorshub.com/iframe-in-shadow-dom/");
//		Thread.sleep(4000);
//		
//		String frameJSPath = "return document.querySelector(\"#userName\").shadowRoot.querySelector(\"#pact1\")";
//		
//		JavascriptExecutor js = (JavascriptExecutor)(driver);
//		
//		WebElement frameEle = (WebElement)js.executeScript(frameJSPath);
//		
//		driver.switchTo().frame(frameEle);
//		
//		//driver.findElement(By.id("glaf")).sendKeys("Learning");
//		//driver.findElement(By.id("close")).click();
//		
//		JavaScriptUtil jsUtil = new JavaScriptUtil(driver);
//		//jsUtil.clickElementByJS(driver.findElement(By.id("close")));
//		jsUtil.sendKeysUsingWithId("glaf", "Learning");
		
		By fn1 = getBy("Tom");
		System.out.println(fn1);
		
		By fn2 = getBy("Lisa");
		System.out.println(fn2);
	}
	
	
	public static By getBy(String userName) {
		By locator = By.xpath("//input[text()='"+userName+"']");
		return locator;
	}
	
	
	
	

}
