package org.codoid;

import java.util.ArrayList;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ShiftBetTabsSameBrowser {

	public static void main(String[] args) {
	      
		 System.setProperty("webdriver.chrome.driver","C:\\Users\\manikandan.k\\eclipse-workspace\\Codoid Selenium\\div\\chromedriver.exe");
		 ChromeOptions o=new ChromeOptions();
	     o.addArguments("--remote-allow-origins=*");
	     WebDriver a=new ChromeDriver(o);
	    
	    a.get("https://www.Facebook.com");

	    
	    ((JavascriptExecutor)a).executeScript("window.open('https://www.youtube.com/')");

	    
	    ArrayList<String> tabs = new ArrayList<String>(a.getWindowHandles());
	    
	    a.switchTo().window(tabs.get(1));
	    System.out.println(a.getTitle());

	  
	    a.switchTo().window(tabs.get(0));
	    System.out.println(a.getTitle());
	}
}
