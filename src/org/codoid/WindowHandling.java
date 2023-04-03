package org.codoid;


import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class WindowHandling {

	public static void main(String[] args) {
		System.setProperty("WebDriver.Chrome.Driver", "C:\\Users\\manikandan.k\\eclipse-workspace\\Codoid\\div\\chromedriver.exe");
        
		ChromeOptions o=new ChromeOptions();
		o.addArguments("--remote-allow-origins=*");
		
		WebDriver a=new ChromeDriver(o);
		a.get("https://www.amazon.in/");
		
		a.findElement(By.id("twotabsearchtextbox")).sendKeys("iphone14",Keys.ENTER);
		a.findElement(By.xpath("//span[text()='Apple iPhone 14 (128 GB) - Yellow']")).click();
		
		
		String win1 = a.getWindowHandle();
		System.out.println(win1);
		
		Set<String> allwin = a.getWindowHandles();
		System.out.println(allwin);
		
		for (String eachwin : allwin) {
			if(!win1.equals(eachwin)) {
				a.switchTo().window(eachwin);
			}
		}
		
		a.findElement(By.xpath("//input[@id='add-to-cart-button']")).click();
		
	}

}
