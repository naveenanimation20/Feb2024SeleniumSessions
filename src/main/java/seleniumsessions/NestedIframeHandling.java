package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NestedIframeHandling {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();//browser
		driver.get("https://selectorshub.com/iframe-scenario/");//page
		
		driver.switchTo().frame("pact1");//f1
		driver.findElement(By.id("inp_val")).sendKeys("testing");
		
		
		//F1-->DC-->Page
//		driver.switchTo().defaultContent();
//		String header = driver.findElement(By.tagName("h3")).getText();
//		System.out.println(header);
		
		
		//F1-->PF-->Page
//		driver.switchTo().parentFrame();
//		String header = driver.findElement(By.tagName("h3")).getText();
//		System.out.println(header);
		
		
		driver.switchTo().frame("pact2");//f2
		driver.findElement(By.id("jex")).sendKeys("automation");
		
		
		//F2-->DC--->Page
//		driver.switchTo().defaultContent();
//		String header = driver.findElement(By.tagName("h3")).getText();
//		System.out.println(header);
		
		//F2-->PF-->F1--DC/PF--->Page
		driver.switchTo().parentFrame();//F1
		driver.findElement(By.id("inp_val")).sendKeys(" with java");
		driver.switchTo().defaultContent();//Page
		String header = driver.findElement(By.tagName("h3")).getText();
		System.out.println(header);
		

//		driver.switchTo().frame("pact3");//f3 
//		driver.findElement(By.id("glaf")).sendKeys("1M subs");
		
		
		//Page -- F1 : yes
		//F1---F2: yes
		//F2---F3: yes
		//Page---->F2: No
		//Page---->F3: NO
		//Page--->F1--F2--->F3: Yes
		
//		driver.switchTo().parentFrame();//F2
//		driver.findElement(By.id("jex")).sendKeys(" Selenium");
//		
//		driver.switchTo().parentFrame();//F1
//		driver.findElement(By.id("inp_val")).sendKeys(" is love");
//		
//		driver.switchTo().parentFrame();//Page
//		String header = driver.findElement(By.tagName("h3")).getText();
//		System.out.println(header);
		
		//F3-->F2-->F1-->Page
		//F1-->Page
		//F2-->F1-->Page
		
		//F3 -->DefaultContent--->Page
//		driver.switchTo().defaultContent();
//		//driver.findElement(By.id("inp_val")).sendKeys(" CI CD");
//		String header = driver.findElement(By.tagName("h3")).getText();
//		System.out.println(header);
		
		

	}

}
