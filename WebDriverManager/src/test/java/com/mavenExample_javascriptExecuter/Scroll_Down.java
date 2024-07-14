package com.mavenExample_javascriptExecuter;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Scroll_Down {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.calculator.net/");
		driver.manage().window().maximize();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		 //Scroll vertically down by 500 pixels
		js.executeScript("window.scrollBy(0,500)");

		try {
			Thread.sleep(5000);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
