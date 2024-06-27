package seleniumsessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownGetOptionsWithoutSelectClass {
	static WebDriver driver;

	public static void main(String[] args) {

		// 1. select a value from drop down without using select class methods: by index, by value, by visibletext
		// 2. select a value from drop down without using select class

		driver = new ChromeDriver();
		driver.get("https://www.orangehrm.com/en/contact-sales/");

		By country = By.id("Form_getForm_Country");
		By employee = By.id("Form_getForm_NoOfEmployees");
		
		//selectValueFromDropDown(country, "India");
		
		By coutryOptions = By.xpath("//select[@id='Form_getForm_Country']/option");
		selectValueFromDropDownWithoutSelectClass(coutryOptions, "Brazil");
	}

	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}

	public static void selectValueFromDropDown(By locator, String optionText) {
		Select select = new Select(getElement(locator));
		List<WebElement> optionsList = select.getOptions();

		for (WebElement e : optionsList) {
			String text = e.getText();
			if (text.equals(optionText.trim())) {
				e.click();
				break;
			}
		}

	}
	
	
	public static void selectValueFromDropDownWithoutSelectClass(By locator, String optionText) {
		List<WebElement> optionsList = driver.findElements(locator);
		for(WebElement e : optionsList) {
			String text = e.getText();
				if(text.equals(optionText)) {
					e.click();
					break;
				}
		}

	}
	

}
