package org.codoid;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Alert {
	

	    public static void main(String[] args) throws InterruptedException {

	       System.setProperty("webdriver.chrome.driver","C:\\Users\\manikandan.k\\eclipse-workspace\\Codoid Selenium\\div\\chromedriver.exe");
		   ChromeOptions o=new ChromeOptions();
		   o.addArguments("--remote-allow-origins=*");
		   WebDriver a=new ChromeDriver(o);
	        
	        a.get("https://demo.automationtesting.in/Alerts.html");
	        
	        a.manage().window().maximize();
	        
		    a.findElement(By.xpath("//button[@class='btn btn-danger']")).click();
		    
		    org.openqa.selenium.Alert al = a.switchTo().alert();
		    Thread.sleep(3000);
            al.accept();
            
		    a.findElement(By.xpath("//a[text()='Alert with OK & Cancel ']")).click();
		    a.findElement(By.xpath("//button[@onclick='confirmbox()']")).click();
		    
		    org.openqa.selenium.Alert al1 = a.switchTo().alert();
		    Thread.sleep(3000);
		    al1.dismiss();
	        
	}

}
