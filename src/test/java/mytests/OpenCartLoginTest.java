package mytests;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;


//AAA
public class OpenCartLoginTest extends BaseTest {

	@Test(description = "checking login page title...")
	public void loginPageTitleTest() {
		String title = driver.getTitle();
		System.out.println("page title : " + title);
		Assert.assertEquals(title, "Account Login", "====title is not matched====");
	}

	@Test(description = "checking login page url...")
	public void loginPageURLTest() {
		String url = driver.getCurrentUrl();
		System.out.println("page url : " + url);
		Assert.assertTrue(url.contains("route=account/login"), "====url is not matched===");
	}

	@Test(description = "checking logo is present on the page...")
	public void loginPageLogoTest() {
		boolean flag = driver.findElement(By.cssSelector("img.img-responsive")).isDisplayed();
		Assert.assertEquals(flag, true, "===logo is missing===");
	}

}
