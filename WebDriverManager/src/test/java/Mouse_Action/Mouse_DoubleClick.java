package Mouse_Action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Mouse_DoubleClick {

	public static void main(String[] args) {
WebDriverManager.chromedriver().setup();
WebDriver driver=new ChromeDriver();
driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml5_ev_ondblclick3");
driver.manage().window().maximize();

//switch to Iframe
driver.switchTo().frame("iframeResult");
driver.findElement(By.id("field1")).clear();
driver.findElement(By.id("field1")).sendKeys("Welcome to Selenium");


	WebElement Button=driver.findElement(By.xpath("//button[text()='Copy Text']"));
	
	Actions act=new Actions(driver);
	act.doubleClick(Button).perform();
	}

}
