package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUploadPopUp {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.get("https://cgi-lib.berkeley.edu/ex/fup.html");

		//type=file: windows/mac/linux
		driver.findElement(By.name("upfile")).sendKeys("/Users/naveenautomationlabs/Documents/DockerGrid/selenoid/new/browsers.json");
		//c:\\users\\dociments\\
		
		//1. AutoIT - tool: windows -- not recommended
		//2. Sikuli -- lib: images
		//3. Robot class: Java: windows machine
		
		
		//cookies
		//adv pop up
		//browser window pop up
		
		
		
		
		
	}

}
