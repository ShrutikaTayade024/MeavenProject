package com.mavenExample.WebDriverManager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Register_facebook {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		driver.findElement(By.xpath("//a[@class='_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy']")).click();
		WebElement name=driver.findElement(By.name("firstname"));
		name.sendKeys("Shrutika");
		WebElement Lname=driver.findElement(By.name("lastname"));
		Lname.sendKeys("Tayade");
		WebElement mob=driver.findElement(By.name("reg_email__"));
		mob.sendKeys("9359371306");
		WebElement pass=driver.findElement(By.name("reg_passwd__"));
		pass.sendKeys("Shrutika@123");
		
		

	}

}
