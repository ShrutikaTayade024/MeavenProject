package TestNG_Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

//openApp
//CheckLogo
//LoginToFB
//VerifyTitle
//Exit


public class testLogo {
	WebDriver driver;
	@Test
	void OpenApp() {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
	}
@Test
	void TestLogo() {
		boolean logo;
		logo=driver.findElement(By.xpath("//img[@class='fb_logo _8ilh img']")).isDisplayed();
		System.out.println("Logo Displayed Test case"+logo);
	}
      void Login() {
    	  WebElement name =driver.findElement(By.name("email"));
    	  name.sendKeys("Shrutikatayade001@gmail.com");
    	  WebElement pass=driver.findElement(By.name("pass"));
    	  
    	  
      }
}
