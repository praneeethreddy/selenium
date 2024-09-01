package com.javaclasses;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class ButtonsPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("file:///Users/praneethkesarapu/Documents/Practice/Testing/Training/index.html");

		driver.manage().window().maximize();
		
		WebElement favPlace= driver.findElement(By.id("texas"));
		boolean fp=favPlace.isSelected();
		if(!fp) {
			favPlace.click();
			
		}
//		favPlace.click();
		System.out.println(favPlace.isSelected());
		
//		
		List<WebElement> fs = driver.findElements(By.name("Fav_Subject"));
		
		boolean flag = false;
		for(int i= 0; i<fs.size();i++) {
			String radios_value = fs.get(i).getAttribute("id");
			if(radios_value.contentEquals("js")) {
				fs.get(i).click();
				flag = true;
				break;
			}
		}
		if(!flag) {
			System.out.println("The element is not found");
		}
		
		
		
		
		
		
//		driver.close();

	}

}
