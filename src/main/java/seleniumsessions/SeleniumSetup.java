package seleniumsessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumSetup {

	public static void main(String[] args) {
		
		//windows:
		//System.setProperty("webdriver.chrome.driver", "c:\\Users\\naveenautomationlabs\\Documents\\seleniumdriver\\chromedriver.exe");

		//mac/linux:
		//System.setProperty("webdriver.chrome.driver", "/Users/naveenautomationlabs/Documents/seleniumdriver/chromedriver");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
		
		//chrome(123) ---> chromedriver.exe(123)
		//chrome(124) --> chromedriver.exe(124)
		
		//Selenium Manager: 4.6.0+
		//1. will check the current browser (chrome) version: 123 in your system(OS)
		//2. will download the respective chromedriver.exe version from the dashboard(vendor)
		//3. will start the server(.exe) --> No need to write System.setProperty()
		
		//chrome(100) --> chromedriver.exe(100)
		
		//tomorrow(next day):
		//chrome(123) --> chromedriver.exe(123) already present--> no need to download
		//.cache folder: maintain all .exe files(all browsers)
		
		
		
	}

}
