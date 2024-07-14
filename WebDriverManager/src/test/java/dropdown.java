import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class dropdown {

	public static void main(String[] args) {
WebDriverManager.chromedriver().setup();

WebDriver driver=new ChromeDriver();

driver.get("https://demoqa.com/select-menu");
WebElement value=driver.findElement(By.id("oldSelectMenu"));
Select value1=new Select(value);
value1.selectByVisibleText("Yellow");
value1.selectByIndex(6);
value1.selectByValue("5");
	}

}
