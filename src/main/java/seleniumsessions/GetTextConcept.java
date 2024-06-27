package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTextConcept {

	static WebDriver driver;

	public static void main(String[] args) {

		driver = new ChromeDriver();//123
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		
//		String header = driver.findElement(By.tagName("h2")).getText();
//		System.out.println(header);
//
//		String forgotLinkText = driver.findElement(By.linkText("Forgotten Password")).getText();
//		System.out.println(forgotLinkText);
//		
//		String para = driver.findElement(By.xpath("//*[@id=\"content\"]/div/div[1]/div/p[2]")).getText();
//		System.out.println(para);
		
		
		By header = By.tagName("h2");
		By forgotPwd = By.linkText("Forgotten Password");
		By para = By.xpath("//*[@id=\"content\"]/div/div[1]/div/p[2]");
		
		ElementUtil eleUtil = new ElementUtil(driver);
		String h = eleUtil.doGetText(header);
		System.out.println(h);
		
		System.out.println(eleUtil.doGetText(para));
		
	}
	
	

}
