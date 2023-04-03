package org.codoid;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class HandlingFrame {
	
	 public static void main(String[] args) {
	         
		 System.setProperty("webdriver.chrome.driver","C:\\Users\\manikandan.k\\eclipse-workspace\\Codoid Selenium\\div\\chromedriver.exe");
		    ChromeOptions o=new ChromeOptions();
		    o.addArguments("--remote-allow-origins=*");
		    WebDriver a=new ChromeDriver(o);
		    
		    a.get("https://chercher.tech/practice/frames");
		    
		    a.manage().window().maximize();
		  
		    a.switchTo().frame(0);
		    WebElement txtbox = a.findElement(By.tagName("input"));
		    txtbox.sendKeys("mani");
		    
		    a.switchTo().frame("frame3");
		    a.findElement(By.id("a")).click();
		    
		    
		    a.switchTo().defaultContent();
		    WebElement frame = a.findElement(By.xpath("//iframe[@id='frame2']"));
		    
		    a.switchTo().frame(frame);
		    WebElement dbn = a.findElement(By.id("animals"));
		    Select s=new Select(dbn);
		    s.selectByIndex(2);

		}
  }


