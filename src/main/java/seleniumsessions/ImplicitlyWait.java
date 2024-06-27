package seleniumsessions;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplicitlyWait {

	public static void main(String[] args) throws InterruptedException {

		
		//sync concept:
		//sel script <------> app
		
		//Thread.sleep(10000);//10 secs -- static wait/hard wait -- Java
		
		//e1 --> 0 secs,  2 secs, 14 secs, 18 secs
		
		//dynamic wait: 10 secs ---> 2 secs ---> 8 secs(cancelled)
		//10 secs ---> 0 secs ---> 10 secs (cancelled)
		//10 secs  -> 8 secs --> 2 secs (cancelled)
		//10 secs ---> 12 secs --->
		
		//1. Implicitly Wait: 
				//global wait: it will be applied for all the web elements by default
		//2. Explicit Wait
			//2.a: WebDriverWait
			//2.b: FluentWait
		
		WebDriver driver = new ChromeDriver();
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);//sel 3.x
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));//sel 4.x
		
		//login page: 10 secs
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		
		driver.findElement(By.id("input-email11")).sendKeys("test@gmail.com");//10 secs: 2 secs
//		driver.findElement(By.id("input-password")).sendKeys("test@123");//10 secs: 5 secs
//		driver.findElement(By.xpath("//input[@value='Login']")).click();//10 secs: 11
		
		//e4 e5 e6 ..e10
		
//		//home page: 15 secs
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));//sel 4.x
//		//e11 e12 e13: 15 secs
//		
//		//loginpage: 10 secs
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));//sel 4.x
//		
//		//reg page: 5 secs
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));//sel 4.x

		//nullify the imp wait == 0
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(0));
		
		//login page
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));//sel 4.x

		//imp wait can not be used for non webelements: url, title, alerts
		
	}

}
