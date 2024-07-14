package TestNG_Demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import junit.framework.Assert;

public class launch_browser {
@Test
	public void browser_launch() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		String actualtitle=driver.getTitle();
		System.out.println(actualtitle);
		String expectedtitle="Google";
		
	Assert.assertEquals(expectedtitle, actualtitle);

		}
		

      public void open_Insta() {
    	  
      }
}
