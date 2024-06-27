package mytests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class OrangeHRMTest extends BaseTest{

	@Test(description = "checking login page title...")
	public void orangeHRMTitleTest() {
		String title = driver.getTitle();
		System.out.println("page title : " + title);
		Assert.assertEquals(title, "30-Day Advanced Free Trial | OrangeHRM", "====title is not matched====");
	}

	@Test(description = "checking login page url...")
	public void orangeHRMURLTest() {
		String url = driver.getCurrentUrl();
		System.out.println("page url : " + url);
		Assert.assertTrue(url.contains("30-day-free-trial"), "====url is not matched===");
	}

}



