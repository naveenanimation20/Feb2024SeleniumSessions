package seleniumsessions;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserWindowHandling {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");//parent
		
		Thread.sleep(2000);	
		
		driver.findElement(By.xpath("//a[contains(@href,'twitter')]")).click();//child
		
		//1. fetch the windows ids:
		Set<String> handles = driver.getWindowHandles();
		
		Iterator<String> it = handles.iterator();
		
		String parentWindowId = it.next();
		System.out.println("parent window id is: " + parentWindowId);
		
		String childWindowId = it.next();
		System.out.println("child window id is: " + childWindowId);
		
		
		//2. switching work:
		driver.switchTo().window(childWindowId);
		System.out.println("child window title : " + driver.getCurrentUrl());
		
		//driver.close();//close the child window
		
		//driver is lost
		
		driver.switchTo().window(parentWindowId);
		System.out.println("parent window title : " + driver.getCurrentUrl());
		
		driver.quit();//close the parent window

	}

}
