package mytests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class GoogleTest extends BaseTest {

	@Test(description = "checking login page title...")
	public void googleTitleTest() {
		String title = driver.getTitle();
		System.out.println("page title : " + title);
		Assert.assertEquals(title, "Google", "====title is not matched====");
	}

	@Test(description = "checking login page url...")
	public void googleURLTest() {
		String url = driver.getCurrentUrl();
		System.out.println("page url : " + url);
		Assert.assertTrue(url.contains("google"), "====url is not matched===");
	}

}



