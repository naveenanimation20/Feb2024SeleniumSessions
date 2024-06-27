package seleniumsessions;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PseudoElementHandle {

	public static void main(String[] args) {

		//Pseudo classes:
		//::Before
		//::After
		//::Has
		
		String firstNameJSContent = 
				"return window.getComputedStyle(document.querySelector(\"label[for='input-firstname']\"), '::before').getPropertyValue('content');";
		
		String firstNameJSColor = 
				"return window.getComputedStyle(document.querySelector(\"label[for='input-firstname']\"), '::before').getPropertyValue('color');";
		
		
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		
		JavascriptExecutor js = ((JavascriptExecutor) driver);
		String mand_fieldText = js.executeScript(firstNameJSContent).toString();
		System.out.println(mand_fieldText);
		if(mand_fieldText.contains("*")) {
			System.out.println("first name is mandatory field");
		}
		
		String firstNameColor = js.executeScript(firstNameJSColor).toString();
		System.out.println(firstNameColor);
		if(firstNameColor.contains("rgb(255, 0, 0)")) {
			System.out.println("first name mand field is with red color");
		}
		
	}

}
