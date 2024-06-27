package seleniumsessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverBasics {

	public static void main(String[] args) {

		//java + selenium code(4.x)
		
		//Automation Steps:
		//Open the browser:
		WebDriver driver = new ChromeDriver();
		//WebDriver driver = new FirefoxDriver();
		//WebDriver driver = new EdgeDriver();
		//WebDriver driver = new SafariDriver();

		
		//enter the url:
		driver.get("www.google.com");
		
		//get the title:
		String title = driver.getTitle();
		System.out.println("page title: " + title);
		
		//validation point//checkpoint
		if(title.equals("Google")) {
			System.out.println("title is correct");
		}
		else {
			System.out.println("title is not correct");
		}
		
		//Automation Steps + validation/checkpoints = Automation Testing
		
		//get the url:
		String url = driver.getCurrentUrl();
		System.out.println("page url : " + url);
		
		if(url.contains("google.com")) {
			System.out.println("url is correct");

		}
		else {
			System.out.println("url is not correct");
		}
		
		//close the browser:
		driver.close();
	}

}
