package seleniumsessions;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TotalLinks {
	
	//total links
	//fetch the text of each link (if text is present)
	//check link is valid/not broken

	static WebDriver driver;

	public static void main(String[] args) {

		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/");
		
		//htmltag = <a>
//		List<WebElement> linksList = driver.findElements(By.tagName("a"));
//		
//		System.out.println("total links = " + linksList.size());
//		
//		for(int i=0; i<linksList.size(); i++) {
//			String text = linksList.get(i).getText();
//				if(text.length()!=0) {
//					System.out.println(text);
//				}
//		}
//		
//		System.out.println("-------");
//		
//		//
//		for(WebElement e : linksList) {
//			String text = e.getText();
//			if(text.length()!=0) {
//				System.out.println(text);
//			}
//		}
		
		By links = By.tagName("a");
		By images = By.tagName("img");

		System.out.println("total links = " + getElementsCount(links));
		System.out.println("total images = " + getElementsCount(images));
		
		List<String> linksTextList = getElementsTextList(links);
		System.out.println(linksTextList);
		
		System.out.println(linksTextList.contains("Shopping Cart"));

		
	}
	
	
	public static List<WebElement> getElements(By locator) {
		return driver.findElements(locator);
	}
	
	public static int getElementsCount(By locator) {
		return getElements(locator).size();
	}
	
	
	//WAF: to fetch the text of each link, store it in some list and return. text should not be a blank
	//name: getElementTextList
	//param: By locator
	//return: List<String>
	
	public static List<String> getElementsTextList(By locator) {
		List<WebElement> eleList = getElements(locator);
		List<String> eleTextList = new ArrayList<String>();//pc=0, size=0
		
		for(WebElement e : eleList) {
			String text = e.getText();
				if(text.length()!=0) {
					eleTextList.add(text);
				}
		}
		
		return eleTextList;
	}
	
	
	

}
