package seleniumsessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class NewWindowTabConcept {

	public static void main(String[] args) {

		
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");// parent
		String parentWindowId = driver.getWindowHandle();
		
		//selenium 4.x:
		//driver.switchTo().newWindow(WindowType.WINDOW);//create a new blank window/tab and switch to it also
		
		driver.switchTo().newWindow(WindowType.TAB);//create a new blank window/tab and switch to it also

		
		driver.get("https://www.google.com");
		System.out.println(driver.getTitle());
		
//		driver.close();
//		
//		driver.switchTo().window(parentWindowId);
//		
//		System.out.println(driver.getTitle());
		
		
		//window1: admin portal - logout
		//window2: customer portal - login with customer
		
		
		
		
	}

}
