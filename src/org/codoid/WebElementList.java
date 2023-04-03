package org.codoid;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class WebElementList {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\manikandan.k\\eclipse-workspace\\Selenium1\\dri\\chromedriver.exe");
	    ChromeOptions o=new ChromeOptions();
	    o.addArguments("--remote-allow-origins=*");
	    WebDriver a=new ChromeDriver(o);
	    
	    a.get("https://demo.guru99.com/test/web-table-element.php");
	    
	    a.manage().window().maximize();
	    
	    WebElement table = a.findElement(By.xpath("//table[@class='dataTable']"));
	    
	    List<WebElement> tablerow = table.findElements(By.tagName("tr"));
		   int size = tablerow.size();
		   System.out.println(size);
	    
	  
	    
	    for(int i=0;i<tablerow.size();i++) {
			   String text2 = tablerow.get(i).getText();
			   System.out.println(text2);
		   }

	}
}
