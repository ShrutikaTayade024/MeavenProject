package com.mavenExample.WebDriverManager;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Schroller_Down {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.calculator.net/");
		driver.manage().window().maximize();
		//JavascriptExecutor js = (JavascriptExecutor) driver;
		// Scroll vertically down by 500 pixels
		//js.executeScript("window.scrollBy(0,1000)");

		try {
			Thread.sleep(5000);

		} catch (Exception e) {
			e.printStackTrace();
		}
		JavascriptExecutor js1 = (JavascriptExecutor) driver;
		WebElement Element = driver.findElement(By.linkText("BMI Calculator"));
		Element.click();
		js1.executeScript("arguments[0].scrollIntoView();", Element);
	}

}
