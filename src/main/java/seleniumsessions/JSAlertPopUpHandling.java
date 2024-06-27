package seleniumsessions;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JSAlertPopUpHandling {

	public static void main(String[] args) throws InterruptedException {

		//JS alerts:
		//1. alert()
		//2. prompt()
		//3. confirm()
		
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		
		//driver.switchTo().alert();//NoAlertPresentException: no such alert
		
		//1. alert
//		driver.findElement(By.xpath("//button[text()='Click for JS Alert']")).click();
//		
//		
//		Alert alert = driver.switchTo().alert();
//		String text = alert.getText();
//		System.out.println(text);
//		
//		alert.accept();//ok button
//		//alert.dismiss();//remove the alert
		
		
		//2. confirm
		driver.findElement(By.xpath("//button[text()='Click for JS Confirm']")).click();
		Alert alert = driver.switchTo().alert();
		System.out.println(alert.getText());
		//alert.sendKeys("testing");//ElementNotInteractableException: element not interactable: User dialog does not have a text box input field.
		alert.accept();//ok -- alert is gone
		//System.out.println(alert.getText());//NoAlertPresentException: no such alert
//		//alert.dismiss();//cancel
		
		//3. prompt
//		driver.findElement(By.xpath("//button[text()='Click for JS Prompt']")).click();
//		Thread.sleep(3000);
//
//		Alert alert = driver.switchTo().alert();
//		System.out.println(alert.getText());
//		alert.sendKeys("test automation");
//		alert.accept();//ok
		
		
	}

}
