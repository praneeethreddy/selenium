package com.javaclasses;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchPage {
	
    public static void main(String[] args) {
        System.out.println("Hello");
//        System.setProperty("webdriver.chrome.driver", "/Users/praneethkesarapu/eclipse-workspace/TestSelenium/Driver/chromedriver");
        
        WebDriver driver = new ChromeDriver();
     
        driver.get("https://www.bankofamerica.com");
        driver.manage().window().maximize();
        driver.findElement(By.cssSelector("img[alt = 'Bank of America Logo']"));
        driver.findElement(By.xpath("//input[@placeholder='User ID']")).sendKeys("Hello");
        driver.findElement(By.xpath("//input[@type='password']")).sendKeys("12345");
        driver.findElement(By.xpath("//div/input[@type='checkbox']")).click();
        driver.findElement(By.partialLinkText("Forgot")).click();
        
        try{Thread.sleep(2000);
        }
        catch(Exception e){
        	System.out.println(e);}
        
        driver.navigate().back();
        System.out.println(driver.getTitle());
        System.out.println(driver.findElement(By.xpath("//div/h2[contains(text(),'Your fi')]")).getText());
        driver.findElement(By.id("finCenterLocator")).click();
        try{Thread.sleep(2000);
        }
        catch(Exception e){
        	System.out.println(e);}
        driver.navigate().back();
        driver.findElement(By.xpath("//input[@placeholder='User ID']")).sendKeys("Thank you");
        

//        driver.switchTo().alert().dismiss();
//        driver.findElement(By.className("ui-autocomplete-input")).sendKeys("77077");
        
//        driver.quit();
    }
}
