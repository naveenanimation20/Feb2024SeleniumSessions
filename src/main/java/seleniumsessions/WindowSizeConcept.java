package seleniumsessions;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WindowSizeConcept {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new FirefoxDriver();
		
		//driver.manage().window().maximize();
		
		//driver.manage().window().fullscreen();
		
		
		Dimension dim = new Dimension(430, 932);
		
		driver.manage().window().setSize(dim);
		
		
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		
		
		Thread.sleep(2000);
		
		//driver.manage().window().minimize();//sel4.x
		
		
	}

}
