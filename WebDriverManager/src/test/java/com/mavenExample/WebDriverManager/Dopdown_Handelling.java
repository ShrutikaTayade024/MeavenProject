package com.mavenExample.WebDriverManager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Dopdown_Handelling {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/select-menu");
		driver.manage().window().maximize();
 //for Select Dropdown
		Select se=new Select(driver.findElement(By.id("oldSelectMenu")));
		se.selectByIndex(4);
	
		se.selectByVisibleText("Indigo");
		
		//for  MultiSelect
		
		Select Mselect=new Select(driver.findElement(By.id("cars")));
		if(Mselect.isMultiple()) {
			
			//Selecting multiple values by index
			Mselect.selectByIndex(3);
			Mselect.selectByIndex(2);
			
			//Or selecting by values
			Mselect.selectByValue("volvo");
			Mselect.selectByValue("saab");
			
			//Or selecting by visible text
			Mselect.selectByVisibleText("Volvo");
			Mselect.selectByVisibleText("Opel");
			
		}
		
		
			
	}

}
