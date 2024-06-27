package seleniumsessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SVGElementHandling {

	public static void main(String[] args) throws InterruptedException {

		//SVG:
		//normal xpath will not wortk for SVG
		//svg[@fill='none'] -- not valid
		
		
				
		WebDriver driver = new ChromeDriver();
		driver.get("https://petdiseasealerts.org/forecast-map#/");
		Thread.sleep(6000);
		//driver.get("chrome://settings/");
		//driver.findElement(By.xpath("(//*[local-name()='svg'])[1]")).click();
		
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[contains(@id,'map-instance')]")));
		
		//*[local-name()='svg' and @id='map-svg']//*[name()='path']
		//*[name()='path']
		
		//svg ---> local-name()='svg' 
		//svg---> name()='svg'
		//*[name()='svg' and @id='map-svg']
		//*[local-name()='svg' and @id='map-svg']
		//*[name()='svg' and @id='map-svg']//*[local-name()='g' and @id='regions']
		
		//svg#map-svg g#features path -- CSS for SVG
		
		
		String xpathVal ="//*[local-name()='svg' and @id='map-svg']/*[name()='g' and @id='features']/*[name()='g' and @id='regions']//*[name()='path']";
		
		List<WebElement> stateList = driver.findElements(By.xpath(xpathVal));
		System.out.println(stateList.size());
		
		for(WebElement e : stateList) {
			String stateName = e.getAttribute("name");
			System.out.println(stateName);
		}
		
	}

}
