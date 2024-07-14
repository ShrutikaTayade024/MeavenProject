package com.facebooklogin;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class facebookLogin {

	WebDriver driver;
	@BeforeSuite
	public void setup() {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().window().maximize();
	}
	
	@BeforeMethod
	public void launchURL() {
		driver.get("https://www.facebook.com/");
	}
	
	@Test
	public void login() {
		System.out.println("Login Applicatrion");
		driver.findElement(By.name("email")).sendKeys("9359371306");
		driver.findElement(By.name("pass")).sendKeys("Shrutika@123");
driver.findElement(By.name("login")).click();
	}
		
}
