package org.codoid;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class AutomateMenuAndSub {
	 public static void main(String[] args) {
		
		 System.setProperty("webdriver.chrome.driver","C:\\Users\\manikandan.k\\eclipse-workspace\\Codoid Selenium\\div\\chromedriver.exe");
		   ChromeOptions o=new ChromeOptions();
		   o.addArguments("--remote-allow-origins=*");
		   WebDriver a=new ChromeDriver(o);
			
	        a.get("https://www.oyorooms.com/");
	        
	        a.manage().window().maximize();
	        
	        WebElement place = a.findElement(By.xpath("//h2[text()='Chennai']"));
	        
		    
			Actions action=new Actions(a);
			
			
			action.moveToElement(place).perform();
			
			
		    a.findElement(By.xpath("//a[text()='Koyambedu']")).click();
		
			
     }
}
