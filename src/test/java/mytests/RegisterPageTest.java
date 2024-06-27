package mytests;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.ITestContext;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class RegisterPageTest extends BaseTest{
	
	
	public static String getRandomEmailId() {
		String emailId = "opencart"+ System.currentTimeMillis()+"@gmail.com"; 
		//String emailId = "opencart"+ UUID.randomUUID()+"@gmail.com"; 
		return emailId;
	}
			
	
	@DataProvider
	public Object[][] getRegTestData() {
		return new Object[][] {
			{"Kavi", "selenium", "9876543223", "kavi@123"},
			{"Amit", "sharma", "7876543223", "amit@123"},
			{"Praful", "automation", "6876543223", "praful@123"}
		};
	}
	
	
	@Parameters({"browser"})
	@Test(dataProvider = "getRegTestData")
	public void registerTest(String firstName, String lastName, String telephone, String password, ITestContext context) {
		
	    String browser = context.getCurrentXmlTest().getParameter("browser");
	    System.out.println("Browser: " + browser);
		
		driver.findElement(By.id("input-firstname")).sendKeys(firstName);
		driver.findElement(By.id("input-lastname")).sendKeys(lastName);
		driver.findElement(By.id("input-email")).sendKeys(getRandomEmailId());
		driver.findElement(By.id("input-telephone")).sendKeys(telephone);
		driver.findElement(By.id("input-password")).sendKeys(password);
		driver.findElement(By.id("input-confirm")).sendKeys(password);

		driver.findElement(By.name("agree")).click();
		driver.findElement(By.xpath("//input[@value='Continue']")).click();
		
		String text = driver.findElement(By.xpath("//div[@id='content']/h1")).getText();
		System.out.println(text);
		Assert.assertEquals(text, "Your Account Has Been Created!");
		
		driver.findElement(By.linkText("Logout")).click();
		driver.findElement(By.linkText("Register")).click();

		
	}
	
	
	
	

}
