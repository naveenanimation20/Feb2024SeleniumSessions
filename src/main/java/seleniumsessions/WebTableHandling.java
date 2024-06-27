package seleniumsessions;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTableHandling {

	static WebDriver driver;
	
	
	public static void main(String[] args) throws InterruptedException {
		driver = new ChromeDriver();
		driver.get("https://selectorshub.com/xpath-practice-page/");
		Thread.sleep(3000);
		
//		driver.findElement
//			(By.xpath("//a[text()='Joe.Root']/ancestor::tr//input[@type='checkbox']")).click();
		
		
//		driver.findElement(By.xpath("//a[text()='Joe.Root']/parent::td/preceding-sibling::td/input[@type='checkbox']"))
//						.click();
		
		selectUserName("Joe.Root");
		selectUserName("John.Smith");

		System.out.println(getUserDataList("Joe.Root"));
		System.out.println(getUserDataList("John.Smith"));

	}
	
	public static List<String> getUserDataList(String userName) {
		List<WebElement> userDataList = driver.findElements(By.xpath("//a[text()='"+userName+"']/parent::td/following-sibling::td"));
		List<String> dataList = new ArrayList<String>();
		for(WebElement e : userDataList) {
			String text = e.getText();
			dataList.add(text);
		}
		return dataList;
	}
	
	
	public static void selectUserName(String userName) {
		driver.findElement
				(By.xpath("//a[text()='"+userName+"']/parent::td/preceding-sibling::td/input[@type='checkbox']"))
						.click();
	}
	
	
	

}
