package seleniumsessions;

import org.openqa.selenium.edge.EdgeDriver;

public class TopCastingOptions {

	public static void main(String[] args) {
		
		//0.
		EdgeDriver driver = new EdgeDriver();

		//1. valid and recommended -- Local execution
		// WebDriver driver = new ChromeDriver();
		
		//2. valid but not recommended
		//SearchContext driver = new ChromeDriver();
		
		//3. valid and recommended -- Local execution
		// RemoteWebDriver driver = new ChromeDriver();
		
		//4. valid and recommended -- for remote execution (AWS,Cloud,Server,VM,Maching) with GRID
		//WebDriver driver = new RemoteWebDriver(remoteAddress, capabilities);
		
		//5. valid but not recommended
		//SearchContext driver = new RemoteWebDriver(remoteAddress, capabilities);
		
		//6. valid but not recommended (only for two browser: edge/chrome)
//		ChromiumDriver driver = new ChromeDriver();
//		driver = new EdgeDriver();
		
		//7. not valid
		//RemoteWebDriver driver = new ChromiumDriver();
		
		
	}

}
