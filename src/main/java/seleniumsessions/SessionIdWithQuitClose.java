package seleniumsessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SessionIdWithQuitClose {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();//sid=123

		// enter the url:
		driver.get("https://www.google.com");

		// get the title:
		String title = driver.getTitle();		
		
		System.out.println("page title: " + title);//Google

		String url = driver.getCurrentUrl();
		System.out.println("page url : " + url);

		// close the browser:
		//driver.quit();//sid=123-->null
		
		driver.close();//sid=123-->invalid
		
		driver = new ChromeDriver();//sid=456
		driver.get("https://www.google.com");//sid=456
		
		System.out.println(driver.getTitle());//sid=456
		//quit://NoSuchSessionException: Session ID is null. Using WebDriver after calling quit()?
		//close://NoSuchSessionException: invalid session id
		
		
		driver.quit();
		
	}

}
