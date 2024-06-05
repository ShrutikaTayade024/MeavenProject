package com.mavenExample.WebDriverManager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FacebookLogin {

	public static void main(String[] args) {
      WebDriverManager.chromedriver().setup();
      WebDriver driver=new ChromeDriver();
      driver.manage().window().maximize();
      driver.get("https://www.flipkart.com/");
WebElement search=  driver.findElement(By.xpath("//input[@class='Pke_EE']"));
search.sendKeys("mobile");
search.submit();

driver.findElement(By.xpath("//div[@class='KzDlHZ']")).click();



	}

}
