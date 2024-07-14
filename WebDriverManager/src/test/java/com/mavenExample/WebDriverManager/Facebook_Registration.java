package com.mavenExample.WebDriverManager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Facebook_Registration {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
      //Create New Class
		driver.findElement(By.xpath("//a[@class='_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy']")).click();
		//firstNmae
	WebElement fname=driver.findElement(By.xpath("//input[@name='firstname']"));
	fname.sendKeys("Shrutika");
	
	//lastName
	WebElement Lname=driver.findElement(By.xpath("//input[@name='lastname']"));
	Lname.sendKeys("Tayade");
	
	WebElement mob=driver.findElement(By.xpath("//input[@name='reg_email__']"));
	mob.sendKeys("9359371306");

		
	}

}
