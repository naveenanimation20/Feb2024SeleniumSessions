package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IFrameHandling {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();//browser
		driver.get("https://www.formsite.com/templates/registration-form-templates/vehicle-registration-form/");//page
		
		driver.findElement(By.cssSelector("img[title='Vehicle-Registration-Forms-and-Examples']")).click();
		
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[contains(@id,'frame-one')]")));
		
		driver.findElement(By.id("RESULT_TextField-8")).sendKeys("Naveen");
		
		driver.switchTo().defaultContent();//back to main page
		
		
		String header = driver.findElement(By.cssSelector(".details__form-preview-title")).getText();
		System.out.println(header);
	}

}


//sunday - 7:00 AM IST
