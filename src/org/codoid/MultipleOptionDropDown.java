package org.codoid;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class MultipleOptionDropDown {
public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\manikandan.k\\eclipse-workspace\\Selenium1\\dri\\chromedriver.exe");
	    ChromeOptions o=new ChromeOptions();
	    o.addArguments("--remote-allow-origins=*");
	    WebDriver a=new ChromeDriver(o);
	    
	    a.get("https://demoqa.com/select-menu");
	    a.manage().window().maximize();
	    
	    WebElement d = a.findElement(By.id("cars"));
	    Select s=new Select(d);
	    
	    
	    s.selectByIndex(0);
	    s.selectByValue("opel");
	    s.selectByVisibleText("Audi");
     }
}
